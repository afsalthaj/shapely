object TypeClasses {
  def FieldNames(productArity: Int) = {
    val fieldNameInstances = (1 to productArity).map { i =>
      val tparams = (1 to i).map(p => s"A$p").mkString(", ")
      val lparams = (1 to i).map(p => s"L$p <: String").mkString(", ")
      val lparams_ = (1 to i).map(p => s"L$p").mkString(", ")
      val valueParams = (1 to i).map(p => s"v${p}: ValueOf[L$p]").mkString(", ")
      val fieldNames = (1 to i).map(p => s"v${p}.value.toString").mkString(", ")

      s"""
         |  implicit def fieldNamesOfCaseClass${i}[A, ${tparams}, ${lparams}](implicit ${valueParams}): FieldNames[CaseClass$i[A, $tparams, $lparams_]] = {
         |    FieldNames.instance(List(${fieldNames}))
         |  }
         |""".stripMargin
    }

    s"""package shapely
       |
       |
       |trait FieldNames[A] {
       |  def fieldNames: List[String]
       |}
       |
       |object FieldNames {
       |  def instance[A](list: List[String]): FieldNames[A] = new FieldNames[A] {
       |    def fieldNames: List[String] = list
       |  }
       |
       |${fieldNameInstances.mkString("\n")}
       |}
         """.stripMargin
  }

  val InvariantApplicativeFunctor: String = {
    s"""
       |package shapely
       |
       |trait InvariantApplicativeFunctor[F[_]] {
       |  def pure[A](a: A): F[A]
       |  def product1[A, B](f: A => B)(g: B => A)(fa: F[A]): F[B]
       |  def product2[A, B, C](f: (A, B) => C)(g: C => (A, B))(fa: F[A], fb: F[B]): F[C]
       | }
       |""".stripMargin
  }

  val Lazy: String = {
    s"""
       |package shapely
       |
       |trait Lazy[F[_], A]{
       |   def instance: F[A]
       | }
       |
       |object Lazy {
       |  def instance[F[_], A](fa: => F[A]) = new Lazy[F, A] {
       |    def instance = fa
       |  }
       | // Derive any typeclass for CaseClass1
       |  implicit def deriveF1[F[_], A, A1, L1 <: String](implicit f: InvariantApplicativeFunctor[F], ev: F[A1]): Lazy[F, CaseClass1[A, A1, L1]] =
       |    instance(f.product1[A1, CaseClass1[A, A1, L1]](CaseClass1(_))(_._1)(ev))
       | }
       |""".stripMargin
  }
}
