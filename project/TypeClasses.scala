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
    val productArity = 30

    val products: Seq[String] = (4 to productArity).map { i =>
      val index = i - 1
      val indexMinus1 = index - 1
      val functionName = s"product${index}"
      val productTypes = (1 to i).map(p => s"A${p}")
      val xproductTypes = (1 to index).map(p => s"x${p}")
      val initXproductTypes = (1 to indexMinus1).map(p => s"x${p}")
      val initProductTypes = (1 to indexMinus1).map(p => s"A${p}").mkString(", ")
      val initProductTypesNonString = (1 to indexMinus1).map(p => s"A${p}")
      val ptString = productTypes.mkString(", ")
      val ptStringWrapped = s"(${ptString})"
      val ptStringWrappedLS = ptStringWrapped.toLowerCase()
      val functionInputs = s"(${productTypes.dropRight(1).mkString(", ")})"
      val functionOutput = productTypes.last
      val f1 = s"f: ${functionInputs} => ${functionOutput}"
      val f2 = s"g: ${functionOutput} => ${functionInputs}"
      val fs = (1 to index).map(p => s"f${p}: F[A${p}]").mkString(", ")
      val fsi = (1 to indexMinus1).map(p => s"f${p}").mkString(", ")
      val returnType = s"F[A${i}]"

      s"""
         |  def ${functionName}[${productTypes.mkString(", ")}](${f1})(${f2})(${fs}): ${returnType} = {
         |      val productx: F[(${initProductTypes})] = product${(1 to indexMinus1).size}[${initProductTypes}, (${initProductTypes})]((${initProductTypes.toLowerCase()}) => (${initProductTypes.toLowerCase()}))(x => x)(${fsi})
         |
         |      product2[(${initProductTypes}), A${index}, A${i}]({ case ((${initProductTypes.toLowerCase}), a${index}) => f(${initProductTypes.toLowerCase()}, a${index}) }) { a${i} =>
         |        val (${xproductTypes.mkString(", ")}) = g(a${i})
         |        ((${initXproductTypes.mkString(", ")}), x${index})
         |      }(productx, f${index})
         |    }
         |""".stripMargin
    }

    s"""
       |package shapely
       |
       |trait InvariantApplicativeFunctor[F[_]] {
       |  def pure[A](a: A): F[A]
       |  def product1[A, B](f: A => B)(g: B => A)(fa: F[A]): F[B]
       |  def product2[A, B, C](f: (A, B) => C)(g: C => (A, B))(fa: F[A], fb: F[B]): F[C]
       |  ${products.mkString("\n")}
       | }
       |""".stripMargin
  }

  def Lazy(productArity: Int): String = {
    // TODO: Generate all products in InvariantApplicativeFunctor
    val lazyInstances = (1 to productArity).map { i =>
      val tparams = (1 to i).map(p => s"A$p").mkString(", ")
      val lparams = (1 to i).map(p => s"L$p <: String").mkString(", ")
      val lparams_ = (1 to i).map(p => s"L$p").mkString(", ")
      val valueParams = (1 to i).map(p => s"v${p}: ValueOf[L$p]").mkString(", ")
      val fieldNames = (1 to i).map(p => s"v${p}.value.toString").mkString(", ")
      val fEvidences = (1 to i).map(p => s"ev${p}: F[A${p}]")

      s"""
         |  implicit def deriveF1${i}[F[_], A, ${tparams}, ${lparams}](implicit f: InvariantApplicativeFunctor[F]): Lazy[F, CaseClass$i[A, $tparams, $lparams_]] = {
         |     FieldNames.instance(List(${fieldNames}))
         |  }
         |""".stripMargin
    }

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
