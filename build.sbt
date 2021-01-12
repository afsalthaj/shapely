organization := "com.fommil"
name := "shapely"

crossScalaVersions in ThisBuild := Seq("2.11.12", "2.12.12", "2.13.4", "3.0.0-M3")
scalaVersion in ThisBuild := "2.12.12"
scalacOptions ++= Seq(
  "-deprecation",
  "-feature"
)
scalacOptions in (Compile, console) -= "-Ywarn-unused"

unmanagedSourceDirectories in Compile ++= {
  val dir = (scalaSource in Compile).value
  val Some((major, minor)) = CrossVersion.partialVersion(scalaVersion.value)
  val specific =
    if (major == 2 && minor <= 12) file(s"${dir.getPath}-2.12-") :: Nil
    else Nil

  file(s"${dir.getPath}-$major") :: specific
}

libraryDependencies ++= Seq(
  "com.novocode" % "junit-interface" % "0.11" % Test,
  "junit" % "junit" % "4.11" % Test
)

libraryDependencies ++= {
  val Some((major, _)) = CrossVersion.partialVersion(scalaVersion.value)
  if (major < 3) List("org.scala-lang" % "scala-reflect" % scalaVersion.value % "provided")
  else Nil
}

crossPaths := false // https://github.com/sbt/junit-interface/issues/35
testOptions += Tests.Argument(TestFrameworks.JUnit, "-v")
fork := true

sourceManaged in Compile := {
  val dir = (sourceManaged in Compile).value
  val Some((major, _)) = CrossVersion.partialVersion(scalaVersion.value)
  dir / s"scala-$major"
}

sourceGenerators in Compile += Def.task {
  val dir = (sourceManaged in Compile).value
  val file = dir / "shapely" / "CaseClass.scala"
  val caseclasses = (1 to 64).map { i =>
    val tparams = (1 to i).map(p => s"A$p").mkString(", ")
    val lparams = (1 to i).map(p => s"L$p <: String").mkString(", ")
    val lparams_ = (1 to i).map(p => s"L$p").mkString(", ")
    val defns = (1 to i).map(p => s"_$p: A$p").mkString(", ")
    val tuple = (1 to i).map(p => s"_$p").mkString(", ")
    val untuple = (1 to i).map(p => s"t._$p").mkString(", ")
    // scala 2 is limited to tuples of arity 22. We could generate this for
    // scala 3 but we'd rather not have a different API.
    val body_class =
      if (i > 22) ""
      else s" with Product${i}[$tparams] { def tuple: Tuple${i}[$tparams] = Tuple$i($tuple) }\n"
    val body_object =
      if (i > 22) ""
      else s"object CaseClass$i { def untuple[A, $tparams, $lparams](t: Tuple$i[$tparams]): CaseClass$i[A, $tparams, $lparams_] = CaseClass$i($untuple) }"
    s"final case class CaseClass$i[A, $tparams, $lparams]($defns) extends CaseClass[A]$body_class$body_object"
  }
  IO.write(
    file,
    s"""package shapely
       |
       |final case class CaseClass0[A]() extends CaseClass[A] { def tuple: Unit = () }
       |case object CaseClass0 { def untuple[A](): CaseClass0[A] = apply[A]() }
       |
       |${caseclasses.mkString("\n\n")}
       |""".stripMargin)
  Seq(file)
}.taskValue

sourceGenerators in Compile += Def.task {
  val dir = (sourceManaged in Compile).value
  val file = dir / "shapely" / "SealedTrait.scala"
  val sealedtraits = (1 to 32).map { i =>
    val tparams = (1 to i).map(p => s"A$p <: A").mkString(", ")
    val tparams_ = (1 to i).map(p => s"A$p").mkString(", ")
    val defns = (1 to i).map(p => s"final case class _$p[A, $tparams](value: A$p) extends SealedTrait$i[A, $tparams_]").mkString("\n  ")
    val either = (1 until i).foldRight(s"A$i" + ("]" * (i - 1)))((e, acc) => s"Either[A$e, $acc")
    def rights(pp: Int, s: String): String = if (pp <= 0) s else rights(pp - 1, s"Right($s)")
    def either_cons(p: Int, splice: String): String = if (p == i) rights(p - 1, splice) else rights(p - 1, s"Left($splice)")
    val toEithers = (1 to i).map { p => s"""case SealedTrait$i._$p(v) => ${either_cons(p, "v")}""" }.mkString("\n    ")
    val fromEithers = (1 to i).map { p => s"""case ${either_cons(p, "v")} => _$p(v)""" }.mkString("\n    ")

    // the either convertors are very inefficient and should only be used for small arity
    val body_class =
      if (i > 12) ""
      else s""" {
       |  def either: $either = this match {
       |    ${toEithers}
       |  }
       |}""".stripMargin
    val uneither =
      if (i > 12) ""
      else s"""
       |  def uneither[A, $tparams](e: $either): SealedTrait$i[A, $tparams_] = e match {
       |    ${fromEithers}
       |  }
       |""".stripMargin
    val body_object = s"""
       |object SealedTrait$i {
       |  $uneither
       |  $defns
       |}""".stripMargin

    s"sealed trait SealedTrait$i[A, $tparams] extends SealedTrait[A]$body_class$body_object"
  }
  IO.write(
    file,
    s"""package shapely
       |
       |${sealedtraits.mkString("\n\n")}
       |""".stripMargin)
  Seq(file)
}.taskValue

sourceGenerators in Compile += Def.task {
  val Some((major, _)) = CrossVersion.partialVersion(scalaVersion.value)
  if (major < 3) Nil
  else {
    val dir = (sourceManaged in Compile).value
    val file = dir / "scala" / "ShapelyCompat.scala"
    val caseclasses = (1 to 64).map { i =>
      val tparams = (1 to i).map(p => s"A$p").mkString(", ")
      val lparams = (1 to i).map(p => s"L$p <: String").mkString(", ")
      val lparams_ = (1 to i).map(p => s"L$p").mkString(", ")
      def tcons(s: String) = if (i == 1) s"Tuple1[$s]" else s"($s)"

      s"""  implicit def caseclass$i[A <: Product, $tparams, $lparams](implicit A: Mirror.ProductOf[A], ev1: A.MirroredElemTypes =:= ${tcons(tparams)}, ev2: A.MirroredElemLabels =:= ${tcons(lparams_)}, S: Mirror.ProductOf[CaseClass$i[A, $tparams, $lparams_]]): Shapely[A, CaseClass$i[A, $tparams, $lparams_]] = new Shapely[A, CaseClass$i[A, $tparams, $lparams_]] {
         |    def to(a: A): CaseClass$i[A, $tparams, $lparams_] = S.fromProduct(a)
         |    def from(s: CaseClass$i[A, $tparams, $lparams_]): A = A.fromProduct(s)
         |  }""".stripMargin
    }
    val sealedtraits = (1 to 32).map { i =>
      val tparams = (1 to i).map(p => s"A$p <: A").mkString(", ")
      val tparams_ = (1 to i).map(p => s"A$p").mkString(", ")
      def tcons(i: String) = if (i == 1) s"Tuple1[$i]" else s"($i)"

      val to_matchers = (1 to i).map(p => s"  case ${p - 1} => SealedTrait$i._$p(a.asInstanceOf[A$p])")

      s"""  implicit def sealedtrait$i[A, $tparams](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= ${tcons(tparams_)}): Shapely[A, SealedTrait$i[A, $tparams_]] = new Shapely[A, SealedTrait$i[A, $tparams_]] {
         |    def to(a: A): SealedTrait$i[A, $tparams_] = A.ordinal(a) match {
         |    ${to_matchers.mkString("\n    ")}
         |    }
         |    def from(s: SealedTrait$i[A, $tparams_]): A = s.value
         |  }""".stripMargin
    }
    IO.write(
      file,
      s"""package scala
         |
         |import deriving.Mirror
         |import shapely._
         |
         |trait ShapelyCompat { this: Shapely.type =>
         |
         |  implicit def caseclass0[A <: Product](implicit A: Mirror.ProductOf[A], ev: A.MirroredElemTypes =:= EmptyTuple): Shapely[A, CaseClass0[A]] = new Shapely[A, CaseClass0[A]] {
         |    def to(a: A): CaseClass0[A] = CaseClass0[A]()
         |    def from(s: CaseClass0[A]): A = A.fromProduct(s)
         |  }
         |
         |${caseclasses.mkString("\n\n")}
         |
         |${sealedtraits.mkString("\n\n")}
         |
         |}""".stripMargin)
    Seq(file)

  }
}.taskValue
