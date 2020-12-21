package shapely

trait SealedTrait

sealed trait SealedTrait1[A1] extends SealedTrait {
  def either: A1 = this match {
    case SealedTrait1._1(v) => v
  }
}
object SealedTrait1 {
  def uneither[A1](e: A1): SealedTrait1[A1] = e match {
    case v => _1(v)
  }
  case class _1[A1](value: A1) extends SealedTrait1[A1]
}

sealed trait SealedTrait2[A1, A2] extends SealedTrait {
  def either: Either[A1, A2] = this match {
    case SealedTrait2._1(v) => Left(v)
    case SealedTrait2._2(v) => Right(v)
  }
}
object SealedTrait2 {
  def uneither[A1, A2](e: Either[A1, A2]): SealedTrait2[A1, A2] = e match {
    case Left(v) => _1(v)
    case Right(v) => _2(v)
  }
  case class _1[A1, A2](value: A1) extends SealedTrait2[A1, A2]
  case class _2[A1, A2](value: A2) extends SealedTrait2[A1, A2]
}

sealed trait SealedTrait3[A1, A2, A3] extends SealedTrait {
  def either: Either[A1, Either[A2, A3]] = this match {
    case SealedTrait3._1(v) => Left(v)
    case SealedTrait3._2(v) => Right(Left(v))
    case SealedTrait3._3(v) => Right(Right(v))
  }
}
object SealedTrait3 {
  def uneither[A1, A2, A3](e: Either[A1, Either[A2, A3]]): SealedTrait3[A1, A2, A3] = e match {
    case Left(v) => _1(v)
    case Right(Left(v)) => _2(v)
    case Right(Right(v)) => _3(v)
  }
  case class _1[A1, A2, A3](value: A1) extends SealedTrait3[A1, A2, A3]
  case class _2[A1, A2, A3](value: A2) extends SealedTrait3[A1, A2, A3]
  case class _3[A1, A2, A3](value: A3) extends SealedTrait3[A1, A2, A3]
}

sealed trait SealedTrait4[A1, A2, A3, A4] extends SealedTrait {
  def either: Either[A1, Either[A2, Either[A3, A4]]] = this match {
    case SealedTrait4._1(v) => Left(v)
    case SealedTrait4._2(v) => Right(Left(v))
    case SealedTrait4._3(v) => Right(Right(Left(v)))
    case SealedTrait4._4(v) => Right(Right(Right(v)))
  }
}
object SealedTrait4 {
  def uneither[A1, A2, A3, A4](e: Either[A1, Either[A2, Either[A3, A4]]]): SealedTrait4[A1, A2, A3, A4] = e match {
    case Left(v) => _1(v)
    case Right(Left(v)) => _2(v)
    case Right(Right(Left(v))) => _3(v)
    case Right(Right(Right(v))) => _4(v)
  }
  case class _1[A1, A2, A3, A4](value: A1) extends SealedTrait4[A1, A2, A3, A4]
  case class _2[A1, A2, A3, A4](value: A2) extends SealedTrait4[A1, A2, A3, A4]
  case class _3[A1, A2, A3, A4](value: A3) extends SealedTrait4[A1, A2, A3, A4]
  case class _4[A1, A2, A3, A4](value: A4) extends SealedTrait4[A1, A2, A3, A4]
}

sealed trait SealedTrait5[A1, A2, A3, A4, A5] extends SealedTrait {
  def either: Either[A1, Either[A2, Either[A3, Either[A4, A5]]]] = this match {
    case SealedTrait5._1(v) => Left(v)
    case SealedTrait5._2(v) => Right(Left(v))
    case SealedTrait5._3(v) => Right(Right(Left(v)))
    case SealedTrait5._4(v) => Right(Right(Right(Left(v))))
    case SealedTrait5._5(v) => Right(Right(Right(Right(v))))
  }
}
object SealedTrait5 {
  def uneither[A1, A2, A3, A4, A5](e: Either[A1, Either[A2, Either[A3, Either[A4, A5]]]]): SealedTrait5[A1, A2, A3, A4, A5] = e match {
    case Left(v) => _1(v)
    case Right(Left(v)) => _2(v)
    case Right(Right(Left(v))) => _3(v)
    case Right(Right(Right(Left(v)))) => _4(v)
    case Right(Right(Right(Right(v)))) => _5(v)
  }
  case class _1[A1, A2, A3, A4, A5](value: A1) extends SealedTrait5[A1, A2, A3, A4, A5]
  case class _2[A1, A2, A3, A4, A5](value: A2) extends SealedTrait5[A1, A2, A3, A4, A5]
  case class _3[A1, A2, A3, A4, A5](value: A3) extends SealedTrait5[A1, A2, A3, A4, A5]
  case class _4[A1, A2, A3, A4, A5](value: A4) extends SealedTrait5[A1, A2, A3, A4, A5]
  case class _5[A1, A2, A3, A4, A5](value: A5) extends SealedTrait5[A1, A2, A3, A4, A5]
}

sealed trait SealedTrait6[A1, A2, A3, A4, A5, A6] extends SealedTrait {
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
  def uneither[A1, A2, A3, A4, A5, A6](e: Either[A1, Either[A2, Either[A3, Either[A4, Either[A5, A6]]]]]): SealedTrait6[A1, A2, A3, A4, A5, A6] = e match {
    case Left(v) => _1(v)
    case Right(Left(v)) => _2(v)
    case Right(Right(Left(v))) => _3(v)
    case Right(Right(Right(Left(v)))) => _4(v)
    case Right(Right(Right(Right(Left(v))))) => _5(v)
    case Right(Right(Right(Right(Right(v))))) => _6(v)
  }
  case class _1[A1, A2, A3, A4, A5, A6](value: A1) extends SealedTrait6[A1, A2, A3, A4, A5, A6]
  case class _2[A1, A2, A3, A4, A5, A6](value: A2) extends SealedTrait6[A1, A2, A3, A4, A5, A6]
  case class _3[A1, A2, A3, A4, A5, A6](value: A3) extends SealedTrait6[A1, A2, A3, A4, A5, A6]
  case class _4[A1, A2, A3, A4, A5, A6](value: A4) extends SealedTrait6[A1, A2, A3, A4, A5, A6]
  case class _5[A1, A2, A3, A4, A5, A6](value: A5) extends SealedTrait6[A1, A2, A3, A4, A5, A6]
  case class _6[A1, A2, A3, A4, A5, A6](value: A6) extends SealedTrait6[A1, A2, A3, A4, A5, A6]
}

sealed trait SealedTrait7[A1, A2, A3, A4, A5, A6, A7] extends SealedTrait {
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
  def uneither[A1, A2, A3, A4, A5, A6, A7](e: Either[A1, Either[A2, Either[A3, Either[A4, Either[A5, Either[A6, A7]]]]]]): SealedTrait7[A1, A2, A3, A4, A5, A6, A7] = e match {
    case Left(v) => _1(v)
    case Right(Left(v)) => _2(v)
    case Right(Right(Left(v))) => _3(v)
    case Right(Right(Right(Left(v)))) => _4(v)
    case Right(Right(Right(Right(Left(v))))) => _5(v)
    case Right(Right(Right(Right(Right(Left(v)))))) => _6(v)
    case Right(Right(Right(Right(Right(Right(v)))))) => _7(v)
  }
  case class _1[A1, A2, A3, A4, A5, A6, A7](value: A1) extends SealedTrait7[A1, A2, A3, A4, A5, A6, A7]
  case class _2[A1, A2, A3, A4, A5, A6, A7](value: A2) extends SealedTrait7[A1, A2, A3, A4, A5, A6, A7]
  case class _3[A1, A2, A3, A4, A5, A6, A7](value: A3) extends SealedTrait7[A1, A2, A3, A4, A5, A6, A7]
  case class _4[A1, A2, A3, A4, A5, A6, A7](value: A4) extends SealedTrait7[A1, A2, A3, A4, A5, A6, A7]
  case class _5[A1, A2, A3, A4, A5, A6, A7](value: A5) extends SealedTrait7[A1, A2, A3, A4, A5, A6, A7]
  case class _6[A1, A2, A3, A4, A5, A6, A7](value: A6) extends SealedTrait7[A1, A2, A3, A4, A5, A6, A7]
  case class _7[A1, A2, A3, A4, A5, A6, A7](value: A7) extends SealedTrait7[A1, A2, A3, A4, A5, A6, A7]
}

sealed trait SealedTrait8[A1, A2, A3, A4, A5, A6, A7, A8] extends SealedTrait {
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
  def uneither[A1, A2, A3, A4, A5, A6, A7, A8](e: Either[A1, Either[A2, Either[A3, Either[A4, Either[A5, Either[A6, Either[A7, A8]]]]]]]): SealedTrait8[A1, A2, A3, A4, A5, A6, A7, A8] = e match {
    case Left(v) => _1(v)
    case Right(Left(v)) => _2(v)
    case Right(Right(Left(v))) => _3(v)
    case Right(Right(Right(Left(v)))) => _4(v)
    case Right(Right(Right(Right(Left(v))))) => _5(v)
    case Right(Right(Right(Right(Right(Left(v)))))) => _6(v)
    case Right(Right(Right(Right(Right(Right(Left(v))))))) => _7(v)
    case Right(Right(Right(Right(Right(Right(Right(v))))))) => _8(v)
  }
  case class _1[A1, A2, A3, A4, A5, A6, A7, A8](value: A1) extends SealedTrait8[A1, A2, A3, A4, A5, A6, A7, A8]
  case class _2[A1, A2, A3, A4, A5, A6, A7, A8](value: A2) extends SealedTrait8[A1, A2, A3, A4, A5, A6, A7, A8]
  case class _3[A1, A2, A3, A4, A5, A6, A7, A8](value: A3) extends SealedTrait8[A1, A2, A3, A4, A5, A6, A7, A8]
  case class _4[A1, A2, A3, A4, A5, A6, A7, A8](value: A4) extends SealedTrait8[A1, A2, A3, A4, A5, A6, A7, A8]
  case class _5[A1, A2, A3, A4, A5, A6, A7, A8](value: A5) extends SealedTrait8[A1, A2, A3, A4, A5, A6, A7, A8]
  case class _6[A1, A2, A3, A4, A5, A6, A7, A8](value: A6) extends SealedTrait8[A1, A2, A3, A4, A5, A6, A7, A8]
  case class _7[A1, A2, A3, A4, A5, A6, A7, A8](value: A7) extends SealedTrait8[A1, A2, A3, A4, A5, A6, A7, A8]
  case class _8[A1, A2, A3, A4, A5, A6, A7, A8](value: A8) extends SealedTrait8[A1, A2, A3, A4, A5, A6, A7, A8]
}

sealed trait SealedTrait9[A1, A2, A3, A4, A5, A6, A7, A8, A9] extends SealedTrait {
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
  def uneither[A1, A2, A3, A4, A5, A6, A7, A8, A9](e: Either[A1, Either[A2, Either[A3, Either[A4, Either[A5, Either[A6, Either[A7, Either[A8, A9]]]]]]]]): SealedTrait9[A1, A2, A3, A4, A5, A6, A7, A8, A9] = e match {
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
  case class _1[A1, A2, A3, A4, A5, A6, A7, A8, A9](value: A1) extends SealedTrait9[A1, A2, A3, A4, A5, A6, A7, A8, A9]
  case class _2[A1, A2, A3, A4, A5, A6, A7, A8, A9](value: A2) extends SealedTrait9[A1, A2, A3, A4, A5, A6, A7, A8, A9]
  case class _3[A1, A2, A3, A4, A5, A6, A7, A8, A9](value: A3) extends SealedTrait9[A1, A2, A3, A4, A5, A6, A7, A8, A9]
  case class _4[A1, A2, A3, A4, A5, A6, A7, A8, A9](value: A4) extends SealedTrait9[A1, A2, A3, A4, A5, A6, A7, A8, A9]
  case class _5[A1, A2, A3, A4, A5, A6, A7, A8, A9](value: A5) extends SealedTrait9[A1, A2, A3, A4, A5, A6, A7, A8, A9]
  case class _6[A1, A2, A3, A4, A5, A6, A7, A8, A9](value: A6) extends SealedTrait9[A1, A2, A3, A4, A5, A6, A7, A8, A9]
  case class _7[A1, A2, A3, A4, A5, A6, A7, A8, A9](value: A7) extends SealedTrait9[A1, A2, A3, A4, A5, A6, A7, A8, A9]
  case class _8[A1, A2, A3, A4, A5, A6, A7, A8, A9](value: A8) extends SealedTrait9[A1, A2, A3, A4, A5, A6, A7, A8, A9]
  case class _9[A1, A2, A3, A4, A5, A6, A7, A8, A9](value: A9) extends SealedTrait9[A1, A2, A3, A4, A5, A6, A7, A8, A9]
}

sealed trait SealedTrait10[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10] extends SealedTrait {
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
  def uneither[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10](e: Either[A1, Either[A2, Either[A3, Either[A4, Either[A5, Either[A6, Either[A7, Either[A8, Either[A9, A10]]]]]]]]]): SealedTrait10[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10] = e match {
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
  case class _1[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10](value: A1) extends SealedTrait10[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10]
  case class _2[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10](value: A2) extends SealedTrait10[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10]
  case class _3[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10](value: A3) extends SealedTrait10[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10]
  case class _4[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10](value: A4) extends SealedTrait10[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10]
  case class _5[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10](value: A5) extends SealedTrait10[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10]
  case class _6[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10](value: A6) extends SealedTrait10[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10]
  case class _7[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10](value: A7) extends SealedTrait10[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10]
  case class _8[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10](value: A8) extends SealedTrait10[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10]
  case class _9[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10](value: A9) extends SealedTrait10[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10]
  case class _10[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10](value: A10) extends SealedTrait10[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10]
}

sealed trait SealedTrait11[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11] extends SealedTrait {
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
  def uneither[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11](e: Either[A1, Either[A2, Either[A3, Either[A4, Either[A5, Either[A6, Either[A7, Either[A8, Either[A9, Either[A10, A11]]]]]]]]]]): SealedTrait11[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11] = e match {
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
  case class _1[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11](value: A1) extends SealedTrait11[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11]
  case class _2[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11](value: A2) extends SealedTrait11[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11]
  case class _3[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11](value: A3) extends SealedTrait11[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11]
  case class _4[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11](value: A4) extends SealedTrait11[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11]
  case class _5[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11](value: A5) extends SealedTrait11[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11]
  case class _6[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11](value: A6) extends SealedTrait11[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11]
  case class _7[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11](value: A7) extends SealedTrait11[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11]
  case class _8[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11](value: A8) extends SealedTrait11[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11]
  case class _9[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11](value: A9) extends SealedTrait11[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11]
  case class _10[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11](value: A10) extends SealedTrait11[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11]
  case class _11[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11](value: A11) extends SealedTrait11[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11]
}

sealed trait SealedTrait12[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12] extends SealedTrait {
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
  def uneither[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12](e: Either[A1, Either[A2, Either[A3, Either[A4, Either[A5, Either[A6, Either[A7, Either[A8, Either[A9, Either[A10, Either[A11, A12]]]]]]]]]]]): SealedTrait12[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12] = e match {
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
  case class _1[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12](value: A1) extends SealedTrait12[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12]
  case class _2[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12](value: A2) extends SealedTrait12[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12]
  case class _3[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12](value: A3) extends SealedTrait12[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12]
  case class _4[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12](value: A4) extends SealedTrait12[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12]
  case class _5[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12](value: A5) extends SealedTrait12[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12]
  case class _6[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12](value: A6) extends SealedTrait12[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12]
  case class _7[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12](value: A7) extends SealedTrait12[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12]
  case class _8[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12](value: A8) extends SealedTrait12[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12]
  case class _9[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12](value: A9) extends SealedTrait12[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12]
  case class _10[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12](value: A10) extends SealedTrait12[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12]
  case class _11[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12](value: A11) extends SealedTrait12[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12]
  case class _12[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12](value: A12) extends SealedTrait12[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12]
}

sealed trait SealedTrait13[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13] extends SealedTrait

sealed trait SealedTrait14[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14] extends SealedTrait

sealed trait SealedTrait15[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15] extends SealedTrait

sealed trait SealedTrait16[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16] extends SealedTrait

sealed trait SealedTrait17[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17] extends SealedTrait

sealed trait SealedTrait18[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18] extends SealedTrait

sealed trait SealedTrait19[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19] extends SealedTrait

sealed trait SealedTrait20[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20] extends SealedTrait

sealed trait SealedTrait21[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21] extends SealedTrait

sealed trait SealedTrait22[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22] extends SealedTrait

sealed trait SealedTrait23[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23] extends SealedTrait

sealed trait SealedTrait24[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24] extends SealedTrait

sealed trait SealedTrait25[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25] extends SealedTrait

sealed trait SealedTrait26[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26] extends SealedTrait

sealed trait SealedTrait27[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27] extends SealedTrait

sealed trait SealedTrait28[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28] extends SealedTrait

sealed trait SealedTrait29[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29] extends SealedTrait

sealed trait SealedTrait30[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30] extends SealedTrait

sealed trait SealedTrait31[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31] extends SealedTrait

sealed trait SealedTrait32[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32] extends SealedTrait

sealed trait SealedTrait33[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33] extends SealedTrait

sealed trait SealedTrait34[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34] extends SealedTrait

sealed trait SealedTrait35[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35] extends SealedTrait

sealed trait SealedTrait36[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36] extends SealedTrait

sealed trait SealedTrait37[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37] extends SealedTrait

sealed trait SealedTrait38[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38] extends SealedTrait

sealed trait SealedTrait39[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39] extends SealedTrait

sealed trait SealedTrait40[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40] extends SealedTrait

sealed trait SealedTrait41[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41] extends SealedTrait

sealed trait SealedTrait42[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42] extends SealedTrait

sealed trait SealedTrait43[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43] extends SealedTrait

sealed trait SealedTrait44[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44] extends SealedTrait

sealed trait SealedTrait45[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45] extends SealedTrait

sealed trait SealedTrait46[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46] extends SealedTrait

sealed trait SealedTrait47[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47] extends SealedTrait

sealed trait SealedTrait48[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48] extends SealedTrait

sealed trait SealedTrait49[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49] extends SealedTrait

sealed trait SealedTrait50[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50] extends SealedTrait

sealed trait SealedTrait51[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51] extends SealedTrait

sealed trait SealedTrait52[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52] extends SealedTrait

sealed trait SealedTrait53[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53] extends SealedTrait

sealed trait SealedTrait54[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54] extends SealedTrait

sealed trait SealedTrait55[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55] extends SealedTrait

sealed trait SealedTrait56[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56] extends SealedTrait

sealed trait SealedTrait57[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57] extends SealedTrait

sealed trait SealedTrait58[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58] extends SealedTrait

sealed trait SealedTrait59[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, A59] extends SealedTrait

sealed trait SealedTrait60[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, A59, A60] extends SealedTrait

sealed trait SealedTrait61[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, A59, A60, A61] extends SealedTrait

sealed trait SealedTrait62[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, A59, A60, A61, A62] extends SealedTrait

sealed trait SealedTrait63[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, A59, A60, A61, A62, A63] extends SealedTrait

sealed trait SealedTrait64[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, A59, A60, A61, A62, A63, A64] extends SealedTrait
