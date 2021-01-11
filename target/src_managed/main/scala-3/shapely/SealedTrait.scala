package shapely

trait SealedTrait[A] { def value: A }

sealed trait SealedTrait1[A, A1 <: A] extends SealedTrait[A] {
  def either: A1 = this match {
    case SealedTrait1._1(v) => v
  }
}
object SealedTrait1 {
  def uneither[A, A1 <: A](e: A1): SealedTrait1[A, A1] = e match {
    case v => _1(v)
  }
  final case class _1[A, A1 <: A](value: A1) extends SealedTrait1[A, A1]
}

sealed trait SealedTrait2[A, A1 <: A, A2 <: A] extends SealedTrait[A] {
  def either: Either[A1, A2] = this match {
    case SealedTrait2._1(v) => Left(v)
    case SealedTrait2._2(v) => Right(v)
  }
}
object SealedTrait2 {
  def uneither[A, A1 <: A, A2 <: A](e: Either[A1, A2]): SealedTrait2[A, A1, A2] = e match {
    case Left(v) => _1(v)
    case Right(v) => _2(v)
  }
  final case class _1[A, A1 <: A, A2 <: A](value: A1) extends SealedTrait2[A, A1, A2]
  final case class _2[A, A1 <: A, A2 <: A](value: A2) extends SealedTrait2[A, A1, A2]
}

sealed trait SealedTrait3[A, A1 <: A, A2 <: A, A3 <: A] extends SealedTrait[A] {
  def either: Either[A1, Either[A2, A3]] = this match {
    case SealedTrait3._1(v) => Left(v)
    case SealedTrait3._2(v) => Right(Left(v))
    case SealedTrait3._3(v) => Right(Right(v))
  }
}
object SealedTrait3 {
  def uneither[A, A1 <: A, A2 <: A, A3 <: A](e: Either[A1, Either[A2, A3]]): SealedTrait3[A, A1, A2, A3] = e match {
    case Left(v) => _1(v)
    case Right(Left(v)) => _2(v)
    case Right(Right(v)) => _3(v)
  }
  final case class _1[A, A1 <: A, A2 <: A, A3 <: A](value: A1) extends SealedTrait3[A, A1, A2, A3]
  final case class _2[A, A1 <: A, A2 <: A, A3 <: A](value: A2) extends SealedTrait3[A, A1, A2, A3]
  final case class _3[A, A1 <: A, A2 <: A, A3 <: A](value: A3) extends SealedTrait3[A, A1, A2, A3]
}

sealed trait SealedTrait4[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A] extends SealedTrait[A] {
  def either: Either[A1, Either[A2, Either[A3, A4]]] = this match {
    case SealedTrait4._1(v) => Left(v)
    case SealedTrait4._2(v) => Right(Left(v))
    case SealedTrait4._3(v) => Right(Right(Left(v)))
    case SealedTrait4._4(v) => Right(Right(Right(v)))
  }
}
object SealedTrait4 {
  def uneither[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A](e: Either[A1, Either[A2, Either[A3, A4]]]): SealedTrait4[A, A1, A2, A3, A4] = e match {
    case Left(v) => _1(v)
    case Right(Left(v)) => _2(v)
    case Right(Right(Left(v))) => _3(v)
    case Right(Right(Right(v))) => _4(v)
  }
  final case class _1[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A](value: A1) extends SealedTrait4[A, A1, A2, A3, A4]
  final case class _2[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A](value: A2) extends SealedTrait4[A, A1, A2, A3, A4]
  final case class _3[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A](value: A3) extends SealedTrait4[A, A1, A2, A3, A4]
  final case class _4[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A](value: A4) extends SealedTrait4[A, A1, A2, A3, A4]
}

sealed trait SealedTrait5[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A] extends SealedTrait[A] {
  def either: Either[A1, Either[A2, Either[A3, Either[A4, A5]]]] = this match {
    case SealedTrait5._1(v) => Left(v)
    case SealedTrait5._2(v) => Right(Left(v))
    case SealedTrait5._3(v) => Right(Right(Left(v)))
    case SealedTrait5._4(v) => Right(Right(Right(Left(v))))
    case SealedTrait5._5(v) => Right(Right(Right(Right(v))))
  }
}
object SealedTrait5 {
  def uneither[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A](e: Either[A1, Either[A2, Either[A3, Either[A4, A5]]]]): SealedTrait5[A, A1, A2, A3, A4, A5] = e match {
    case Left(v) => _1(v)
    case Right(Left(v)) => _2(v)
    case Right(Right(Left(v))) => _3(v)
    case Right(Right(Right(Left(v)))) => _4(v)
    case Right(Right(Right(Right(v)))) => _5(v)
  }
  final case class _1[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A](value: A1) extends SealedTrait5[A, A1, A2, A3, A4, A5]
  final case class _2[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A](value: A2) extends SealedTrait5[A, A1, A2, A3, A4, A5]
  final case class _3[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A](value: A3) extends SealedTrait5[A, A1, A2, A3, A4, A5]
  final case class _4[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A](value: A4) extends SealedTrait5[A, A1, A2, A3, A4, A5]
  final case class _5[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A](value: A5) extends SealedTrait5[A, A1, A2, A3, A4, A5]
}

sealed trait SealedTrait6[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A] extends SealedTrait[A] {
  def either: Either[A1, Either[A2, Either[A3, Either[A4, Either[A5, A6]]]]] = this match {
    case SealedTrait6._1(v) => Left(v)
    case SealedTrait6._2(v) => Right(Left(v))
    case SealedTrait6._3(v) => Right(Right(Left(v)))
    case SealedTrait6._4(v) => Right(Right(Right(Left(v))))
    case SealedTrait6._5(v) => Right(Right(Right(Right(Left(v)))))
    case SealedTrait6._6(v) => Right(Right(Right(Right(Right(v)))))
  }
}
object SealedTrait6 {
  def uneither[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A](e: Either[A1, Either[A2, Either[A3, Either[A4, Either[A5, A6]]]]]): SealedTrait6[A, A1, A2, A3, A4, A5, A6] = e match {
    case Left(v) => _1(v)
    case Right(Left(v)) => _2(v)
    case Right(Right(Left(v))) => _3(v)
    case Right(Right(Right(Left(v)))) => _4(v)
    case Right(Right(Right(Right(Left(v))))) => _5(v)
    case Right(Right(Right(Right(Right(v))))) => _6(v)
  }
  final case class _1[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A](value: A1) extends SealedTrait6[A, A1, A2, A3, A4, A5, A6]
  final case class _2[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A](value: A2) extends SealedTrait6[A, A1, A2, A3, A4, A5, A6]
  final case class _3[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A](value: A3) extends SealedTrait6[A, A1, A2, A3, A4, A5, A6]
  final case class _4[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A](value: A4) extends SealedTrait6[A, A1, A2, A3, A4, A5, A6]
  final case class _5[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A](value: A5) extends SealedTrait6[A, A1, A2, A3, A4, A5, A6]
  final case class _6[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A](value: A6) extends SealedTrait6[A, A1, A2, A3, A4, A5, A6]
}

sealed trait SealedTrait7[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A] extends SealedTrait[A] {
  def either: Either[A1, Either[A2, Either[A3, Either[A4, Either[A5, Either[A6, A7]]]]]] = this match {
    case SealedTrait7._1(v) => Left(v)
    case SealedTrait7._2(v) => Right(Left(v))
    case SealedTrait7._3(v) => Right(Right(Left(v)))
    case SealedTrait7._4(v) => Right(Right(Right(Left(v))))
    case SealedTrait7._5(v) => Right(Right(Right(Right(Left(v)))))
    case SealedTrait7._6(v) => Right(Right(Right(Right(Right(Left(v))))))
    case SealedTrait7._7(v) => Right(Right(Right(Right(Right(Right(v))))))
  }
}
object SealedTrait7 {
  def uneither[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A](e: Either[A1, Either[A2, Either[A3, Either[A4, Either[A5, Either[A6, A7]]]]]]): SealedTrait7[A, A1, A2, A3, A4, A5, A6, A7] = e match {
    case Left(v) => _1(v)
    case Right(Left(v)) => _2(v)
    case Right(Right(Left(v))) => _3(v)
    case Right(Right(Right(Left(v)))) => _4(v)
    case Right(Right(Right(Right(Left(v))))) => _5(v)
    case Right(Right(Right(Right(Right(Left(v)))))) => _6(v)
    case Right(Right(Right(Right(Right(Right(v)))))) => _7(v)
  }
  final case class _1[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A](value: A1) extends SealedTrait7[A, A1, A2, A3, A4, A5, A6, A7]
  final case class _2[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A](value: A2) extends SealedTrait7[A, A1, A2, A3, A4, A5, A6, A7]
  final case class _3[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A](value: A3) extends SealedTrait7[A, A1, A2, A3, A4, A5, A6, A7]
  final case class _4[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A](value: A4) extends SealedTrait7[A, A1, A2, A3, A4, A5, A6, A7]
  final case class _5[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A](value: A5) extends SealedTrait7[A, A1, A2, A3, A4, A5, A6, A7]
  final case class _6[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A](value: A6) extends SealedTrait7[A, A1, A2, A3, A4, A5, A6, A7]
  final case class _7[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A](value: A7) extends SealedTrait7[A, A1, A2, A3, A4, A5, A6, A7]
}

sealed trait SealedTrait8[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A] extends SealedTrait[A] {
  def either: Either[A1, Either[A2, Either[A3, Either[A4, Either[A5, Either[A6, Either[A7, A8]]]]]]] = this match {
    case SealedTrait8._1(v) => Left(v)
    case SealedTrait8._2(v) => Right(Left(v))
    case SealedTrait8._3(v) => Right(Right(Left(v)))
    case SealedTrait8._4(v) => Right(Right(Right(Left(v))))
    case SealedTrait8._5(v) => Right(Right(Right(Right(Left(v)))))
    case SealedTrait8._6(v) => Right(Right(Right(Right(Right(Left(v))))))
    case SealedTrait8._7(v) => Right(Right(Right(Right(Right(Right(Left(v)))))))
    case SealedTrait8._8(v) => Right(Right(Right(Right(Right(Right(Right(v)))))))
  }
}
object SealedTrait8 {
  def uneither[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A](e: Either[A1, Either[A2, Either[A3, Either[A4, Either[A5, Either[A6, Either[A7, A8]]]]]]]): SealedTrait8[A, A1, A2, A3, A4, A5, A6, A7, A8] = e match {
    case Left(v) => _1(v)
    case Right(Left(v)) => _2(v)
    case Right(Right(Left(v))) => _3(v)
    case Right(Right(Right(Left(v)))) => _4(v)
    case Right(Right(Right(Right(Left(v))))) => _5(v)
    case Right(Right(Right(Right(Right(Left(v)))))) => _6(v)
    case Right(Right(Right(Right(Right(Right(Left(v))))))) => _7(v)
    case Right(Right(Right(Right(Right(Right(Right(v))))))) => _8(v)
  }
  final case class _1[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A](value: A1) extends SealedTrait8[A, A1, A2, A3, A4, A5, A6, A7, A8]
  final case class _2[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A](value: A2) extends SealedTrait8[A, A1, A2, A3, A4, A5, A6, A7, A8]
  final case class _3[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A](value: A3) extends SealedTrait8[A, A1, A2, A3, A4, A5, A6, A7, A8]
  final case class _4[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A](value: A4) extends SealedTrait8[A, A1, A2, A3, A4, A5, A6, A7, A8]
  final case class _5[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A](value: A5) extends SealedTrait8[A, A1, A2, A3, A4, A5, A6, A7, A8]
  final case class _6[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A](value: A6) extends SealedTrait8[A, A1, A2, A3, A4, A5, A6, A7, A8]
  final case class _7[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A](value: A7) extends SealedTrait8[A, A1, A2, A3, A4, A5, A6, A7, A8]
  final case class _8[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A](value: A8) extends SealedTrait8[A, A1, A2, A3, A4, A5, A6, A7, A8]
}

sealed trait SealedTrait9[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A] extends SealedTrait[A] {
  def either: Either[A1, Either[A2, Either[A3, Either[A4, Either[A5, Either[A6, Either[A7, Either[A8, A9]]]]]]]] = this match {
    case SealedTrait9._1(v) => Left(v)
    case SealedTrait9._2(v) => Right(Left(v))
    case SealedTrait9._3(v) => Right(Right(Left(v)))
    case SealedTrait9._4(v) => Right(Right(Right(Left(v))))
    case SealedTrait9._5(v) => Right(Right(Right(Right(Left(v)))))
    case SealedTrait9._6(v) => Right(Right(Right(Right(Right(Left(v))))))
    case SealedTrait9._7(v) => Right(Right(Right(Right(Right(Right(Left(v)))))))
    case SealedTrait9._8(v) => Right(Right(Right(Right(Right(Right(Right(Left(v))))))))
    case SealedTrait9._9(v) => Right(Right(Right(Right(Right(Right(Right(Right(v))))))))
  }
}
object SealedTrait9 {
  def uneither[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A](e: Either[A1, Either[A2, Either[A3, Either[A4, Either[A5, Either[A6, Either[A7, Either[A8, A9]]]]]]]]): SealedTrait9[A, A1, A2, A3, A4, A5, A6, A7, A8, A9] = e match {
    case Left(v) => _1(v)
    case Right(Left(v)) => _2(v)
    case Right(Right(Left(v))) => _3(v)
    case Right(Right(Right(Left(v)))) => _4(v)
    case Right(Right(Right(Right(Left(v))))) => _5(v)
    case Right(Right(Right(Right(Right(Left(v)))))) => _6(v)
    case Right(Right(Right(Right(Right(Right(Left(v))))))) => _7(v)
    case Right(Right(Right(Right(Right(Right(Right(Left(v)))))))) => _8(v)
    case Right(Right(Right(Right(Right(Right(Right(Right(v)))))))) => _9(v)
  }
  final case class _1[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A](value: A1) extends SealedTrait9[A, A1, A2, A3, A4, A5, A6, A7, A8, A9]
  final case class _2[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A](value: A2) extends SealedTrait9[A, A1, A2, A3, A4, A5, A6, A7, A8, A9]
  final case class _3[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A](value: A3) extends SealedTrait9[A, A1, A2, A3, A4, A5, A6, A7, A8, A9]
  final case class _4[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A](value: A4) extends SealedTrait9[A, A1, A2, A3, A4, A5, A6, A7, A8, A9]
  final case class _5[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A](value: A5) extends SealedTrait9[A, A1, A2, A3, A4, A5, A6, A7, A8, A9]
  final case class _6[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A](value: A6) extends SealedTrait9[A, A1, A2, A3, A4, A5, A6, A7, A8, A9]
  final case class _7[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A](value: A7) extends SealedTrait9[A, A1, A2, A3, A4, A5, A6, A7, A8, A9]
  final case class _8[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A](value: A8) extends SealedTrait9[A, A1, A2, A3, A4, A5, A6, A7, A8, A9]
  final case class _9[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A](value: A9) extends SealedTrait9[A, A1, A2, A3, A4, A5, A6, A7, A8, A9]
}

sealed trait SealedTrait10[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A] extends SealedTrait[A] {
  def either: Either[A1, Either[A2, Either[A3, Either[A4, Either[A5, Either[A6, Either[A7, Either[A8, Either[A9, A10]]]]]]]]] = this match {
    case SealedTrait10._1(v) => Left(v)
    case SealedTrait10._2(v) => Right(Left(v))
    case SealedTrait10._3(v) => Right(Right(Left(v)))
    case SealedTrait10._4(v) => Right(Right(Right(Left(v))))
    case SealedTrait10._5(v) => Right(Right(Right(Right(Left(v)))))
    case SealedTrait10._6(v) => Right(Right(Right(Right(Right(Left(v))))))
    case SealedTrait10._7(v) => Right(Right(Right(Right(Right(Right(Left(v)))))))
    case SealedTrait10._8(v) => Right(Right(Right(Right(Right(Right(Right(Left(v))))))))
    case SealedTrait10._9(v) => Right(Right(Right(Right(Right(Right(Right(Right(Left(v)))))))))
    case SealedTrait10._10(v) => Right(Right(Right(Right(Right(Right(Right(Right(Right(v)))))))))
  }
}
object SealedTrait10 {
  def uneither[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A](e: Either[A1, Either[A2, Either[A3, Either[A4, Either[A5, Either[A6, Either[A7, Either[A8, Either[A9, A10]]]]]]]]]): SealedTrait10[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10] = e match {
    case Left(v) => _1(v)
    case Right(Left(v)) => _2(v)
    case Right(Right(Left(v))) => _3(v)
    case Right(Right(Right(Left(v)))) => _4(v)
    case Right(Right(Right(Right(Left(v))))) => _5(v)
    case Right(Right(Right(Right(Right(Left(v)))))) => _6(v)
    case Right(Right(Right(Right(Right(Right(Left(v))))))) => _7(v)
    case Right(Right(Right(Right(Right(Right(Right(Left(v)))))))) => _8(v)
    case Right(Right(Right(Right(Right(Right(Right(Right(Left(v))))))))) => _9(v)
    case Right(Right(Right(Right(Right(Right(Right(Right(Right(v))))))))) => _10(v)
  }
  final case class _1[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A](value: A1) extends SealedTrait10[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10]
  final case class _2[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A](value: A2) extends SealedTrait10[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10]
  final case class _3[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A](value: A3) extends SealedTrait10[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10]
  final case class _4[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A](value: A4) extends SealedTrait10[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10]
  final case class _5[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A](value: A5) extends SealedTrait10[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10]
  final case class _6[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A](value: A6) extends SealedTrait10[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10]
  final case class _7[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A](value: A7) extends SealedTrait10[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10]
  final case class _8[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A](value: A8) extends SealedTrait10[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10]
  final case class _9[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A](value: A9) extends SealedTrait10[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10]
  final case class _10[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A](value: A10) extends SealedTrait10[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10]
}

sealed trait SealedTrait11[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A] extends SealedTrait[A] {
  def either: Either[A1, Either[A2, Either[A3, Either[A4, Either[A5, Either[A6, Either[A7, Either[A8, Either[A9, Either[A10, A11]]]]]]]]]] = this match {
    case SealedTrait11._1(v) => Left(v)
    case SealedTrait11._2(v) => Right(Left(v))
    case SealedTrait11._3(v) => Right(Right(Left(v)))
    case SealedTrait11._4(v) => Right(Right(Right(Left(v))))
    case SealedTrait11._5(v) => Right(Right(Right(Right(Left(v)))))
    case SealedTrait11._6(v) => Right(Right(Right(Right(Right(Left(v))))))
    case SealedTrait11._7(v) => Right(Right(Right(Right(Right(Right(Left(v)))))))
    case SealedTrait11._8(v) => Right(Right(Right(Right(Right(Right(Right(Left(v))))))))
    case SealedTrait11._9(v) => Right(Right(Right(Right(Right(Right(Right(Right(Left(v)))))))))
    case SealedTrait11._10(v) => Right(Right(Right(Right(Right(Right(Right(Right(Right(Left(v))))))))))
    case SealedTrait11._11(v) => Right(Right(Right(Right(Right(Right(Right(Right(Right(Right(v))))))))))
  }
}
object SealedTrait11 {
  def uneither[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A](e: Either[A1, Either[A2, Either[A3, Either[A4, Either[A5, Either[A6, Either[A7, Either[A8, Either[A9, Either[A10, A11]]]]]]]]]]): SealedTrait11[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11] = e match {
    case Left(v) => _1(v)
    case Right(Left(v)) => _2(v)
    case Right(Right(Left(v))) => _3(v)
    case Right(Right(Right(Left(v)))) => _4(v)
    case Right(Right(Right(Right(Left(v))))) => _5(v)
    case Right(Right(Right(Right(Right(Left(v)))))) => _6(v)
    case Right(Right(Right(Right(Right(Right(Left(v))))))) => _7(v)
    case Right(Right(Right(Right(Right(Right(Right(Left(v)))))))) => _8(v)
    case Right(Right(Right(Right(Right(Right(Right(Right(Left(v))))))))) => _9(v)
    case Right(Right(Right(Right(Right(Right(Right(Right(Right(Left(v)))))))))) => _10(v)
    case Right(Right(Right(Right(Right(Right(Right(Right(Right(Right(v)))))))))) => _11(v)
  }
  final case class _1[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A](value: A1) extends SealedTrait11[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11]
  final case class _2[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A](value: A2) extends SealedTrait11[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11]
  final case class _3[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A](value: A3) extends SealedTrait11[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11]
  final case class _4[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A](value: A4) extends SealedTrait11[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11]
  final case class _5[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A](value: A5) extends SealedTrait11[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11]
  final case class _6[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A](value: A6) extends SealedTrait11[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11]
  final case class _7[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A](value: A7) extends SealedTrait11[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11]
  final case class _8[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A](value: A8) extends SealedTrait11[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11]
  final case class _9[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A](value: A9) extends SealedTrait11[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11]
  final case class _10[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A](value: A10) extends SealedTrait11[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11]
  final case class _11[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A](value: A11) extends SealedTrait11[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11]
}

sealed trait SealedTrait12[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A] extends SealedTrait[A] {
  def either: Either[A1, Either[A2, Either[A3, Either[A4, Either[A5, Either[A6, Either[A7, Either[A8, Either[A9, Either[A10, Either[A11, A12]]]]]]]]]]] = this match {
    case SealedTrait12._1(v) => Left(v)
    case SealedTrait12._2(v) => Right(Left(v))
    case SealedTrait12._3(v) => Right(Right(Left(v)))
    case SealedTrait12._4(v) => Right(Right(Right(Left(v))))
    case SealedTrait12._5(v) => Right(Right(Right(Right(Left(v)))))
    case SealedTrait12._6(v) => Right(Right(Right(Right(Right(Left(v))))))
    case SealedTrait12._7(v) => Right(Right(Right(Right(Right(Right(Left(v)))))))
    case SealedTrait12._8(v) => Right(Right(Right(Right(Right(Right(Right(Left(v))))))))
    case SealedTrait12._9(v) => Right(Right(Right(Right(Right(Right(Right(Right(Left(v)))))))))
    case SealedTrait12._10(v) => Right(Right(Right(Right(Right(Right(Right(Right(Right(Left(v))))))))))
    case SealedTrait12._11(v) => Right(Right(Right(Right(Right(Right(Right(Right(Right(Right(Left(v)))))))))))
    case SealedTrait12._12(v) => Right(Right(Right(Right(Right(Right(Right(Right(Right(Right(Right(v)))))))))))
  }
}
object SealedTrait12 {
  def uneither[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A](e: Either[A1, Either[A2, Either[A3, Either[A4, Either[A5, Either[A6, Either[A7, Either[A8, Either[A9, Either[A10, Either[A11, A12]]]]]]]]]]]): SealedTrait12[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12] = e match {
    case Left(v) => _1(v)
    case Right(Left(v)) => _2(v)
    case Right(Right(Left(v))) => _3(v)
    case Right(Right(Right(Left(v)))) => _4(v)
    case Right(Right(Right(Right(Left(v))))) => _5(v)
    case Right(Right(Right(Right(Right(Left(v)))))) => _6(v)
    case Right(Right(Right(Right(Right(Right(Left(v))))))) => _7(v)
    case Right(Right(Right(Right(Right(Right(Right(Left(v)))))))) => _8(v)
    case Right(Right(Right(Right(Right(Right(Right(Right(Left(v))))))))) => _9(v)
    case Right(Right(Right(Right(Right(Right(Right(Right(Right(Left(v)))))))))) => _10(v)
    case Right(Right(Right(Right(Right(Right(Right(Right(Right(Right(Left(v))))))))))) => _11(v)
    case Right(Right(Right(Right(Right(Right(Right(Right(Right(Right(Right(v))))))))))) => _12(v)
  }
  final case class _1[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A](value: A1) extends SealedTrait12[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12]
  final case class _2[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A](value: A2) extends SealedTrait12[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12]
  final case class _3[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A](value: A3) extends SealedTrait12[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12]
  final case class _4[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A](value: A4) extends SealedTrait12[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12]
  final case class _5[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A](value: A5) extends SealedTrait12[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12]
  final case class _6[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A](value: A6) extends SealedTrait12[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12]
  final case class _7[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A](value: A7) extends SealedTrait12[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12]
  final case class _8[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A](value: A8) extends SealedTrait12[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12]
  final case class _9[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A](value: A9) extends SealedTrait12[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12]
  final case class _10[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A](value: A10) extends SealedTrait12[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12]
  final case class _11[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A](value: A11) extends SealedTrait12[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12]
  final case class _12[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A](value: A12) extends SealedTrait12[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12]
}

sealed trait SealedTrait13[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A] extends SealedTrait[A]

sealed trait SealedTrait14[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A] extends SealedTrait[A]

sealed trait SealedTrait15[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A] extends SealedTrait[A]

sealed trait SealedTrait16[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A] extends SealedTrait[A]

sealed trait SealedTrait17[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A] extends SealedTrait[A]

sealed trait SealedTrait18[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A] extends SealedTrait[A]

sealed trait SealedTrait19[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A] extends SealedTrait[A]

sealed trait SealedTrait20[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A] extends SealedTrait[A]

sealed trait SealedTrait21[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A] extends SealedTrait[A]

sealed trait SealedTrait22[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A] extends SealedTrait[A]

sealed trait SealedTrait23[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A] extends SealedTrait[A]

sealed trait SealedTrait24[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A] extends SealedTrait[A]

sealed trait SealedTrait25[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A] extends SealedTrait[A]

sealed trait SealedTrait26[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A] extends SealedTrait[A]

sealed trait SealedTrait27[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A] extends SealedTrait[A]

sealed trait SealedTrait28[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A, A28 <: A] extends SealedTrait[A]

sealed trait SealedTrait29[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A, A28 <: A, A29 <: A] extends SealedTrait[A]

sealed trait SealedTrait30[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A, A28 <: A, A29 <: A, A30 <: A] extends SealedTrait[A]

sealed trait SealedTrait31[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A, A28 <: A, A29 <: A, A30 <: A, A31 <: A] extends SealedTrait[A]

sealed trait SealedTrait32[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A, A28 <: A, A29 <: A, A30 <: A, A31 <: A, A32 <: A] extends SealedTrait[A]

sealed trait SealedTrait33[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A, A28 <: A, A29 <: A, A30 <: A, A31 <: A, A32 <: A, A33 <: A] extends SealedTrait[A]

sealed trait SealedTrait34[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A, A28 <: A, A29 <: A, A30 <: A, A31 <: A, A32 <: A, A33 <: A, A34 <: A] extends SealedTrait[A]

sealed trait SealedTrait35[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A, A28 <: A, A29 <: A, A30 <: A, A31 <: A, A32 <: A, A33 <: A, A34 <: A, A35 <: A] extends SealedTrait[A]

sealed trait SealedTrait36[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A, A28 <: A, A29 <: A, A30 <: A, A31 <: A, A32 <: A, A33 <: A, A34 <: A, A35 <: A, A36 <: A] extends SealedTrait[A]

sealed trait SealedTrait37[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A, A28 <: A, A29 <: A, A30 <: A, A31 <: A, A32 <: A, A33 <: A, A34 <: A, A35 <: A, A36 <: A, A37 <: A] extends SealedTrait[A]

sealed trait SealedTrait38[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A, A28 <: A, A29 <: A, A30 <: A, A31 <: A, A32 <: A, A33 <: A, A34 <: A, A35 <: A, A36 <: A, A37 <: A, A38 <: A] extends SealedTrait[A]

sealed trait SealedTrait39[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A, A28 <: A, A29 <: A, A30 <: A, A31 <: A, A32 <: A, A33 <: A, A34 <: A, A35 <: A, A36 <: A, A37 <: A, A38 <: A, A39 <: A] extends SealedTrait[A]

sealed trait SealedTrait40[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A, A28 <: A, A29 <: A, A30 <: A, A31 <: A, A32 <: A, A33 <: A, A34 <: A, A35 <: A, A36 <: A, A37 <: A, A38 <: A, A39 <: A, A40 <: A] extends SealedTrait[A]

sealed trait SealedTrait41[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A, A28 <: A, A29 <: A, A30 <: A, A31 <: A, A32 <: A, A33 <: A, A34 <: A, A35 <: A, A36 <: A, A37 <: A, A38 <: A, A39 <: A, A40 <: A, A41 <: A] extends SealedTrait[A]

sealed trait SealedTrait42[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A, A28 <: A, A29 <: A, A30 <: A, A31 <: A, A32 <: A, A33 <: A, A34 <: A, A35 <: A, A36 <: A, A37 <: A, A38 <: A, A39 <: A, A40 <: A, A41 <: A, A42 <: A] extends SealedTrait[A]

sealed trait SealedTrait43[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A, A28 <: A, A29 <: A, A30 <: A, A31 <: A, A32 <: A, A33 <: A, A34 <: A, A35 <: A, A36 <: A, A37 <: A, A38 <: A, A39 <: A, A40 <: A, A41 <: A, A42 <: A, A43 <: A] extends SealedTrait[A]

sealed trait SealedTrait44[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A, A28 <: A, A29 <: A, A30 <: A, A31 <: A, A32 <: A, A33 <: A, A34 <: A, A35 <: A, A36 <: A, A37 <: A, A38 <: A, A39 <: A, A40 <: A, A41 <: A, A42 <: A, A43 <: A, A44 <: A] extends SealedTrait[A]

sealed trait SealedTrait45[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A, A28 <: A, A29 <: A, A30 <: A, A31 <: A, A32 <: A, A33 <: A, A34 <: A, A35 <: A, A36 <: A, A37 <: A, A38 <: A, A39 <: A, A40 <: A, A41 <: A, A42 <: A, A43 <: A, A44 <: A, A45 <: A] extends SealedTrait[A]

sealed trait SealedTrait46[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A, A28 <: A, A29 <: A, A30 <: A, A31 <: A, A32 <: A, A33 <: A, A34 <: A, A35 <: A, A36 <: A, A37 <: A, A38 <: A, A39 <: A, A40 <: A, A41 <: A, A42 <: A, A43 <: A, A44 <: A, A45 <: A, A46 <: A] extends SealedTrait[A]

sealed trait SealedTrait47[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A, A28 <: A, A29 <: A, A30 <: A, A31 <: A, A32 <: A, A33 <: A, A34 <: A, A35 <: A, A36 <: A, A37 <: A, A38 <: A, A39 <: A, A40 <: A, A41 <: A, A42 <: A, A43 <: A, A44 <: A, A45 <: A, A46 <: A, A47 <: A] extends SealedTrait[A]

sealed trait SealedTrait48[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A, A28 <: A, A29 <: A, A30 <: A, A31 <: A, A32 <: A, A33 <: A, A34 <: A, A35 <: A, A36 <: A, A37 <: A, A38 <: A, A39 <: A, A40 <: A, A41 <: A, A42 <: A, A43 <: A, A44 <: A, A45 <: A, A46 <: A, A47 <: A, A48 <: A] extends SealedTrait[A]

sealed trait SealedTrait49[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A, A28 <: A, A29 <: A, A30 <: A, A31 <: A, A32 <: A, A33 <: A, A34 <: A, A35 <: A, A36 <: A, A37 <: A, A38 <: A, A39 <: A, A40 <: A, A41 <: A, A42 <: A, A43 <: A, A44 <: A, A45 <: A, A46 <: A, A47 <: A, A48 <: A, A49 <: A] extends SealedTrait[A]

sealed trait SealedTrait50[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A, A28 <: A, A29 <: A, A30 <: A, A31 <: A, A32 <: A, A33 <: A, A34 <: A, A35 <: A, A36 <: A, A37 <: A, A38 <: A, A39 <: A, A40 <: A, A41 <: A, A42 <: A, A43 <: A, A44 <: A, A45 <: A, A46 <: A, A47 <: A, A48 <: A, A49 <: A, A50 <: A] extends SealedTrait[A]

sealed trait SealedTrait51[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A, A28 <: A, A29 <: A, A30 <: A, A31 <: A, A32 <: A, A33 <: A, A34 <: A, A35 <: A, A36 <: A, A37 <: A, A38 <: A, A39 <: A, A40 <: A, A41 <: A, A42 <: A, A43 <: A, A44 <: A, A45 <: A, A46 <: A, A47 <: A, A48 <: A, A49 <: A, A50 <: A, A51 <: A] extends SealedTrait[A]

sealed trait SealedTrait52[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A, A28 <: A, A29 <: A, A30 <: A, A31 <: A, A32 <: A, A33 <: A, A34 <: A, A35 <: A, A36 <: A, A37 <: A, A38 <: A, A39 <: A, A40 <: A, A41 <: A, A42 <: A, A43 <: A, A44 <: A, A45 <: A, A46 <: A, A47 <: A, A48 <: A, A49 <: A, A50 <: A, A51 <: A, A52 <: A] extends SealedTrait[A]

sealed trait SealedTrait53[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A, A28 <: A, A29 <: A, A30 <: A, A31 <: A, A32 <: A, A33 <: A, A34 <: A, A35 <: A, A36 <: A, A37 <: A, A38 <: A, A39 <: A, A40 <: A, A41 <: A, A42 <: A, A43 <: A, A44 <: A, A45 <: A, A46 <: A, A47 <: A, A48 <: A, A49 <: A, A50 <: A, A51 <: A, A52 <: A, A53 <: A] extends SealedTrait[A]

sealed trait SealedTrait54[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A, A28 <: A, A29 <: A, A30 <: A, A31 <: A, A32 <: A, A33 <: A, A34 <: A, A35 <: A, A36 <: A, A37 <: A, A38 <: A, A39 <: A, A40 <: A, A41 <: A, A42 <: A, A43 <: A, A44 <: A, A45 <: A, A46 <: A, A47 <: A, A48 <: A, A49 <: A, A50 <: A, A51 <: A, A52 <: A, A53 <: A, A54 <: A] extends SealedTrait[A]

sealed trait SealedTrait55[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A, A28 <: A, A29 <: A, A30 <: A, A31 <: A, A32 <: A, A33 <: A, A34 <: A, A35 <: A, A36 <: A, A37 <: A, A38 <: A, A39 <: A, A40 <: A, A41 <: A, A42 <: A, A43 <: A, A44 <: A, A45 <: A, A46 <: A, A47 <: A, A48 <: A, A49 <: A, A50 <: A, A51 <: A, A52 <: A, A53 <: A, A54 <: A, A55 <: A] extends SealedTrait[A]

sealed trait SealedTrait56[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A, A28 <: A, A29 <: A, A30 <: A, A31 <: A, A32 <: A, A33 <: A, A34 <: A, A35 <: A, A36 <: A, A37 <: A, A38 <: A, A39 <: A, A40 <: A, A41 <: A, A42 <: A, A43 <: A, A44 <: A, A45 <: A, A46 <: A, A47 <: A, A48 <: A, A49 <: A, A50 <: A, A51 <: A, A52 <: A, A53 <: A, A54 <: A, A55 <: A, A56 <: A] extends SealedTrait[A]

sealed trait SealedTrait57[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A, A28 <: A, A29 <: A, A30 <: A, A31 <: A, A32 <: A, A33 <: A, A34 <: A, A35 <: A, A36 <: A, A37 <: A, A38 <: A, A39 <: A, A40 <: A, A41 <: A, A42 <: A, A43 <: A, A44 <: A, A45 <: A, A46 <: A, A47 <: A, A48 <: A, A49 <: A, A50 <: A, A51 <: A, A52 <: A, A53 <: A, A54 <: A, A55 <: A, A56 <: A, A57 <: A] extends SealedTrait[A]

sealed trait SealedTrait58[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A, A28 <: A, A29 <: A, A30 <: A, A31 <: A, A32 <: A, A33 <: A, A34 <: A, A35 <: A, A36 <: A, A37 <: A, A38 <: A, A39 <: A, A40 <: A, A41 <: A, A42 <: A, A43 <: A, A44 <: A, A45 <: A, A46 <: A, A47 <: A, A48 <: A, A49 <: A, A50 <: A, A51 <: A, A52 <: A, A53 <: A, A54 <: A, A55 <: A, A56 <: A, A57 <: A, A58 <: A] extends SealedTrait[A]

sealed trait SealedTrait59[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A, A28 <: A, A29 <: A, A30 <: A, A31 <: A, A32 <: A, A33 <: A, A34 <: A, A35 <: A, A36 <: A, A37 <: A, A38 <: A, A39 <: A, A40 <: A, A41 <: A, A42 <: A, A43 <: A, A44 <: A, A45 <: A, A46 <: A, A47 <: A, A48 <: A, A49 <: A, A50 <: A, A51 <: A, A52 <: A, A53 <: A, A54 <: A, A55 <: A, A56 <: A, A57 <: A, A58 <: A, A59 <: A] extends SealedTrait[A]

sealed trait SealedTrait60[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A, A28 <: A, A29 <: A, A30 <: A, A31 <: A, A32 <: A, A33 <: A, A34 <: A, A35 <: A, A36 <: A, A37 <: A, A38 <: A, A39 <: A, A40 <: A, A41 <: A, A42 <: A, A43 <: A, A44 <: A, A45 <: A, A46 <: A, A47 <: A, A48 <: A, A49 <: A, A50 <: A, A51 <: A, A52 <: A, A53 <: A, A54 <: A, A55 <: A, A56 <: A, A57 <: A, A58 <: A, A59 <: A, A60 <: A] extends SealedTrait[A]

sealed trait SealedTrait61[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A, A28 <: A, A29 <: A, A30 <: A, A31 <: A, A32 <: A, A33 <: A, A34 <: A, A35 <: A, A36 <: A, A37 <: A, A38 <: A, A39 <: A, A40 <: A, A41 <: A, A42 <: A, A43 <: A, A44 <: A, A45 <: A, A46 <: A, A47 <: A, A48 <: A, A49 <: A, A50 <: A, A51 <: A, A52 <: A, A53 <: A, A54 <: A, A55 <: A, A56 <: A, A57 <: A, A58 <: A, A59 <: A, A60 <: A, A61 <: A] extends SealedTrait[A]

sealed trait SealedTrait62[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A, A28 <: A, A29 <: A, A30 <: A, A31 <: A, A32 <: A, A33 <: A, A34 <: A, A35 <: A, A36 <: A, A37 <: A, A38 <: A, A39 <: A, A40 <: A, A41 <: A, A42 <: A, A43 <: A, A44 <: A, A45 <: A, A46 <: A, A47 <: A, A48 <: A, A49 <: A, A50 <: A, A51 <: A, A52 <: A, A53 <: A, A54 <: A, A55 <: A, A56 <: A, A57 <: A, A58 <: A, A59 <: A, A60 <: A, A61 <: A, A62 <: A] extends SealedTrait[A]

sealed trait SealedTrait63[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A, A28 <: A, A29 <: A, A30 <: A, A31 <: A, A32 <: A, A33 <: A, A34 <: A, A35 <: A, A36 <: A, A37 <: A, A38 <: A, A39 <: A, A40 <: A, A41 <: A, A42 <: A, A43 <: A, A44 <: A, A45 <: A, A46 <: A, A47 <: A, A48 <: A, A49 <: A, A50 <: A, A51 <: A, A52 <: A, A53 <: A, A54 <: A, A55 <: A, A56 <: A, A57 <: A, A58 <: A, A59 <: A, A60 <: A, A61 <: A, A62 <: A, A63 <: A] extends SealedTrait[A]

sealed trait SealedTrait64[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A, A28 <: A, A29 <: A, A30 <: A, A31 <: A, A32 <: A, A33 <: A, A34 <: A, A35 <: A, A36 <: A, A37 <: A, A38 <: A, A39 <: A, A40 <: A, A41 <: A, A42 <: A, A43 <: A, A44 <: A, A45 <: A, A46 <: A, A47 <: A, A48 <: A, A49 <: A, A50 <: A, A51 <: A, A52 <: A, A53 <: A, A54 <: A, A55 <: A, A56 <: A, A57 <: A, A58 <: A, A59 <: A, A60 <: A, A61 <: A, A62 <: A, A63 <: A, A64 <: A] extends SealedTrait[A]
