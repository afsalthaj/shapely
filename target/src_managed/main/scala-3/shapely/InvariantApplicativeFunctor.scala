
package shapely

trait InvariantApplicativeFunctor[F[_]] {
  def pure[A](a: A): F[A]
  def product1[A, B](f: A => B)(g: B => A)(fa: F[A]): F[B]
  def product2[A, B, C](f: (A, B) => C)(g: C => (A, B))(fa: F[A], fb: F[B]): F[C]
  
  def product3[A1, A2, A3, A4](f: (A1, A2, A3) => A4)(g: A4 => (A1, A2, A3))(f1: F[A1], f2: F[A2], f3: F[A3]): F[A4] = {
      val productx: F[(A1, A2)] = product2[A1, A2, (A1, A2)]((a1, a2) => (a1, a2))(x => x)(f1, f2)

      product2[(A1, A2), A3, A4]({ case ((a1, a2), a3) => f(a1, a2, a3) }) { a4 =>
        val (x1, x2, x3) = g(a4)
        ((x1, x2), x3)
      }(productx, f3)
    }


  def product4[A1, A2, A3, A4, A5](f: (A1, A2, A3, A4) => A5)(g: A5 => (A1, A2, A3, A4))(f1: F[A1], f2: F[A2], f3: F[A3], f4: F[A4]): F[A5] = {
      val productx: F[(A1, A2, A3)] = product3[A1, A2, A3, (A1, A2, A3)]((a1, a2, a3) => (a1, a2, a3))(x => x)(f1, f2, f3)

      product2[(A1, A2, A3), A4, A5]({ case ((a1, a2, a3), a4) => f(a1, a2, a3, a4) }) { a5 =>
        val (x1, x2, x3, x4) = g(a5)
        ((x1, x2, x3), x4)
      }(productx, f4)
    }


  def product5[A1, A2, A3, A4, A5, A6](f: (A1, A2, A3, A4, A5) => A6)(g: A6 => (A1, A2, A3, A4, A5))(f1: F[A1], f2: F[A2], f3: F[A3], f4: F[A4], f5: F[A5]): F[A6] = {
      val productx: F[(A1, A2, A3, A4)] = product4[A1, A2, A3, A4, (A1, A2, A3, A4)]((a1, a2, a3, a4) => (a1, a2, a3, a4))(x => x)(f1, f2, f3, f4)

      product2[(A1, A2, A3, A4), A5, A6]({ case ((a1, a2, a3, a4), a5) => f(a1, a2, a3, a4, a5) }) { a6 =>
        val (x1, x2, x3, x4, x5) = g(a6)
        ((x1, x2, x3, x4), x5)
      }(productx, f5)
    }


  def product6[A1, A2, A3, A4, A5, A6, A7](f: (A1, A2, A3, A4, A5, A6) => A7)(g: A7 => (A1, A2, A3, A4, A5, A6))(f1: F[A1], f2: F[A2], f3: F[A3], f4: F[A4], f5: F[A5], f6: F[A6]): F[A7] = {
      val productx: F[(A1, A2, A3, A4, A5)] = product5[A1, A2, A3, A4, A5, (A1, A2, A3, A4, A5)]((a1, a2, a3, a4, a5) => (a1, a2, a3, a4, a5))(x => x)(f1, f2, f3, f4, f5)

      product2[(A1, A2, A3, A4, A5), A6, A7]({ case ((a1, a2, a3, a4, a5), a6) => f(a1, a2, a3, a4, a5, a6) }) { a7 =>
        val (x1, x2, x3, x4, x5, x6) = g(a7)
        ((x1, x2, x3, x4, x5), x6)
      }(productx, f6)
    }


  def product7[A1, A2, A3, A4, A5, A6, A7, A8](f: (A1, A2, A3, A4, A5, A6, A7) => A8)(g: A8 => (A1, A2, A3, A4, A5, A6, A7))(f1: F[A1], f2: F[A2], f3: F[A3], f4: F[A4], f5: F[A5], f6: F[A6], f7: F[A7]): F[A8] = {
      val productx: F[(A1, A2, A3, A4, A5, A6)] = product6[A1, A2, A3, A4, A5, A6, (A1, A2, A3, A4, A5, A6)]((a1, a2, a3, a4, a5, a6) => (a1, a2, a3, a4, a5, a6))(x => x)(f1, f2, f3, f4, f5, f6)

      product2[(A1, A2, A3, A4, A5, A6), A7, A8]({ case ((a1, a2, a3, a4, a5, a6), a7) => f(a1, a2, a3, a4, a5, a6, a7) }) { a8 =>
        val (x1, x2, x3, x4, x5, x6, x7) = g(a8)
        ((x1, x2, x3, x4, x5, x6), x7)
      }(productx, f7)
    }


  def product8[A1, A2, A3, A4, A5, A6, A7, A8, A9](f: (A1, A2, A3, A4, A5, A6, A7, A8) => A9)(g: A9 => (A1, A2, A3, A4, A5, A6, A7, A8))(f1: F[A1], f2: F[A2], f3: F[A3], f4: F[A4], f5: F[A5], f6: F[A6], f7: F[A7], f8: F[A8]): F[A9] = {
      val productx: F[(A1, A2, A3, A4, A5, A6, A7)] = product7[A1, A2, A3, A4, A5, A6, A7, (A1, A2, A3, A4, A5, A6, A7)]((a1, a2, a3, a4, a5, a6, a7) => (a1, a2, a3, a4, a5, a6, a7))(x => x)(f1, f2, f3, f4, f5, f6, f7)

      product2[(A1, A2, A3, A4, A5, A6, A7), A8, A9]({ case ((a1, a2, a3, a4, a5, a6, a7), a8) => f(a1, a2, a3, a4, a5, a6, a7, a8) }) { a9 =>
        val (x1, x2, x3, x4, x5, x6, x7, x8) = g(a9)
        ((x1, x2, x3, x4, x5, x6, x7), x8)
      }(productx, f8)
    }


  def product9[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10](f: (A1, A2, A3, A4, A5, A6, A7, A8, A9) => A10)(g: A10 => (A1, A2, A3, A4, A5, A6, A7, A8, A9))(f1: F[A1], f2: F[A2], f3: F[A3], f4: F[A4], f5: F[A5], f6: F[A6], f7: F[A7], f8: F[A8], f9: F[A9]): F[A10] = {
      val productx: F[(A1, A2, A3, A4, A5, A6, A7, A8)] = product8[A1, A2, A3, A4, A5, A6, A7, A8, (A1, A2, A3, A4, A5, A6, A7, A8)]((a1, a2, a3, a4, a5, a6, a7, a8) => (a1, a2, a3, a4, a5, a6, a7, a8))(x => x)(f1, f2, f3, f4, f5, f6, f7, f8)

      product2[(A1, A2, A3, A4, A5, A6, A7, A8), A9, A10]({ case ((a1, a2, a3, a4, a5, a6, a7, a8), a9) => f(a1, a2, a3, a4, a5, a6, a7, a8, a9) }) { a10 =>
        val (x1, x2, x3, x4, x5, x6, x7, x8, x9) = g(a10)
        ((x1, x2, x3, x4, x5, x6, x7, x8), x9)
      }(productx, f9)
    }


  def product10[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11](f: (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10) => A11)(g: A11 => (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10))(f1: F[A1], f2: F[A2], f3: F[A3], f4: F[A4], f5: F[A5], f6: F[A6], f7: F[A7], f8: F[A8], f9: F[A9], f10: F[A10]): F[A11] = {
      val productx: F[(A1, A2, A3, A4, A5, A6, A7, A8, A9)] = product9[A1, A2, A3, A4, A5, A6, A7, A8, A9, (A1, A2, A3, A4, A5, A6, A7, A8, A9)]((a1, a2, a3, a4, a5, a6, a7, a8, a9) => (a1, a2, a3, a4, a5, a6, a7, a8, a9))(x => x)(f1, f2, f3, f4, f5, f6, f7, f8, f9)

      product2[(A1, A2, A3, A4, A5, A6, A7, A8, A9), A10, A11]({ case ((a1, a2, a3, a4, a5, a6, a7, a8, a9), a10) => f(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10) }) { a11 =>
        val (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10) = g(a11)
        ((x1, x2, x3, x4, x5, x6, x7, x8, x9), x10)
      }(productx, f10)
    }


  def product11[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12](f: (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11) => A12)(g: A12 => (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11))(f1: F[A1], f2: F[A2], f3: F[A3], f4: F[A4], f5: F[A5], f6: F[A6], f7: F[A7], f8: F[A8], f9: F[A9], f10: F[A10], f11: F[A11]): F[A12] = {
      val productx: F[(A1, A2, A3, A4, A5, A6, A7, A8, A9, A10)] = product10[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10)]((a1, a2, a3, a4, a5, a6, a7, a8, a9, a10) => (a1, a2, a3, a4, a5, a6, a7, a8, a9, a10))(x => x)(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10)

      product2[(A1, A2, A3, A4, A5, A6, A7, A8, A9, A10), A11, A12]({ case ((a1, a2, a3, a4, a5, a6, a7, a8, a9, a10), a11) => f(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11) }) { a12 =>
        val (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10, x11) = g(a12)
        ((x1, x2, x3, x4, x5, x6, x7, x8, x9, x10), x11)
      }(productx, f11)
    }


  def product12[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13](f: (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12) => A13)(g: A13 => (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12))(f1: F[A1], f2: F[A2], f3: F[A3], f4: F[A4], f5: F[A5], f6: F[A6], f7: F[A7], f8: F[A8], f9: F[A9], f10: F[A10], f11: F[A11], f12: F[A12]): F[A13] = {
      val productx: F[(A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11)] = product11[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11)]((a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11) => (a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11))(x => x)(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11)

      product2[(A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11), A12, A13]({ case ((a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11), a12) => f(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12) }) { a13 =>
        val (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10, x11, x12) = g(a13)
        ((x1, x2, x3, x4, x5, x6, x7, x8, x9, x10, x11), x12)
      }(productx, f12)
    }


  def product13[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14](f: (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13) => A14)(g: A14 => (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13))(f1: F[A1], f2: F[A2], f3: F[A3], f4: F[A4], f5: F[A5], f6: F[A6], f7: F[A7], f8: F[A8], f9: F[A9], f10: F[A10], f11: F[A11], f12: F[A12], f13: F[A13]): F[A14] = {
      val productx: F[(A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12)] = product12[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12)]((a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12) => (a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12))(x => x)(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12)

      product2[(A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12), A13, A14]({ case ((a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12), a13) => f(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13) }) { a14 =>
        val (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10, x11, x12, x13) = g(a14)
        ((x1, x2, x3, x4, x5, x6, x7, x8, x9, x10, x11, x12), x13)
      }(productx, f13)
    }


  def product14[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15](f: (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14) => A15)(g: A15 => (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14))(f1: F[A1], f2: F[A2], f3: F[A3], f4: F[A4], f5: F[A5], f6: F[A6], f7: F[A7], f8: F[A8], f9: F[A9], f10: F[A10], f11: F[A11], f12: F[A12], f13: F[A13], f14: F[A14]): F[A15] = {
      val productx: F[(A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13)] = product13[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13)]((a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13) => (a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13))(x => x)(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13)

      product2[(A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13), A14, A15]({ case ((a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13), a14) => f(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14) }) { a15 =>
        val (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10, x11, x12, x13, x14) = g(a15)
        ((x1, x2, x3, x4, x5, x6, x7, x8, x9, x10, x11, x12, x13), x14)
      }(productx, f14)
    }


  def product15[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16](f: (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15) => A16)(g: A16 => (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15))(f1: F[A1], f2: F[A2], f3: F[A3], f4: F[A4], f5: F[A5], f6: F[A6], f7: F[A7], f8: F[A8], f9: F[A9], f10: F[A10], f11: F[A11], f12: F[A12], f13: F[A13], f14: F[A14], f15: F[A15]): F[A16] = {
      val productx: F[(A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14)] = product14[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14)]((a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14) => (a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14))(x => x)(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14)

      product2[(A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14), A15, A16]({ case ((a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14), a15) => f(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15) }) { a16 =>
        val (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10, x11, x12, x13, x14, x15) = g(a16)
        ((x1, x2, x3, x4, x5, x6, x7, x8, x9, x10, x11, x12, x13, x14), x15)
      }(productx, f15)
    }


  def product16[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17](f: (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16) => A17)(g: A17 => (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16))(f1: F[A1], f2: F[A2], f3: F[A3], f4: F[A4], f5: F[A5], f6: F[A6], f7: F[A7], f8: F[A8], f9: F[A9], f10: F[A10], f11: F[A11], f12: F[A12], f13: F[A13], f14: F[A14], f15: F[A15], f16: F[A16]): F[A17] = {
      val productx: F[(A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15)] = product15[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15)]((a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15) => (a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15))(x => x)(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15)

      product2[(A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15), A16, A17]({ case ((a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15), a16) => f(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16) }) { a17 =>
        val (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10, x11, x12, x13, x14, x15, x16) = g(a17)
        ((x1, x2, x3, x4, x5, x6, x7, x8, x9, x10, x11, x12, x13, x14, x15), x16)
      }(productx, f16)
    }


  def product17[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18](f: (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17) => A18)(g: A18 => (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17))(f1: F[A1], f2: F[A2], f3: F[A3], f4: F[A4], f5: F[A5], f6: F[A6], f7: F[A7], f8: F[A8], f9: F[A9], f10: F[A10], f11: F[A11], f12: F[A12], f13: F[A13], f14: F[A14], f15: F[A15], f16: F[A16], f17: F[A17]): F[A18] = {
      val productx: F[(A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16)] = product16[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16)]((a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16) => (a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16))(x => x)(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16)

      product2[(A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16), A17, A18]({ case ((a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16), a17) => f(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17) }) { a18 =>
        val (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10, x11, x12, x13, x14, x15, x16, x17) = g(a18)
        ((x1, x2, x3, x4, x5, x6, x7, x8, x9, x10, x11, x12, x13, x14, x15, x16), x17)
      }(productx, f17)
    }


  def product18[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19](f: (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18) => A19)(g: A19 => (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18))(f1: F[A1], f2: F[A2], f3: F[A3], f4: F[A4], f5: F[A5], f6: F[A6], f7: F[A7], f8: F[A8], f9: F[A9], f10: F[A10], f11: F[A11], f12: F[A12], f13: F[A13], f14: F[A14], f15: F[A15], f16: F[A16], f17: F[A17], f18: F[A18]): F[A19] = {
      val productx: F[(A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17)] = product17[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17)]((a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17) => (a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17))(x => x)(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16, f17)

      product2[(A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17), A18, A19]({ case ((a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17), a18) => f(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18) }) { a19 =>
        val (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10, x11, x12, x13, x14, x15, x16, x17, x18) = g(a19)
        ((x1, x2, x3, x4, x5, x6, x7, x8, x9, x10, x11, x12, x13, x14, x15, x16, x17), x18)
      }(productx, f18)
    }


  def product19[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20](f: (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19) => A20)(g: A20 => (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19))(f1: F[A1], f2: F[A2], f3: F[A3], f4: F[A4], f5: F[A5], f6: F[A6], f7: F[A7], f8: F[A8], f9: F[A9], f10: F[A10], f11: F[A11], f12: F[A12], f13: F[A13], f14: F[A14], f15: F[A15], f16: F[A16], f17: F[A17], f18: F[A18], f19: F[A19]): F[A20] = {
      val productx: F[(A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18)] = product18[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18)]((a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18) => (a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18))(x => x)(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16, f17, f18)

      product2[(A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18), A19, A20]({ case ((a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18), a19) => f(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19) }) { a20 =>
        val (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10, x11, x12, x13, x14, x15, x16, x17, x18, x19) = g(a20)
        ((x1, x2, x3, x4, x5, x6, x7, x8, x9, x10, x11, x12, x13, x14, x15, x16, x17, x18), x19)
      }(productx, f19)
    }


  def product20[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21](f: (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20) => A21)(g: A21 => (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20))(f1: F[A1], f2: F[A2], f3: F[A3], f4: F[A4], f5: F[A5], f6: F[A6], f7: F[A7], f8: F[A8], f9: F[A9], f10: F[A10], f11: F[A11], f12: F[A12], f13: F[A13], f14: F[A14], f15: F[A15], f16: F[A16], f17: F[A17], f18: F[A18], f19: F[A19], f20: F[A20]): F[A21] = {
      val productx: F[(A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19)] = product19[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19)]((a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19) => (a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19))(x => x)(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19)

      product2[(A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19), A20, A21]({ case ((a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19), a20) => f(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20) }) { a21 =>
        val (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10, x11, x12, x13, x14, x15, x16, x17, x18, x19, x20) = g(a21)
        ((x1, x2, x3, x4, x5, x6, x7, x8, x9, x10, x11, x12, x13, x14, x15, x16, x17, x18, x19), x20)
      }(productx, f20)
    }


  def product21[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22](f: (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21) => A22)(g: A22 => (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21))(f1: F[A1], f2: F[A2], f3: F[A3], f4: F[A4], f5: F[A5], f6: F[A6], f7: F[A7], f8: F[A8], f9: F[A9], f10: F[A10], f11: F[A11], f12: F[A12], f13: F[A13], f14: F[A14], f15: F[A15], f16: F[A16], f17: F[A17], f18: F[A18], f19: F[A19], f20: F[A20], f21: F[A21]): F[A22] = {
      val productx: F[(A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20)] = product20[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20)]((a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20) => (a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20))(x => x)(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, f20)

      product2[(A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20), A21, A22]({ case ((a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20), a21) => f(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21) }) { a22 =>
        val (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10, x11, x12, x13, x14, x15, x16, x17, x18, x19, x20, x21) = g(a22)
        ((x1, x2, x3, x4, x5, x6, x7, x8, x9, x10, x11, x12, x13, x14, x15, x16, x17, x18, x19, x20), x21)
      }(productx, f21)
    }


  def product22[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23](f: (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22) => A23)(g: A23 => (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22))(f1: F[A1], f2: F[A2], f3: F[A3], f4: F[A4], f5: F[A5], f6: F[A6], f7: F[A7], f8: F[A8], f9: F[A9], f10: F[A10], f11: F[A11], f12: F[A12], f13: F[A13], f14: F[A14], f15: F[A15], f16: F[A16], f17: F[A17], f18: F[A18], f19: F[A19], f20: F[A20], f21: F[A21], f22: F[A22]): F[A23] = {
      val productx: F[(A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21)] = product21[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21)]((a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21) => (a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21))(x => x)(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, f20, f21)

      product2[(A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21), A22, A23]({ case ((a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21), a22) => f(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22) }) { a23 =>
        val (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10, x11, x12, x13, x14, x15, x16, x17, x18, x19, x20, x21, x22) = g(a23)
        ((x1, x2, x3, x4, x5, x6, x7, x8, x9, x10, x11, x12, x13, x14, x15, x16, x17, x18, x19, x20, x21), x22)
      }(productx, f22)
    }


  def product23[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24](f: (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23) => A24)(g: A24 => (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23))(f1: F[A1], f2: F[A2], f3: F[A3], f4: F[A4], f5: F[A5], f6: F[A6], f7: F[A7], f8: F[A8], f9: F[A9], f10: F[A10], f11: F[A11], f12: F[A12], f13: F[A13], f14: F[A14], f15: F[A15], f16: F[A16], f17: F[A17], f18: F[A18], f19: F[A19], f20: F[A20], f21: F[A21], f22: F[A22], f23: F[A23]): F[A24] = {
      val productx: F[(A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22)] = product22[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22)]((a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22) => (a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22))(x => x)(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, f20, f21, f22)

      product2[(A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22), A23, A24]({ case ((a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22), a23) => f(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22, a23) }) { a24 =>
        val (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10, x11, x12, x13, x14, x15, x16, x17, x18, x19, x20, x21, x22, x23) = g(a24)
        ((x1, x2, x3, x4, x5, x6, x7, x8, x9, x10, x11, x12, x13, x14, x15, x16, x17, x18, x19, x20, x21, x22), x23)
      }(productx, f23)
    }


  def product24[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25](f: (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24) => A25)(g: A25 => (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24))(f1: F[A1], f2: F[A2], f3: F[A3], f4: F[A4], f5: F[A5], f6: F[A6], f7: F[A7], f8: F[A8], f9: F[A9], f10: F[A10], f11: F[A11], f12: F[A12], f13: F[A13], f14: F[A14], f15: F[A15], f16: F[A16], f17: F[A17], f18: F[A18], f19: F[A19], f20: F[A20], f21: F[A21], f22: F[A22], f23: F[A23], f24: F[A24]): F[A25] = {
      val productx: F[(A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23)] = product23[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23)]((a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22, a23) => (a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22, a23))(x => x)(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, f20, f21, f22, f23)

      product2[(A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23), A24, A25]({ case ((a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22, a23), a24) => f(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22, a23, a24) }) { a25 =>
        val (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10, x11, x12, x13, x14, x15, x16, x17, x18, x19, x20, x21, x22, x23, x24) = g(a25)
        ((x1, x2, x3, x4, x5, x6, x7, x8, x9, x10, x11, x12, x13, x14, x15, x16, x17, x18, x19, x20, x21, x22, x23), x24)
      }(productx, f24)
    }


  def product25[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26](f: (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25) => A26)(g: A26 => (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25))(f1: F[A1], f2: F[A2], f3: F[A3], f4: F[A4], f5: F[A5], f6: F[A6], f7: F[A7], f8: F[A8], f9: F[A9], f10: F[A10], f11: F[A11], f12: F[A12], f13: F[A13], f14: F[A14], f15: F[A15], f16: F[A16], f17: F[A17], f18: F[A18], f19: F[A19], f20: F[A20], f21: F[A21], f22: F[A22], f23: F[A23], f24: F[A24], f25: F[A25]): F[A26] = {
      val productx: F[(A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24)] = product24[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24)]((a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22, a23, a24) => (a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22, a23, a24))(x => x)(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, f20, f21, f22, f23, f24)

      product2[(A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24), A25, A26]({ case ((a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22, a23, a24), a25) => f(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22, a23, a24, a25) }) { a26 =>
        val (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10, x11, x12, x13, x14, x15, x16, x17, x18, x19, x20, x21, x22, x23, x24, x25) = g(a26)
        ((x1, x2, x3, x4, x5, x6, x7, x8, x9, x10, x11, x12, x13, x14, x15, x16, x17, x18, x19, x20, x21, x22, x23, x24), x25)
      }(productx, f25)
    }


  def product26[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27](f: (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26) => A27)(g: A27 => (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26))(f1: F[A1], f2: F[A2], f3: F[A3], f4: F[A4], f5: F[A5], f6: F[A6], f7: F[A7], f8: F[A8], f9: F[A9], f10: F[A10], f11: F[A11], f12: F[A12], f13: F[A13], f14: F[A14], f15: F[A15], f16: F[A16], f17: F[A17], f18: F[A18], f19: F[A19], f20: F[A20], f21: F[A21], f22: F[A22], f23: F[A23], f24: F[A24], f25: F[A25], f26: F[A26]): F[A27] = {
      val productx: F[(A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25)] = product25[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25)]((a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22, a23, a24, a25) => (a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22, a23, a24, a25))(x => x)(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, f20, f21, f22, f23, f24, f25)

      product2[(A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25), A26, A27]({ case ((a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22, a23, a24, a25), a26) => f(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22, a23, a24, a25, a26) }) { a27 =>
        val (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10, x11, x12, x13, x14, x15, x16, x17, x18, x19, x20, x21, x22, x23, x24, x25, x26) = g(a27)
        ((x1, x2, x3, x4, x5, x6, x7, x8, x9, x10, x11, x12, x13, x14, x15, x16, x17, x18, x19, x20, x21, x22, x23, x24, x25), x26)
      }(productx, f26)
    }


  def product27[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28](f: (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27) => A28)(g: A28 => (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27))(f1: F[A1], f2: F[A2], f3: F[A3], f4: F[A4], f5: F[A5], f6: F[A6], f7: F[A7], f8: F[A8], f9: F[A9], f10: F[A10], f11: F[A11], f12: F[A12], f13: F[A13], f14: F[A14], f15: F[A15], f16: F[A16], f17: F[A17], f18: F[A18], f19: F[A19], f20: F[A20], f21: F[A21], f22: F[A22], f23: F[A23], f24: F[A24], f25: F[A25], f26: F[A26], f27: F[A27]): F[A28] = {
      val productx: F[(A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26)] = product26[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26)]((a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22, a23, a24, a25, a26) => (a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22, a23, a24, a25, a26))(x => x)(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, f20, f21, f22, f23, f24, f25, f26)

      product2[(A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26), A27, A28]({ case ((a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22, a23, a24, a25, a26), a27) => f(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22, a23, a24, a25, a26, a27) }) { a28 =>
        val (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10, x11, x12, x13, x14, x15, x16, x17, x18, x19, x20, x21, x22, x23, x24, x25, x26, x27) = g(a28)
        ((x1, x2, x3, x4, x5, x6, x7, x8, x9, x10, x11, x12, x13, x14, x15, x16, x17, x18, x19, x20, x21, x22, x23, x24, x25, x26), x27)
      }(productx, f27)
    }


  def product28[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29](f: (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28) => A29)(g: A29 => (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28))(f1: F[A1], f2: F[A2], f3: F[A3], f4: F[A4], f5: F[A5], f6: F[A6], f7: F[A7], f8: F[A8], f9: F[A9], f10: F[A10], f11: F[A11], f12: F[A12], f13: F[A13], f14: F[A14], f15: F[A15], f16: F[A16], f17: F[A17], f18: F[A18], f19: F[A19], f20: F[A20], f21: F[A21], f22: F[A22], f23: F[A23], f24: F[A24], f25: F[A25], f26: F[A26], f27: F[A27], f28: F[A28]): F[A29] = {
      val productx: F[(A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27)] = product27[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27)]((a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22, a23, a24, a25, a26, a27) => (a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22, a23, a24, a25, a26, a27))(x => x)(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, f20, f21, f22, f23, f24, f25, f26, f27)

      product2[(A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27), A28, A29]({ case ((a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22, a23, a24, a25, a26, a27), a28) => f(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22, a23, a24, a25, a26, a27, a28) }) { a29 =>
        val (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10, x11, x12, x13, x14, x15, x16, x17, x18, x19, x20, x21, x22, x23, x24, x25, x26, x27, x28) = g(a29)
        ((x1, x2, x3, x4, x5, x6, x7, x8, x9, x10, x11, x12, x13, x14, x15, x16, x17, x18, x19, x20, x21, x22, x23, x24, x25, x26, x27), x28)
      }(productx, f28)
    }


  def product29[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30](f: (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29) => A30)(g: A30 => (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29))(f1: F[A1], f2: F[A2], f3: F[A3], f4: F[A4], f5: F[A5], f6: F[A6], f7: F[A7], f8: F[A8], f9: F[A9], f10: F[A10], f11: F[A11], f12: F[A12], f13: F[A13], f14: F[A14], f15: F[A15], f16: F[A16], f17: F[A17], f18: F[A18], f19: F[A19], f20: F[A20], f21: F[A21], f22: F[A22], f23: F[A23], f24: F[A24], f25: F[A25], f26: F[A26], f27: F[A27], f28: F[A28], f29: F[A29]): F[A30] = {
      val productx: F[(A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28)] = product28[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28)]((a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22, a23, a24, a25, a26, a27, a28) => (a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22, a23, a24, a25, a26, a27, a28))(x => x)(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, f20, f21, f22, f23, f24, f25, f26, f27, f28)

      product2[(A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28), A29, A30]({ case ((a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22, a23, a24, a25, a26, a27, a28), a29) => f(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22, a23, a24, a25, a26, a27, a28, a29) }) { a30 =>
        val (x1, x2, x3, x4, x5, x6, x7, x8, x9, x10, x11, x12, x13, x14, x15, x16, x17, x18, x19, x20, x21, x22, x23, x24, x25, x26, x27, x28, x29) = g(a30)
        ((x1, x2, x3, x4, x5, x6, x7, x8, x9, x10, x11, x12, x13, x14, x15, x16, x17, x18, x19, x20, x21, x22, x23, x24, x25, x26, x27, x28), x29)
      }(productx, f29)
    }

 }
