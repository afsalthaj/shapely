organization := "com.fommil"
name := "shapely"

scalaVersion in ThisBuild := "2.13.4"
scalacOptions ++= Seq(
  "-deprecation",
  "-feature",
  "-Ywarn-value-discard",
  "-Ywarn-unused"
)
scalacOptions in (Compile, console) -= "-Ywarn-unused"

libraryDependencies ++= Seq(
  "org.scala-lang" % "scala-reflect" % scalaVersion.value % "provided",
  "com.novocode" % "junit-interface" % "0.11" % Test,
  "junit" % "junit" % "4.11" % Test
)

crossPaths := false // https://github.com/sbt/junit-interface/issues/35
testOptions += Tests.Argument(TestFrameworks.JUnit, "-v")
fork := true

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
    // scala is limited to tuples of arity 22
    val body_class =
      if (i > 22) ""
      else s" with Product${i}[$tparams] { def tuple: Tuple${i}[$tparams] = Tuple$i($tuple) }\n"
    val body_object =
      if (i > 22) ""
      else s"object CaseClass$i { def untuple[$tparams, $lparams](t: Tuple$i[$tparams]): CaseClass$i[$tparams, $lparams_] = CaseClass$i($untuple) }"
    s"case class CaseClass$i[$tparams, $lparams]($defns) extends CaseClass$body_class$body_object"
  }
  IO.write(
    file,
    s"""package shapely
       |
       |trait CaseClass
       |
       |case object CaseClass0 extends CaseClass {
       |  def apply(): CaseClass0.type = this
       |  def tuple: Unit = ()
       |  def untuple(): CaseClass0.type = this
       |}
       |
       |${caseclasses.mkString("\n\n")}
       |""".stripMargin)
  Seq(file)
}.taskValue

sourceGenerators in Compile += Def.task {
  val dir = (sourceManaged in Compile).value
  val file = dir / "shapely" / "SealedTrait.scala"
  val sealedtraits = (1 to 64).map { i =>
    val tparams = (1 to i).map(p => s"A$p").mkString(", ")
    val defns = (1 to i).map(p => s"case class _$p[$tparams](value: A$p) extends SealedTrait$i[$tparams]").mkString("\n  ")
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
    val body_object =
      if (i > 12) ""
      else s"""
       |object SealedTrait$i {
       |  def uneither[$tparams](e: $either): SealedTrait$i[$tparams] = e match {
       |    ${fromEithers}
       |  }
       |  $defns
       |}""".stripMargin

    s"sealed trait SealedTrait$i[$tparams] extends SealedTrait$body_class$body_object"
  }
  IO.write(
    file,
    s"""package shapely
       |
       |trait SealedTrait
       |
       |${sealedtraits.mkString("\n\n")}
       |""".stripMargin)
  Seq(file)
}.taskValue
