package scala

import deriving.Mirror
import shapely._

trait ShapelyCompat { this: Shapely.type =>

  implicit def caseclass0[A <: Product](implicit A: Mirror.ProductOf[A], ev: A.MirroredElemTypes =:= EmptyTuple): Shapely[A, CaseClass0[A]] = new Shapely[A, CaseClass0[A]] {
    def to(a: A): CaseClass0[A] = CaseClass0[A]()
    def from(s: CaseClass0[A]): A = A.fromProduct(s)
  }

  implicit def caseclass1[A <: Product, A1, L1 <: String](implicit A: Mirror.ProductOf[A], ev1: A.MirroredElemTypes =:= Tuple1[A1], ev2: A.MirroredElemLabels =:= Tuple1[L1], S: Mirror.ProductOf[CaseClass1[A, A1, L1]]): Shapely[A, CaseClass1[A, A1, L1]] = new Shapely[A, CaseClass1[A, A1, L1]] {
    def to(a: A): CaseClass1[A, A1, L1] = S.fromProduct(a)
    def from(s: CaseClass1[A, A1, L1]): A = A.fromProduct(s)
  }

  implicit def caseclass2[A <: Product, A1, A2, L1 <: String, L2 <: String](implicit A: Mirror.ProductOf[A], ev1: A.MirroredElemTypes =:= (A1, A2), ev2: A.MirroredElemLabels =:= (L1, L2), S: Mirror.ProductOf[CaseClass2[A, A1, A2, L1, L2]]): Shapely[A, CaseClass2[A, A1, A2, L1, L2]] = new Shapely[A, CaseClass2[A, A1, A2, L1, L2]] {
    def to(a: A): CaseClass2[A, A1, A2, L1, L2] = S.fromProduct(a)
    def from(s: CaseClass2[A, A1, A2, L1, L2]): A = A.fromProduct(s)
  }

  implicit def caseclass3[A <: Product, A1, A2, A3, L1 <: String, L2 <: String, L3 <: String](implicit A: Mirror.ProductOf[A], ev1: A.MirroredElemTypes =:= (A1, A2, A3), ev2: A.MirroredElemLabels =:= (L1, L2, L3), S: Mirror.ProductOf[CaseClass3[A, A1, A2, A3, L1, L2, L3]]): Shapely[A, CaseClass3[A, A1, A2, A3, L1, L2, L3]] = new Shapely[A, CaseClass3[A, A1, A2, A3, L1, L2, L3]] {
    def to(a: A): CaseClass3[A, A1, A2, A3, L1, L2, L3] = S.fromProduct(a)
    def from(s: CaseClass3[A, A1, A2, A3, L1, L2, L3]): A = A.fromProduct(s)
  }

  implicit def caseclass4[A <: Product, A1, A2, A3, A4, L1 <: String, L2 <: String, L3 <: String, L4 <: String](implicit A: Mirror.ProductOf[A], ev1: A.MirroredElemTypes =:= (A1, A2, A3, A4), ev2: A.MirroredElemLabels =:= (L1, L2, L3, L4), S: Mirror.ProductOf[CaseClass4[A, A1, A2, A3, A4, L1, L2, L3, L4]]): Shapely[A, CaseClass4[A, A1, A2, A3, A4, L1, L2, L3, L4]] = new Shapely[A, CaseClass4[A, A1, A2, A3, A4, L1, L2, L3, L4]] {
    def to(a: A): CaseClass4[A, A1, A2, A3, A4, L1, L2, L3, L4] = S.fromProduct(a)
    def from(s: CaseClass4[A, A1, A2, A3, A4, L1, L2, L3, L4]): A = A.fromProduct(s)
  }

  implicit def caseclass5[A <: Product, A1, A2, A3, A4, A5, L1 <: String, L2 <: String, L3 <: String, L4 <: String, L5 <: String](implicit A: Mirror.ProductOf[A], ev1: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5), ev2: A.MirroredElemLabels =:= (L1, L2, L3, L4, L5), S: Mirror.ProductOf[CaseClass5[A, A1, A2, A3, A4, A5, L1, L2, L3, L4, L5]]): Shapely[A, CaseClass5[A, A1, A2, A3, A4, A5, L1, L2, L3, L4, L5]] = new Shapely[A, CaseClass5[A, A1, A2, A3, A4, A5, L1, L2, L3, L4, L5]] {
    def to(a: A): CaseClass5[A, A1, A2, A3, A4, A5, L1, L2, L3, L4, L5] = S.fromProduct(a)
    def from(s: CaseClass5[A, A1, A2, A3, A4, A5, L1, L2, L3, L4, L5]): A = A.fromProduct(s)
  }

  implicit def caseclass6[A <: Product, A1, A2, A3, A4, A5, A6, L1 <: String, L2 <: String, L3 <: String, L4 <: String, L5 <: String, L6 <: String](implicit A: Mirror.ProductOf[A], ev1: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6), ev2: A.MirroredElemLabels =:= (L1, L2, L3, L4, L5, L6), S: Mirror.ProductOf[CaseClass6[A, A1, A2, A3, A4, A5, A6, L1, L2, L3, L4, L5, L6]]): Shapely[A, CaseClass6[A, A1, A2, A3, A4, A5, A6, L1, L2, L3, L4, L5, L6]] = new Shapely[A, CaseClass6[A, A1, A2, A3, A4, A5, A6, L1, L2, L3, L4, L5, L6]] {
    def to(a: A): CaseClass6[A, A1, A2, A3, A4, A5, A6, L1, L2, L3, L4, L5, L6] = S.fromProduct(a)
    def from(s: CaseClass6[A, A1, A2, A3, A4, A5, A6, L1, L2, L3, L4, L5, L6]): A = A.fromProduct(s)
  }

  implicit def caseclass7[A <: Product, A1, A2, A3, A4, A5, A6, A7, L1 <: String, L2 <: String, L3 <: String, L4 <: String, L5 <: String, L6 <: String, L7 <: String](implicit A: Mirror.ProductOf[A], ev1: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7), ev2: A.MirroredElemLabels =:= (L1, L2, L3, L4, L5, L6, L7), S: Mirror.ProductOf[CaseClass7[A, A1, A2, A3, A4, A5, A6, A7, L1, L2, L3, L4, L5, L6, L7]]): Shapely[A, CaseClass7[A, A1, A2, A3, A4, A5, A6, A7, L1, L2, L3, L4, L5, L6, L7]] = new Shapely[A, CaseClass7[A, A1, A2, A3, A4, A5, A6, A7, L1, L2, L3, L4, L5, L6, L7]] {
    def to(a: A): CaseClass7[A, A1, A2, A3, A4, A5, A6, A7, L1, L2, L3, L4, L5, L6, L7] = S.fromProduct(a)
    def from(s: CaseClass7[A, A1, A2, A3, A4, A5, A6, A7, L1, L2, L3, L4, L5, L6, L7]): A = A.fromProduct(s)
  }

  implicit def caseclass8[A <: Product, A1, A2, A3, A4, A5, A6, A7, A8, L1 <: String, L2 <: String, L3 <: String, L4 <: String, L5 <: String, L6 <: String, L7 <: String, L8 <: String](implicit A: Mirror.ProductOf[A], ev1: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8), ev2: A.MirroredElemLabels =:= (L1, L2, L3, L4, L5, L6, L7, L8), S: Mirror.ProductOf[CaseClass8[A, A1, A2, A3, A4, A5, A6, A7, A8, L1, L2, L3, L4, L5, L6, L7, L8]]): Shapely[A, CaseClass8[A, A1, A2, A3, A4, A5, A6, A7, A8, L1, L2, L3, L4, L5, L6, L7, L8]] = new Shapely[A, CaseClass8[A, A1, A2, A3, A4, A5, A6, A7, A8, L1, L2, L3, L4, L5, L6, L7, L8]] {
    def to(a: A): CaseClass8[A, A1, A2, A3, A4, A5, A6, A7, A8, L1, L2, L3, L4, L5, L6, L7, L8] = S.fromProduct(a)
    def from(s: CaseClass8[A, A1, A2, A3, A4, A5, A6, A7, A8, L1, L2, L3, L4, L5, L6, L7, L8]): A = A.fromProduct(s)
  }

  implicit def caseclass9[A <: Product, A1, A2, A3, A4, A5, A6, A7, A8, A9, L1 <: String, L2 <: String, L3 <: String, L4 <: String, L5 <: String, L6 <: String, L7 <: String, L8 <: String, L9 <: String](implicit A: Mirror.ProductOf[A], ev1: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9), ev2: A.MirroredElemLabels =:= (L1, L2, L3, L4, L5, L6, L7, L8, L9), S: Mirror.ProductOf[CaseClass9[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, L1, L2, L3, L4, L5, L6, L7, L8, L9]]): Shapely[A, CaseClass9[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, L1, L2, L3, L4, L5, L6, L7, L8, L9]] = new Shapely[A, CaseClass9[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, L1, L2, L3, L4, L5, L6, L7, L8, L9]] {
    def to(a: A): CaseClass9[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, L1, L2, L3, L4, L5, L6, L7, L8, L9] = S.fromProduct(a)
    def from(s: CaseClass9[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, L1, L2, L3, L4, L5, L6, L7, L8, L9]): A = A.fromProduct(s)
  }

  implicit def caseclass10[A <: Product, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, L1 <: String, L2 <: String, L3 <: String, L4 <: String, L5 <: String, L6 <: String, L7 <: String, L8 <: String, L9 <: String, L10 <: String](implicit A: Mirror.ProductOf[A], ev1: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10), ev2: A.MirroredElemLabels =:= (L1, L2, L3, L4, L5, L6, L7, L8, L9, L10), S: Mirror.ProductOf[CaseClass10[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10]]): Shapely[A, CaseClass10[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10]] = new Shapely[A, CaseClass10[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10]] {
    def to(a: A): CaseClass10[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10] = S.fromProduct(a)
    def from(s: CaseClass10[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10]): A = A.fromProduct(s)
  }

  implicit def caseclass11[A <: Product, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, L1 <: String, L2 <: String, L3 <: String, L4 <: String, L5 <: String, L6 <: String, L7 <: String, L8 <: String, L9 <: String, L10 <: String, L11 <: String](implicit A: Mirror.ProductOf[A], ev1: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11), ev2: A.MirroredElemLabels =:= (L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11), S: Mirror.ProductOf[CaseClass11[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11]]): Shapely[A, CaseClass11[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11]] = new Shapely[A, CaseClass11[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11]] {
    def to(a: A): CaseClass11[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11] = S.fromProduct(a)
    def from(s: CaseClass11[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11]): A = A.fromProduct(s)
  }

  implicit def caseclass12[A <: Product, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, L1 <: String, L2 <: String, L3 <: String, L4 <: String, L5 <: String, L6 <: String, L7 <: String, L8 <: String, L9 <: String, L10 <: String, L11 <: String, L12 <: String](implicit A: Mirror.ProductOf[A], ev1: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12), ev2: A.MirroredElemLabels =:= (L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12), S: Mirror.ProductOf[CaseClass12[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12]]): Shapely[A, CaseClass12[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12]] = new Shapely[A, CaseClass12[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12]] {
    def to(a: A): CaseClass12[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12] = S.fromProduct(a)
    def from(s: CaseClass12[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12]): A = A.fromProduct(s)
  }

  implicit def caseclass13[A <: Product, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, L1 <: String, L2 <: String, L3 <: String, L4 <: String, L5 <: String, L6 <: String, L7 <: String, L8 <: String, L9 <: String, L10 <: String, L11 <: String, L12 <: String, L13 <: String](implicit A: Mirror.ProductOf[A], ev1: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13), ev2: A.MirroredElemLabels =:= (L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13), S: Mirror.ProductOf[CaseClass13[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13]]): Shapely[A, CaseClass13[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13]] = new Shapely[A, CaseClass13[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13]] {
    def to(a: A): CaseClass13[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13] = S.fromProduct(a)
    def from(s: CaseClass13[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13]): A = A.fromProduct(s)
  }

  implicit def caseclass14[A <: Product, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, L1 <: String, L2 <: String, L3 <: String, L4 <: String, L5 <: String, L6 <: String, L7 <: String, L8 <: String, L9 <: String, L10 <: String, L11 <: String, L12 <: String, L13 <: String, L14 <: String](implicit A: Mirror.ProductOf[A], ev1: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14), ev2: A.MirroredElemLabels =:= (L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14), S: Mirror.ProductOf[CaseClass14[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14]]): Shapely[A, CaseClass14[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14]] = new Shapely[A, CaseClass14[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14]] {
    def to(a: A): CaseClass14[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14] = S.fromProduct(a)
    def from(s: CaseClass14[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14]): A = A.fromProduct(s)
  }

  implicit def caseclass15[A <: Product, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, L1 <: String, L2 <: String, L3 <: String, L4 <: String, L5 <: String, L6 <: String, L7 <: String, L8 <: String, L9 <: String, L10 <: String, L11 <: String, L12 <: String, L13 <: String, L14 <: String, L15 <: String](implicit A: Mirror.ProductOf[A], ev1: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15), ev2: A.MirroredElemLabels =:= (L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15), S: Mirror.ProductOf[CaseClass15[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15]]): Shapely[A, CaseClass15[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15]] = new Shapely[A, CaseClass15[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15]] {
    def to(a: A): CaseClass15[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15] = S.fromProduct(a)
    def from(s: CaseClass15[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15]): A = A.fromProduct(s)
  }

  implicit def caseclass16[A <: Product, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, L1 <: String, L2 <: String, L3 <: String, L4 <: String, L5 <: String, L6 <: String, L7 <: String, L8 <: String, L9 <: String, L10 <: String, L11 <: String, L12 <: String, L13 <: String, L14 <: String, L15 <: String, L16 <: String](implicit A: Mirror.ProductOf[A], ev1: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16), ev2: A.MirroredElemLabels =:= (L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16), S: Mirror.ProductOf[CaseClass16[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16]]): Shapely[A, CaseClass16[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16]] = new Shapely[A, CaseClass16[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16]] {
    def to(a: A): CaseClass16[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16] = S.fromProduct(a)
    def from(s: CaseClass16[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16]): A = A.fromProduct(s)
  }

  implicit def caseclass17[A <: Product, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, L1 <: String, L2 <: String, L3 <: String, L4 <: String, L5 <: String, L6 <: String, L7 <: String, L8 <: String, L9 <: String, L10 <: String, L11 <: String, L12 <: String, L13 <: String, L14 <: String, L15 <: String, L16 <: String, L17 <: String](implicit A: Mirror.ProductOf[A], ev1: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17), ev2: A.MirroredElemLabels =:= (L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17), S: Mirror.ProductOf[CaseClass17[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17]]): Shapely[A, CaseClass17[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17]] = new Shapely[A, CaseClass17[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17]] {
    def to(a: A): CaseClass17[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17] = S.fromProduct(a)
    def from(s: CaseClass17[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17]): A = A.fromProduct(s)
  }

  implicit def caseclass18[A <: Product, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, L1 <: String, L2 <: String, L3 <: String, L4 <: String, L5 <: String, L6 <: String, L7 <: String, L8 <: String, L9 <: String, L10 <: String, L11 <: String, L12 <: String, L13 <: String, L14 <: String, L15 <: String, L16 <: String, L17 <: String, L18 <: String](implicit A: Mirror.ProductOf[A], ev1: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18), ev2: A.MirroredElemLabels =:= (L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18), S: Mirror.ProductOf[CaseClass18[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18]]): Shapely[A, CaseClass18[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18]] = new Shapely[A, CaseClass18[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18]] {
    def to(a: A): CaseClass18[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18] = S.fromProduct(a)
    def from(s: CaseClass18[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18]): A = A.fromProduct(s)
  }

  implicit def caseclass19[A <: Product, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, L1 <: String, L2 <: String, L3 <: String, L4 <: String, L5 <: String, L6 <: String, L7 <: String, L8 <: String, L9 <: String, L10 <: String, L11 <: String, L12 <: String, L13 <: String, L14 <: String, L15 <: String, L16 <: String, L17 <: String, L18 <: String, L19 <: String](implicit A: Mirror.ProductOf[A], ev1: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19), ev2: A.MirroredElemLabels =:= (L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19), S: Mirror.ProductOf[CaseClass19[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19]]): Shapely[A, CaseClass19[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19]] = new Shapely[A, CaseClass19[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19]] {
    def to(a: A): CaseClass19[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19] = S.fromProduct(a)
    def from(s: CaseClass19[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19]): A = A.fromProduct(s)
  }

  implicit def caseclass20[A <: Product, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, L1 <: String, L2 <: String, L3 <: String, L4 <: String, L5 <: String, L6 <: String, L7 <: String, L8 <: String, L9 <: String, L10 <: String, L11 <: String, L12 <: String, L13 <: String, L14 <: String, L15 <: String, L16 <: String, L17 <: String, L18 <: String, L19 <: String, L20 <: String](implicit A: Mirror.ProductOf[A], ev1: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20), ev2: A.MirroredElemLabels =:= (L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20), S: Mirror.ProductOf[CaseClass20[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20]]): Shapely[A, CaseClass20[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20]] = new Shapely[A, CaseClass20[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20]] {
    def to(a: A): CaseClass20[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20] = S.fromProduct(a)
    def from(s: CaseClass20[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20]): A = A.fromProduct(s)
  }

  implicit def caseclass21[A <: Product, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, L1 <: String, L2 <: String, L3 <: String, L4 <: String, L5 <: String, L6 <: String, L7 <: String, L8 <: String, L9 <: String, L10 <: String, L11 <: String, L12 <: String, L13 <: String, L14 <: String, L15 <: String, L16 <: String, L17 <: String, L18 <: String, L19 <: String, L20 <: String, L21 <: String](implicit A: Mirror.ProductOf[A], ev1: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21), ev2: A.MirroredElemLabels =:= (L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21), S: Mirror.ProductOf[CaseClass21[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21]]): Shapely[A, CaseClass21[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21]] = new Shapely[A, CaseClass21[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21]] {
    def to(a: A): CaseClass21[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21] = S.fromProduct(a)
    def from(s: CaseClass21[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21]): A = A.fromProduct(s)
  }

  implicit def caseclass22[A <: Product, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, L1 <: String, L2 <: String, L3 <: String, L4 <: String, L5 <: String, L6 <: String, L7 <: String, L8 <: String, L9 <: String, L10 <: String, L11 <: String, L12 <: String, L13 <: String, L14 <: String, L15 <: String, L16 <: String, L17 <: String, L18 <: String, L19 <: String, L20 <: String, L21 <: String, L22 <: String](implicit A: Mirror.ProductOf[A], ev1: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22), ev2: A.MirroredElemLabels =:= (L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22), S: Mirror.ProductOf[CaseClass22[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22]]): Shapely[A, CaseClass22[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22]] = new Shapely[A, CaseClass22[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22]] {
    def to(a: A): CaseClass22[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22] = S.fromProduct(a)
    def from(s: CaseClass22[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22]): A = A.fromProduct(s)
  }

  implicit def caseclass23[A <: Product, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, L1 <: String, L2 <: String, L3 <: String, L4 <: String, L5 <: String, L6 <: String, L7 <: String, L8 <: String, L9 <: String, L10 <: String, L11 <: String, L12 <: String, L13 <: String, L14 <: String, L15 <: String, L16 <: String, L17 <: String, L18 <: String, L19 <: String, L20 <: String, L21 <: String, L22 <: String, L23 <: String](implicit A: Mirror.ProductOf[A], ev1: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23), ev2: A.MirroredElemLabels =:= (L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23), S: Mirror.ProductOf[CaseClass23[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23]]): Shapely[A, CaseClass23[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23]] = new Shapely[A, CaseClass23[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23]] {
    def to(a: A): CaseClass23[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23] = S.fromProduct(a)
    def from(s: CaseClass23[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23]): A = A.fromProduct(s)
  }

  implicit def caseclass24[A <: Product, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, L1 <: String, L2 <: String, L3 <: String, L4 <: String, L5 <: String, L6 <: String, L7 <: String, L8 <: String, L9 <: String, L10 <: String, L11 <: String, L12 <: String, L13 <: String, L14 <: String, L15 <: String, L16 <: String, L17 <: String, L18 <: String, L19 <: String, L20 <: String, L21 <: String, L22 <: String, L23 <: String, L24 <: String](implicit A: Mirror.ProductOf[A], ev1: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24), ev2: A.MirroredElemLabels =:= (L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24), S: Mirror.ProductOf[CaseClass24[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24]]): Shapely[A, CaseClass24[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24]] = new Shapely[A, CaseClass24[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24]] {
    def to(a: A): CaseClass24[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24] = S.fromProduct(a)
    def from(s: CaseClass24[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24]): A = A.fromProduct(s)
  }

  implicit def caseclass25[A <: Product, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, L1 <: String, L2 <: String, L3 <: String, L4 <: String, L5 <: String, L6 <: String, L7 <: String, L8 <: String, L9 <: String, L10 <: String, L11 <: String, L12 <: String, L13 <: String, L14 <: String, L15 <: String, L16 <: String, L17 <: String, L18 <: String, L19 <: String, L20 <: String, L21 <: String, L22 <: String, L23 <: String, L24 <: String, L25 <: String](implicit A: Mirror.ProductOf[A], ev1: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25), ev2: A.MirroredElemLabels =:= (L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25), S: Mirror.ProductOf[CaseClass25[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25]]): Shapely[A, CaseClass25[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25]] = new Shapely[A, CaseClass25[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25]] {
    def to(a: A): CaseClass25[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25] = S.fromProduct(a)
    def from(s: CaseClass25[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25]): A = A.fromProduct(s)
  }

  implicit def caseclass26[A <: Product, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, L1 <: String, L2 <: String, L3 <: String, L4 <: String, L5 <: String, L6 <: String, L7 <: String, L8 <: String, L9 <: String, L10 <: String, L11 <: String, L12 <: String, L13 <: String, L14 <: String, L15 <: String, L16 <: String, L17 <: String, L18 <: String, L19 <: String, L20 <: String, L21 <: String, L22 <: String, L23 <: String, L24 <: String, L25 <: String, L26 <: String](implicit A: Mirror.ProductOf[A], ev1: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26), ev2: A.MirroredElemLabels =:= (L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26), S: Mirror.ProductOf[CaseClass26[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26]]): Shapely[A, CaseClass26[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26]] = new Shapely[A, CaseClass26[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26]] {
    def to(a: A): CaseClass26[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26] = S.fromProduct(a)
    def from(s: CaseClass26[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26]): A = A.fromProduct(s)
  }

  implicit def caseclass27[A <: Product, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, L1 <: String, L2 <: String, L3 <: String, L4 <: String, L5 <: String, L6 <: String, L7 <: String, L8 <: String, L9 <: String, L10 <: String, L11 <: String, L12 <: String, L13 <: String, L14 <: String, L15 <: String, L16 <: String, L17 <: String, L18 <: String, L19 <: String, L20 <: String, L21 <: String, L22 <: String, L23 <: String, L24 <: String, L25 <: String, L26 <: String, L27 <: String](implicit A: Mirror.ProductOf[A], ev1: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27), ev2: A.MirroredElemLabels =:= (L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27), S: Mirror.ProductOf[CaseClass27[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27]]): Shapely[A, CaseClass27[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27]] = new Shapely[A, CaseClass27[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27]] {
    def to(a: A): CaseClass27[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27] = S.fromProduct(a)
    def from(s: CaseClass27[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27]): A = A.fromProduct(s)
  }

  implicit def caseclass28[A <: Product, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, L1 <: String, L2 <: String, L3 <: String, L4 <: String, L5 <: String, L6 <: String, L7 <: String, L8 <: String, L9 <: String, L10 <: String, L11 <: String, L12 <: String, L13 <: String, L14 <: String, L15 <: String, L16 <: String, L17 <: String, L18 <: String, L19 <: String, L20 <: String, L21 <: String, L22 <: String, L23 <: String, L24 <: String, L25 <: String, L26 <: String, L27 <: String, L28 <: String](implicit A: Mirror.ProductOf[A], ev1: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28), ev2: A.MirroredElemLabels =:= (L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28), S: Mirror.ProductOf[CaseClass28[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28]]): Shapely[A, CaseClass28[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28]] = new Shapely[A, CaseClass28[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28]] {
    def to(a: A): CaseClass28[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28] = S.fromProduct(a)
    def from(s: CaseClass28[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28]): A = A.fromProduct(s)
  }

  implicit def caseclass29[A <: Product, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, L1 <: String, L2 <: String, L3 <: String, L4 <: String, L5 <: String, L6 <: String, L7 <: String, L8 <: String, L9 <: String, L10 <: String, L11 <: String, L12 <: String, L13 <: String, L14 <: String, L15 <: String, L16 <: String, L17 <: String, L18 <: String, L19 <: String, L20 <: String, L21 <: String, L22 <: String, L23 <: String, L24 <: String, L25 <: String, L26 <: String, L27 <: String, L28 <: String, L29 <: String](implicit A: Mirror.ProductOf[A], ev1: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29), ev2: A.MirroredElemLabels =:= (L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29), S: Mirror.ProductOf[CaseClass29[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29]]): Shapely[A, CaseClass29[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29]] = new Shapely[A, CaseClass29[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29]] {
    def to(a: A): CaseClass29[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29] = S.fromProduct(a)
    def from(s: CaseClass29[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29]): A = A.fromProduct(s)
  }

  implicit def caseclass30[A <: Product, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, L1 <: String, L2 <: String, L3 <: String, L4 <: String, L5 <: String, L6 <: String, L7 <: String, L8 <: String, L9 <: String, L10 <: String, L11 <: String, L12 <: String, L13 <: String, L14 <: String, L15 <: String, L16 <: String, L17 <: String, L18 <: String, L19 <: String, L20 <: String, L21 <: String, L22 <: String, L23 <: String, L24 <: String, L25 <: String, L26 <: String, L27 <: String, L28 <: String, L29 <: String, L30 <: String](implicit A: Mirror.ProductOf[A], ev1: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30), ev2: A.MirroredElemLabels =:= (L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30), S: Mirror.ProductOf[CaseClass30[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30]]): Shapely[A, CaseClass30[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30]] = new Shapely[A, CaseClass30[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30]] {
    def to(a: A): CaseClass30[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30] = S.fromProduct(a)
    def from(s: CaseClass30[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30]): A = A.fromProduct(s)
  }

  implicit def caseclass31[A <: Product, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, L1 <: String, L2 <: String, L3 <: String, L4 <: String, L5 <: String, L6 <: String, L7 <: String, L8 <: String, L9 <: String, L10 <: String, L11 <: String, L12 <: String, L13 <: String, L14 <: String, L15 <: String, L16 <: String, L17 <: String, L18 <: String, L19 <: String, L20 <: String, L21 <: String, L22 <: String, L23 <: String, L24 <: String, L25 <: String, L26 <: String, L27 <: String, L28 <: String, L29 <: String, L30 <: String, L31 <: String](implicit A: Mirror.ProductOf[A], ev1: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31), ev2: A.MirroredElemLabels =:= (L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31), S: Mirror.ProductOf[CaseClass31[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31]]): Shapely[A, CaseClass31[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31]] = new Shapely[A, CaseClass31[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31]] {
    def to(a: A): CaseClass31[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31] = S.fromProduct(a)
    def from(s: CaseClass31[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31]): A = A.fromProduct(s)
  }

  implicit def caseclass32[A <: Product, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, L1 <: String, L2 <: String, L3 <: String, L4 <: String, L5 <: String, L6 <: String, L7 <: String, L8 <: String, L9 <: String, L10 <: String, L11 <: String, L12 <: String, L13 <: String, L14 <: String, L15 <: String, L16 <: String, L17 <: String, L18 <: String, L19 <: String, L20 <: String, L21 <: String, L22 <: String, L23 <: String, L24 <: String, L25 <: String, L26 <: String, L27 <: String, L28 <: String, L29 <: String, L30 <: String, L31 <: String, L32 <: String](implicit A: Mirror.ProductOf[A], ev1: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32), ev2: A.MirroredElemLabels =:= (L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32), S: Mirror.ProductOf[CaseClass32[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32]]): Shapely[A, CaseClass32[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32]] = new Shapely[A, CaseClass32[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32]] {
    def to(a: A): CaseClass32[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32] = S.fromProduct(a)
    def from(s: CaseClass32[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32]): A = A.fromProduct(s)
  }

  implicit def caseclass33[A <: Product, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, L1 <: String, L2 <: String, L3 <: String, L4 <: String, L5 <: String, L6 <: String, L7 <: String, L8 <: String, L9 <: String, L10 <: String, L11 <: String, L12 <: String, L13 <: String, L14 <: String, L15 <: String, L16 <: String, L17 <: String, L18 <: String, L19 <: String, L20 <: String, L21 <: String, L22 <: String, L23 <: String, L24 <: String, L25 <: String, L26 <: String, L27 <: String, L28 <: String, L29 <: String, L30 <: String, L31 <: String, L32 <: String, L33 <: String](implicit A: Mirror.ProductOf[A], ev1: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33), ev2: A.MirroredElemLabels =:= (L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33), S: Mirror.ProductOf[CaseClass33[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33]]): Shapely[A, CaseClass33[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33]] = new Shapely[A, CaseClass33[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33]] {
    def to(a: A): CaseClass33[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33] = S.fromProduct(a)
    def from(s: CaseClass33[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33]): A = A.fromProduct(s)
  }

  implicit def caseclass34[A <: Product, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, L1 <: String, L2 <: String, L3 <: String, L4 <: String, L5 <: String, L6 <: String, L7 <: String, L8 <: String, L9 <: String, L10 <: String, L11 <: String, L12 <: String, L13 <: String, L14 <: String, L15 <: String, L16 <: String, L17 <: String, L18 <: String, L19 <: String, L20 <: String, L21 <: String, L22 <: String, L23 <: String, L24 <: String, L25 <: String, L26 <: String, L27 <: String, L28 <: String, L29 <: String, L30 <: String, L31 <: String, L32 <: String, L33 <: String, L34 <: String](implicit A: Mirror.ProductOf[A], ev1: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34), ev2: A.MirroredElemLabels =:= (L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34), S: Mirror.ProductOf[CaseClass34[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34]]): Shapely[A, CaseClass34[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34]] = new Shapely[A, CaseClass34[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34]] {
    def to(a: A): CaseClass34[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34] = S.fromProduct(a)
    def from(s: CaseClass34[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34]): A = A.fromProduct(s)
  }

  implicit def caseclass35[A <: Product, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, L1 <: String, L2 <: String, L3 <: String, L4 <: String, L5 <: String, L6 <: String, L7 <: String, L8 <: String, L9 <: String, L10 <: String, L11 <: String, L12 <: String, L13 <: String, L14 <: String, L15 <: String, L16 <: String, L17 <: String, L18 <: String, L19 <: String, L20 <: String, L21 <: String, L22 <: String, L23 <: String, L24 <: String, L25 <: String, L26 <: String, L27 <: String, L28 <: String, L29 <: String, L30 <: String, L31 <: String, L32 <: String, L33 <: String, L34 <: String, L35 <: String](implicit A: Mirror.ProductOf[A], ev1: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35), ev2: A.MirroredElemLabels =:= (L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35), S: Mirror.ProductOf[CaseClass35[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35]]): Shapely[A, CaseClass35[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35]] = new Shapely[A, CaseClass35[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35]] {
    def to(a: A): CaseClass35[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35] = S.fromProduct(a)
    def from(s: CaseClass35[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35]): A = A.fromProduct(s)
  }

  implicit def caseclass36[A <: Product, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, L1 <: String, L2 <: String, L3 <: String, L4 <: String, L5 <: String, L6 <: String, L7 <: String, L8 <: String, L9 <: String, L10 <: String, L11 <: String, L12 <: String, L13 <: String, L14 <: String, L15 <: String, L16 <: String, L17 <: String, L18 <: String, L19 <: String, L20 <: String, L21 <: String, L22 <: String, L23 <: String, L24 <: String, L25 <: String, L26 <: String, L27 <: String, L28 <: String, L29 <: String, L30 <: String, L31 <: String, L32 <: String, L33 <: String, L34 <: String, L35 <: String, L36 <: String](implicit A: Mirror.ProductOf[A], ev1: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36), ev2: A.MirroredElemLabels =:= (L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36), S: Mirror.ProductOf[CaseClass36[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36]]): Shapely[A, CaseClass36[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36]] = new Shapely[A, CaseClass36[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36]] {
    def to(a: A): CaseClass36[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36] = S.fromProduct(a)
    def from(s: CaseClass36[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36]): A = A.fromProduct(s)
  }

  implicit def caseclass37[A <: Product, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, L1 <: String, L2 <: String, L3 <: String, L4 <: String, L5 <: String, L6 <: String, L7 <: String, L8 <: String, L9 <: String, L10 <: String, L11 <: String, L12 <: String, L13 <: String, L14 <: String, L15 <: String, L16 <: String, L17 <: String, L18 <: String, L19 <: String, L20 <: String, L21 <: String, L22 <: String, L23 <: String, L24 <: String, L25 <: String, L26 <: String, L27 <: String, L28 <: String, L29 <: String, L30 <: String, L31 <: String, L32 <: String, L33 <: String, L34 <: String, L35 <: String, L36 <: String, L37 <: String](implicit A: Mirror.ProductOf[A], ev1: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37), ev2: A.MirroredElemLabels =:= (L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37), S: Mirror.ProductOf[CaseClass37[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37]]): Shapely[A, CaseClass37[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37]] = new Shapely[A, CaseClass37[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37]] {
    def to(a: A): CaseClass37[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37] = S.fromProduct(a)
    def from(s: CaseClass37[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37]): A = A.fromProduct(s)
  }

  implicit def caseclass38[A <: Product, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, L1 <: String, L2 <: String, L3 <: String, L4 <: String, L5 <: String, L6 <: String, L7 <: String, L8 <: String, L9 <: String, L10 <: String, L11 <: String, L12 <: String, L13 <: String, L14 <: String, L15 <: String, L16 <: String, L17 <: String, L18 <: String, L19 <: String, L20 <: String, L21 <: String, L22 <: String, L23 <: String, L24 <: String, L25 <: String, L26 <: String, L27 <: String, L28 <: String, L29 <: String, L30 <: String, L31 <: String, L32 <: String, L33 <: String, L34 <: String, L35 <: String, L36 <: String, L37 <: String, L38 <: String](implicit A: Mirror.ProductOf[A], ev1: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38), ev2: A.MirroredElemLabels =:= (L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38), S: Mirror.ProductOf[CaseClass38[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38]]): Shapely[A, CaseClass38[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38]] = new Shapely[A, CaseClass38[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38]] {
    def to(a: A): CaseClass38[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38] = S.fromProduct(a)
    def from(s: CaseClass38[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38]): A = A.fromProduct(s)
  }

  implicit def caseclass39[A <: Product, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, L1 <: String, L2 <: String, L3 <: String, L4 <: String, L5 <: String, L6 <: String, L7 <: String, L8 <: String, L9 <: String, L10 <: String, L11 <: String, L12 <: String, L13 <: String, L14 <: String, L15 <: String, L16 <: String, L17 <: String, L18 <: String, L19 <: String, L20 <: String, L21 <: String, L22 <: String, L23 <: String, L24 <: String, L25 <: String, L26 <: String, L27 <: String, L28 <: String, L29 <: String, L30 <: String, L31 <: String, L32 <: String, L33 <: String, L34 <: String, L35 <: String, L36 <: String, L37 <: String, L38 <: String, L39 <: String](implicit A: Mirror.ProductOf[A], ev1: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39), ev2: A.MirroredElemLabels =:= (L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39), S: Mirror.ProductOf[CaseClass39[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39]]): Shapely[A, CaseClass39[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39]] = new Shapely[A, CaseClass39[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39]] {
    def to(a: A): CaseClass39[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39] = S.fromProduct(a)
    def from(s: CaseClass39[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39]): A = A.fromProduct(s)
  }

  implicit def caseclass40[A <: Product, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, L1 <: String, L2 <: String, L3 <: String, L4 <: String, L5 <: String, L6 <: String, L7 <: String, L8 <: String, L9 <: String, L10 <: String, L11 <: String, L12 <: String, L13 <: String, L14 <: String, L15 <: String, L16 <: String, L17 <: String, L18 <: String, L19 <: String, L20 <: String, L21 <: String, L22 <: String, L23 <: String, L24 <: String, L25 <: String, L26 <: String, L27 <: String, L28 <: String, L29 <: String, L30 <: String, L31 <: String, L32 <: String, L33 <: String, L34 <: String, L35 <: String, L36 <: String, L37 <: String, L38 <: String, L39 <: String, L40 <: String](implicit A: Mirror.ProductOf[A], ev1: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40), ev2: A.MirroredElemLabels =:= (L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40), S: Mirror.ProductOf[CaseClass40[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40]]): Shapely[A, CaseClass40[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40]] = new Shapely[A, CaseClass40[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40]] {
    def to(a: A): CaseClass40[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40] = S.fromProduct(a)
    def from(s: CaseClass40[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40]): A = A.fromProduct(s)
  }

  implicit def caseclass41[A <: Product, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, L1 <: String, L2 <: String, L3 <: String, L4 <: String, L5 <: String, L6 <: String, L7 <: String, L8 <: String, L9 <: String, L10 <: String, L11 <: String, L12 <: String, L13 <: String, L14 <: String, L15 <: String, L16 <: String, L17 <: String, L18 <: String, L19 <: String, L20 <: String, L21 <: String, L22 <: String, L23 <: String, L24 <: String, L25 <: String, L26 <: String, L27 <: String, L28 <: String, L29 <: String, L30 <: String, L31 <: String, L32 <: String, L33 <: String, L34 <: String, L35 <: String, L36 <: String, L37 <: String, L38 <: String, L39 <: String, L40 <: String, L41 <: String](implicit A: Mirror.ProductOf[A], ev1: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41), ev2: A.MirroredElemLabels =:= (L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41), S: Mirror.ProductOf[CaseClass41[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41]]): Shapely[A, CaseClass41[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41]] = new Shapely[A, CaseClass41[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41]] {
    def to(a: A): CaseClass41[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41] = S.fromProduct(a)
    def from(s: CaseClass41[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41]): A = A.fromProduct(s)
  }

  implicit def caseclass42[A <: Product, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, L1 <: String, L2 <: String, L3 <: String, L4 <: String, L5 <: String, L6 <: String, L7 <: String, L8 <: String, L9 <: String, L10 <: String, L11 <: String, L12 <: String, L13 <: String, L14 <: String, L15 <: String, L16 <: String, L17 <: String, L18 <: String, L19 <: String, L20 <: String, L21 <: String, L22 <: String, L23 <: String, L24 <: String, L25 <: String, L26 <: String, L27 <: String, L28 <: String, L29 <: String, L30 <: String, L31 <: String, L32 <: String, L33 <: String, L34 <: String, L35 <: String, L36 <: String, L37 <: String, L38 <: String, L39 <: String, L40 <: String, L41 <: String, L42 <: String](implicit A: Mirror.ProductOf[A], ev1: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42), ev2: A.MirroredElemLabels =:= (L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42), S: Mirror.ProductOf[CaseClass42[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42]]): Shapely[A, CaseClass42[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42]] = new Shapely[A, CaseClass42[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42]] {
    def to(a: A): CaseClass42[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42] = S.fromProduct(a)
    def from(s: CaseClass42[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42]): A = A.fromProduct(s)
  }

  implicit def caseclass43[A <: Product, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, L1 <: String, L2 <: String, L3 <: String, L4 <: String, L5 <: String, L6 <: String, L7 <: String, L8 <: String, L9 <: String, L10 <: String, L11 <: String, L12 <: String, L13 <: String, L14 <: String, L15 <: String, L16 <: String, L17 <: String, L18 <: String, L19 <: String, L20 <: String, L21 <: String, L22 <: String, L23 <: String, L24 <: String, L25 <: String, L26 <: String, L27 <: String, L28 <: String, L29 <: String, L30 <: String, L31 <: String, L32 <: String, L33 <: String, L34 <: String, L35 <: String, L36 <: String, L37 <: String, L38 <: String, L39 <: String, L40 <: String, L41 <: String, L42 <: String, L43 <: String](implicit A: Mirror.ProductOf[A], ev1: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43), ev2: A.MirroredElemLabels =:= (L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43), S: Mirror.ProductOf[CaseClass43[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43]]): Shapely[A, CaseClass43[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43]] = new Shapely[A, CaseClass43[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43]] {
    def to(a: A): CaseClass43[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43] = S.fromProduct(a)
    def from(s: CaseClass43[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43]): A = A.fromProduct(s)
  }

  implicit def caseclass44[A <: Product, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, L1 <: String, L2 <: String, L3 <: String, L4 <: String, L5 <: String, L6 <: String, L7 <: String, L8 <: String, L9 <: String, L10 <: String, L11 <: String, L12 <: String, L13 <: String, L14 <: String, L15 <: String, L16 <: String, L17 <: String, L18 <: String, L19 <: String, L20 <: String, L21 <: String, L22 <: String, L23 <: String, L24 <: String, L25 <: String, L26 <: String, L27 <: String, L28 <: String, L29 <: String, L30 <: String, L31 <: String, L32 <: String, L33 <: String, L34 <: String, L35 <: String, L36 <: String, L37 <: String, L38 <: String, L39 <: String, L40 <: String, L41 <: String, L42 <: String, L43 <: String, L44 <: String](implicit A: Mirror.ProductOf[A], ev1: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44), ev2: A.MirroredElemLabels =:= (L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44), S: Mirror.ProductOf[CaseClass44[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44]]): Shapely[A, CaseClass44[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44]] = new Shapely[A, CaseClass44[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44]] {
    def to(a: A): CaseClass44[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44] = S.fromProduct(a)
    def from(s: CaseClass44[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44]): A = A.fromProduct(s)
  }

  implicit def caseclass45[A <: Product, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, L1 <: String, L2 <: String, L3 <: String, L4 <: String, L5 <: String, L6 <: String, L7 <: String, L8 <: String, L9 <: String, L10 <: String, L11 <: String, L12 <: String, L13 <: String, L14 <: String, L15 <: String, L16 <: String, L17 <: String, L18 <: String, L19 <: String, L20 <: String, L21 <: String, L22 <: String, L23 <: String, L24 <: String, L25 <: String, L26 <: String, L27 <: String, L28 <: String, L29 <: String, L30 <: String, L31 <: String, L32 <: String, L33 <: String, L34 <: String, L35 <: String, L36 <: String, L37 <: String, L38 <: String, L39 <: String, L40 <: String, L41 <: String, L42 <: String, L43 <: String, L44 <: String, L45 <: String](implicit A: Mirror.ProductOf[A], ev1: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45), ev2: A.MirroredElemLabels =:= (L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45), S: Mirror.ProductOf[CaseClass45[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45]]): Shapely[A, CaseClass45[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45]] = new Shapely[A, CaseClass45[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45]] {
    def to(a: A): CaseClass45[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45] = S.fromProduct(a)
    def from(s: CaseClass45[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45]): A = A.fromProduct(s)
  }

  implicit def caseclass46[A <: Product, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, L1 <: String, L2 <: String, L3 <: String, L4 <: String, L5 <: String, L6 <: String, L7 <: String, L8 <: String, L9 <: String, L10 <: String, L11 <: String, L12 <: String, L13 <: String, L14 <: String, L15 <: String, L16 <: String, L17 <: String, L18 <: String, L19 <: String, L20 <: String, L21 <: String, L22 <: String, L23 <: String, L24 <: String, L25 <: String, L26 <: String, L27 <: String, L28 <: String, L29 <: String, L30 <: String, L31 <: String, L32 <: String, L33 <: String, L34 <: String, L35 <: String, L36 <: String, L37 <: String, L38 <: String, L39 <: String, L40 <: String, L41 <: String, L42 <: String, L43 <: String, L44 <: String, L45 <: String, L46 <: String](implicit A: Mirror.ProductOf[A], ev1: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46), ev2: A.MirroredElemLabels =:= (L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46), S: Mirror.ProductOf[CaseClass46[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46]]): Shapely[A, CaseClass46[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46]] = new Shapely[A, CaseClass46[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46]] {
    def to(a: A): CaseClass46[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46] = S.fromProduct(a)
    def from(s: CaseClass46[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46]): A = A.fromProduct(s)
  }

  implicit def caseclass47[A <: Product, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, L1 <: String, L2 <: String, L3 <: String, L4 <: String, L5 <: String, L6 <: String, L7 <: String, L8 <: String, L9 <: String, L10 <: String, L11 <: String, L12 <: String, L13 <: String, L14 <: String, L15 <: String, L16 <: String, L17 <: String, L18 <: String, L19 <: String, L20 <: String, L21 <: String, L22 <: String, L23 <: String, L24 <: String, L25 <: String, L26 <: String, L27 <: String, L28 <: String, L29 <: String, L30 <: String, L31 <: String, L32 <: String, L33 <: String, L34 <: String, L35 <: String, L36 <: String, L37 <: String, L38 <: String, L39 <: String, L40 <: String, L41 <: String, L42 <: String, L43 <: String, L44 <: String, L45 <: String, L46 <: String, L47 <: String](implicit A: Mirror.ProductOf[A], ev1: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47), ev2: A.MirroredElemLabels =:= (L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46, L47), S: Mirror.ProductOf[CaseClass47[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46, L47]]): Shapely[A, CaseClass47[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46, L47]] = new Shapely[A, CaseClass47[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46, L47]] {
    def to(a: A): CaseClass47[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46, L47] = S.fromProduct(a)
    def from(s: CaseClass47[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46, L47]): A = A.fromProduct(s)
  }

  implicit def caseclass48[A <: Product, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, L1 <: String, L2 <: String, L3 <: String, L4 <: String, L5 <: String, L6 <: String, L7 <: String, L8 <: String, L9 <: String, L10 <: String, L11 <: String, L12 <: String, L13 <: String, L14 <: String, L15 <: String, L16 <: String, L17 <: String, L18 <: String, L19 <: String, L20 <: String, L21 <: String, L22 <: String, L23 <: String, L24 <: String, L25 <: String, L26 <: String, L27 <: String, L28 <: String, L29 <: String, L30 <: String, L31 <: String, L32 <: String, L33 <: String, L34 <: String, L35 <: String, L36 <: String, L37 <: String, L38 <: String, L39 <: String, L40 <: String, L41 <: String, L42 <: String, L43 <: String, L44 <: String, L45 <: String, L46 <: String, L47 <: String, L48 <: String](implicit A: Mirror.ProductOf[A], ev1: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48), ev2: A.MirroredElemLabels =:= (L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46, L47, L48), S: Mirror.ProductOf[CaseClass48[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46, L47, L48]]): Shapely[A, CaseClass48[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46, L47, L48]] = new Shapely[A, CaseClass48[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46, L47, L48]] {
    def to(a: A): CaseClass48[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46, L47, L48] = S.fromProduct(a)
    def from(s: CaseClass48[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46, L47, L48]): A = A.fromProduct(s)
  }

  implicit def caseclass49[A <: Product, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, L1 <: String, L2 <: String, L3 <: String, L4 <: String, L5 <: String, L6 <: String, L7 <: String, L8 <: String, L9 <: String, L10 <: String, L11 <: String, L12 <: String, L13 <: String, L14 <: String, L15 <: String, L16 <: String, L17 <: String, L18 <: String, L19 <: String, L20 <: String, L21 <: String, L22 <: String, L23 <: String, L24 <: String, L25 <: String, L26 <: String, L27 <: String, L28 <: String, L29 <: String, L30 <: String, L31 <: String, L32 <: String, L33 <: String, L34 <: String, L35 <: String, L36 <: String, L37 <: String, L38 <: String, L39 <: String, L40 <: String, L41 <: String, L42 <: String, L43 <: String, L44 <: String, L45 <: String, L46 <: String, L47 <: String, L48 <: String, L49 <: String](implicit A: Mirror.ProductOf[A], ev1: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49), ev2: A.MirroredElemLabels =:= (L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46, L47, L48, L49), S: Mirror.ProductOf[CaseClass49[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46, L47, L48, L49]]): Shapely[A, CaseClass49[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46, L47, L48, L49]] = new Shapely[A, CaseClass49[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46, L47, L48, L49]] {
    def to(a: A): CaseClass49[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46, L47, L48, L49] = S.fromProduct(a)
    def from(s: CaseClass49[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46, L47, L48, L49]): A = A.fromProduct(s)
  }

  implicit def caseclass50[A <: Product, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, L1 <: String, L2 <: String, L3 <: String, L4 <: String, L5 <: String, L6 <: String, L7 <: String, L8 <: String, L9 <: String, L10 <: String, L11 <: String, L12 <: String, L13 <: String, L14 <: String, L15 <: String, L16 <: String, L17 <: String, L18 <: String, L19 <: String, L20 <: String, L21 <: String, L22 <: String, L23 <: String, L24 <: String, L25 <: String, L26 <: String, L27 <: String, L28 <: String, L29 <: String, L30 <: String, L31 <: String, L32 <: String, L33 <: String, L34 <: String, L35 <: String, L36 <: String, L37 <: String, L38 <: String, L39 <: String, L40 <: String, L41 <: String, L42 <: String, L43 <: String, L44 <: String, L45 <: String, L46 <: String, L47 <: String, L48 <: String, L49 <: String, L50 <: String](implicit A: Mirror.ProductOf[A], ev1: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50), ev2: A.MirroredElemLabels =:= (L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46, L47, L48, L49, L50), S: Mirror.ProductOf[CaseClass50[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46, L47, L48, L49, L50]]): Shapely[A, CaseClass50[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46, L47, L48, L49, L50]] = new Shapely[A, CaseClass50[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46, L47, L48, L49, L50]] {
    def to(a: A): CaseClass50[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46, L47, L48, L49, L50] = S.fromProduct(a)
    def from(s: CaseClass50[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46, L47, L48, L49, L50]): A = A.fromProduct(s)
  }

  implicit def caseclass51[A <: Product, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, L1 <: String, L2 <: String, L3 <: String, L4 <: String, L5 <: String, L6 <: String, L7 <: String, L8 <: String, L9 <: String, L10 <: String, L11 <: String, L12 <: String, L13 <: String, L14 <: String, L15 <: String, L16 <: String, L17 <: String, L18 <: String, L19 <: String, L20 <: String, L21 <: String, L22 <: String, L23 <: String, L24 <: String, L25 <: String, L26 <: String, L27 <: String, L28 <: String, L29 <: String, L30 <: String, L31 <: String, L32 <: String, L33 <: String, L34 <: String, L35 <: String, L36 <: String, L37 <: String, L38 <: String, L39 <: String, L40 <: String, L41 <: String, L42 <: String, L43 <: String, L44 <: String, L45 <: String, L46 <: String, L47 <: String, L48 <: String, L49 <: String, L50 <: String, L51 <: String](implicit A: Mirror.ProductOf[A], ev1: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51), ev2: A.MirroredElemLabels =:= (L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46, L47, L48, L49, L50, L51), S: Mirror.ProductOf[CaseClass51[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46, L47, L48, L49, L50, L51]]): Shapely[A, CaseClass51[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46, L47, L48, L49, L50, L51]] = new Shapely[A, CaseClass51[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46, L47, L48, L49, L50, L51]] {
    def to(a: A): CaseClass51[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46, L47, L48, L49, L50, L51] = S.fromProduct(a)
    def from(s: CaseClass51[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46, L47, L48, L49, L50, L51]): A = A.fromProduct(s)
  }

  implicit def caseclass52[A <: Product, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, L1 <: String, L2 <: String, L3 <: String, L4 <: String, L5 <: String, L6 <: String, L7 <: String, L8 <: String, L9 <: String, L10 <: String, L11 <: String, L12 <: String, L13 <: String, L14 <: String, L15 <: String, L16 <: String, L17 <: String, L18 <: String, L19 <: String, L20 <: String, L21 <: String, L22 <: String, L23 <: String, L24 <: String, L25 <: String, L26 <: String, L27 <: String, L28 <: String, L29 <: String, L30 <: String, L31 <: String, L32 <: String, L33 <: String, L34 <: String, L35 <: String, L36 <: String, L37 <: String, L38 <: String, L39 <: String, L40 <: String, L41 <: String, L42 <: String, L43 <: String, L44 <: String, L45 <: String, L46 <: String, L47 <: String, L48 <: String, L49 <: String, L50 <: String, L51 <: String, L52 <: String](implicit A: Mirror.ProductOf[A], ev1: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52), ev2: A.MirroredElemLabels =:= (L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46, L47, L48, L49, L50, L51, L52), S: Mirror.ProductOf[CaseClass52[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46, L47, L48, L49, L50, L51, L52]]): Shapely[A, CaseClass52[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46, L47, L48, L49, L50, L51, L52]] = new Shapely[A, CaseClass52[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46, L47, L48, L49, L50, L51, L52]] {
    def to(a: A): CaseClass52[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46, L47, L48, L49, L50, L51, L52] = S.fromProduct(a)
    def from(s: CaseClass52[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46, L47, L48, L49, L50, L51, L52]): A = A.fromProduct(s)
  }

  implicit def caseclass53[A <: Product, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, L1 <: String, L2 <: String, L3 <: String, L4 <: String, L5 <: String, L6 <: String, L7 <: String, L8 <: String, L9 <: String, L10 <: String, L11 <: String, L12 <: String, L13 <: String, L14 <: String, L15 <: String, L16 <: String, L17 <: String, L18 <: String, L19 <: String, L20 <: String, L21 <: String, L22 <: String, L23 <: String, L24 <: String, L25 <: String, L26 <: String, L27 <: String, L28 <: String, L29 <: String, L30 <: String, L31 <: String, L32 <: String, L33 <: String, L34 <: String, L35 <: String, L36 <: String, L37 <: String, L38 <: String, L39 <: String, L40 <: String, L41 <: String, L42 <: String, L43 <: String, L44 <: String, L45 <: String, L46 <: String, L47 <: String, L48 <: String, L49 <: String, L50 <: String, L51 <: String, L52 <: String, L53 <: String](implicit A: Mirror.ProductOf[A], ev1: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53), ev2: A.MirroredElemLabels =:= (L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46, L47, L48, L49, L50, L51, L52, L53), S: Mirror.ProductOf[CaseClass53[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46, L47, L48, L49, L50, L51, L52, L53]]): Shapely[A, CaseClass53[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46, L47, L48, L49, L50, L51, L52, L53]] = new Shapely[A, CaseClass53[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46, L47, L48, L49, L50, L51, L52, L53]] {
    def to(a: A): CaseClass53[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46, L47, L48, L49, L50, L51, L52, L53] = S.fromProduct(a)
    def from(s: CaseClass53[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46, L47, L48, L49, L50, L51, L52, L53]): A = A.fromProduct(s)
  }

  implicit def caseclass54[A <: Product, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, L1 <: String, L2 <: String, L3 <: String, L4 <: String, L5 <: String, L6 <: String, L7 <: String, L8 <: String, L9 <: String, L10 <: String, L11 <: String, L12 <: String, L13 <: String, L14 <: String, L15 <: String, L16 <: String, L17 <: String, L18 <: String, L19 <: String, L20 <: String, L21 <: String, L22 <: String, L23 <: String, L24 <: String, L25 <: String, L26 <: String, L27 <: String, L28 <: String, L29 <: String, L30 <: String, L31 <: String, L32 <: String, L33 <: String, L34 <: String, L35 <: String, L36 <: String, L37 <: String, L38 <: String, L39 <: String, L40 <: String, L41 <: String, L42 <: String, L43 <: String, L44 <: String, L45 <: String, L46 <: String, L47 <: String, L48 <: String, L49 <: String, L50 <: String, L51 <: String, L52 <: String, L53 <: String, L54 <: String](implicit A: Mirror.ProductOf[A], ev1: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54), ev2: A.MirroredElemLabels =:= (L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46, L47, L48, L49, L50, L51, L52, L53, L54), S: Mirror.ProductOf[CaseClass54[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46, L47, L48, L49, L50, L51, L52, L53, L54]]): Shapely[A, CaseClass54[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46, L47, L48, L49, L50, L51, L52, L53, L54]] = new Shapely[A, CaseClass54[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46, L47, L48, L49, L50, L51, L52, L53, L54]] {
    def to(a: A): CaseClass54[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46, L47, L48, L49, L50, L51, L52, L53, L54] = S.fromProduct(a)
    def from(s: CaseClass54[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46, L47, L48, L49, L50, L51, L52, L53, L54]): A = A.fromProduct(s)
  }

  implicit def caseclass55[A <: Product, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, L1 <: String, L2 <: String, L3 <: String, L4 <: String, L5 <: String, L6 <: String, L7 <: String, L8 <: String, L9 <: String, L10 <: String, L11 <: String, L12 <: String, L13 <: String, L14 <: String, L15 <: String, L16 <: String, L17 <: String, L18 <: String, L19 <: String, L20 <: String, L21 <: String, L22 <: String, L23 <: String, L24 <: String, L25 <: String, L26 <: String, L27 <: String, L28 <: String, L29 <: String, L30 <: String, L31 <: String, L32 <: String, L33 <: String, L34 <: String, L35 <: String, L36 <: String, L37 <: String, L38 <: String, L39 <: String, L40 <: String, L41 <: String, L42 <: String, L43 <: String, L44 <: String, L45 <: String, L46 <: String, L47 <: String, L48 <: String, L49 <: String, L50 <: String, L51 <: String, L52 <: String, L53 <: String, L54 <: String, L55 <: String](implicit A: Mirror.ProductOf[A], ev1: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55), ev2: A.MirroredElemLabels =:= (L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46, L47, L48, L49, L50, L51, L52, L53, L54, L55), S: Mirror.ProductOf[CaseClass55[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46, L47, L48, L49, L50, L51, L52, L53, L54, L55]]): Shapely[A, CaseClass55[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46, L47, L48, L49, L50, L51, L52, L53, L54, L55]] = new Shapely[A, CaseClass55[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46, L47, L48, L49, L50, L51, L52, L53, L54, L55]] {
    def to(a: A): CaseClass55[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46, L47, L48, L49, L50, L51, L52, L53, L54, L55] = S.fromProduct(a)
    def from(s: CaseClass55[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46, L47, L48, L49, L50, L51, L52, L53, L54, L55]): A = A.fromProduct(s)
  }

  implicit def caseclass56[A <: Product, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, L1 <: String, L2 <: String, L3 <: String, L4 <: String, L5 <: String, L6 <: String, L7 <: String, L8 <: String, L9 <: String, L10 <: String, L11 <: String, L12 <: String, L13 <: String, L14 <: String, L15 <: String, L16 <: String, L17 <: String, L18 <: String, L19 <: String, L20 <: String, L21 <: String, L22 <: String, L23 <: String, L24 <: String, L25 <: String, L26 <: String, L27 <: String, L28 <: String, L29 <: String, L30 <: String, L31 <: String, L32 <: String, L33 <: String, L34 <: String, L35 <: String, L36 <: String, L37 <: String, L38 <: String, L39 <: String, L40 <: String, L41 <: String, L42 <: String, L43 <: String, L44 <: String, L45 <: String, L46 <: String, L47 <: String, L48 <: String, L49 <: String, L50 <: String, L51 <: String, L52 <: String, L53 <: String, L54 <: String, L55 <: String, L56 <: String](implicit A: Mirror.ProductOf[A], ev1: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56), ev2: A.MirroredElemLabels =:= (L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46, L47, L48, L49, L50, L51, L52, L53, L54, L55, L56), S: Mirror.ProductOf[CaseClass56[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46, L47, L48, L49, L50, L51, L52, L53, L54, L55, L56]]): Shapely[A, CaseClass56[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46, L47, L48, L49, L50, L51, L52, L53, L54, L55, L56]] = new Shapely[A, CaseClass56[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46, L47, L48, L49, L50, L51, L52, L53, L54, L55, L56]] {
    def to(a: A): CaseClass56[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46, L47, L48, L49, L50, L51, L52, L53, L54, L55, L56] = S.fromProduct(a)
    def from(s: CaseClass56[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46, L47, L48, L49, L50, L51, L52, L53, L54, L55, L56]): A = A.fromProduct(s)
  }

  implicit def caseclass57[A <: Product, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, L1 <: String, L2 <: String, L3 <: String, L4 <: String, L5 <: String, L6 <: String, L7 <: String, L8 <: String, L9 <: String, L10 <: String, L11 <: String, L12 <: String, L13 <: String, L14 <: String, L15 <: String, L16 <: String, L17 <: String, L18 <: String, L19 <: String, L20 <: String, L21 <: String, L22 <: String, L23 <: String, L24 <: String, L25 <: String, L26 <: String, L27 <: String, L28 <: String, L29 <: String, L30 <: String, L31 <: String, L32 <: String, L33 <: String, L34 <: String, L35 <: String, L36 <: String, L37 <: String, L38 <: String, L39 <: String, L40 <: String, L41 <: String, L42 <: String, L43 <: String, L44 <: String, L45 <: String, L46 <: String, L47 <: String, L48 <: String, L49 <: String, L50 <: String, L51 <: String, L52 <: String, L53 <: String, L54 <: String, L55 <: String, L56 <: String, L57 <: String](implicit A: Mirror.ProductOf[A], ev1: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57), ev2: A.MirroredElemLabels =:= (L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46, L47, L48, L49, L50, L51, L52, L53, L54, L55, L56, L57), S: Mirror.ProductOf[CaseClass57[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46, L47, L48, L49, L50, L51, L52, L53, L54, L55, L56, L57]]): Shapely[A, CaseClass57[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46, L47, L48, L49, L50, L51, L52, L53, L54, L55, L56, L57]] = new Shapely[A, CaseClass57[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46, L47, L48, L49, L50, L51, L52, L53, L54, L55, L56, L57]] {
    def to(a: A): CaseClass57[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46, L47, L48, L49, L50, L51, L52, L53, L54, L55, L56, L57] = S.fromProduct(a)
    def from(s: CaseClass57[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46, L47, L48, L49, L50, L51, L52, L53, L54, L55, L56, L57]): A = A.fromProduct(s)
  }

  implicit def caseclass58[A <: Product, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, L1 <: String, L2 <: String, L3 <: String, L4 <: String, L5 <: String, L6 <: String, L7 <: String, L8 <: String, L9 <: String, L10 <: String, L11 <: String, L12 <: String, L13 <: String, L14 <: String, L15 <: String, L16 <: String, L17 <: String, L18 <: String, L19 <: String, L20 <: String, L21 <: String, L22 <: String, L23 <: String, L24 <: String, L25 <: String, L26 <: String, L27 <: String, L28 <: String, L29 <: String, L30 <: String, L31 <: String, L32 <: String, L33 <: String, L34 <: String, L35 <: String, L36 <: String, L37 <: String, L38 <: String, L39 <: String, L40 <: String, L41 <: String, L42 <: String, L43 <: String, L44 <: String, L45 <: String, L46 <: String, L47 <: String, L48 <: String, L49 <: String, L50 <: String, L51 <: String, L52 <: String, L53 <: String, L54 <: String, L55 <: String, L56 <: String, L57 <: String, L58 <: String](implicit A: Mirror.ProductOf[A], ev1: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58), ev2: A.MirroredElemLabels =:= (L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46, L47, L48, L49, L50, L51, L52, L53, L54, L55, L56, L57, L58), S: Mirror.ProductOf[CaseClass58[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46, L47, L48, L49, L50, L51, L52, L53, L54, L55, L56, L57, L58]]): Shapely[A, CaseClass58[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46, L47, L48, L49, L50, L51, L52, L53, L54, L55, L56, L57, L58]] = new Shapely[A, CaseClass58[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46, L47, L48, L49, L50, L51, L52, L53, L54, L55, L56, L57, L58]] {
    def to(a: A): CaseClass58[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46, L47, L48, L49, L50, L51, L52, L53, L54, L55, L56, L57, L58] = S.fromProduct(a)
    def from(s: CaseClass58[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46, L47, L48, L49, L50, L51, L52, L53, L54, L55, L56, L57, L58]): A = A.fromProduct(s)
  }

  implicit def caseclass59[A <: Product, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, A59, L1 <: String, L2 <: String, L3 <: String, L4 <: String, L5 <: String, L6 <: String, L7 <: String, L8 <: String, L9 <: String, L10 <: String, L11 <: String, L12 <: String, L13 <: String, L14 <: String, L15 <: String, L16 <: String, L17 <: String, L18 <: String, L19 <: String, L20 <: String, L21 <: String, L22 <: String, L23 <: String, L24 <: String, L25 <: String, L26 <: String, L27 <: String, L28 <: String, L29 <: String, L30 <: String, L31 <: String, L32 <: String, L33 <: String, L34 <: String, L35 <: String, L36 <: String, L37 <: String, L38 <: String, L39 <: String, L40 <: String, L41 <: String, L42 <: String, L43 <: String, L44 <: String, L45 <: String, L46 <: String, L47 <: String, L48 <: String, L49 <: String, L50 <: String, L51 <: String, L52 <: String, L53 <: String, L54 <: String, L55 <: String, L56 <: String, L57 <: String, L58 <: String, L59 <: String](implicit A: Mirror.ProductOf[A], ev1: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, A59), ev2: A.MirroredElemLabels =:= (L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46, L47, L48, L49, L50, L51, L52, L53, L54, L55, L56, L57, L58, L59), S: Mirror.ProductOf[CaseClass59[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, A59, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46, L47, L48, L49, L50, L51, L52, L53, L54, L55, L56, L57, L58, L59]]): Shapely[A, CaseClass59[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, A59, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46, L47, L48, L49, L50, L51, L52, L53, L54, L55, L56, L57, L58, L59]] = new Shapely[A, CaseClass59[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, A59, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46, L47, L48, L49, L50, L51, L52, L53, L54, L55, L56, L57, L58, L59]] {
    def to(a: A): CaseClass59[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, A59, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46, L47, L48, L49, L50, L51, L52, L53, L54, L55, L56, L57, L58, L59] = S.fromProduct(a)
    def from(s: CaseClass59[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, A59, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46, L47, L48, L49, L50, L51, L52, L53, L54, L55, L56, L57, L58, L59]): A = A.fromProduct(s)
  }

  implicit def caseclass60[A <: Product, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, A59, A60, L1 <: String, L2 <: String, L3 <: String, L4 <: String, L5 <: String, L6 <: String, L7 <: String, L8 <: String, L9 <: String, L10 <: String, L11 <: String, L12 <: String, L13 <: String, L14 <: String, L15 <: String, L16 <: String, L17 <: String, L18 <: String, L19 <: String, L20 <: String, L21 <: String, L22 <: String, L23 <: String, L24 <: String, L25 <: String, L26 <: String, L27 <: String, L28 <: String, L29 <: String, L30 <: String, L31 <: String, L32 <: String, L33 <: String, L34 <: String, L35 <: String, L36 <: String, L37 <: String, L38 <: String, L39 <: String, L40 <: String, L41 <: String, L42 <: String, L43 <: String, L44 <: String, L45 <: String, L46 <: String, L47 <: String, L48 <: String, L49 <: String, L50 <: String, L51 <: String, L52 <: String, L53 <: String, L54 <: String, L55 <: String, L56 <: String, L57 <: String, L58 <: String, L59 <: String, L60 <: String](implicit A: Mirror.ProductOf[A], ev1: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, A59, A60), ev2: A.MirroredElemLabels =:= (L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46, L47, L48, L49, L50, L51, L52, L53, L54, L55, L56, L57, L58, L59, L60), S: Mirror.ProductOf[CaseClass60[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, A59, A60, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46, L47, L48, L49, L50, L51, L52, L53, L54, L55, L56, L57, L58, L59, L60]]): Shapely[A, CaseClass60[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, A59, A60, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46, L47, L48, L49, L50, L51, L52, L53, L54, L55, L56, L57, L58, L59, L60]] = new Shapely[A, CaseClass60[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, A59, A60, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46, L47, L48, L49, L50, L51, L52, L53, L54, L55, L56, L57, L58, L59, L60]] {
    def to(a: A): CaseClass60[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, A59, A60, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46, L47, L48, L49, L50, L51, L52, L53, L54, L55, L56, L57, L58, L59, L60] = S.fromProduct(a)
    def from(s: CaseClass60[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, A59, A60, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46, L47, L48, L49, L50, L51, L52, L53, L54, L55, L56, L57, L58, L59, L60]): A = A.fromProduct(s)
  }

  implicit def caseclass61[A <: Product, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, A59, A60, A61, L1 <: String, L2 <: String, L3 <: String, L4 <: String, L5 <: String, L6 <: String, L7 <: String, L8 <: String, L9 <: String, L10 <: String, L11 <: String, L12 <: String, L13 <: String, L14 <: String, L15 <: String, L16 <: String, L17 <: String, L18 <: String, L19 <: String, L20 <: String, L21 <: String, L22 <: String, L23 <: String, L24 <: String, L25 <: String, L26 <: String, L27 <: String, L28 <: String, L29 <: String, L30 <: String, L31 <: String, L32 <: String, L33 <: String, L34 <: String, L35 <: String, L36 <: String, L37 <: String, L38 <: String, L39 <: String, L40 <: String, L41 <: String, L42 <: String, L43 <: String, L44 <: String, L45 <: String, L46 <: String, L47 <: String, L48 <: String, L49 <: String, L50 <: String, L51 <: String, L52 <: String, L53 <: String, L54 <: String, L55 <: String, L56 <: String, L57 <: String, L58 <: String, L59 <: String, L60 <: String, L61 <: String](implicit A: Mirror.ProductOf[A], ev1: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, A59, A60, A61), ev2: A.MirroredElemLabels =:= (L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46, L47, L48, L49, L50, L51, L52, L53, L54, L55, L56, L57, L58, L59, L60, L61), S: Mirror.ProductOf[CaseClass61[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, A59, A60, A61, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46, L47, L48, L49, L50, L51, L52, L53, L54, L55, L56, L57, L58, L59, L60, L61]]): Shapely[A, CaseClass61[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, A59, A60, A61, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46, L47, L48, L49, L50, L51, L52, L53, L54, L55, L56, L57, L58, L59, L60, L61]] = new Shapely[A, CaseClass61[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, A59, A60, A61, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46, L47, L48, L49, L50, L51, L52, L53, L54, L55, L56, L57, L58, L59, L60, L61]] {
    def to(a: A): CaseClass61[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, A59, A60, A61, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46, L47, L48, L49, L50, L51, L52, L53, L54, L55, L56, L57, L58, L59, L60, L61] = S.fromProduct(a)
    def from(s: CaseClass61[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, A59, A60, A61, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46, L47, L48, L49, L50, L51, L52, L53, L54, L55, L56, L57, L58, L59, L60, L61]): A = A.fromProduct(s)
  }

  implicit def caseclass62[A <: Product, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, A59, A60, A61, A62, L1 <: String, L2 <: String, L3 <: String, L4 <: String, L5 <: String, L6 <: String, L7 <: String, L8 <: String, L9 <: String, L10 <: String, L11 <: String, L12 <: String, L13 <: String, L14 <: String, L15 <: String, L16 <: String, L17 <: String, L18 <: String, L19 <: String, L20 <: String, L21 <: String, L22 <: String, L23 <: String, L24 <: String, L25 <: String, L26 <: String, L27 <: String, L28 <: String, L29 <: String, L30 <: String, L31 <: String, L32 <: String, L33 <: String, L34 <: String, L35 <: String, L36 <: String, L37 <: String, L38 <: String, L39 <: String, L40 <: String, L41 <: String, L42 <: String, L43 <: String, L44 <: String, L45 <: String, L46 <: String, L47 <: String, L48 <: String, L49 <: String, L50 <: String, L51 <: String, L52 <: String, L53 <: String, L54 <: String, L55 <: String, L56 <: String, L57 <: String, L58 <: String, L59 <: String, L60 <: String, L61 <: String, L62 <: String](implicit A: Mirror.ProductOf[A], ev1: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, A59, A60, A61, A62), ev2: A.MirroredElemLabels =:= (L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46, L47, L48, L49, L50, L51, L52, L53, L54, L55, L56, L57, L58, L59, L60, L61, L62), S: Mirror.ProductOf[CaseClass62[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, A59, A60, A61, A62, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46, L47, L48, L49, L50, L51, L52, L53, L54, L55, L56, L57, L58, L59, L60, L61, L62]]): Shapely[A, CaseClass62[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, A59, A60, A61, A62, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46, L47, L48, L49, L50, L51, L52, L53, L54, L55, L56, L57, L58, L59, L60, L61, L62]] = new Shapely[A, CaseClass62[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, A59, A60, A61, A62, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46, L47, L48, L49, L50, L51, L52, L53, L54, L55, L56, L57, L58, L59, L60, L61, L62]] {
    def to(a: A): CaseClass62[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, A59, A60, A61, A62, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46, L47, L48, L49, L50, L51, L52, L53, L54, L55, L56, L57, L58, L59, L60, L61, L62] = S.fromProduct(a)
    def from(s: CaseClass62[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, A59, A60, A61, A62, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46, L47, L48, L49, L50, L51, L52, L53, L54, L55, L56, L57, L58, L59, L60, L61, L62]): A = A.fromProduct(s)
  }

  implicit def caseclass63[A <: Product, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, A59, A60, A61, A62, A63, L1 <: String, L2 <: String, L3 <: String, L4 <: String, L5 <: String, L6 <: String, L7 <: String, L8 <: String, L9 <: String, L10 <: String, L11 <: String, L12 <: String, L13 <: String, L14 <: String, L15 <: String, L16 <: String, L17 <: String, L18 <: String, L19 <: String, L20 <: String, L21 <: String, L22 <: String, L23 <: String, L24 <: String, L25 <: String, L26 <: String, L27 <: String, L28 <: String, L29 <: String, L30 <: String, L31 <: String, L32 <: String, L33 <: String, L34 <: String, L35 <: String, L36 <: String, L37 <: String, L38 <: String, L39 <: String, L40 <: String, L41 <: String, L42 <: String, L43 <: String, L44 <: String, L45 <: String, L46 <: String, L47 <: String, L48 <: String, L49 <: String, L50 <: String, L51 <: String, L52 <: String, L53 <: String, L54 <: String, L55 <: String, L56 <: String, L57 <: String, L58 <: String, L59 <: String, L60 <: String, L61 <: String, L62 <: String, L63 <: String](implicit A: Mirror.ProductOf[A], ev1: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, A59, A60, A61, A62, A63), ev2: A.MirroredElemLabels =:= (L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46, L47, L48, L49, L50, L51, L52, L53, L54, L55, L56, L57, L58, L59, L60, L61, L62, L63), S: Mirror.ProductOf[CaseClass63[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, A59, A60, A61, A62, A63, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46, L47, L48, L49, L50, L51, L52, L53, L54, L55, L56, L57, L58, L59, L60, L61, L62, L63]]): Shapely[A, CaseClass63[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, A59, A60, A61, A62, A63, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46, L47, L48, L49, L50, L51, L52, L53, L54, L55, L56, L57, L58, L59, L60, L61, L62, L63]] = new Shapely[A, CaseClass63[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, A59, A60, A61, A62, A63, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46, L47, L48, L49, L50, L51, L52, L53, L54, L55, L56, L57, L58, L59, L60, L61, L62, L63]] {
    def to(a: A): CaseClass63[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, A59, A60, A61, A62, A63, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46, L47, L48, L49, L50, L51, L52, L53, L54, L55, L56, L57, L58, L59, L60, L61, L62, L63] = S.fromProduct(a)
    def from(s: CaseClass63[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, A59, A60, A61, A62, A63, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46, L47, L48, L49, L50, L51, L52, L53, L54, L55, L56, L57, L58, L59, L60, L61, L62, L63]): A = A.fromProduct(s)
  }

  implicit def caseclass64[A <: Product, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, A59, A60, A61, A62, A63, A64, L1 <: String, L2 <: String, L3 <: String, L4 <: String, L5 <: String, L6 <: String, L7 <: String, L8 <: String, L9 <: String, L10 <: String, L11 <: String, L12 <: String, L13 <: String, L14 <: String, L15 <: String, L16 <: String, L17 <: String, L18 <: String, L19 <: String, L20 <: String, L21 <: String, L22 <: String, L23 <: String, L24 <: String, L25 <: String, L26 <: String, L27 <: String, L28 <: String, L29 <: String, L30 <: String, L31 <: String, L32 <: String, L33 <: String, L34 <: String, L35 <: String, L36 <: String, L37 <: String, L38 <: String, L39 <: String, L40 <: String, L41 <: String, L42 <: String, L43 <: String, L44 <: String, L45 <: String, L46 <: String, L47 <: String, L48 <: String, L49 <: String, L50 <: String, L51 <: String, L52 <: String, L53 <: String, L54 <: String, L55 <: String, L56 <: String, L57 <: String, L58 <: String, L59 <: String, L60 <: String, L61 <: String, L62 <: String, L63 <: String, L64 <: String](implicit A: Mirror.ProductOf[A], ev1: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, A59, A60, A61, A62, A63, A64), ev2: A.MirroredElemLabels =:= (L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46, L47, L48, L49, L50, L51, L52, L53, L54, L55, L56, L57, L58, L59, L60, L61, L62, L63, L64), S: Mirror.ProductOf[CaseClass64[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, A59, A60, A61, A62, A63, A64, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46, L47, L48, L49, L50, L51, L52, L53, L54, L55, L56, L57, L58, L59, L60, L61, L62, L63, L64]]): Shapely[A, CaseClass64[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, A59, A60, A61, A62, A63, A64, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46, L47, L48, L49, L50, L51, L52, L53, L54, L55, L56, L57, L58, L59, L60, L61, L62, L63, L64]] = new Shapely[A, CaseClass64[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, A59, A60, A61, A62, A63, A64, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46, L47, L48, L49, L50, L51, L52, L53, L54, L55, L56, L57, L58, L59, L60, L61, L62, L63, L64]] {
    def to(a: A): CaseClass64[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, A59, A60, A61, A62, A63, A64, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46, L47, L48, L49, L50, L51, L52, L53, L54, L55, L56, L57, L58, L59, L60, L61, L62, L63, L64] = S.fromProduct(a)
    def from(s: CaseClass64[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, A59, A60, A61, A62, A63, A64, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33, L34, L35, L36, L37, L38, L39, L40, L41, L42, L43, L44, L45, L46, L47, L48, L49, L50, L51, L52, L53, L54, L55, L56, L57, L58, L59, L60, L61, L62, L63, L64]): A = A.fromProduct(s)
  }

  implicit def sealedtrait1[A, A1 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1)): Shapely[A, SealedTrait1[A, A1]] = new Shapely[A, SealedTrait1[A, A1]] {
    def to(a: A): SealedTrait1[A, A1] = A.ordinal(a) match {
      case 0 => SealedTrait1._1(a.asInstanceOf[A1])
    }
    def from(s: SealedTrait1[A, A1]): A = s.value
  }

  implicit def sealedtrait2[A, A1 <: A, A2 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2)): Shapely[A, SealedTrait2[A, A1, A2]] = new Shapely[A, SealedTrait2[A, A1, A2]] {
    def to(a: A): SealedTrait2[A, A1, A2] = A.ordinal(a) match {
      case 0 => SealedTrait2._1(a.asInstanceOf[A1])
      case 1 => SealedTrait2._2(a.asInstanceOf[A2])
    }
    def from(s: SealedTrait2[A, A1, A2]): A = s.value
  }

  implicit def sealedtrait3[A, A1 <: A, A2 <: A, A3 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3)): Shapely[A, SealedTrait3[A, A1, A2, A3]] = new Shapely[A, SealedTrait3[A, A1, A2, A3]] {
    def to(a: A): SealedTrait3[A, A1, A2, A3] = A.ordinal(a) match {
      case 0 => SealedTrait3._1(a.asInstanceOf[A1])
      case 1 => SealedTrait3._2(a.asInstanceOf[A2])
      case 2 => SealedTrait3._3(a.asInstanceOf[A3])
    }
    def from(s: SealedTrait3[A, A1, A2, A3]): A = s.value
  }

  implicit def sealedtrait4[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4)): Shapely[A, SealedTrait4[A, A1, A2, A3, A4]] = new Shapely[A, SealedTrait4[A, A1, A2, A3, A4]] {
    def to(a: A): SealedTrait4[A, A1, A2, A3, A4] = A.ordinal(a) match {
      case 0 => SealedTrait4._1(a.asInstanceOf[A1])
      case 1 => SealedTrait4._2(a.asInstanceOf[A2])
      case 2 => SealedTrait4._3(a.asInstanceOf[A3])
      case 3 => SealedTrait4._4(a.asInstanceOf[A4])
    }
    def from(s: SealedTrait4[A, A1, A2, A3, A4]): A = s.value
  }

  implicit def sealedtrait5[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5)): Shapely[A, SealedTrait5[A, A1, A2, A3, A4, A5]] = new Shapely[A, SealedTrait5[A, A1, A2, A3, A4, A5]] {
    def to(a: A): SealedTrait5[A, A1, A2, A3, A4, A5] = A.ordinal(a) match {
      case 0 => SealedTrait5._1(a.asInstanceOf[A1])
      case 1 => SealedTrait5._2(a.asInstanceOf[A2])
      case 2 => SealedTrait5._3(a.asInstanceOf[A3])
      case 3 => SealedTrait5._4(a.asInstanceOf[A4])
      case 4 => SealedTrait5._5(a.asInstanceOf[A5])
    }
    def from(s: SealedTrait5[A, A1, A2, A3, A4, A5]): A = s.value
  }

  implicit def sealedtrait6[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6)): Shapely[A, SealedTrait6[A, A1, A2, A3, A4, A5, A6]] = new Shapely[A, SealedTrait6[A, A1, A2, A3, A4, A5, A6]] {
    def to(a: A): SealedTrait6[A, A1, A2, A3, A4, A5, A6] = A.ordinal(a) match {
      case 0 => SealedTrait6._1(a.asInstanceOf[A1])
      case 1 => SealedTrait6._2(a.asInstanceOf[A2])
      case 2 => SealedTrait6._3(a.asInstanceOf[A3])
      case 3 => SealedTrait6._4(a.asInstanceOf[A4])
      case 4 => SealedTrait6._5(a.asInstanceOf[A5])
      case 5 => SealedTrait6._6(a.asInstanceOf[A6])
    }
    def from(s: SealedTrait6[A, A1, A2, A3, A4, A5, A6]): A = s.value
  }

  implicit def sealedtrait7[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7)): Shapely[A, SealedTrait7[A, A1, A2, A3, A4, A5, A6, A7]] = new Shapely[A, SealedTrait7[A, A1, A2, A3, A4, A5, A6, A7]] {
    def to(a: A): SealedTrait7[A, A1, A2, A3, A4, A5, A6, A7] = A.ordinal(a) match {
      case 0 => SealedTrait7._1(a.asInstanceOf[A1])
      case 1 => SealedTrait7._2(a.asInstanceOf[A2])
      case 2 => SealedTrait7._3(a.asInstanceOf[A3])
      case 3 => SealedTrait7._4(a.asInstanceOf[A4])
      case 4 => SealedTrait7._5(a.asInstanceOf[A5])
      case 5 => SealedTrait7._6(a.asInstanceOf[A6])
      case 6 => SealedTrait7._7(a.asInstanceOf[A7])
    }
    def from(s: SealedTrait7[A, A1, A2, A3, A4, A5, A6, A7]): A = s.value
  }

  implicit def sealedtrait8[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8)): Shapely[A, SealedTrait8[A, A1, A2, A3, A4, A5, A6, A7, A8]] = new Shapely[A, SealedTrait8[A, A1, A2, A3, A4, A5, A6, A7, A8]] {
    def to(a: A): SealedTrait8[A, A1, A2, A3, A4, A5, A6, A7, A8] = A.ordinal(a) match {
      case 0 => SealedTrait8._1(a.asInstanceOf[A1])
      case 1 => SealedTrait8._2(a.asInstanceOf[A2])
      case 2 => SealedTrait8._3(a.asInstanceOf[A3])
      case 3 => SealedTrait8._4(a.asInstanceOf[A4])
      case 4 => SealedTrait8._5(a.asInstanceOf[A5])
      case 5 => SealedTrait8._6(a.asInstanceOf[A6])
      case 6 => SealedTrait8._7(a.asInstanceOf[A7])
      case 7 => SealedTrait8._8(a.asInstanceOf[A8])
    }
    def from(s: SealedTrait8[A, A1, A2, A3, A4, A5, A6, A7, A8]): A = s.value
  }

  implicit def sealedtrait9[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9)): Shapely[A, SealedTrait9[A, A1, A2, A3, A4, A5, A6, A7, A8, A9]] = new Shapely[A, SealedTrait9[A, A1, A2, A3, A4, A5, A6, A7, A8, A9]] {
    def to(a: A): SealedTrait9[A, A1, A2, A3, A4, A5, A6, A7, A8, A9] = A.ordinal(a) match {
      case 0 => SealedTrait9._1(a.asInstanceOf[A1])
      case 1 => SealedTrait9._2(a.asInstanceOf[A2])
      case 2 => SealedTrait9._3(a.asInstanceOf[A3])
      case 3 => SealedTrait9._4(a.asInstanceOf[A4])
      case 4 => SealedTrait9._5(a.asInstanceOf[A5])
      case 5 => SealedTrait9._6(a.asInstanceOf[A6])
      case 6 => SealedTrait9._7(a.asInstanceOf[A7])
      case 7 => SealedTrait9._8(a.asInstanceOf[A8])
      case 8 => SealedTrait9._9(a.asInstanceOf[A9])
    }
    def from(s: SealedTrait9[A, A1, A2, A3, A4, A5, A6, A7, A8, A9]): A = s.value
  }

  implicit def sealedtrait10[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10)): Shapely[A, SealedTrait10[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10]] = new Shapely[A, SealedTrait10[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10]] {
    def to(a: A): SealedTrait10[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10] = A.ordinal(a) match {
      case 0 => SealedTrait10._1(a.asInstanceOf[A1])
      case 1 => SealedTrait10._2(a.asInstanceOf[A2])
      case 2 => SealedTrait10._3(a.asInstanceOf[A3])
      case 3 => SealedTrait10._4(a.asInstanceOf[A4])
      case 4 => SealedTrait10._5(a.asInstanceOf[A5])
      case 5 => SealedTrait10._6(a.asInstanceOf[A6])
      case 6 => SealedTrait10._7(a.asInstanceOf[A7])
      case 7 => SealedTrait10._8(a.asInstanceOf[A8])
      case 8 => SealedTrait10._9(a.asInstanceOf[A9])
      case 9 => SealedTrait10._10(a.asInstanceOf[A10])
    }
    def from(s: SealedTrait10[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10]): A = s.value
  }

  implicit def sealedtrait11[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11)): Shapely[A, SealedTrait11[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11]] = new Shapely[A, SealedTrait11[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11]] {
    def to(a: A): SealedTrait11[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11] = A.ordinal(a) match {
      case 0 => SealedTrait11._1(a.asInstanceOf[A1])
      case 1 => SealedTrait11._2(a.asInstanceOf[A2])
      case 2 => SealedTrait11._3(a.asInstanceOf[A3])
      case 3 => SealedTrait11._4(a.asInstanceOf[A4])
      case 4 => SealedTrait11._5(a.asInstanceOf[A5])
      case 5 => SealedTrait11._6(a.asInstanceOf[A6])
      case 6 => SealedTrait11._7(a.asInstanceOf[A7])
      case 7 => SealedTrait11._8(a.asInstanceOf[A8])
      case 8 => SealedTrait11._9(a.asInstanceOf[A9])
      case 9 => SealedTrait11._10(a.asInstanceOf[A10])
      case 10 => SealedTrait11._11(a.asInstanceOf[A11])
    }
    def from(s: SealedTrait11[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11]): A = s.value
  }

  implicit def sealedtrait12[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12)): Shapely[A, SealedTrait12[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12]] = new Shapely[A, SealedTrait12[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12]] {
    def to(a: A): SealedTrait12[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12] = A.ordinal(a) match {
      case 0 => SealedTrait12._1(a.asInstanceOf[A1])
      case 1 => SealedTrait12._2(a.asInstanceOf[A2])
      case 2 => SealedTrait12._3(a.asInstanceOf[A3])
      case 3 => SealedTrait12._4(a.asInstanceOf[A4])
      case 4 => SealedTrait12._5(a.asInstanceOf[A5])
      case 5 => SealedTrait12._6(a.asInstanceOf[A6])
      case 6 => SealedTrait12._7(a.asInstanceOf[A7])
      case 7 => SealedTrait12._8(a.asInstanceOf[A8])
      case 8 => SealedTrait12._9(a.asInstanceOf[A9])
      case 9 => SealedTrait12._10(a.asInstanceOf[A10])
      case 10 => SealedTrait12._11(a.asInstanceOf[A11])
      case 11 => SealedTrait12._12(a.asInstanceOf[A12])
    }
    def from(s: SealedTrait12[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12]): A = s.value
  }

  implicit def sealedtrait13[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13)): Shapely[A, SealedTrait13[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13]] = new Shapely[A, SealedTrait13[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13]] {
    def to(a: A): SealedTrait13[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13] = A.ordinal(a) match {
      case 0 => SealedTrait13._1(a.asInstanceOf[A1])
      case 1 => SealedTrait13._2(a.asInstanceOf[A2])
      case 2 => SealedTrait13._3(a.asInstanceOf[A3])
      case 3 => SealedTrait13._4(a.asInstanceOf[A4])
      case 4 => SealedTrait13._5(a.asInstanceOf[A5])
      case 5 => SealedTrait13._6(a.asInstanceOf[A6])
      case 6 => SealedTrait13._7(a.asInstanceOf[A7])
      case 7 => SealedTrait13._8(a.asInstanceOf[A8])
      case 8 => SealedTrait13._9(a.asInstanceOf[A9])
      case 9 => SealedTrait13._10(a.asInstanceOf[A10])
      case 10 => SealedTrait13._11(a.asInstanceOf[A11])
      case 11 => SealedTrait13._12(a.asInstanceOf[A12])
      case 12 => SealedTrait13._13(a.asInstanceOf[A13])
    }
    def from(s: SealedTrait13[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13]): A = s.value
  }

  implicit def sealedtrait14[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14)): Shapely[A, SealedTrait14[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14]] = new Shapely[A, SealedTrait14[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14]] {
    def to(a: A): SealedTrait14[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14] = A.ordinal(a) match {
      case 0 => SealedTrait14._1(a.asInstanceOf[A1])
      case 1 => SealedTrait14._2(a.asInstanceOf[A2])
      case 2 => SealedTrait14._3(a.asInstanceOf[A3])
      case 3 => SealedTrait14._4(a.asInstanceOf[A4])
      case 4 => SealedTrait14._5(a.asInstanceOf[A5])
      case 5 => SealedTrait14._6(a.asInstanceOf[A6])
      case 6 => SealedTrait14._7(a.asInstanceOf[A7])
      case 7 => SealedTrait14._8(a.asInstanceOf[A8])
      case 8 => SealedTrait14._9(a.asInstanceOf[A9])
      case 9 => SealedTrait14._10(a.asInstanceOf[A10])
      case 10 => SealedTrait14._11(a.asInstanceOf[A11])
      case 11 => SealedTrait14._12(a.asInstanceOf[A12])
      case 12 => SealedTrait14._13(a.asInstanceOf[A13])
      case 13 => SealedTrait14._14(a.asInstanceOf[A14])
    }
    def from(s: SealedTrait14[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14]): A = s.value
  }

  implicit def sealedtrait15[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15)): Shapely[A, SealedTrait15[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15]] = new Shapely[A, SealedTrait15[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15]] {
    def to(a: A): SealedTrait15[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15] = A.ordinal(a) match {
      case 0 => SealedTrait15._1(a.asInstanceOf[A1])
      case 1 => SealedTrait15._2(a.asInstanceOf[A2])
      case 2 => SealedTrait15._3(a.asInstanceOf[A3])
      case 3 => SealedTrait15._4(a.asInstanceOf[A4])
      case 4 => SealedTrait15._5(a.asInstanceOf[A5])
      case 5 => SealedTrait15._6(a.asInstanceOf[A6])
      case 6 => SealedTrait15._7(a.asInstanceOf[A7])
      case 7 => SealedTrait15._8(a.asInstanceOf[A8])
      case 8 => SealedTrait15._9(a.asInstanceOf[A9])
      case 9 => SealedTrait15._10(a.asInstanceOf[A10])
      case 10 => SealedTrait15._11(a.asInstanceOf[A11])
      case 11 => SealedTrait15._12(a.asInstanceOf[A12])
      case 12 => SealedTrait15._13(a.asInstanceOf[A13])
      case 13 => SealedTrait15._14(a.asInstanceOf[A14])
      case 14 => SealedTrait15._15(a.asInstanceOf[A15])
    }
    def from(s: SealedTrait15[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15]): A = s.value
  }

  implicit def sealedtrait16[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16)): Shapely[A, SealedTrait16[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16]] = new Shapely[A, SealedTrait16[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16]] {
    def to(a: A): SealedTrait16[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16] = A.ordinal(a) match {
      case 0 => SealedTrait16._1(a.asInstanceOf[A1])
      case 1 => SealedTrait16._2(a.asInstanceOf[A2])
      case 2 => SealedTrait16._3(a.asInstanceOf[A3])
      case 3 => SealedTrait16._4(a.asInstanceOf[A4])
      case 4 => SealedTrait16._5(a.asInstanceOf[A5])
      case 5 => SealedTrait16._6(a.asInstanceOf[A6])
      case 6 => SealedTrait16._7(a.asInstanceOf[A7])
      case 7 => SealedTrait16._8(a.asInstanceOf[A8])
      case 8 => SealedTrait16._9(a.asInstanceOf[A9])
      case 9 => SealedTrait16._10(a.asInstanceOf[A10])
      case 10 => SealedTrait16._11(a.asInstanceOf[A11])
      case 11 => SealedTrait16._12(a.asInstanceOf[A12])
      case 12 => SealedTrait16._13(a.asInstanceOf[A13])
      case 13 => SealedTrait16._14(a.asInstanceOf[A14])
      case 14 => SealedTrait16._15(a.asInstanceOf[A15])
      case 15 => SealedTrait16._16(a.asInstanceOf[A16])
    }
    def from(s: SealedTrait16[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16]): A = s.value
  }

  implicit def sealedtrait17[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17)): Shapely[A, SealedTrait17[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17]] = new Shapely[A, SealedTrait17[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17]] {
    def to(a: A): SealedTrait17[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17] = A.ordinal(a) match {
      case 0 => SealedTrait17._1(a.asInstanceOf[A1])
      case 1 => SealedTrait17._2(a.asInstanceOf[A2])
      case 2 => SealedTrait17._3(a.asInstanceOf[A3])
      case 3 => SealedTrait17._4(a.asInstanceOf[A4])
      case 4 => SealedTrait17._5(a.asInstanceOf[A5])
      case 5 => SealedTrait17._6(a.asInstanceOf[A6])
      case 6 => SealedTrait17._7(a.asInstanceOf[A7])
      case 7 => SealedTrait17._8(a.asInstanceOf[A8])
      case 8 => SealedTrait17._9(a.asInstanceOf[A9])
      case 9 => SealedTrait17._10(a.asInstanceOf[A10])
      case 10 => SealedTrait17._11(a.asInstanceOf[A11])
      case 11 => SealedTrait17._12(a.asInstanceOf[A12])
      case 12 => SealedTrait17._13(a.asInstanceOf[A13])
      case 13 => SealedTrait17._14(a.asInstanceOf[A14])
      case 14 => SealedTrait17._15(a.asInstanceOf[A15])
      case 15 => SealedTrait17._16(a.asInstanceOf[A16])
      case 16 => SealedTrait17._17(a.asInstanceOf[A17])
    }
    def from(s: SealedTrait17[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17]): A = s.value
  }

  implicit def sealedtrait18[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18)): Shapely[A, SealedTrait18[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18]] = new Shapely[A, SealedTrait18[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18]] {
    def to(a: A): SealedTrait18[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18] = A.ordinal(a) match {
      case 0 => SealedTrait18._1(a.asInstanceOf[A1])
      case 1 => SealedTrait18._2(a.asInstanceOf[A2])
      case 2 => SealedTrait18._3(a.asInstanceOf[A3])
      case 3 => SealedTrait18._4(a.asInstanceOf[A4])
      case 4 => SealedTrait18._5(a.asInstanceOf[A5])
      case 5 => SealedTrait18._6(a.asInstanceOf[A6])
      case 6 => SealedTrait18._7(a.asInstanceOf[A7])
      case 7 => SealedTrait18._8(a.asInstanceOf[A8])
      case 8 => SealedTrait18._9(a.asInstanceOf[A9])
      case 9 => SealedTrait18._10(a.asInstanceOf[A10])
      case 10 => SealedTrait18._11(a.asInstanceOf[A11])
      case 11 => SealedTrait18._12(a.asInstanceOf[A12])
      case 12 => SealedTrait18._13(a.asInstanceOf[A13])
      case 13 => SealedTrait18._14(a.asInstanceOf[A14])
      case 14 => SealedTrait18._15(a.asInstanceOf[A15])
      case 15 => SealedTrait18._16(a.asInstanceOf[A16])
      case 16 => SealedTrait18._17(a.asInstanceOf[A17])
      case 17 => SealedTrait18._18(a.asInstanceOf[A18])
    }
    def from(s: SealedTrait18[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18]): A = s.value
  }

  implicit def sealedtrait19[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19)): Shapely[A, SealedTrait19[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19]] = new Shapely[A, SealedTrait19[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19]] {
    def to(a: A): SealedTrait19[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19] = A.ordinal(a) match {
      case 0 => SealedTrait19._1(a.asInstanceOf[A1])
      case 1 => SealedTrait19._2(a.asInstanceOf[A2])
      case 2 => SealedTrait19._3(a.asInstanceOf[A3])
      case 3 => SealedTrait19._4(a.asInstanceOf[A4])
      case 4 => SealedTrait19._5(a.asInstanceOf[A5])
      case 5 => SealedTrait19._6(a.asInstanceOf[A6])
      case 6 => SealedTrait19._7(a.asInstanceOf[A7])
      case 7 => SealedTrait19._8(a.asInstanceOf[A8])
      case 8 => SealedTrait19._9(a.asInstanceOf[A9])
      case 9 => SealedTrait19._10(a.asInstanceOf[A10])
      case 10 => SealedTrait19._11(a.asInstanceOf[A11])
      case 11 => SealedTrait19._12(a.asInstanceOf[A12])
      case 12 => SealedTrait19._13(a.asInstanceOf[A13])
      case 13 => SealedTrait19._14(a.asInstanceOf[A14])
      case 14 => SealedTrait19._15(a.asInstanceOf[A15])
      case 15 => SealedTrait19._16(a.asInstanceOf[A16])
      case 16 => SealedTrait19._17(a.asInstanceOf[A17])
      case 17 => SealedTrait19._18(a.asInstanceOf[A18])
      case 18 => SealedTrait19._19(a.asInstanceOf[A19])
    }
    def from(s: SealedTrait19[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19]): A = s.value
  }

  implicit def sealedtrait20[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20)): Shapely[A, SealedTrait20[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20]] = new Shapely[A, SealedTrait20[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20]] {
    def to(a: A): SealedTrait20[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20] = A.ordinal(a) match {
      case 0 => SealedTrait20._1(a.asInstanceOf[A1])
      case 1 => SealedTrait20._2(a.asInstanceOf[A2])
      case 2 => SealedTrait20._3(a.asInstanceOf[A3])
      case 3 => SealedTrait20._4(a.asInstanceOf[A4])
      case 4 => SealedTrait20._5(a.asInstanceOf[A5])
      case 5 => SealedTrait20._6(a.asInstanceOf[A6])
      case 6 => SealedTrait20._7(a.asInstanceOf[A7])
      case 7 => SealedTrait20._8(a.asInstanceOf[A8])
      case 8 => SealedTrait20._9(a.asInstanceOf[A9])
      case 9 => SealedTrait20._10(a.asInstanceOf[A10])
      case 10 => SealedTrait20._11(a.asInstanceOf[A11])
      case 11 => SealedTrait20._12(a.asInstanceOf[A12])
      case 12 => SealedTrait20._13(a.asInstanceOf[A13])
      case 13 => SealedTrait20._14(a.asInstanceOf[A14])
      case 14 => SealedTrait20._15(a.asInstanceOf[A15])
      case 15 => SealedTrait20._16(a.asInstanceOf[A16])
      case 16 => SealedTrait20._17(a.asInstanceOf[A17])
      case 17 => SealedTrait20._18(a.asInstanceOf[A18])
      case 18 => SealedTrait20._19(a.asInstanceOf[A19])
      case 19 => SealedTrait20._20(a.asInstanceOf[A20])
    }
    def from(s: SealedTrait20[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20]): A = s.value
  }

  implicit def sealedtrait21[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21)): Shapely[A, SealedTrait21[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21]] = new Shapely[A, SealedTrait21[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21]] {
    def to(a: A): SealedTrait21[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21] = A.ordinal(a) match {
      case 0 => SealedTrait21._1(a.asInstanceOf[A1])
      case 1 => SealedTrait21._2(a.asInstanceOf[A2])
      case 2 => SealedTrait21._3(a.asInstanceOf[A3])
      case 3 => SealedTrait21._4(a.asInstanceOf[A4])
      case 4 => SealedTrait21._5(a.asInstanceOf[A5])
      case 5 => SealedTrait21._6(a.asInstanceOf[A6])
      case 6 => SealedTrait21._7(a.asInstanceOf[A7])
      case 7 => SealedTrait21._8(a.asInstanceOf[A8])
      case 8 => SealedTrait21._9(a.asInstanceOf[A9])
      case 9 => SealedTrait21._10(a.asInstanceOf[A10])
      case 10 => SealedTrait21._11(a.asInstanceOf[A11])
      case 11 => SealedTrait21._12(a.asInstanceOf[A12])
      case 12 => SealedTrait21._13(a.asInstanceOf[A13])
      case 13 => SealedTrait21._14(a.asInstanceOf[A14])
      case 14 => SealedTrait21._15(a.asInstanceOf[A15])
      case 15 => SealedTrait21._16(a.asInstanceOf[A16])
      case 16 => SealedTrait21._17(a.asInstanceOf[A17])
      case 17 => SealedTrait21._18(a.asInstanceOf[A18])
      case 18 => SealedTrait21._19(a.asInstanceOf[A19])
      case 19 => SealedTrait21._20(a.asInstanceOf[A20])
      case 20 => SealedTrait21._21(a.asInstanceOf[A21])
    }
    def from(s: SealedTrait21[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21]): A = s.value
  }

  implicit def sealedtrait22[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22)): Shapely[A, SealedTrait22[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22]] = new Shapely[A, SealedTrait22[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22]] {
    def to(a: A): SealedTrait22[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22] = A.ordinal(a) match {
      case 0 => SealedTrait22._1(a.asInstanceOf[A1])
      case 1 => SealedTrait22._2(a.asInstanceOf[A2])
      case 2 => SealedTrait22._3(a.asInstanceOf[A3])
      case 3 => SealedTrait22._4(a.asInstanceOf[A4])
      case 4 => SealedTrait22._5(a.asInstanceOf[A5])
      case 5 => SealedTrait22._6(a.asInstanceOf[A6])
      case 6 => SealedTrait22._7(a.asInstanceOf[A7])
      case 7 => SealedTrait22._8(a.asInstanceOf[A8])
      case 8 => SealedTrait22._9(a.asInstanceOf[A9])
      case 9 => SealedTrait22._10(a.asInstanceOf[A10])
      case 10 => SealedTrait22._11(a.asInstanceOf[A11])
      case 11 => SealedTrait22._12(a.asInstanceOf[A12])
      case 12 => SealedTrait22._13(a.asInstanceOf[A13])
      case 13 => SealedTrait22._14(a.asInstanceOf[A14])
      case 14 => SealedTrait22._15(a.asInstanceOf[A15])
      case 15 => SealedTrait22._16(a.asInstanceOf[A16])
      case 16 => SealedTrait22._17(a.asInstanceOf[A17])
      case 17 => SealedTrait22._18(a.asInstanceOf[A18])
      case 18 => SealedTrait22._19(a.asInstanceOf[A19])
      case 19 => SealedTrait22._20(a.asInstanceOf[A20])
      case 20 => SealedTrait22._21(a.asInstanceOf[A21])
      case 21 => SealedTrait22._22(a.asInstanceOf[A22])
    }
    def from(s: SealedTrait22[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22]): A = s.value
  }

  implicit def sealedtrait23[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23)): Shapely[A, SealedTrait23[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23]] = new Shapely[A, SealedTrait23[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23]] {
    def to(a: A): SealedTrait23[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23] = A.ordinal(a) match {
      case 0 => SealedTrait23._1(a.asInstanceOf[A1])
      case 1 => SealedTrait23._2(a.asInstanceOf[A2])
      case 2 => SealedTrait23._3(a.asInstanceOf[A3])
      case 3 => SealedTrait23._4(a.asInstanceOf[A4])
      case 4 => SealedTrait23._5(a.asInstanceOf[A5])
      case 5 => SealedTrait23._6(a.asInstanceOf[A6])
      case 6 => SealedTrait23._7(a.asInstanceOf[A7])
      case 7 => SealedTrait23._8(a.asInstanceOf[A8])
      case 8 => SealedTrait23._9(a.asInstanceOf[A9])
      case 9 => SealedTrait23._10(a.asInstanceOf[A10])
      case 10 => SealedTrait23._11(a.asInstanceOf[A11])
      case 11 => SealedTrait23._12(a.asInstanceOf[A12])
      case 12 => SealedTrait23._13(a.asInstanceOf[A13])
      case 13 => SealedTrait23._14(a.asInstanceOf[A14])
      case 14 => SealedTrait23._15(a.asInstanceOf[A15])
      case 15 => SealedTrait23._16(a.asInstanceOf[A16])
      case 16 => SealedTrait23._17(a.asInstanceOf[A17])
      case 17 => SealedTrait23._18(a.asInstanceOf[A18])
      case 18 => SealedTrait23._19(a.asInstanceOf[A19])
      case 19 => SealedTrait23._20(a.asInstanceOf[A20])
      case 20 => SealedTrait23._21(a.asInstanceOf[A21])
      case 21 => SealedTrait23._22(a.asInstanceOf[A22])
      case 22 => SealedTrait23._23(a.asInstanceOf[A23])
    }
    def from(s: SealedTrait23[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23]): A = s.value
  }

  implicit def sealedtrait24[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24)): Shapely[A, SealedTrait24[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24]] = new Shapely[A, SealedTrait24[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24]] {
    def to(a: A): SealedTrait24[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24] = A.ordinal(a) match {
      case 0 => SealedTrait24._1(a.asInstanceOf[A1])
      case 1 => SealedTrait24._2(a.asInstanceOf[A2])
      case 2 => SealedTrait24._3(a.asInstanceOf[A3])
      case 3 => SealedTrait24._4(a.asInstanceOf[A4])
      case 4 => SealedTrait24._5(a.asInstanceOf[A5])
      case 5 => SealedTrait24._6(a.asInstanceOf[A6])
      case 6 => SealedTrait24._7(a.asInstanceOf[A7])
      case 7 => SealedTrait24._8(a.asInstanceOf[A8])
      case 8 => SealedTrait24._9(a.asInstanceOf[A9])
      case 9 => SealedTrait24._10(a.asInstanceOf[A10])
      case 10 => SealedTrait24._11(a.asInstanceOf[A11])
      case 11 => SealedTrait24._12(a.asInstanceOf[A12])
      case 12 => SealedTrait24._13(a.asInstanceOf[A13])
      case 13 => SealedTrait24._14(a.asInstanceOf[A14])
      case 14 => SealedTrait24._15(a.asInstanceOf[A15])
      case 15 => SealedTrait24._16(a.asInstanceOf[A16])
      case 16 => SealedTrait24._17(a.asInstanceOf[A17])
      case 17 => SealedTrait24._18(a.asInstanceOf[A18])
      case 18 => SealedTrait24._19(a.asInstanceOf[A19])
      case 19 => SealedTrait24._20(a.asInstanceOf[A20])
      case 20 => SealedTrait24._21(a.asInstanceOf[A21])
      case 21 => SealedTrait24._22(a.asInstanceOf[A22])
      case 22 => SealedTrait24._23(a.asInstanceOf[A23])
      case 23 => SealedTrait24._24(a.asInstanceOf[A24])
    }
    def from(s: SealedTrait24[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24]): A = s.value
  }

  implicit def sealedtrait25[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25)): Shapely[A, SealedTrait25[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25]] = new Shapely[A, SealedTrait25[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25]] {
    def to(a: A): SealedTrait25[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25] = A.ordinal(a) match {
      case 0 => SealedTrait25._1(a.asInstanceOf[A1])
      case 1 => SealedTrait25._2(a.asInstanceOf[A2])
      case 2 => SealedTrait25._3(a.asInstanceOf[A3])
      case 3 => SealedTrait25._4(a.asInstanceOf[A4])
      case 4 => SealedTrait25._5(a.asInstanceOf[A5])
      case 5 => SealedTrait25._6(a.asInstanceOf[A6])
      case 6 => SealedTrait25._7(a.asInstanceOf[A7])
      case 7 => SealedTrait25._8(a.asInstanceOf[A8])
      case 8 => SealedTrait25._9(a.asInstanceOf[A9])
      case 9 => SealedTrait25._10(a.asInstanceOf[A10])
      case 10 => SealedTrait25._11(a.asInstanceOf[A11])
      case 11 => SealedTrait25._12(a.asInstanceOf[A12])
      case 12 => SealedTrait25._13(a.asInstanceOf[A13])
      case 13 => SealedTrait25._14(a.asInstanceOf[A14])
      case 14 => SealedTrait25._15(a.asInstanceOf[A15])
      case 15 => SealedTrait25._16(a.asInstanceOf[A16])
      case 16 => SealedTrait25._17(a.asInstanceOf[A17])
      case 17 => SealedTrait25._18(a.asInstanceOf[A18])
      case 18 => SealedTrait25._19(a.asInstanceOf[A19])
      case 19 => SealedTrait25._20(a.asInstanceOf[A20])
      case 20 => SealedTrait25._21(a.asInstanceOf[A21])
      case 21 => SealedTrait25._22(a.asInstanceOf[A22])
      case 22 => SealedTrait25._23(a.asInstanceOf[A23])
      case 23 => SealedTrait25._24(a.asInstanceOf[A24])
      case 24 => SealedTrait25._25(a.asInstanceOf[A25])
    }
    def from(s: SealedTrait25[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25]): A = s.value
  }

  implicit def sealedtrait26[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26)): Shapely[A, SealedTrait26[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26]] = new Shapely[A, SealedTrait26[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26]] {
    def to(a: A): SealedTrait26[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26] = A.ordinal(a) match {
      case 0 => SealedTrait26._1(a.asInstanceOf[A1])
      case 1 => SealedTrait26._2(a.asInstanceOf[A2])
      case 2 => SealedTrait26._3(a.asInstanceOf[A3])
      case 3 => SealedTrait26._4(a.asInstanceOf[A4])
      case 4 => SealedTrait26._5(a.asInstanceOf[A5])
      case 5 => SealedTrait26._6(a.asInstanceOf[A6])
      case 6 => SealedTrait26._7(a.asInstanceOf[A7])
      case 7 => SealedTrait26._8(a.asInstanceOf[A8])
      case 8 => SealedTrait26._9(a.asInstanceOf[A9])
      case 9 => SealedTrait26._10(a.asInstanceOf[A10])
      case 10 => SealedTrait26._11(a.asInstanceOf[A11])
      case 11 => SealedTrait26._12(a.asInstanceOf[A12])
      case 12 => SealedTrait26._13(a.asInstanceOf[A13])
      case 13 => SealedTrait26._14(a.asInstanceOf[A14])
      case 14 => SealedTrait26._15(a.asInstanceOf[A15])
      case 15 => SealedTrait26._16(a.asInstanceOf[A16])
      case 16 => SealedTrait26._17(a.asInstanceOf[A17])
      case 17 => SealedTrait26._18(a.asInstanceOf[A18])
      case 18 => SealedTrait26._19(a.asInstanceOf[A19])
      case 19 => SealedTrait26._20(a.asInstanceOf[A20])
      case 20 => SealedTrait26._21(a.asInstanceOf[A21])
      case 21 => SealedTrait26._22(a.asInstanceOf[A22])
      case 22 => SealedTrait26._23(a.asInstanceOf[A23])
      case 23 => SealedTrait26._24(a.asInstanceOf[A24])
      case 24 => SealedTrait26._25(a.asInstanceOf[A25])
      case 25 => SealedTrait26._26(a.asInstanceOf[A26])
    }
    def from(s: SealedTrait26[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26]): A = s.value
  }

  implicit def sealedtrait27[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27)): Shapely[A, SealedTrait27[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27]] = new Shapely[A, SealedTrait27[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27]] {
    def to(a: A): SealedTrait27[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27] = A.ordinal(a) match {
      case 0 => SealedTrait27._1(a.asInstanceOf[A1])
      case 1 => SealedTrait27._2(a.asInstanceOf[A2])
      case 2 => SealedTrait27._3(a.asInstanceOf[A3])
      case 3 => SealedTrait27._4(a.asInstanceOf[A4])
      case 4 => SealedTrait27._5(a.asInstanceOf[A5])
      case 5 => SealedTrait27._6(a.asInstanceOf[A6])
      case 6 => SealedTrait27._7(a.asInstanceOf[A7])
      case 7 => SealedTrait27._8(a.asInstanceOf[A8])
      case 8 => SealedTrait27._9(a.asInstanceOf[A9])
      case 9 => SealedTrait27._10(a.asInstanceOf[A10])
      case 10 => SealedTrait27._11(a.asInstanceOf[A11])
      case 11 => SealedTrait27._12(a.asInstanceOf[A12])
      case 12 => SealedTrait27._13(a.asInstanceOf[A13])
      case 13 => SealedTrait27._14(a.asInstanceOf[A14])
      case 14 => SealedTrait27._15(a.asInstanceOf[A15])
      case 15 => SealedTrait27._16(a.asInstanceOf[A16])
      case 16 => SealedTrait27._17(a.asInstanceOf[A17])
      case 17 => SealedTrait27._18(a.asInstanceOf[A18])
      case 18 => SealedTrait27._19(a.asInstanceOf[A19])
      case 19 => SealedTrait27._20(a.asInstanceOf[A20])
      case 20 => SealedTrait27._21(a.asInstanceOf[A21])
      case 21 => SealedTrait27._22(a.asInstanceOf[A22])
      case 22 => SealedTrait27._23(a.asInstanceOf[A23])
      case 23 => SealedTrait27._24(a.asInstanceOf[A24])
      case 24 => SealedTrait27._25(a.asInstanceOf[A25])
      case 25 => SealedTrait27._26(a.asInstanceOf[A26])
      case 26 => SealedTrait27._27(a.asInstanceOf[A27])
    }
    def from(s: SealedTrait27[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27]): A = s.value
  }

  implicit def sealedtrait28[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A, A28 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28)): Shapely[A, SealedTrait28[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28]] = new Shapely[A, SealedTrait28[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28]] {
    def to(a: A): SealedTrait28[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28] = A.ordinal(a) match {
      case 0 => SealedTrait28._1(a.asInstanceOf[A1])
      case 1 => SealedTrait28._2(a.asInstanceOf[A2])
      case 2 => SealedTrait28._3(a.asInstanceOf[A3])
      case 3 => SealedTrait28._4(a.asInstanceOf[A4])
      case 4 => SealedTrait28._5(a.asInstanceOf[A5])
      case 5 => SealedTrait28._6(a.asInstanceOf[A6])
      case 6 => SealedTrait28._7(a.asInstanceOf[A7])
      case 7 => SealedTrait28._8(a.asInstanceOf[A8])
      case 8 => SealedTrait28._9(a.asInstanceOf[A9])
      case 9 => SealedTrait28._10(a.asInstanceOf[A10])
      case 10 => SealedTrait28._11(a.asInstanceOf[A11])
      case 11 => SealedTrait28._12(a.asInstanceOf[A12])
      case 12 => SealedTrait28._13(a.asInstanceOf[A13])
      case 13 => SealedTrait28._14(a.asInstanceOf[A14])
      case 14 => SealedTrait28._15(a.asInstanceOf[A15])
      case 15 => SealedTrait28._16(a.asInstanceOf[A16])
      case 16 => SealedTrait28._17(a.asInstanceOf[A17])
      case 17 => SealedTrait28._18(a.asInstanceOf[A18])
      case 18 => SealedTrait28._19(a.asInstanceOf[A19])
      case 19 => SealedTrait28._20(a.asInstanceOf[A20])
      case 20 => SealedTrait28._21(a.asInstanceOf[A21])
      case 21 => SealedTrait28._22(a.asInstanceOf[A22])
      case 22 => SealedTrait28._23(a.asInstanceOf[A23])
      case 23 => SealedTrait28._24(a.asInstanceOf[A24])
      case 24 => SealedTrait28._25(a.asInstanceOf[A25])
      case 25 => SealedTrait28._26(a.asInstanceOf[A26])
      case 26 => SealedTrait28._27(a.asInstanceOf[A27])
      case 27 => SealedTrait28._28(a.asInstanceOf[A28])
    }
    def from(s: SealedTrait28[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28]): A = s.value
  }

  implicit def sealedtrait29[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A, A28 <: A, A29 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29)): Shapely[A, SealedTrait29[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29]] = new Shapely[A, SealedTrait29[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29]] {
    def to(a: A): SealedTrait29[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29] = A.ordinal(a) match {
      case 0 => SealedTrait29._1(a.asInstanceOf[A1])
      case 1 => SealedTrait29._2(a.asInstanceOf[A2])
      case 2 => SealedTrait29._3(a.asInstanceOf[A3])
      case 3 => SealedTrait29._4(a.asInstanceOf[A4])
      case 4 => SealedTrait29._5(a.asInstanceOf[A5])
      case 5 => SealedTrait29._6(a.asInstanceOf[A6])
      case 6 => SealedTrait29._7(a.asInstanceOf[A7])
      case 7 => SealedTrait29._8(a.asInstanceOf[A8])
      case 8 => SealedTrait29._9(a.asInstanceOf[A9])
      case 9 => SealedTrait29._10(a.asInstanceOf[A10])
      case 10 => SealedTrait29._11(a.asInstanceOf[A11])
      case 11 => SealedTrait29._12(a.asInstanceOf[A12])
      case 12 => SealedTrait29._13(a.asInstanceOf[A13])
      case 13 => SealedTrait29._14(a.asInstanceOf[A14])
      case 14 => SealedTrait29._15(a.asInstanceOf[A15])
      case 15 => SealedTrait29._16(a.asInstanceOf[A16])
      case 16 => SealedTrait29._17(a.asInstanceOf[A17])
      case 17 => SealedTrait29._18(a.asInstanceOf[A18])
      case 18 => SealedTrait29._19(a.asInstanceOf[A19])
      case 19 => SealedTrait29._20(a.asInstanceOf[A20])
      case 20 => SealedTrait29._21(a.asInstanceOf[A21])
      case 21 => SealedTrait29._22(a.asInstanceOf[A22])
      case 22 => SealedTrait29._23(a.asInstanceOf[A23])
      case 23 => SealedTrait29._24(a.asInstanceOf[A24])
      case 24 => SealedTrait29._25(a.asInstanceOf[A25])
      case 25 => SealedTrait29._26(a.asInstanceOf[A26])
      case 26 => SealedTrait29._27(a.asInstanceOf[A27])
      case 27 => SealedTrait29._28(a.asInstanceOf[A28])
      case 28 => SealedTrait29._29(a.asInstanceOf[A29])
    }
    def from(s: SealedTrait29[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29]): A = s.value
  }

  implicit def sealedtrait30[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A, A28 <: A, A29 <: A, A30 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30)): Shapely[A, SealedTrait30[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30]] = new Shapely[A, SealedTrait30[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30]] {
    def to(a: A): SealedTrait30[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30] = A.ordinal(a) match {
      case 0 => SealedTrait30._1(a.asInstanceOf[A1])
      case 1 => SealedTrait30._2(a.asInstanceOf[A2])
      case 2 => SealedTrait30._3(a.asInstanceOf[A3])
      case 3 => SealedTrait30._4(a.asInstanceOf[A4])
      case 4 => SealedTrait30._5(a.asInstanceOf[A5])
      case 5 => SealedTrait30._6(a.asInstanceOf[A6])
      case 6 => SealedTrait30._7(a.asInstanceOf[A7])
      case 7 => SealedTrait30._8(a.asInstanceOf[A8])
      case 8 => SealedTrait30._9(a.asInstanceOf[A9])
      case 9 => SealedTrait30._10(a.asInstanceOf[A10])
      case 10 => SealedTrait30._11(a.asInstanceOf[A11])
      case 11 => SealedTrait30._12(a.asInstanceOf[A12])
      case 12 => SealedTrait30._13(a.asInstanceOf[A13])
      case 13 => SealedTrait30._14(a.asInstanceOf[A14])
      case 14 => SealedTrait30._15(a.asInstanceOf[A15])
      case 15 => SealedTrait30._16(a.asInstanceOf[A16])
      case 16 => SealedTrait30._17(a.asInstanceOf[A17])
      case 17 => SealedTrait30._18(a.asInstanceOf[A18])
      case 18 => SealedTrait30._19(a.asInstanceOf[A19])
      case 19 => SealedTrait30._20(a.asInstanceOf[A20])
      case 20 => SealedTrait30._21(a.asInstanceOf[A21])
      case 21 => SealedTrait30._22(a.asInstanceOf[A22])
      case 22 => SealedTrait30._23(a.asInstanceOf[A23])
      case 23 => SealedTrait30._24(a.asInstanceOf[A24])
      case 24 => SealedTrait30._25(a.asInstanceOf[A25])
      case 25 => SealedTrait30._26(a.asInstanceOf[A26])
      case 26 => SealedTrait30._27(a.asInstanceOf[A27])
      case 27 => SealedTrait30._28(a.asInstanceOf[A28])
      case 28 => SealedTrait30._29(a.asInstanceOf[A29])
      case 29 => SealedTrait30._30(a.asInstanceOf[A30])
    }
    def from(s: SealedTrait30[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30]): A = s.value
  }

  implicit def sealedtrait31[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A, A28 <: A, A29 <: A, A30 <: A, A31 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31)): Shapely[A, SealedTrait31[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31]] = new Shapely[A, SealedTrait31[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31]] {
    def to(a: A): SealedTrait31[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31] = A.ordinal(a) match {
      case 0 => SealedTrait31._1(a.asInstanceOf[A1])
      case 1 => SealedTrait31._2(a.asInstanceOf[A2])
      case 2 => SealedTrait31._3(a.asInstanceOf[A3])
      case 3 => SealedTrait31._4(a.asInstanceOf[A4])
      case 4 => SealedTrait31._5(a.asInstanceOf[A5])
      case 5 => SealedTrait31._6(a.asInstanceOf[A6])
      case 6 => SealedTrait31._7(a.asInstanceOf[A7])
      case 7 => SealedTrait31._8(a.asInstanceOf[A8])
      case 8 => SealedTrait31._9(a.asInstanceOf[A9])
      case 9 => SealedTrait31._10(a.asInstanceOf[A10])
      case 10 => SealedTrait31._11(a.asInstanceOf[A11])
      case 11 => SealedTrait31._12(a.asInstanceOf[A12])
      case 12 => SealedTrait31._13(a.asInstanceOf[A13])
      case 13 => SealedTrait31._14(a.asInstanceOf[A14])
      case 14 => SealedTrait31._15(a.asInstanceOf[A15])
      case 15 => SealedTrait31._16(a.asInstanceOf[A16])
      case 16 => SealedTrait31._17(a.asInstanceOf[A17])
      case 17 => SealedTrait31._18(a.asInstanceOf[A18])
      case 18 => SealedTrait31._19(a.asInstanceOf[A19])
      case 19 => SealedTrait31._20(a.asInstanceOf[A20])
      case 20 => SealedTrait31._21(a.asInstanceOf[A21])
      case 21 => SealedTrait31._22(a.asInstanceOf[A22])
      case 22 => SealedTrait31._23(a.asInstanceOf[A23])
      case 23 => SealedTrait31._24(a.asInstanceOf[A24])
      case 24 => SealedTrait31._25(a.asInstanceOf[A25])
      case 25 => SealedTrait31._26(a.asInstanceOf[A26])
      case 26 => SealedTrait31._27(a.asInstanceOf[A27])
      case 27 => SealedTrait31._28(a.asInstanceOf[A28])
      case 28 => SealedTrait31._29(a.asInstanceOf[A29])
      case 29 => SealedTrait31._30(a.asInstanceOf[A30])
      case 30 => SealedTrait31._31(a.asInstanceOf[A31])
    }
    def from(s: SealedTrait31[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31]): A = s.value
  }

  implicit def sealedtrait32[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A, A28 <: A, A29 <: A, A30 <: A, A31 <: A, A32 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32)): Shapely[A, SealedTrait32[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32]] = new Shapely[A, SealedTrait32[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32]] {
    def to(a: A): SealedTrait32[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32] = A.ordinal(a) match {
      case 0 => SealedTrait32._1(a.asInstanceOf[A1])
      case 1 => SealedTrait32._2(a.asInstanceOf[A2])
      case 2 => SealedTrait32._3(a.asInstanceOf[A3])
      case 3 => SealedTrait32._4(a.asInstanceOf[A4])
      case 4 => SealedTrait32._5(a.asInstanceOf[A5])
      case 5 => SealedTrait32._6(a.asInstanceOf[A6])
      case 6 => SealedTrait32._7(a.asInstanceOf[A7])
      case 7 => SealedTrait32._8(a.asInstanceOf[A8])
      case 8 => SealedTrait32._9(a.asInstanceOf[A9])
      case 9 => SealedTrait32._10(a.asInstanceOf[A10])
      case 10 => SealedTrait32._11(a.asInstanceOf[A11])
      case 11 => SealedTrait32._12(a.asInstanceOf[A12])
      case 12 => SealedTrait32._13(a.asInstanceOf[A13])
      case 13 => SealedTrait32._14(a.asInstanceOf[A14])
      case 14 => SealedTrait32._15(a.asInstanceOf[A15])
      case 15 => SealedTrait32._16(a.asInstanceOf[A16])
      case 16 => SealedTrait32._17(a.asInstanceOf[A17])
      case 17 => SealedTrait32._18(a.asInstanceOf[A18])
      case 18 => SealedTrait32._19(a.asInstanceOf[A19])
      case 19 => SealedTrait32._20(a.asInstanceOf[A20])
      case 20 => SealedTrait32._21(a.asInstanceOf[A21])
      case 21 => SealedTrait32._22(a.asInstanceOf[A22])
      case 22 => SealedTrait32._23(a.asInstanceOf[A23])
      case 23 => SealedTrait32._24(a.asInstanceOf[A24])
      case 24 => SealedTrait32._25(a.asInstanceOf[A25])
      case 25 => SealedTrait32._26(a.asInstanceOf[A26])
      case 26 => SealedTrait32._27(a.asInstanceOf[A27])
      case 27 => SealedTrait32._28(a.asInstanceOf[A28])
      case 28 => SealedTrait32._29(a.asInstanceOf[A29])
      case 29 => SealedTrait32._30(a.asInstanceOf[A30])
      case 30 => SealedTrait32._31(a.asInstanceOf[A31])
      case 31 => SealedTrait32._32(a.asInstanceOf[A32])
    }
    def from(s: SealedTrait32[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32]): A = s.value
  }

  implicit def sealedtrait33[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A, A28 <: A, A29 <: A, A30 <: A, A31 <: A, A32 <: A, A33 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33)): Shapely[A, SealedTrait33[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33]] = new Shapely[A, SealedTrait33[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33]] {
    def to(a: A): SealedTrait33[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33] = A.ordinal(a) match {
      case 0 => SealedTrait33._1(a.asInstanceOf[A1])
      case 1 => SealedTrait33._2(a.asInstanceOf[A2])
      case 2 => SealedTrait33._3(a.asInstanceOf[A3])
      case 3 => SealedTrait33._4(a.asInstanceOf[A4])
      case 4 => SealedTrait33._5(a.asInstanceOf[A5])
      case 5 => SealedTrait33._6(a.asInstanceOf[A6])
      case 6 => SealedTrait33._7(a.asInstanceOf[A7])
      case 7 => SealedTrait33._8(a.asInstanceOf[A8])
      case 8 => SealedTrait33._9(a.asInstanceOf[A9])
      case 9 => SealedTrait33._10(a.asInstanceOf[A10])
      case 10 => SealedTrait33._11(a.asInstanceOf[A11])
      case 11 => SealedTrait33._12(a.asInstanceOf[A12])
      case 12 => SealedTrait33._13(a.asInstanceOf[A13])
      case 13 => SealedTrait33._14(a.asInstanceOf[A14])
      case 14 => SealedTrait33._15(a.asInstanceOf[A15])
      case 15 => SealedTrait33._16(a.asInstanceOf[A16])
      case 16 => SealedTrait33._17(a.asInstanceOf[A17])
      case 17 => SealedTrait33._18(a.asInstanceOf[A18])
      case 18 => SealedTrait33._19(a.asInstanceOf[A19])
      case 19 => SealedTrait33._20(a.asInstanceOf[A20])
      case 20 => SealedTrait33._21(a.asInstanceOf[A21])
      case 21 => SealedTrait33._22(a.asInstanceOf[A22])
      case 22 => SealedTrait33._23(a.asInstanceOf[A23])
      case 23 => SealedTrait33._24(a.asInstanceOf[A24])
      case 24 => SealedTrait33._25(a.asInstanceOf[A25])
      case 25 => SealedTrait33._26(a.asInstanceOf[A26])
      case 26 => SealedTrait33._27(a.asInstanceOf[A27])
      case 27 => SealedTrait33._28(a.asInstanceOf[A28])
      case 28 => SealedTrait33._29(a.asInstanceOf[A29])
      case 29 => SealedTrait33._30(a.asInstanceOf[A30])
      case 30 => SealedTrait33._31(a.asInstanceOf[A31])
      case 31 => SealedTrait33._32(a.asInstanceOf[A32])
      case 32 => SealedTrait33._33(a.asInstanceOf[A33])
    }
    def from(s: SealedTrait33[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33]): A = s.value
  }

  implicit def sealedtrait34[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A, A28 <: A, A29 <: A, A30 <: A, A31 <: A, A32 <: A, A33 <: A, A34 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34)): Shapely[A, SealedTrait34[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34]] = new Shapely[A, SealedTrait34[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34]] {
    def to(a: A): SealedTrait34[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34] = A.ordinal(a) match {
      case 0 => SealedTrait34._1(a.asInstanceOf[A1])
      case 1 => SealedTrait34._2(a.asInstanceOf[A2])
      case 2 => SealedTrait34._3(a.asInstanceOf[A3])
      case 3 => SealedTrait34._4(a.asInstanceOf[A4])
      case 4 => SealedTrait34._5(a.asInstanceOf[A5])
      case 5 => SealedTrait34._6(a.asInstanceOf[A6])
      case 6 => SealedTrait34._7(a.asInstanceOf[A7])
      case 7 => SealedTrait34._8(a.asInstanceOf[A8])
      case 8 => SealedTrait34._9(a.asInstanceOf[A9])
      case 9 => SealedTrait34._10(a.asInstanceOf[A10])
      case 10 => SealedTrait34._11(a.asInstanceOf[A11])
      case 11 => SealedTrait34._12(a.asInstanceOf[A12])
      case 12 => SealedTrait34._13(a.asInstanceOf[A13])
      case 13 => SealedTrait34._14(a.asInstanceOf[A14])
      case 14 => SealedTrait34._15(a.asInstanceOf[A15])
      case 15 => SealedTrait34._16(a.asInstanceOf[A16])
      case 16 => SealedTrait34._17(a.asInstanceOf[A17])
      case 17 => SealedTrait34._18(a.asInstanceOf[A18])
      case 18 => SealedTrait34._19(a.asInstanceOf[A19])
      case 19 => SealedTrait34._20(a.asInstanceOf[A20])
      case 20 => SealedTrait34._21(a.asInstanceOf[A21])
      case 21 => SealedTrait34._22(a.asInstanceOf[A22])
      case 22 => SealedTrait34._23(a.asInstanceOf[A23])
      case 23 => SealedTrait34._24(a.asInstanceOf[A24])
      case 24 => SealedTrait34._25(a.asInstanceOf[A25])
      case 25 => SealedTrait34._26(a.asInstanceOf[A26])
      case 26 => SealedTrait34._27(a.asInstanceOf[A27])
      case 27 => SealedTrait34._28(a.asInstanceOf[A28])
      case 28 => SealedTrait34._29(a.asInstanceOf[A29])
      case 29 => SealedTrait34._30(a.asInstanceOf[A30])
      case 30 => SealedTrait34._31(a.asInstanceOf[A31])
      case 31 => SealedTrait34._32(a.asInstanceOf[A32])
      case 32 => SealedTrait34._33(a.asInstanceOf[A33])
      case 33 => SealedTrait34._34(a.asInstanceOf[A34])
    }
    def from(s: SealedTrait34[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34]): A = s.value
  }

  implicit def sealedtrait35[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A, A28 <: A, A29 <: A, A30 <: A, A31 <: A, A32 <: A, A33 <: A, A34 <: A, A35 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35)): Shapely[A, SealedTrait35[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35]] = new Shapely[A, SealedTrait35[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35]] {
    def to(a: A): SealedTrait35[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35] = A.ordinal(a) match {
      case 0 => SealedTrait35._1(a.asInstanceOf[A1])
      case 1 => SealedTrait35._2(a.asInstanceOf[A2])
      case 2 => SealedTrait35._3(a.asInstanceOf[A3])
      case 3 => SealedTrait35._4(a.asInstanceOf[A4])
      case 4 => SealedTrait35._5(a.asInstanceOf[A5])
      case 5 => SealedTrait35._6(a.asInstanceOf[A6])
      case 6 => SealedTrait35._7(a.asInstanceOf[A7])
      case 7 => SealedTrait35._8(a.asInstanceOf[A8])
      case 8 => SealedTrait35._9(a.asInstanceOf[A9])
      case 9 => SealedTrait35._10(a.asInstanceOf[A10])
      case 10 => SealedTrait35._11(a.asInstanceOf[A11])
      case 11 => SealedTrait35._12(a.asInstanceOf[A12])
      case 12 => SealedTrait35._13(a.asInstanceOf[A13])
      case 13 => SealedTrait35._14(a.asInstanceOf[A14])
      case 14 => SealedTrait35._15(a.asInstanceOf[A15])
      case 15 => SealedTrait35._16(a.asInstanceOf[A16])
      case 16 => SealedTrait35._17(a.asInstanceOf[A17])
      case 17 => SealedTrait35._18(a.asInstanceOf[A18])
      case 18 => SealedTrait35._19(a.asInstanceOf[A19])
      case 19 => SealedTrait35._20(a.asInstanceOf[A20])
      case 20 => SealedTrait35._21(a.asInstanceOf[A21])
      case 21 => SealedTrait35._22(a.asInstanceOf[A22])
      case 22 => SealedTrait35._23(a.asInstanceOf[A23])
      case 23 => SealedTrait35._24(a.asInstanceOf[A24])
      case 24 => SealedTrait35._25(a.asInstanceOf[A25])
      case 25 => SealedTrait35._26(a.asInstanceOf[A26])
      case 26 => SealedTrait35._27(a.asInstanceOf[A27])
      case 27 => SealedTrait35._28(a.asInstanceOf[A28])
      case 28 => SealedTrait35._29(a.asInstanceOf[A29])
      case 29 => SealedTrait35._30(a.asInstanceOf[A30])
      case 30 => SealedTrait35._31(a.asInstanceOf[A31])
      case 31 => SealedTrait35._32(a.asInstanceOf[A32])
      case 32 => SealedTrait35._33(a.asInstanceOf[A33])
      case 33 => SealedTrait35._34(a.asInstanceOf[A34])
      case 34 => SealedTrait35._35(a.asInstanceOf[A35])
    }
    def from(s: SealedTrait35[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35]): A = s.value
  }

  implicit def sealedtrait36[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A, A28 <: A, A29 <: A, A30 <: A, A31 <: A, A32 <: A, A33 <: A, A34 <: A, A35 <: A, A36 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36)): Shapely[A, SealedTrait36[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36]] = new Shapely[A, SealedTrait36[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36]] {
    def to(a: A): SealedTrait36[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36] = A.ordinal(a) match {
      case 0 => SealedTrait36._1(a.asInstanceOf[A1])
      case 1 => SealedTrait36._2(a.asInstanceOf[A2])
      case 2 => SealedTrait36._3(a.asInstanceOf[A3])
      case 3 => SealedTrait36._4(a.asInstanceOf[A4])
      case 4 => SealedTrait36._5(a.asInstanceOf[A5])
      case 5 => SealedTrait36._6(a.asInstanceOf[A6])
      case 6 => SealedTrait36._7(a.asInstanceOf[A7])
      case 7 => SealedTrait36._8(a.asInstanceOf[A8])
      case 8 => SealedTrait36._9(a.asInstanceOf[A9])
      case 9 => SealedTrait36._10(a.asInstanceOf[A10])
      case 10 => SealedTrait36._11(a.asInstanceOf[A11])
      case 11 => SealedTrait36._12(a.asInstanceOf[A12])
      case 12 => SealedTrait36._13(a.asInstanceOf[A13])
      case 13 => SealedTrait36._14(a.asInstanceOf[A14])
      case 14 => SealedTrait36._15(a.asInstanceOf[A15])
      case 15 => SealedTrait36._16(a.asInstanceOf[A16])
      case 16 => SealedTrait36._17(a.asInstanceOf[A17])
      case 17 => SealedTrait36._18(a.asInstanceOf[A18])
      case 18 => SealedTrait36._19(a.asInstanceOf[A19])
      case 19 => SealedTrait36._20(a.asInstanceOf[A20])
      case 20 => SealedTrait36._21(a.asInstanceOf[A21])
      case 21 => SealedTrait36._22(a.asInstanceOf[A22])
      case 22 => SealedTrait36._23(a.asInstanceOf[A23])
      case 23 => SealedTrait36._24(a.asInstanceOf[A24])
      case 24 => SealedTrait36._25(a.asInstanceOf[A25])
      case 25 => SealedTrait36._26(a.asInstanceOf[A26])
      case 26 => SealedTrait36._27(a.asInstanceOf[A27])
      case 27 => SealedTrait36._28(a.asInstanceOf[A28])
      case 28 => SealedTrait36._29(a.asInstanceOf[A29])
      case 29 => SealedTrait36._30(a.asInstanceOf[A30])
      case 30 => SealedTrait36._31(a.asInstanceOf[A31])
      case 31 => SealedTrait36._32(a.asInstanceOf[A32])
      case 32 => SealedTrait36._33(a.asInstanceOf[A33])
      case 33 => SealedTrait36._34(a.asInstanceOf[A34])
      case 34 => SealedTrait36._35(a.asInstanceOf[A35])
      case 35 => SealedTrait36._36(a.asInstanceOf[A36])
    }
    def from(s: SealedTrait36[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36]): A = s.value
  }

  implicit def sealedtrait37[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A, A28 <: A, A29 <: A, A30 <: A, A31 <: A, A32 <: A, A33 <: A, A34 <: A, A35 <: A, A36 <: A, A37 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37)): Shapely[A, SealedTrait37[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37]] = new Shapely[A, SealedTrait37[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37]] {
    def to(a: A): SealedTrait37[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37] = A.ordinal(a) match {
      case 0 => SealedTrait37._1(a.asInstanceOf[A1])
      case 1 => SealedTrait37._2(a.asInstanceOf[A2])
      case 2 => SealedTrait37._3(a.asInstanceOf[A3])
      case 3 => SealedTrait37._4(a.asInstanceOf[A4])
      case 4 => SealedTrait37._5(a.asInstanceOf[A5])
      case 5 => SealedTrait37._6(a.asInstanceOf[A6])
      case 6 => SealedTrait37._7(a.asInstanceOf[A7])
      case 7 => SealedTrait37._8(a.asInstanceOf[A8])
      case 8 => SealedTrait37._9(a.asInstanceOf[A9])
      case 9 => SealedTrait37._10(a.asInstanceOf[A10])
      case 10 => SealedTrait37._11(a.asInstanceOf[A11])
      case 11 => SealedTrait37._12(a.asInstanceOf[A12])
      case 12 => SealedTrait37._13(a.asInstanceOf[A13])
      case 13 => SealedTrait37._14(a.asInstanceOf[A14])
      case 14 => SealedTrait37._15(a.asInstanceOf[A15])
      case 15 => SealedTrait37._16(a.asInstanceOf[A16])
      case 16 => SealedTrait37._17(a.asInstanceOf[A17])
      case 17 => SealedTrait37._18(a.asInstanceOf[A18])
      case 18 => SealedTrait37._19(a.asInstanceOf[A19])
      case 19 => SealedTrait37._20(a.asInstanceOf[A20])
      case 20 => SealedTrait37._21(a.asInstanceOf[A21])
      case 21 => SealedTrait37._22(a.asInstanceOf[A22])
      case 22 => SealedTrait37._23(a.asInstanceOf[A23])
      case 23 => SealedTrait37._24(a.asInstanceOf[A24])
      case 24 => SealedTrait37._25(a.asInstanceOf[A25])
      case 25 => SealedTrait37._26(a.asInstanceOf[A26])
      case 26 => SealedTrait37._27(a.asInstanceOf[A27])
      case 27 => SealedTrait37._28(a.asInstanceOf[A28])
      case 28 => SealedTrait37._29(a.asInstanceOf[A29])
      case 29 => SealedTrait37._30(a.asInstanceOf[A30])
      case 30 => SealedTrait37._31(a.asInstanceOf[A31])
      case 31 => SealedTrait37._32(a.asInstanceOf[A32])
      case 32 => SealedTrait37._33(a.asInstanceOf[A33])
      case 33 => SealedTrait37._34(a.asInstanceOf[A34])
      case 34 => SealedTrait37._35(a.asInstanceOf[A35])
      case 35 => SealedTrait37._36(a.asInstanceOf[A36])
      case 36 => SealedTrait37._37(a.asInstanceOf[A37])
    }
    def from(s: SealedTrait37[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37]): A = s.value
  }

  implicit def sealedtrait38[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A, A28 <: A, A29 <: A, A30 <: A, A31 <: A, A32 <: A, A33 <: A, A34 <: A, A35 <: A, A36 <: A, A37 <: A, A38 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38)): Shapely[A, SealedTrait38[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38]] = new Shapely[A, SealedTrait38[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38]] {
    def to(a: A): SealedTrait38[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38] = A.ordinal(a) match {
      case 0 => SealedTrait38._1(a.asInstanceOf[A1])
      case 1 => SealedTrait38._2(a.asInstanceOf[A2])
      case 2 => SealedTrait38._3(a.asInstanceOf[A3])
      case 3 => SealedTrait38._4(a.asInstanceOf[A4])
      case 4 => SealedTrait38._5(a.asInstanceOf[A5])
      case 5 => SealedTrait38._6(a.asInstanceOf[A6])
      case 6 => SealedTrait38._7(a.asInstanceOf[A7])
      case 7 => SealedTrait38._8(a.asInstanceOf[A8])
      case 8 => SealedTrait38._9(a.asInstanceOf[A9])
      case 9 => SealedTrait38._10(a.asInstanceOf[A10])
      case 10 => SealedTrait38._11(a.asInstanceOf[A11])
      case 11 => SealedTrait38._12(a.asInstanceOf[A12])
      case 12 => SealedTrait38._13(a.asInstanceOf[A13])
      case 13 => SealedTrait38._14(a.asInstanceOf[A14])
      case 14 => SealedTrait38._15(a.asInstanceOf[A15])
      case 15 => SealedTrait38._16(a.asInstanceOf[A16])
      case 16 => SealedTrait38._17(a.asInstanceOf[A17])
      case 17 => SealedTrait38._18(a.asInstanceOf[A18])
      case 18 => SealedTrait38._19(a.asInstanceOf[A19])
      case 19 => SealedTrait38._20(a.asInstanceOf[A20])
      case 20 => SealedTrait38._21(a.asInstanceOf[A21])
      case 21 => SealedTrait38._22(a.asInstanceOf[A22])
      case 22 => SealedTrait38._23(a.asInstanceOf[A23])
      case 23 => SealedTrait38._24(a.asInstanceOf[A24])
      case 24 => SealedTrait38._25(a.asInstanceOf[A25])
      case 25 => SealedTrait38._26(a.asInstanceOf[A26])
      case 26 => SealedTrait38._27(a.asInstanceOf[A27])
      case 27 => SealedTrait38._28(a.asInstanceOf[A28])
      case 28 => SealedTrait38._29(a.asInstanceOf[A29])
      case 29 => SealedTrait38._30(a.asInstanceOf[A30])
      case 30 => SealedTrait38._31(a.asInstanceOf[A31])
      case 31 => SealedTrait38._32(a.asInstanceOf[A32])
      case 32 => SealedTrait38._33(a.asInstanceOf[A33])
      case 33 => SealedTrait38._34(a.asInstanceOf[A34])
      case 34 => SealedTrait38._35(a.asInstanceOf[A35])
      case 35 => SealedTrait38._36(a.asInstanceOf[A36])
      case 36 => SealedTrait38._37(a.asInstanceOf[A37])
      case 37 => SealedTrait38._38(a.asInstanceOf[A38])
    }
    def from(s: SealedTrait38[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38]): A = s.value
  }

  implicit def sealedtrait39[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A, A28 <: A, A29 <: A, A30 <: A, A31 <: A, A32 <: A, A33 <: A, A34 <: A, A35 <: A, A36 <: A, A37 <: A, A38 <: A, A39 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39)): Shapely[A, SealedTrait39[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39]] = new Shapely[A, SealedTrait39[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39]] {
    def to(a: A): SealedTrait39[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39] = A.ordinal(a) match {
      case 0 => SealedTrait39._1(a.asInstanceOf[A1])
      case 1 => SealedTrait39._2(a.asInstanceOf[A2])
      case 2 => SealedTrait39._3(a.asInstanceOf[A3])
      case 3 => SealedTrait39._4(a.asInstanceOf[A4])
      case 4 => SealedTrait39._5(a.asInstanceOf[A5])
      case 5 => SealedTrait39._6(a.asInstanceOf[A6])
      case 6 => SealedTrait39._7(a.asInstanceOf[A7])
      case 7 => SealedTrait39._8(a.asInstanceOf[A8])
      case 8 => SealedTrait39._9(a.asInstanceOf[A9])
      case 9 => SealedTrait39._10(a.asInstanceOf[A10])
      case 10 => SealedTrait39._11(a.asInstanceOf[A11])
      case 11 => SealedTrait39._12(a.asInstanceOf[A12])
      case 12 => SealedTrait39._13(a.asInstanceOf[A13])
      case 13 => SealedTrait39._14(a.asInstanceOf[A14])
      case 14 => SealedTrait39._15(a.asInstanceOf[A15])
      case 15 => SealedTrait39._16(a.asInstanceOf[A16])
      case 16 => SealedTrait39._17(a.asInstanceOf[A17])
      case 17 => SealedTrait39._18(a.asInstanceOf[A18])
      case 18 => SealedTrait39._19(a.asInstanceOf[A19])
      case 19 => SealedTrait39._20(a.asInstanceOf[A20])
      case 20 => SealedTrait39._21(a.asInstanceOf[A21])
      case 21 => SealedTrait39._22(a.asInstanceOf[A22])
      case 22 => SealedTrait39._23(a.asInstanceOf[A23])
      case 23 => SealedTrait39._24(a.asInstanceOf[A24])
      case 24 => SealedTrait39._25(a.asInstanceOf[A25])
      case 25 => SealedTrait39._26(a.asInstanceOf[A26])
      case 26 => SealedTrait39._27(a.asInstanceOf[A27])
      case 27 => SealedTrait39._28(a.asInstanceOf[A28])
      case 28 => SealedTrait39._29(a.asInstanceOf[A29])
      case 29 => SealedTrait39._30(a.asInstanceOf[A30])
      case 30 => SealedTrait39._31(a.asInstanceOf[A31])
      case 31 => SealedTrait39._32(a.asInstanceOf[A32])
      case 32 => SealedTrait39._33(a.asInstanceOf[A33])
      case 33 => SealedTrait39._34(a.asInstanceOf[A34])
      case 34 => SealedTrait39._35(a.asInstanceOf[A35])
      case 35 => SealedTrait39._36(a.asInstanceOf[A36])
      case 36 => SealedTrait39._37(a.asInstanceOf[A37])
      case 37 => SealedTrait39._38(a.asInstanceOf[A38])
      case 38 => SealedTrait39._39(a.asInstanceOf[A39])
    }
    def from(s: SealedTrait39[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39]): A = s.value
  }

  implicit def sealedtrait40[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A, A28 <: A, A29 <: A, A30 <: A, A31 <: A, A32 <: A, A33 <: A, A34 <: A, A35 <: A, A36 <: A, A37 <: A, A38 <: A, A39 <: A, A40 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40)): Shapely[A, SealedTrait40[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40]] = new Shapely[A, SealedTrait40[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40]] {
    def to(a: A): SealedTrait40[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40] = A.ordinal(a) match {
      case 0 => SealedTrait40._1(a.asInstanceOf[A1])
      case 1 => SealedTrait40._2(a.asInstanceOf[A2])
      case 2 => SealedTrait40._3(a.asInstanceOf[A3])
      case 3 => SealedTrait40._4(a.asInstanceOf[A4])
      case 4 => SealedTrait40._5(a.asInstanceOf[A5])
      case 5 => SealedTrait40._6(a.asInstanceOf[A6])
      case 6 => SealedTrait40._7(a.asInstanceOf[A7])
      case 7 => SealedTrait40._8(a.asInstanceOf[A8])
      case 8 => SealedTrait40._9(a.asInstanceOf[A9])
      case 9 => SealedTrait40._10(a.asInstanceOf[A10])
      case 10 => SealedTrait40._11(a.asInstanceOf[A11])
      case 11 => SealedTrait40._12(a.asInstanceOf[A12])
      case 12 => SealedTrait40._13(a.asInstanceOf[A13])
      case 13 => SealedTrait40._14(a.asInstanceOf[A14])
      case 14 => SealedTrait40._15(a.asInstanceOf[A15])
      case 15 => SealedTrait40._16(a.asInstanceOf[A16])
      case 16 => SealedTrait40._17(a.asInstanceOf[A17])
      case 17 => SealedTrait40._18(a.asInstanceOf[A18])
      case 18 => SealedTrait40._19(a.asInstanceOf[A19])
      case 19 => SealedTrait40._20(a.asInstanceOf[A20])
      case 20 => SealedTrait40._21(a.asInstanceOf[A21])
      case 21 => SealedTrait40._22(a.asInstanceOf[A22])
      case 22 => SealedTrait40._23(a.asInstanceOf[A23])
      case 23 => SealedTrait40._24(a.asInstanceOf[A24])
      case 24 => SealedTrait40._25(a.asInstanceOf[A25])
      case 25 => SealedTrait40._26(a.asInstanceOf[A26])
      case 26 => SealedTrait40._27(a.asInstanceOf[A27])
      case 27 => SealedTrait40._28(a.asInstanceOf[A28])
      case 28 => SealedTrait40._29(a.asInstanceOf[A29])
      case 29 => SealedTrait40._30(a.asInstanceOf[A30])
      case 30 => SealedTrait40._31(a.asInstanceOf[A31])
      case 31 => SealedTrait40._32(a.asInstanceOf[A32])
      case 32 => SealedTrait40._33(a.asInstanceOf[A33])
      case 33 => SealedTrait40._34(a.asInstanceOf[A34])
      case 34 => SealedTrait40._35(a.asInstanceOf[A35])
      case 35 => SealedTrait40._36(a.asInstanceOf[A36])
      case 36 => SealedTrait40._37(a.asInstanceOf[A37])
      case 37 => SealedTrait40._38(a.asInstanceOf[A38])
      case 38 => SealedTrait40._39(a.asInstanceOf[A39])
      case 39 => SealedTrait40._40(a.asInstanceOf[A40])
    }
    def from(s: SealedTrait40[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40]): A = s.value
  }

  implicit def sealedtrait41[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A, A28 <: A, A29 <: A, A30 <: A, A31 <: A, A32 <: A, A33 <: A, A34 <: A, A35 <: A, A36 <: A, A37 <: A, A38 <: A, A39 <: A, A40 <: A, A41 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41)): Shapely[A, SealedTrait41[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41]] = new Shapely[A, SealedTrait41[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41]] {
    def to(a: A): SealedTrait41[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41] = A.ordinal(a) match {
      case 0 => SealedTrait41._1(a.asInstanceOf[A1])
      case 1 => SealedTrait41._2(a.asInstanceOf[A2])
      case 2 => SealedTrait41._3(a.asInstanceOf[A3])
      case 3 => SealedTrait41._4(a.asInstanceOf[A4])
      case 4 => SealedTrait41._5(a.asInstanceOf[A5])
      case 5 => SealedTrait41._6(a.asInstanceOf[A6])
      case 6 => SealedTrait41._7(a.asInstanceOf[A7])
      case 7 => SealedTrait41._8(a.asInstanceOf[A8])
      case 8 => SealedTrait41._9(a.asInstanceOf[A9])
      case 9 => SealedTrait41._10(a.asInstanceOf[A10])
      case 10 => SealedTrait41._11(a.asInstanceOf[A11])
      case 11 => SealedTrait41._12(a.asInstanceOf[A12])
      case 12 => SealedTrait41._13(a.asInstanceOf[A13])
      case 13 => SealedTrait41._14(a.asInstanceOf[A14])
      case 14 => SealedTrait41._15(a.asInstanceOf[A15])
      case 15 => SealedTrait41._16(a.asInstanceOf[A16])
      case 16 => SealedTrait41._17(a.asInstanceOf[A17])
      case 17 => SealedTrait41._18(a.asInstanceOf[A18])
      case 18 => SealedTrait41._19(a.asInstanceOf[A19])
      case 19 => SealedTrait41._20(a.asInstanceOf[A20])
      case 20 => SealedTrait41._21(a.asInstanceOf[A21])
      case 21 => SealedTrait41._22(a.asInstanceOf[A22])
      case 22 => SealedTrait41._23(a.asInstanceOf[A23])
      case 23 => SealedTrait41._24(a.asInstanceOf[A24])
      case 24 => SealedTrait41._25(a.asInstanceOf[A25])
      case 25 => SealedTrait41._26(a.asInstanceOf[A26])
      case 26 => SealedTrait41._27(a.asInstanceOf[A27])
      case 27 => SealedTrait41._28(a.asInstanceOf[A28])
      case 28 => SealedTrait41._29(a.asInstanceOf[A29])
      case 29 => SealedTrait41._30(a.asInstanceOf[A30])
      case 30 => SealedTrait41._31(a.asInstanceOf[A31])
      case 31 => SealedTrait41._32(a.asInstanceOf[A32])
      case 32 => SealedTrait41._33(a.asInstanceOf[A33])
      case 33 => SealedTrait41._34(a.asInstanceOf[A34])
      case 34 => SealedTrait41._35(a.asInstanceOf[A35])
      case 35 => SealedTrait41._36(a.asInstanceOf[A36])
      case 36 => SealedTrait41._37(a.asInstanceOf[A37])
      case 37 => SealedTrait41._38(a.asInstanceOf[A38])
      case 38 => SealedTrait41._39(a.asInstanceOf[A39])
      case 39 => SealedTrait41._40(a.asInstanceOf[A40])
      case 40 => SealedTrait41._41(a.asInstanceOf[A41])
    }
    def from(s: SealedTrait41[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41]): A = s.value
  }

  implicit def sealedtrait42[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A, A28 <: A, A29 <: A, A30 <: A, A31 <: A, A32 <: A, A33 <: A, A34 <: A, A35 <: A, A36 <: A, A37 <: A, A38 <: A, A39 <: A, A40 <: A, A41 <: A, A42 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42)): Shapely[A, SealedTrait42[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42]] = new Shapely[A, SealedTrait42[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42]] {
    def to(a: A): SealedTrait42[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42] = A.ordinal(a) match {
      case 0 => SealedTrait42._1(a.asInstanceOf[A1])
      case 1 => SealedTrait42._2(a.asInstanceOf[A2])
      case 2 => SealedTrait42._3(a.asInstanceOf[A3])
      case 3 => SealedTrait42._4(a.asInstanceOf[A4])
      case 4 => SealedTrait42._5(a.asInstanceOf[A5])
      case 5 => SealedTrait42._6(a.asInstanceOf[A6])
      case 6 => SealedTrait42._7(a.asInstanceOf[A7])
      case 7 => SealedTrait42._8(a.asInstanceOf[A8])
      case 8 => SealedTrait42._9(a.asInstanceOf[A9])
      case 9 => SealedTrait42._10(a.asInstanceOf[A10])
      case 10 => SealedTrait42._11(a.asInstanceOf[A11])
      case 11 => SealedTrait42._12(a.asInstanceOf[A12])
      case 12 => SealedTrait42._13(a.asInstanceOf[A13])
      case 13 => SealedTrait42._14(a.asInstanceOf[A14])
      case 14 => SealedTrait42._15(a.asInstanceOf[A15])
      case 15 => SealedTrait42._16(a.asInstanceOf[A16])
      case 16 => SealedTrait42._17(a.asInstanceOf[A17])
      case 17 => SealedTrait42._18(a.asInstanceOf[A18])
      case 18 => SealedTrait42._19(a.asInstanceOf[A19])
      case 19 => SealedTrait42._20(a.asInstanceOf[A20])
      case 20 => SealedTrait42._21(a.asInstanceOf[A21])
      case 21 => SealedTrait42._22(a.asInstanceOf[A22])
      case 22 => SealedTrait42._23(a.asInstanceOf[A23])
      case 23 => SealedTrait42._24(a.asInstanceOf[A24])
      case 24 => SealedTrait42._25(a.asInstanceOf[A25])
      case 25 => SealedTrait42._26(a.asInstanceOf[A26])
      case 26 => SealedTrait42._27(a.asInstanceOf[A27])
      case 27 => SealedTrait42._28(a.asInstanceOf[A28])
      case 28 => SealedTrait42._29(a.asInstanceOf[A29])
      case 29 => SealedTrait42._30(a.asInstanceOf[A30])
      case 30 => SealedTrait42._31(a.asInstanceOf[A31])
      case 31 => SealedTrait42._32(a.asInstanceOf[A32])
      case 32 => SealedTrait42._33(a.asInstanceOf[A33])
      case 33 => SealedTrait42._34(a.asInstanceOf[A34])
      case 34 => SealedTrait42._35(a.asInstanceOf[A35])
      case 35 => SealedTrait42._36(a.asInstanceOf[A36])
      case 36 => SealedTrait42._37(a.asInstanceOf[A37])
      case 37 => SealedTrait42._38(a.asInstanceOf[A38])
      case 38 => SealedTrait42._39(a.asInstanceOf[A39])
      case 39 => SealedTrait42._40(a.asInstanceOf[A40])
      case 40 => SealedTrait42._41(a.asInstanceOf[A41])
      case 41 => SealedTrait42._42(a.asInstanceOf[A42])
    }
    def from(s: SealedTrait42[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42]): A = s.value
  }

  implicit def sealedtrait43[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A, A28 <: A, A29 <: A, A30 <: A, A31 <: A, A32 <: A, A33 <: A, A34 <: A, A35 <: A, A36 <: A, A37 <: A, A38 <: A, A39 <: A, A40 <: A, A41 <: A, A42 <: A, A43 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43)): Shapely[A, SealedTrait43[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43]] = new Shapely[A, SealedTrait43[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43]] {
    def to(a: A): SealedTrait43[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43] = A.ordinal(a) match {
      case 0 => SealedTrait43._1(a.asInstanceOf[A1])
      case 1 => SealedTrait43._2(a.asInstanceOf[A2])
      case 2 => SealedTrait43._3(a.asInstanceOf[A3])
      case 3 => SealedTrait43._4(a.asInstanceOf[A4])
      case 4 => SealedTrait43._5(a.asInstanceOf[A5])
      case 5 => SealedTrait43._6(a.asInstanceOf[A6])
      case 6 => SealedTrait43._7(a.asInstanceOf[A7])
      case 7 => SealedTrait43._8(a.asInstanceOf[A8])
      case 8 => SealedTrait43._9(a.asInstanceOf[A9])
      case 9 => SealedTrait43._10(a.asInstanceOf[A10])
      case 10 => SealedTrait43._11(a.asInstanceOf[A11])
      case 11 => SealedTrait43._12(a.asInstanceOf[A12])
      case 12 => SealedTrait43._13(a.asInstanceOf[A13])
      case 13 => SealedTrait43._14(a.asInstanceOf[A14])
      case 14 => SealedTrait43._15(a.asInstanceOf[A15])
      case 15 => SealedTrait43._16(a.asInstanceOf[A16])
      case 16 => SealedTrait43._17(a.asInstanceOf[A17])
      case 17 => SealedTrait43._18(a.asInstanceOf[A18])
      case 18 => SealedTrait43._19(a.asInstanceOf[A19])
      case 19 => SealedTrait43._20(a.asInstanceOf[A20])
      case 20 => SealedTrait43._21(a.asInstanceOf[A21])
      case 21 => SealedTrait43._22(a.asInstanceOf[A22])
      case 22 => SealedTrait43._23(a.asInstanceOf[A23])
      case 23 => SealedTrait43._24(a.asInstanceOf[A24])
      case 24 => SealedTrait43._25(a.asInstanceOf[A25])
      case 25 => SealedTrait43._26(a.asInstanceOf[A26])
      case 26 => SealedTrait43._27(a.asInstanceOf[A27])
      case 27 => SealedTrait43._28(a.asInstanceOf[A28])
      case 28 => SealedTrait43._29(a.asInstanceOf[A29])
      case 29 => SealedTrait43._30(a.asInstanceOf[A30])
      case 30 => SealedTrait43._31(a.asInstanceOf[A31])
      case 31 => SealedTrait43._32(a.asInstanceOf[A32])
      case 32 => SealedTrait43._33(a.asInstanceOf[A33])
      case 33 => SealedTrait43._34(a.asInstanceOf[A34])
      case 34 => SealedTrait43._35(a.asInstanceOf[A35])
      case 35 => SealedTrait43._36(a.asInstanceOf[A36])
      case 36 => SealedTrait43._37(a.asInstanceOf[A37])
      case 37 => SealedTrait43._38(a.asInstanceOf[A38])
      case 38 => SealedTrait43._39(a.asInstanceOf[A39])
      case 39 => SealedTrait43._40(a.asInstanceOf[A40])
      case 40 => SealedTrait43._41(a.asInstanceOf[A41])
      case 41 => SealedTrait43._42(a.asInstanceOf[A42])
      case 42 => SealedTrait43._43(a.asInstanceOf[A43])
    }
    def from(s: SealedTrait43[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43]): A = s.value
  }

  implicit def sealedtrait44[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A, A28 <: A, A29 <: A, A30 <: A, A31 <: A, A32 <: A, A33 <: A, A34 <: A, A35 <: A, A36 <: A, A37 <: A, A38 <: A, A39 <: A, A40 <: A, A41 <: A, A42 <: A, A43 <: A, A44 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44)): Shapely[A, SealedTrait44[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44]] = new Shapely[A, SealedTrait44[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44]] {
    def to(a: A): SealedTrait44[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44] = A.ordinal(a) match {
      case 0 => SealedTrait44._1(a.asInstanceOf[A1])
      case 1 => SealedTrait44._2(a.asInstanceOf[A2])
      case 2 => SealedTrait44._3(a.asInstanceOf[A3])
      case 3 => SealedTrait44._4(a.asInstanceOf[A4])
      case 4 => SealedTrait44._5(a.asInstanceOf[A5])
      case 5 => SealedTrait44._6(a.asInstanceOf[A6])
      case 6 => SealedTrait44._7(a.asInstanceOf[A7])
      case 7 => SealedTrait44._8(a.asInstanceOf[A8])
      case 8 => SealedTrait44._9(a.asInstanceOf[A9])
      case 9 => SealedTrait44._10(a.asInstanceOf[A10])
      case 10 => SealedTrait44._11(a.asInstanceOf[A11])
      case 11 => SealedTrait44._12(a.asInstanceOf[A12])
      case 12 => SealedTrait44._13(a.asInstanceOf[A13])
      case 13 => SealedTrait44._14(a.asInstanceOf[A14])
      case 14 => SealedTrait44._15(a.asInstanceOf[A15])
      case 15 => SealedTrait44._16(a.asInstanceOf[A16])
      case 16 => SealedTrait44._17(a.asInstanceOf[A17])
      case 17 => SealedTrait44._18(a.asInstanceOf[A18])
      case 18 => SealedTrait44._19(a.asInstanceOf[A19])
      case 19 => SealedTrait44._20(a.asInstanceOf[A20])
      case 20 => SealedTrait44._21(a.asInstanceOf[A21])
      case 21 => SealedTrait44._22(a.asInstanceOf[A22])
      case 22 => SealedTrait44._23(a.asInstanceOf[A23])
      case 23 => SealedTrait44._24(a.asInstanceOf[A24])
      case 24 => SealedTrait44._25(a.asInstanceOf[A25])
      case 25 => SealedTrait44._26(a.asInstanceOf[A26])
      case 26 => SealedTrait44._27(a.asInstanceOf[A27])
      case 27 => SealedTrait44._28(a.asInstanceOf[A28])
      case 28 => SealedTrait44._29(a.asInstanceOf[A29])
      case 29 => SealedTrait44._30(a.asInstanceOf[A30])
      case 30 => SealedTrait44._31(a.asInstanceOf[A31])
      case 31 => SealedTrait44._32(a.asInstanceOf[A32])
      case 32 => SealedTrait44._33(a.asInstanceOf[A33])
      case 33 => SealedTrait44._34(a.asInstanceOf[A34])
      case 34 => SealedTrait44._35(a.asInstanceOf[A35])
      case 35 => SealedTrait44._36(a.asInstanceOf[A36])
      case 36 => SealedTrait44._37(a.asInstanceOf[A37])
      case 37 => SealedTrait44._38(a.asInstanceOf[A38])
      case 38 => SealedTrait44._39(a.asInstanceOf[A39])
      case 39 => SealedTrait44._40(a.asInstanceOf[A40])
      case 40 => SealedTrait44._41(a.asInstanceOf[A41])
      case 41 => SealedTrait44._42(a.asInstanceOf[A42])
      case 42 => SealedTrait44._43(a.asInstanceOf[A43])
      case 43 => SealedTrait44._44(a.asInstanceOf[A44])
    }
    def from(s: SealedTrait44[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44]): A = s.value
  }

  implicit def sealedtrait45[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A, A28 <: A, A29 <: A, A30 <: A, A31 <: A, A32 <: A, A33 <: A, A34 <: A, A35 <: A, A36 <: A, A37 <: A, A38 <: A, A39 <: A, A40 <: A, A41 <: A, A42 <: A, A43 <: A, A44 <: A, A45 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45)): Shapely[A, SealedTrait45[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45]] = new Shapely[A, SealedTrait45[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45]] {
    def to(a: A): SealedTrait45[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45] = A.ordinal(a) match {
      case 0 => SealedTrait45._1(a.asInstanceOf[A1])
      case 1 => SealedTrait45._2(a.asInstanceOf[A2])
      case 2 => SealedTrait45._3(a.asInstanceOf[A3])
      case 3 => SealedTrait45._4(a.asInstanceOf[A4])
      case 4 => SealedTrait45._5(a.asInstanceOf[A5])
      case 5 => SealedTrait45._6(a.asInstanceOf[A6])
      case 6 => SealedTrait45._7(a.asInstanceOf[A7])
      case 7 => SealedTrait45._8(a.asInstanceOf[A8])
      case 8 => SealedTrait45._9(a.asInstanceOf[A9])
      case 9 => SealedTrait45._10(a.asInstanceOf[A10])
      case 10 => SealedTrait45._11(a.asInstanceOf[A11])
      case 11 => SealedTrait45._12(a.asInstanceOf[A12])
      case 12 => SealedTrait45._13(a.asInstanceOf[A13])
      case 13 => SealedTrait45._14(a.asInstanceOf[A14])
      case 14 => SealedTrait45._15(a.asInstanceOf[A15])
      case 15 => SealedTrait45._16(a.asInstanceOf[A16])
      case 16 => SealedTrait45._17(a.asInstanceOf[A17])
      case 17 => SealedTrait45._18(a.asInstanceOf[A18])
      case 18 => SealedTrait45._19(a.asInstanceOf[A19])
      case 19 => SealedTrait45._20(a.asInstanceOf[A20])
      case 20 => SealedTrait45._21(a.asInstanceOf[A21])
      case 21 => SealedTrait45._22(a.asInstanceOf[A22])
      case 22 => SealedTrait45._23(a.asInstanceOf[A23])
      case 23 => SealedTrait45._24(a.asInstanceOf[A24])
      case 24 => SealedTrait45._25(a.asInstanceOf[A25])
      case 25 => SealedTrait45._26(a.asInstanceOf[A26])
      case 26 => SealedTrait45._27(a.asInstanceOf[A27])
      case 27 => SealedTrait45._28(a.asInstanceOf[A28])
      case 28 => SealedTrait45._29(a.asInstanceOf[A29])
      case 29 => SealedTrait45._30(a.asInstanceOf[A30])
      case 30 => SealedTrait45._31(a.asInstanceOf[A31])
      case 31 => SealedTrait45._32(a.asInstanceOf[A32])
      case 32 => SealedTrait45._33(a.asInstanceOf[A33])
      case 33 => SealedTrait45._34(a.asInstanceOf[A34])
      case 34 => SealedTrait45._35(a.asInstanceOf[A35])
      case 35 => SealedTrait45._36(a.asInstanceOf[A36])
      case 36 => SealedTrait45._37(a.asInstanceOf[A37])
      case 37 => SealedTrait45._38(a.asInstanceOf[A38])
      case 38 => SealedTrait45._39(a.asInstanceOf[A39])
      case 39 => SealedTrait45._40(a.asInstanceOf[A40])
      case 40 => SealedTrait45._41(a.asInstanceOf[A41])
      case 41 => SealedTrait45._42(a.asInstanceOf[A42])
      case 42 => SealedTrait45._43(a.asInstanceOf[A43])
      case 43 => SealedTrait45._44(a.asInstanceOf[A44])
      case 44 => SealedTrait45._45(a.asInstanceOf[A45])
    }
    def from(s: SealedTrait45[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45]): A = s.value
  }

  implicit def sealedtrait46[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A, A28 <: A, A29 <: A, A30 <: A, A31 <: A, A32 <: A, A33 <: A, A34 <: A, A35 <: A, A36 <: A, A37 <: A, A38 <: A, A39 <: A, A40 <: A, A41 <: A, A42 <: A, A43 <: A, A44 <: A, A45 <: A, A46 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46)): Shapely[A, SealedTrait46[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46]] = new Shapely[A, SealedTrait46[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46]] {
    def to(a: A): SealedTrait46[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46] = A.ordinal(a) match {
      case 0 => SealedTrait46._1(a.asInstanceOf[A1])
      case 1 => SealedTrait46._2(a.asInstanceOf[A2])
      case 2 => SealedTrait46._3(a.asInstanceOf[A3])
      case 3 => SealedTrait46._4(a.asInstanceOf[A4])
      case 4 => SealedTrait46._5(a.asInstanceOf[A5])
      case 5 => SealedTrait46._6(a.asInstanceOf[A6])
      case 6 => SealedTrait46._7(a.asInstanceOf[A7])
      case 7 => SealedTrait46._8(a.asInstanceOf[A8])
      case 8 => SealedTrait46._9(a.asInstanceOf[A9])
      case 9 => SealedTrait46._10(a.asInstanceOf[A10])
      case 10 => SealedTrait46._11(a.asInstanceOf[A11])
      case 11 => SealedTrait46._12(a.asInstanceOf[A12])
      case 12 => SealedTrait46._13(a.asInstanceOf[A13])
      case 13 => SealedTrait46._14(a.asInstanceOf[A14])
      case 14 => SealedTrait46._15(a.asInstanceOf[A15])
      case 15 => SealedTrait46._16(a.asInstanceOf[A16])
      case 16 => SealedTrait46._17(a.asInstanceOf[A17])
      case 17 => SealedTrait46._18(a.asInstanceOf[A18])
      case 18 => SealedTrait46._19(a.asInstanceOf[A19])
      case 19 => SealedTrait46._20(a.asInstanceOf[A20])
      case 20 => SealedTrait46._21(a.asInstanceOf[A21])
      case 21 => SealedTrait46._22(a.asInstanceOf[A22])
      case 22 => SealedTrait46._23(a.asInstanceOf[A23])
      case 23 => SealedTrait46._24(a.asInstanceOf[A24])
      case 24 => SealedTrait46._25(a.asInstanceOf[A25])
      case 25 => SealedTrait46._26(a.asInstanceOf[A26])
      case 26 => SealedTrait46._27(a.asInstanceOf[A27])
      case 27 => SealedTrait46._28(a.asInstanceOf[A28])
      case 28 => SealedTrait46._29(a.asInstanceOf[A29])
      case 29 => SealedTrait46._30(a.asInstanceOf[A30])
      case 30 => SealedTrait46._31(a.asInstanceOf[A31])
      case 31 => SealedTrait46._32(a.asInstanceOf[A32])
      case 32 => SealedTrait46._33(a.asInstanceOf[A33])
      case 33 => SealedTrait46._34(a.asInstanceOf[A34])
      case 34 => SealedTrait46._35(a.asInstanceOf[A35])
      case 35 => SealedTrait46._36(a.asInstanceOf[A36])
      case 36 => SealedTrait46._37(a.asInstanceOf[A37])
      case 37 => SealedTrait46._38(a.asInstanceOf[A38])
      case 38 => SealedTrait46._39(a.asInstanceOf[A39])
      case 39 => SealedTrait46._40(a.asInstanceOf[A40])
      case 40 => SealedTrait46._41(a.asInstanceOf[A41])
      case 41 => SealedTrait46._42(a.asInstanceOf[A42])
      case 42 => SealedTrait46._43(a.asInstanceOf[A43])
      case 43 => SealedTrait46._44(a.asInstanceOf[A44])
      case 44 => SealedTrait46._45(a.asInstanceOf[A45])
      case 45 => SealedTrait46._46(a.asInstanceOf[A46])
    }
    def from(s: SealedTrait46[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46]): A = s.value
  }

  implicit def sealedtrait47[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A, A28 <: A, A29 <: A, A30 <: A, A31 <: A, A32 <: A, A33 <: A, A34 <: A, A35 <: A, A36 <: A, A37 <: A, A38 <: A, A39 <: A, A40 <: A, A41 <: A, A42 <: A, A43 <: A, A44 <: A, A45 <: A, A46 <: A, A47 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47)): Shapely[A, SealedTrait47[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47]] = new Shapely[A, SealedTrait47[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47]] {
    def to(a: A): SealedTrait47[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47] = A.ordinal(a) match {
      case 0 => SealedTrait47._1(a.asInstanceOf[A1])
      case 1 => SealedTrait47._2(a.asInstanceOf[A2])
      case 2 => SealedTrait47._3(a.asInstanceOf[A3])
      case 3 => SealedTrait47._4(a.asInstanceOf[A4])
      case 4 => SealedTrait47._5(a.asInstanceOf[A5])
      case 5 => SealedTrait47._6(a.asInstanceOf[A6])
      case 6 => SealedTrait47._7(a.asInstanceOf[A7])
      case 7 => SealedTrait47._8(a.asInstanceOf[A8])
      case 8 => SealedTrait47._9(a.asInstanceOf[A9])
      case 9 => SealedTrait47._10(a.asInstanceOf[A10])
      case 10 => SealedTrait47._11(a.asInstanceOf[A11])
      case 11 => SealedTrait47._12(a.asInstanceOf[A12])
      case 12 => SealedTrait47._13(a.asInstanceOf[A13])
      case 13 => SealedTrait47._14(a.asInstanceOf[A14])
      case 14 => SealedTrait47._15(a.asInstanceOf[A15])
      case 15 => SealedTrait47._16(a.asInstanceOf[A16])
      case 16 => SealedTrait47._17(a.asInstanceOf[A17])
      case 17 => SealedTrait47._18(a.asInstanceOf[A18])
      case 18 => SealedTrait47._19(a.asInstanceOf[A19])
      case 19 => SealedTrait47._20(a.asInstanceOf[A20])
      case 20 => SealedTrait47._21(a.asInstanceOf[A21])
      case 21 => SealedTrait47._22(a.asInstanceOf[A22])
      case 22 => SealedTrait47._23(a.asInstanceOf[A23])
      case 23 => SealedTrait47._24(a.asInstanceOf[A24])
      case 24 => SealedTrait47._25(a.asInstanceOf[A25])
      case 25 => SealedTrait47._26(a.asInstanceOf[A26])
      case 26 => SealedTrait47._27(a.asInstanceOf[A27])
      case 27 => SealedTrait47._28(a.asInstanceOf[A28])
      case 28 => SealedTrait47._29(a.asInstanceOf[A29])
      case 29 => SealedTrait47._30(a.asInstanceOf[A30])
      case 30 => SealedTrait47._31(a.asInstanceOf[A31])
      case 31 => SealedTrait47._32(a.asInstanceOf[A32])
      case 32 => SealedTrait47._33(a.asInstanceOf[A33])
      case 33 => SealedTrait47._34(a.asInstanceOf[A34])
      case 34 => SealedTrait47._35(a.asInstanceOf[A35])
      case 35 => SealedTrait47._36(a.asInstanceOf[A36])
      case 36 => SealedTrait47._37(a.asInstanceOf[A37])
      case 37 => SealedTrait47._38(a.asInstanceOf[A38])
      case 38 => SealedTrait47._39(a.asInstanceOf[A39])
      case 39 => SealedTrait47._40(a.asInstanceOf[A40])
      case 40 => SealedTrait47._41(a.asInstanceOf[A41])
      case 41 => SealedTrait47._42(a.asInstanceOf[A42])
      case 42 => SealedTrait47._43(a.asInstanceOf[A43])
      case 43 => SealedTrait47._44(a.asInstanceOf[A44])
      case 44 => SealedTrait47._45(a.asInstanceOf[A45])
      case 45 => SealedTrait47._46(a.asInstanceOf[A46])
      case 46 => SealedTrait47._47(a.asInstanceOf[A47])
    }
    def from(s: SealedTrait47[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47]): A = s.value
  }

  implicit def sealedtrait48[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A, A28 <: A, A29 <: A, A30 <: A, A31 <: A, A32 <: A, A33 <: A, A34 <: A, A35 <: A, A36 <: A, A37 <: A, A38 <: A, A39 <: A, A40 <: A, A41 <: A, A42 <: A, A43 <: A, A44 <: A, A45 <: A, A46 <: A, A47 <: A, A48 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48)): Shapely[A, SealedTrait48[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48]] = new Shapely[A, SealedTrait48[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48]] {
    def to(a: A): SealedTrait48[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48] = A.ordinal(a) match {
      case 0 => SealedTrait48._1(a.asInstanceOf[A1])
      case 1 => SealedTrait48._2(a.asInstanceOf[A2])
      case 2 => SealedTrait48._3(a.asInstanceOf[A3])
      case 3 => SealedTrait48._4(a.asInstanceOf[A4])
      case 4 => SealedTrait48._5(a.asInstanceOf[A5])
      case 5 => SealedTrait48._6(a.asInstanceOf[A6])
      case 6 => SealedTrait48._7(a.asInstanceOf[A7])
      case 7 => SealedTrait48._8(a.asInstanceOf[A8])
      case 8 => SealedTrait48._9(a.asInstanceOf[A9])
      case 9 => SealedTrait48._10(a.asInstanceOf[A10])
      case 10 => SealedTrait48._11(a.asInstanceOf[A11])
      case 11 => SealedTrait48._12(a.asInstanceOf[A12])
      case 12 => SealedTrait48._13(a.asInstanceOf[A13])
      case 13 => SealedTrait48._14(a.asInstanceOf[A14])
      case 14 => SealedTrait48._15(a.asInstanceOf[A15])
      case 15 => SealedTrait48._16(a.asInstanceOf[A16])
      case 16 => SealedTrait48._17(a.asInstanceOf[A17])
      case 17 => SealedTrait48._18(a.asInstanceOf[A18])
      case 18 => SealedTrait48._19(a.asInstanceOf[A19])
      case 19 => SealedTrait48._20(a.asInstanceOf[A20])
      case 20 => SealedTrait48._21(a.asInstanceOf[A21])
      case 21 => SealedTrait48._22(a.asInstanceOf[A22])
      case 22 => SealedTrait48._23(a.asInstanceOf[A23])
      case 23 => SealedTrait48._24(a.asInstanceOf[A24])
      case 24 => SealedTrait48._25(a.asInstanceOf[A25])
      case 25 => SealedTrait48._26(a.asInstanceOf[A26])
      case 26 => SealedTrait48._27(a.asInstanceOf[A27])
      case 27 => SealedTrait48._28(a.asInstanceOf[A28])
      case 28 => SealedTrait48._29(a.asInstanceOf[A29])
      case 29 => SealedTrait48._30(a.asInstanceOf[A30])
      case 30 => SealedTrait48._31(a.asInstanceOf[A31])
      case 31 => SealedTrait48._32(a.asInstanceOf[A32])
      case 32 => SealedTrait48._33(a.asInstanceOf[A33])
      case 33 => SealedTrait48._34(a.asInstanceOf[A34])
      case 34 => SealedTrait48._35(a.asInstanceOf[A35])
      case 35 => SealedTrait48._36(a.asInstanceOf[A36])
      case 36 => SealedTrait48._37(a.asInstanceOf[A37])
      case 37 => SealedTrait48._38(a.asInstanceOf[A38])
      case 38 => SealedTrait48._39(a.asInstanceOf[A39])
      case 39 => SealedTrait48._40(a.asInstanceOf[A40])
      case 40 => SealedTrait48._41(a.asInstanceOf[A41])
      case 41 => SealedTrait48._42(a.asInstanceOf[A42])
      case 42 => SealedTrait48._43(a.asInstanceOf[A43])
      case 43 => SealedTrait48._44(a.asInstanceOf[A44])
      case 44 => SealedTrait48._45(a.asInstanceOf[A45])
      case 45 => SealedTrait48._46(a.asInstanceOf[A46])
      case 46 => SealedTrait48._47(a.asInstanceOf[A47])
      case 47 => SealedTrait48._48(a.asInstanceOf[A48])
    }
    def from(s: SealedTrait48[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48]): A = s.value
  }

  implicit def sealedtrait49[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A, A28 <: A, A29 <: A, A30 <: A, A31 <: A, A32 <: A, A33 <: A, A34 <: A, A35 <: A, A36 <: A, A37 <: A, A38 <: A, A39 <: A, A40 <: A, A41 <: A, A42 <: A, A43 <: A, A44 <: A, A45 <: A, A46 <: A, A47 <: A, A48 <: A, A49 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49)): Shapely[A, SealedTrait49[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49]] = new Shapely[A, SealedTrait49[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49]] {
    def to(a: A): SealedTrait49[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49] = A.ordinal(a) match {
      case 0 => SealedTrait49._1(a.asInstanceOf[A1])
      case 1 => SealedTrait49._2(a.asInstanceOf[A2])
      case 2 => SealedTrait49._3(a.asInstanceOf[A3])
      case 3 => SealedTrait49._4(a.asInstanceOf[A4])
      case 4 => SealedTrait49._5(a.asInstanceOf[A5])
      case 5 => SealedTrait49._6(a.asInstanceOf[A6])
      case 6 => SealedTrait49._7(a.asInstanceOf[A7])
      case 7 => SealedTrait49._8(a.asInstanceOf[A8])
      case 8 => SealedTrait49._9(a.asInstanceOf[A9])
      case 9 => SealedTrait49._10(a.asInstanceOf[A10])
      case 10 => SealedTrait49._11(a.asInstanceOf[A11])
      case 11 => SealedTrait49._12(a.asInstanceOf[A12])
      case 12 => SealedTrait49._13(a.asInstanceOf[A13])
      case 13 => SealedTrait49._14(a.asInstanceOf[A14])
      case 14 => SealedTrait49._15(a.asInstanceOf[A15])
      case 15 => SealedTrait49._16(a.asInstanceOf[A16])
      case 16 => SealedTrait49._17(a.asInstanceOf[A17])
      case 17 => SealedTrait49._18(a.asInstanceOf[A18])
      case 18 => SealedTrait49._19(a.asInstanceOf[A19])
      case 19 => SealedTrait49._20(a.asInstanceOf[A20])
      case 20 => SealedTrait49._21(a.asInstanceOf[A21])
      case 21 => SealedTrait49._22(a.asInstanceOf[A22])
      case 22 => SealedTrait49._23(a.asInstanceOf[A23])
      case 23 => SealedTrait49._24(a.asInstanceOf[A24])
      case 24 => SealedTrait49._25(a.asInstanceOf[A25])
      case 25 => SealedTrait49._26(a.asInstanceOf[A26])
      case 26 => SealedTrait49._27(a.asInstanceOf[A27])
      case 27 => SealedTrait49._28(a.asInstanceOf[A28])
      case 28 => SealedTrait49._29(a.asInstanceOf[A29])
      case 29 => SealedTrait49._30(a.asInstanceOf[A30])
      case 30 => SealedTrait49._31(a.asInstanceOf[A31])
      case 31 => SealedTrait49._32(a.asInstanceOf[A32])
      case 32 => SealedTrait49._33(a.asInstanceOf[A33])
      case 33 => SealedTrait49._34(a.asInstanceOf[A34])
      case 34 => SealedTrait49._35(a.asInstanceOf[A35])
      case 35 => SealedTrait49._36(a.asInstanceOf[A36])
      case 36 => SealedTrait49._37(a.asInstanceOf[A37])
      case 37 => SealedTrait49._38(a.asInstanceOf[A38])
      case 38 => SealedTrait49._39(a.asInstanceOf[A39])
      case 39 => SealedTrait49._40(a.asInstanceOf[A40])
      case 40 => SealedTrait49._41(a.asInstanceOf[A41])
      case 41 => SealedTrait49._42(a.asInstanceOf[A42])
      case 42 => SealedTrait49._43(a.asInstanceOf[A43])
      case 43 => SealedTrait49._44(a.asInstanceOf[A44])
      case 44 => SealedTrait49._45(a.asInstanceOf[A45])
      case 45 => SealedTrait49._46(a.asInstanceOf[A46])
      case 46 => SealedTrait49._47(a.asInstanceOf[A47])
      case 47 => SealedTrait49._48(a.asInstanceOf[A48])
      case 48 => SealedTrait49._49(a.asInstanceOf[A49])
    }
    def from(s: SealedTrait49[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49]): A = s.value
  }

  implicit def sealedtrait50[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A, A28 <: A, A29 <: A, A30 <: A, A31 <: A, A32 <: A, A33 <: A, A34 <: A, A35 <: A, A36 <: A, A37 <: A, A38 <: A, A39 <: A, A40 <: A, A41 <: A, A42 <: A, A43 <: A, A44 <: A, A45 <: A, A46 <: A, A47 <: A, A48 <: A, A49 <: A, A50 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50)): Shapely[A, SealedTrait50[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50]] = new Shapely[A, SealedTrait50[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50]] {
    def to(a: A): SealedTrait50[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50] = A.ordinal(a) match {
      case 0 => SealedTrait50._1(a.asInstanceOf[A1])
      case 1 => SealedTrait50._2(a.asInstanceOf[A2])
      case 2 => SealedTrait50._3(a.asInstanceOf[A3])
      case 3 => SealedTrait50._4(a.asInstanceOf[A4])
      case 4 => SealedTrait50._5(a.asInstanceOf[A5])
      case 5 => SealedTrait50._6(a.asInstanceOf[A6])
      case 6 => SealedTrait50._7(a.asInstanceOf[A7])
      case 7 => SealedTrait50._8(a.asInstanceOf[A8])
      case 8 => SealedTrait50._9(a.asInstanceOf[A9])
      case 9 => SealedTrait50._10(a.asInstanceOf[A10])
      case 10 => SealedTrait50._11(a.asInstanceOf[A11])
      case 11 => SealedTrait50._12(a.asInstanceOf[A12])
      case 12 => SealedTrait50._13(a.asInstanceOf[A13])
      case 13 => SealedTrait50._14(a.asInstanceOf[A14])
      case 14 => SealedTrait50._15(a.asInstanceOf[A15])
      case 15 => SealedTrait50._16(a.asInstanceOf[A16])
      case 16 => SealedTrait50._17(a.asInstanceOf[A17])
      case 17 => SealedTrait50._18(a.asInstanceOf[A18])
      case 18 => SealedTrait50._19(a.asInstanceOf[A19])
      case 19 => SealedTrait50._20(a.asInstanceOf[A20])
      case 20 => SealedTrait50._21(a.asInstanceOf[A21])
      case 21 => SealedTrait50._22(a.asInstanceOf[A22])
      case 22 => SealedTrait50._23(a.asInstanceOf[A23])
      case 23 => SealedTrait50._24(a.asInstanceOf[A24])
      case 24 => SealedTrait50._25(a.asInstanceOf[A25])
      case 25 => SealedTrait50._26(a.asInstanceOf[A26])
      case 26 => SealedTrait50._27(a.asInstanceOf[A27])
      case 27 => SealedTrait50._28(a.asInstanceOf[A28])
      case 28 => SealedTrait50._29(a.asInstanceOf[A29])
      case 29 => SealedTrait50._30(a.asInstanceOf[A30])
      case 30 => SealedTrait50._31(a.asInstanceOf[A31])
      case 31 => SealedTrait50._32(a.asInstanceOf[A32])
      case 32 => SealedTrait50._33(a.asInstanceOf[A33])
      case 33 => SealedTrait50._34(a.asInstanceOf[A34])
      case 34 => SealedTrait50._35(a.asInstanceOf[A35])
      case 35 => SealedTrait50._36(a.asInstanceOf[A36])
      case 36 => SealedTrait50._37(a.asInstanceOf[A37])
      case 37 => SealedTrait50._38(a.asInstanceOf[A38])
      case 38 => SealedTrait50._39(a.asInstanceOf[A39])
      case 39 => SealedTrait50._40(a.asInstanceOf[A40])
      case 40 => SealedTrait50._41(a.asInstanceOf[A41])
      case 41 => SealedTrait50._42(a.asInstanceOf[A42])
      case 42 => SealedTrait50._43(a.asInstanceOf[A43])
      case 43 => SealedTrait50._44(a.asInstanceOf[A44])
      case 44 => SealedTrait50._45(a.asInstanceOf[A45])
      case 45 => SealedTrait50._46(a.asInstanceOf[A46])
      case 46 => SealedTrait50._47(a.asInstanceOf[A47])
      case 47 => SealedTrait50._48(a.asInstanceOf[A48])
      case 48 => SealedTrait50._49(a.asInstanceOf[A49])
      case 49 => SealedTrait50._50(a.asInstanceOf[A50])
    }
    def from(s: SealedTrait50[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50]): A = s.value
  }

  implicit def sealedtrait51[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A, A28 <: A, A29 <: A, A30 <: A, A31 <: A, A32 <: A, A33 <: A, A34 <: A, A35 <: A, A36 <: A, A37 <: A, A38 <: A, A39 <: A, A40 <: A, A41 <: A, A42 <: A, A43 <: A, A44 <: A, A45 <: A, A46 <: A, A47 <: A, A48 <: A, A49 <: A, A50 <: A, A51 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51)): Shapely[A, SealedTrait51[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51]] = new Shapely[A, SealedTrait51[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51]] {
    def to(a: A): SealedTrait51[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51] = A.ordinal(a) match {
      case 0 => SealedTrait51._1(a.asInstanceOf[A1])
      case 1 => SealedTrait51._2(a.asInstanceOf[A2])
      case 2 => SealedTrait51._3(a.asInstanceOf[A3])
      case 3 => SealedTrait51._4(a.asInstanceOf[A4])
      case 4 => SealedTrait51._5(a.asInstanceOf[A5])
      case 5 => SealedTrait51._6(a.asInstanceOf[A6])
      case 6 => SealedTrait51._7(a.asInstanceOf[A7])
      case 7 => SealedTrait51._8(a.asInstanceOf[A8])
      case 8 => SealedTrait51._9(a.asInstanceOf[A9])
      case 9 => SealedTrait51._10(a.asInstanceOf[A10])
      case 10 => SealedTrait51._11(a.asInstanceOf[A11])
      case 11 => SealedTrait51._12(a.asInstanceOf[A12])
      case 12 => SealedTrait51._13(a.asInstanceOf[A13])
      case 13 => SealedTrait51._14(a.asInstanceOf[A14])
      case 14 => SealedTrait51._15(a.asInstanceOf[A15])
      case 15 => SealedTrait51._16(a.asInstanceOf[A16])
      case 16 => SealedTrait51._17(a.asInstanceOf[A17])
      case 17 => SealedTrait51._18(a.asInstanceOf[A18])
      case 18 => SealedTrait51._19(a.asInstanceOf[A19])
      case 19 => SealedTrait51._20(a.asInstanceOf[A20])
      case 20 => SealedTrait51._21(a.asInstanceOf[A21])
      case 21 => SealedTrait51._22(a.asInstanceOf[A22])
      case 22 => SealedTrait51._23(a.asInstanceOf[A23])
      case 23 => SealedTrait51._24(a.asInstanceOf[A24])
      case 24 => SealedTrait51._25(a.asInstanceOf[A25])
      case 25 => SealedTrait51._26(a.asInstanceOf[A26])
      case 26 => SealedTrait51._27(a.asInstanceOf[A27])
      case 27 => SealedTrait51._28(a.asInstanceOf[A28])
      case 28 => SealedTrait51._29(a.asInstanceOf[A29])
      case 29 => SealedTrait51._30(a.asInstanceOf[A30])
      case 30 => SealedTrait51._31(a.asInstanceOf[A31])
      case 31 => SealedTrait51._32(a.asInstanceOf[A32])
      case 32 => SealedTrait51._33(a.asInstanceOf[A33])
      case 33 => SealedTrait51._34(a.asInstanceOf[A34])
      case 34 => SealedTrait51._35(a.asInstanceOf[A35])
      case 35 => SealedTrait51._36(a.asInstanceOf[A36])
      case 36 => SealedTrait51._37(a.asInstanceOf[A37])
      case 37 => SealedTrait51._38(a.asInstanceOf[A38])
      case 38 => SealedTrait51._39(a.asInstanceOf[A39])
      case 39 => SealedTrait51._40(a.asInstanceOf[A40])
      case 40 => SealedTrait51._41(a.asInstanceOf[A41])
      case 41 => SealedTrait51._42(a.asInstanceOf[A42])
      case 42 => SealedTrait51._43(a.asInstanceOf[A43])
      case 43 => SealedTrait51._44(a.asInstanceOf[A44])
      case 44 => SealedTrait51._45(a.asInstanceOf[A45])
      case 45 => SealedTrait51._46(a.asInstanceOf[A46])
      case 46 => SealedTrait51._47(a.asInstanceOf[A47])
      case 47 => SealedTrait51._48(a.asInstanceOf[A48])
      case 48 => SealedTrait51._49(a.asInstanceOf[A49])
      case 49 => SealedTrait51._50(a.asInstanceOf[A50])
      case 50 => SealedTrait51._51(a.asInstanceOf[A51])
    }
    def from(s: SealedTrait51[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51]): A = s.value
  }

  implicit def sealedtrait52[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A, A28 <: A, A29 <: A, A30 <: A, A31 <: A, A32 <: A, A33 <: A, A34 <: A, A35 <: A, A36 <: A, A37 <: A, A38 <: A, A39 <: A, A40 <: A, A41 <: A, A42 <: A, A43 <: A, A44 <: A, A45 <: A, A46 <: A, A47 <: A, A48 <: A, A49 <: A, A50 <: A, A51 <: A, A52 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52)): Shapely[A, SealedTrait52[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52]] = new Shapely[A, SealedTrait52[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52]] {
    def to(a: A): SealedTrait52[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52] = A.ordinal(a) match {
      case 0 => SealedTrait52._1(a.asInstanceOf[A1])
      case 1 => SealedTrait52._2(a.asInstanceOf[A2])
      case 2 => SealedTrait52._3(a.asInstanceOf[A3])
      case 3 => SealedTrait52._4(a.asInstanceOf[A4])
      case 4 => SealedTrait52._5(a.asInstanceOf[A5])
      case 5 => SealedTrait52._6(a.asInstanceOf[A6])
      case 6 => SealedTrait52._7(a.asInstanceOf[A7])
      case 7 => SealedTrait52._8(a.asInstanceOf[A8])
      case 8 => SealedTrait52._9(a.asInstanceOf[A9])
      case 9 => SealedTrait52._10(a.asInstanceOf[A10])
      case 10 => SealedTrait52._11(a.asInstanceOf[A11])
      case 11 => SealedTrait52._12(a.asInstanceOf[A12])
      case 12 => SealedTrait52._13(a.asInstanceOf[A13])
      case 13 => SealedTrait52._14(a.asInstanceOf[A14])
      case 14 => SealedTrait52._15(a.asInstanceOf[A15])
      case 15 => SealedTrait52._16(a.asInstanceOf[A16])
      case 16 => SealedTrait52._17(a.asInstanceOf[A17])
      case 17 => SealedTrait52._18(a.asInstanceOf[A18])
      case 18 => SealedTrait52._19(a.asInstanceOf[A19])
      case 19 => SealedTrait52._20(a.asInstanceOf[A20])
      case 20 => SealedTrait52._21(a.asInstanceOf[A21])
      case 21 => SealedTrait52._22(a.asInstanceOf[A22])
      case 22 => SealedTrait52._23(a.asInstanceOf[A23])
      case 23 => SealedTrait52._24(a.asInstanceOf[A24])
      case 24 => SealedTrait52._25(a.asInstanceOf[A25])
      case 25 => SealedTrait52._26(a.asInstanceOf[A26])
      case 26 => SealedTrait52._27(a.asInstanceOf[A27])
      case 27 => SealedTrait52._28(a.asInstanceOf[A28])
      case 28 => SealedTrait52._29(a.asInstanceOf[A29])
      case 29 => SealedTrait52._30(a.asInstanceOf[A30])
      case 30 => SealedTrait52._31(a.asInstanceOf[A31])
      case 31 => SealedTrait52._32(a.asInstanceOf[A32])
      case 32 => SealedTrait52._33(a.asInstanceOf[A33])
      case 33 => SealedTrait52._34(a.asInstanceOf[A34])
      case 34 => SealedTrait52._35(a.asInstanceOf[A35])
      case 35 => SealedTrait52._36(a.asInstanceOf[A36])
      case 36 => SealedTrait52._37(a.asInstanceOf[A37])
      case 37 => SealedTrait52._38(a.asInstanceOf[A38])
      case 38 => SealedTrait52._39(a.asInstanceOf[A39])
      case 39 => SealedTrait52._40(a.asInstanceOf[A40])
      case 40 => SealedTrait52._41(a.asInstanceOf[A41])
      case 41 => SealedTrait52._42(a.asInstanceOf[A42])
      case 42 => SealedTrait52._43(a.asInstanceOf[A43])
      case 43 => SealedTrait52._44(a.asInstanceOf[A44])
      case 44 => SealedTrait52._45(a.asInstanceOf[A45])
      case 45 => SealedTrait52._46(a.asInstanceOf[A46])
      case 46 => SealedTrait52._47(a.asInstanceOf[A47])
      case 47 => SealedTrait52._48(a.asInstanceOf[A48])
      case 48 => SealedTrait52._49(a.asInstanceOf[A49])
      case 49 => SealedTrait52._50(a.asInstanceOf[A50])
      case 50 => SealedTrait52._51(a.asInstanceOf[A51])
      case 51 => SealedTrait52._52(a.asInstanceOf[A52])
    }
    def from(s: SealedTrait52[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52]): A = s.value
  }

  implicit def sealedtrait53[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A, A28 <: A, A29 <: A, A30 <: A, A31 <: A, A32 <: A, A33 <: A, A34 <: A, A35 <: A, A36 <: A, A37 <: A, A38 <: A, A39 <: A, A40 <: A, A41 <: A, A42 <: A, A43 <: A, A44 <: A, A45 <: A, A46 <: A, A47 <: A, A48 <: A, A49 <: A, A50 <: A, A51 <: A, A52 <: A, A53 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53)): Shapely[A, SealedTrait53[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53]] = new Shapely[A, SealedTrait53[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53]] {
    def to(a: A): SealedTrait53[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53] = A.ordinal(a) match {
      case 0 => SealedTrait53._1(a.asInstanceOf[A1])
      case 1 => SealedTrait53._2(a.asInstanceOf[A2])
      case 2 => SealedTrait53._3(a.asInstanceOf[A3])
      case 3 => SealedTrait53._4(a.asInstanceOf[A4])
      case 4 => SealedTrait53._5(a.asInstanceOf[A5])
      case 5 => SealedTrait53._6(a.asInstanceOf[A6])
      case 6 => SealedTrait53._7(a.asInstanceOf[A7])
      case 7 => SealedTrait53._8(a.asInstanceOf[A8])
      case 8 => SealedTrait53._9(a.asInstanceOf[A9])
      case 9 => SealedTrait53._10(a.asInstanceOf[A10])
      case 10 => SealedTrait53._11(a.asInstanceOf[A11])
      case 11 => SealedTrait53._12(a.asInstanceOf[A12])
      case 12 => SealedTrait53._13(a.asInstanceOf[A13])
      case 13 => SealedTrait53._14(a.asInstanceOf[A14])
      case 14 => SealedTrait53._15(a.asInstanceOf[A15])
      case 15 => SealedTrait53._16(a.asInstanceOf[A16])
      case 16 => SealedTrait53._17(a.asInstanceOf[A17])
      case 17 => SealedTrait53._18(a.asInstanceOf[A18])
      case 18 => SealedTrait53._19(a.asInstanceOf[A19])
      case 19 => SealedTrait53._20(a.asInstanceOf[A20])
      case 20 => SealedTrait53._21(a.asInstanceOf[A21])
      case 21 => SealedTrait53._22(a.asInstanceOf[A22])
      case 22 => SealedTrait53._23(a.asInstanceOf[A23])
      case 23 => SealedTrait53._24(a.asInstanceOf[A24])
      case 24 => SealedTrait53._25(a.asInstanceOf[A25])
      case 25 => SealedTrait53._26(a.asInstanceOf[A26])
      case 26 => SealedTrait53._27(a.asInstanceOf[A27])
      case 27 => SealedTrait53._28(a.asInstanceOf[A28])
      case 28 => SealedTrait53._29(a.asInstanceOf[A29])
      case 29 => SealedTrait53._30(a.asInstanceOf[A30])
      case 30 => SealedTrait53._31(a.asInstanceOf[A31])
      case 31 => SealedTrait53._32(a.asInstanceOf[A32])
      case 32 => SealedTrait53._33(a.asInstanceOf[A33])
      case 33 => SealedTrait53._34(a.asInstanceOf[A34])
      case 34 => SealedTrait53._35(a.asInstanceOf[A35])
      case 35 => SealedTrait53._36(a.asInstanceOf[A36])
      case 36 => SealedTrait53._37(a.asInstanceOf[A37])
      case 37 => SealedTrait53._38(a.asInstanceOf[A38])
      case 38 => SealedTrait53._39(a.asInstanceOf[A39])
      case 39 => SealedTrait53._40(a.asInstanceOf[A40])
      case 40 => SealedTrait53._41(a.asInstanceOf[A41])
      case 41 => SealedTrait53._42(a.asInstanceOf[A42])
      case 42 => SealedTrait53._43(a.asInstanceOf[A43])
      case 43 => SealedTrait53._44(a.asInstanceOf[A44])
      case 44 => SealedTrait53._45(a.asInstanceOf[A45])
      case 45 => SealedTrait53._46(a.asInstanceOf[A46])
      case 46 => SealedTrait53._47(a.asInstanceOf[A47])
      case 47 => SealedTrait53._48(a.asInstanceOf[A48])
      case 48 => SealedTrait53._49(a.asInstanceOf[A49])
      case 49 => SealedTrait53._50(a.asInstanceOf[A50])
      case 50 => SealedTrait53._51(a.asInstanceOf[A51])
      case 51 => SealedTrait53._52(a.asInstanceOf[A52])
      case 52 => SealedTrait53._53(a.asInstanceOf[A53])
    }
    def from(s: SealedTrait53[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53]): A = s.value
  }

  implicit def sealedtrait54[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A, A28 <: A, A29 <: A, A30 <: A, A31 <: A, A32 <: A, A33 <: A, A34 <: A, A35 <: A, A36 <: A, A37 <: A, A38 <: A, A39 <: A, A40 <: A, A41 <: A, A42 <: A, A43 <: A, A44 <: A, A45 <: A, A46 <: A, A47 <: A, A48 <: A, A49 <: A, A50 <: A, A51 <: A, A52 <: A, A53 <: A, A54 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54)): Shapely[A, SealedTrait54[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54]] = new Shapely[A, SealedTrait54[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54]] {
    def to(a: A): SealedTrait54[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54] = A.ordinal(a) match {
      case 0 => SealedTrait54._1(a.asInstanceOf[A1])
      case 1 => SealedTrait54._2(a.asInstanceOf[A2])
      case 2 => SealedTrait54._3(a.asInstanceOf[A3])
      case 3 => SealedTrait54._4(a.asInstanceOf[A4])
      case 4 => SealedTrait54._5(a.asInstanceOf[A5])
      case 5 => SealedTrait54._6(a.asInstanceOf[A6])
      case 6 => SealedTrait54._7(a.asInstanceOf[A7])
      case 7 => SealedTrait54._8(a.asInstanceOf[A8])
      case 8 => SealedTrait54._9(a.asInstanceOf[A9])
      case 9 => SealedTrait54._10(a.asInstanceOf[A10])
      case 10 => SealedTrait54._11(a.asInstanceOf[A11])
      case 11 => SealedTrait54._12(a.asInstanceOf[A12])
      case 12 => SealedTrait54._13(a.asInstanceOf[A13])
      case 13 => SealedTrait54._14(a.asInstanceOf[A14])
      case 14 => SealedTrait54._15(a.asInstanceOf[A15])
      case 15 => SealedTrait54._16(a.asInstanceOf[A16])
      case 16 => SealedTrait54._17(a.asInstanceOf[A17])
      case 17 => SealedTrait54._18(a.asInstanceOf[A18])
      case 18 => SealedTrait54._19(a.asInstanceOf[A19])
      case 19 => SealedTrait54._20(a.asInstanceOf[A20])
      case 20 => SealedTrait54._21(a.asInstanceOf[A21])
      case 21 => SealedTrait54._22(a.asInstanceOf[A22])
      case 22 => SealedTrait54._23(a.asInstanceOf[A23])
      case 23 => SealedTrait54._24(a.asInstanceOf[A24])
      case 24 => SealedTrait54._25(a.asInstanceOf[A25])
      case 25 => SealedTrait54._26(a.asInstanceOf[A26])
      case 26 => SealedTrait54._27(a.asInstanceOf[A27])
      case 27 => SealedTrait54._28(a.asInstanceOf[A28])
      case 28 => SealedTrait54._29(a.asInstanceOf[A29])
      case 29 => SealedTrait54._30(a.asInstanceOf[A30])
      case 30 => SealedTrait54._31(a.asInstanceOf[A31])
      case 31 => SealedTrait54._32(a.asInstanceOf[A32])
      case 32 => SealedTrait54._33(a.asInstanceOf[A33])
      case 33 => SealedTrait54._34(a.asInstanceOf[A34])
      case 34 => SealedTrait54._35(a.asInstanceOf[A35])
      case 35 => SealedTrait54._36(a.asInstanceOf[A36])
      case 36 => SealedTrait54._37(a.asInstanceOf[A37])
      case 37 => SealedTrait54._38(a.asInstanceOf[A38])
      case 38 => SealedTrait54._39(a.asInstanceOf[A39])
      case 39 => SealedTrait54._40(a.asInstanceOf[A40])
      case 40 => SealedTrait54._41(a.asInstanceOf[A41])
      case 41 => SealedTrait54._42(a.asInstanceOf[A42])
      case 42 => SealedTrait54._43(a.asInstanceOf[A43])
      case 43 => SealedTrait54._44(a.asInstanceOf[A44])
      case 44 => SealedTrait54._45(a.asInstanceOf[A45])
      case 45 => SealedTrait54._46(a.asInstanceOf[A46])
      case 46 => SealedTrait54._47(a.asInstanceOf[A47])
      case 47 => SealedTrait54._48(a.asInstanceOf[A48])
      case 48 => SealedTrait54._49(a.asInstanceOf[A49])
      case 49 => SealedTrait54._50(a.asInstanceOf[A50])
      case 50 => SealedTrait54._51(a.asInstanceOf[A51])
      case 51 => SealedTrait54._52(a.asInstanceOf[A52])
      case 52 => SealedTrait54._53(a.asInstanceOf[A53])
      case 53 => SealedTrait54._54(a.asInstanceOf[A54])
    }
    def from(s: SealedTrait54[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54]): A = s.value
  }

  implicit def sealedtrait55[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A, A28 <: A, A29 <: A, A30 <: A, A31 <: A, A32 <: A, A33 <: A, A34 <: A, A35 <: A, A36 <: A, A37 <: A, A38 <: A, A39 <: A, A40 <: A, A41 <: A, A42 <: A, A43 <: A, A44 <: A, A45 <: A, A46 <: A, A47 <: A, A48 <: A, A49 <: A, A50 <: A, A51 <: A, A52 <: A, A53 <: A, A54 <: A, A55 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55)): Shapely[A, SealedTrait55[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55]] = new Shapely[A, SealedTrait55[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55]] {
    def to(a: A): SealedTrait55[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55] = A.ordinal(a) match {
      case 0 => SealedTrait55._1(a.asInstanceOf[A1])
      case 1 => SealedTrait55._2(a.asInstanceOf[A2])
      case 2 => SealedTrait55._3(a.asInstanceOf[A3])
      case 3 => SealedTrait55._4(a.asInstanceOf[A4])
      case 4 => SealedTrait55._5(a.asInstanceOf[A5])
      case 5 => SealedTrait55._6(a.asInstanceOf[A6])
      case 6 => SealedTrait55._7(a.asInstanceOf[A7])
      case 7 => SealedTrait55._8(a.asInstanceOf[A8])
      case 8 => SealedTrait55._9(a.asInstanceOf[A9])
      case 9 => SealedTrait55._10(a.asInstanceOf[A10])
      case 10 => SealedTrait55._11(a.asInstanceOf[A11])
      case 11 => SealedTrait55._12(a.asInstanceOf[A12])
      case 12 => SealedTrait55._13(a.asInstanceOf[A13])
      case 13 => SealedTrait55._14(a.asInstanceOf[A14])
      case 14 => SealedTrait55._15(a.asInstanceOf[A15])
      case 15 => SealedTrait55._16(a.asInstanceOf[A16])
      case 16 => SealedTrait55._17(a.asInstanceOf[A17])
      case 17 => SealedTrait55._18(a.asInstanceOf[A18])
      case 18 => SealedTrait55._19(a.asInstanceOf[A19])
      case 19 => SealedTrait55._20(a.asInstanceOf[A20])
      case 20 => SealedTrait55._21(a.asInstanceOf[A21])
      case 21 => SealedTrait55._22(a.asInstanceOf[A22])
      case 22 => SealedTrait55._23(a.asInstanceOf[A23])
      case 23 => SealedTrait55._24(a.asInstanceOf[A24])
      case 24 => SealedTrait55._25(a.asInstanceOf[A25])
      case 25 => SealedTrait55._26(a.asInstanceOf[A26])
      case 26 => SealedTrait55._27(a.asInstanceOf[A27])
      case 27 => SealedTrait55._28(a.asInstanceOf[A28])
      case 28 => SealedTrait55._29(a.asInstanceOf[A29])
      case 29 => SealedTrait55._30(a.asInstanceOf[A30])
      case 30 => SealedTrait55._31(a.asInstanceOf[A31])
      case 31 => SealedTrait55._32(a.asInstanceOf[A32])
      case 32 => SealedTrait55._33(a.asInstanceOf[A33])
      case 33 => SealedTrait55._34(a.asInstanceOf[A34])
      case 34 => SealedTrait55._35(a.asInstanceOf[A35])
      case 35 => SealedTrait55._36(a.asInstanceOf[A36])
      case 36 => SealedTrait55._37(a.asInstanceOf[A37])
      case 37 => SealedTrait55._38(a.asInstanceOf[A38])
      case 38 => SealedTrait55._39(a.asInstanceOf[A39])
      case 39 => SealedTrait55._40(a.asInstanceOf[A40])
      case 40 => SealedTrait55._41(a.asInstanceOf[A41])
      case 41 => SealedTrait55._42(a.asInstanceOf[A42])
      case 42 => SealedTrait55._43(a.asInstanceOf[A43])
      case 43 => SealedTrait55._44(a.asInstanceOf[A44])
      case 44 => SealedTrait55._45(a.asInstanceOf[A45])
      case 45 => SealedTrait55._46(a.asInstanceOf[A46])
      case 46 => SealedTrait55._47(a.asInstanceOf[A47])
      case 47 => SealedTrait55._48(a.asInstanceOf[A48])
      case 48 => SealedTrait55._49(a.asInstanceOf[A49])
      case 49 => SealedTrait55._50(a.asInstanceOf[A50])
      case 50 => SealedTrait55._51(a.asInstanceOf[A51])
      case 51 => SealedTrait55._52(a.asInstanceOf[A52])
      case 52 => SealedTrait55._53(a.asInstanceOf[A53])
      case 53 => SealedTrait55._54(a.asInstanceOf[A54])
      case 54 => SealedTrait55._55(a.asInstanceOf[A55])
    }
    def from(s: SealedTrait55[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55]): A = s.value
  }

  implicit def sealedtrait56[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A, A28 <: A, A29 <: A, A30 <: A, A31 <: A, A32 <: A, A33 <: A, A34 <: A, A35 <: A, A36 <: A, A37 <: A, A38 <: A, A39 <: A, A40 <: A, A41 <: A, A42 <: A, A43 <: A, A44 <: A, A45 <: A, A46 <: A, A47 <: A, A48 <: A, A49 <: A, A50 <: A, A51 <: A, A52 <: A, A53 <: A, A54 <: A, A55 <: A, A56 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56)): Shapely[A, SealedTrait56[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56]] = new Shapely[A, SealedTrait56[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56]] {
    def to(a: A): SealedTrait56[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56] = A.ordinal(a) match {
      case 0 => SealedTrait56._1(a.asInstanceOf[A1])
      case 1 => SealedTrait56._2(a.asInstanceOf[A2])
      case 2 => SealedTrait56._3(a.asInstanceOf[A3])
      case 3 => SealedTrait56._4(a.asInstanceOf[A4])
      case 4 => SealedTrait56._5(a.asInstanceOf[A5])
      case 5 => SealedTrait56._6(a.asInstanceOf[A6])
      case 6 => SealedTrait56._7(a.asInstanceOf[A7])
      case 7 => SealedTrait56._8(a.asInstanceOf[A8])
      case 8 => SealedTrait56._9(a.asInstanceOf[A9])
      case 9 => SealedTrait56._10(a.asInstanceOf[A10])
      case 10 => SealedTrait56._11(a.asInstanceOf[A11])
      case 11 => SealedTrait56._12(a.asInstanceOf[A12])
      case 12 => SealedTrait56._13(a.asInstanceOf[A13])
      case 13 => SealedTrait56._14(a.asInstanceOf[A14])
      case 14 => SealedTrait56._15(a.asInstanceOf[A15])
      case 15 => SealedTrait56._16(a.asInstanceOf[A16])
      case 16 => SealedTrait56._17(a.asInstanceOf[A17])
      case 17 => SealedTrait56._18(a.asInstanceOf[A18])
      case 18 => SealedTrait56._19(a.asInstanceOf[A19])
      case 19 => SealedTrait56._20(a.asInstanceOf[A20])
      case 20 => SealedTrait56._21(a.asInstanceOf[A21])
      case 21 => SealedTrait56._22(a.asInstanceOf[A22])
      case 22 => SealedTrait56._23(a.asInstanceOf[A23])
      case 23 => SealedTrait56._24(a.asInstanceOf[A24])
      case 24 => SealedTrait56._25(a.asInstanceOf[A25])
      case 25 => SealedTrait56._26(a.asInstanceOf[A26])
      case 26 => SealedTrait56._27(a.asInstanceOf[A27])
      case 27 => SealedTrait56._28(a.asInstanceOf[A28])
      case 28 => SealedTrait56._29(a.asInstanceOf[A29])
      case 29 => SealedTrait56._30(a.asInstanceOf[A30])
      case 30 => SealedTrait56._31(a.asInstanceOf[A31])
      case 31 => SealedTrait56._32(a.asInstanceOf[A32])
      case 32 => SealedTrait56._33(a.asInstanceOf[A33])
      case 33 => SealedTrait56._34(a.asInstanceOf[A34])
      case 34 => SealedTrait56._35(a.asInstanceOf[A35])
      case 35 => SealedTrait56._36(a.asInstanceOf[A36])
      case 36 => SealedTrait56._37(a.asInstanceOf[A37])
      case 37 => SealedTrait56._38(a.asInstanceOf[A38])
      case 38 => SealedTrait56._39(a.asInstanceOf[A39])
      case 39 => SealedTrait56._40(a.asInstanceOf[A40])
      case 40 => SealedTrait56._41(a.asInstanceOf[A41])
      case 41 => SealedTrait56._42(a.asInstanceOf[A42])
      case 42 => SealedTrait56._43(a.asInstanceOf[A43])
      case 43 => SealedTrait56._44(a.asInstanceOf[A44])
      case 44 => SealedTrait56._45(a.asInstanceOf[A45])
      case 45 => SealedTrait56._46(a.asInstanceOf[A46])
      case 46 => SealedTrait56._47(a.asInstanceOf[A47])
      case 47 => SealedTrait56._48(a.asInstanceOf[A48])
      case 48 => SealedTrait56._49(a.asInstanceOf[A49])
      case 49 => SealedTrait56._50(a.asInstanceOf[A50])
      case 50 => SealedTrait56._51(a.asInstanceOf[A51])
      case 51 => SealedTrait56._52(a.asInstanceOf[A52])
      case 52 => SealedTrait56._53(a.asInstanceOf[A53])
      case 53 => SealedTrait56._54(a.asInstanceOf[A54])
      case 54 => SealedTrait56._55(a.asInstanceOf[A55])
      case 55 => SealedTrait56._56(a.asInstanceOf[A56])
    }
    def from(s: SealedTrait56[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56]): A = s.value
  }

  implicit def sealedtrait57[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A, A28 <: A, A29 <: A, A30 <: A, A31 <: A, A32 <: A, A33 <: A, A34 <: A, A35 <: A, A36 <: A, A37 <: A, A38 <: A, A39 <: A, A40 <: A, A41 <: A, A42 <: A, A43 <: A, A44 <: A, A45 <: A, A46 <: A, A47 <: A, A48 <: A, A49 <: A, A50 <: A, A51 <: A, A52 <: A, A53 <: A, A54 <: A, A55 <: A, A56 <: A, A57 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57)): Shapely[A, SealedTrait57[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57]] = new Shapely[A, SealedTrait57[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57]] {
    def to(a: A): SealedTrait57[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57] = A.ordinal(a) match {
      case 0 => SealedTrait57._1(a.asInstanceOf[A1])
      case 1 => SealedTrait57._2(a.asInstanceOf[A2])
      case 2 => SealedTrait57._3(a.asInstanceOf[A3])
      case 3 => SealedTrait57._4(a.asInstanceOf[A4])
      case 4 => SealedTrait57._5(a.asInstanceOf[A5])
      case 5 => SealedTrait57._6(a.asInstanceOf[A6])
      case 6 => SealedTrait57._7(a.asInstanceOf[A7])
      case 7 => SealedTrait57._8(a.asInstanceOf[A8])
      case 8 => SealedTrait57._9(a.asInstanceOf[A9])
      case 9 => SealedTrait57._10(a.asInstanceOf[A10])
      case 10 => SealedTrait57._11(a.asInstanceOf[A11])
      case 11 => SealedTrait57._12(a.asInstanceOf[A12])
      case 12 => SealedTrait57._13(a.asInstanceOf[A13])
      case 13 => SealedTrait57._14(a.asInstanceOf[A14])
      case 14 => SealedTrait57._15(a.asInstanceOf[A15])
      case 15 => SealedTrait57._16(a.asInstanceOf[A16])
      case 16 => SealedTrait57._17(a.asInstanceOf[A17])
      case 17 => SealedTrait57._18(a.asInstanceOf[A18])
      case 18 => SealedTrait57._19(a.asInstanceOf[A19])
      case 19 => SealedTrait57._20(a.asInstanceOf[A20])
      case 20 => SealedTrait57._21(a.asInstanceOf[A21])
      case 21 => SealedTrait57._22(a.asInstanceOf[A22])
      case 22 => SealedTrait57._23(a.asInstanceOf[A23])
      case 23 => SealedTrait57._24(a.asInstanceOf[A24])
      case 24 => SealedTrait57._25(a.asInstanceOf[A25])
      case 25 => SealedTrait57._26(a.asInstanceOf[A26])
      case 26 => SealedTrait57._27(a.asInstanceOf[A27])
      case 27 => SealedTrait57._28(a.asInstanceOf[A28])
      case 28 => SealedTrait57._29(a.asInstanceOf[A29])
      case 29 => SealedTrait57._30(a.asInstanceOf[A30])
      case 30 => SealedTrait57._31(a.asInstanceOf[A31])
      case 31 => SealedTrait57._32(a.asInstanceOf[A32])
      case 32 => SealedTrait57._33(a.asInstanceOf[A33])
      case 33 => SealedTrait57._34(a.asInstanceOf[A34])
      case 34 => SealedTrait57._35(a.asInstanceOf[A35])
      case 35 => SealedTrait57._36(a.asInstanceOf[A36])
      case 36 => SealedTrait57._37(a.asInstanceOf[A37])
      case 37 => SealedTrait57._38(a.asInstanceOf[A38])
      case 38 => SealedTrait57._39(a.asInstanceOf[A39])
      case 39 => SealedTrait57._40(a.asInstanceOf[A40])
      case 40 => SealedTrait57._41(a.asInstanceOf[A41])
      case 41 => SealedTrait57._42(a.asInstanceOf[A42])
      case 42 => SealedTrait57._43(a.asInstanceOf[A43])
      case 43 => SealedTrait57._44(a.asInstanceOf[A44])
      case 44 => SealedTrait57._45(a.asInstanceOf[A45])
      case 45 => SealedTrait57._46(a.asInstanceOf[A46])
      case 46 => SealedTrait57._47(a.asInstanceOf[A47])
      case 47 => SealedTrait57._48(a.asInstanceOf[A48])
      case 48 => SealedTrait57._49(a.asInstanceOf[A49])
      case 49 => SealedTrait57._50(a.asInstanceOf[A50])
      case 50 => SealedTrait57._51(a.asInstanceOf[A51])
      case 51 => SealedTrait57._52(a.asInstanceOf[A52])
      case 52 => SealedTrait57._53(a.asInstanceOf[A53])
      case 53 => SealedTrait57._54(a.asInstanceOf[A54])
      case 54 => SealedTrait57._55(a.asInstanceOf[A55])
      case 55 => SealedTrait57._56(a.asInstanceOf[A56])
      case 56 => SealedTrait57._57(a.asInstanceOf[A57])
    }
    def from(s: SealedTrait57[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57]): A = s.value
  }

  implicit def sealedtrait58[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A, A28 <: A, A29 <: A, A30 <: A, A31 <: A, A32 <: A, A33 <: A, A34 <: A, A35 <: A, A36 <: A, A37 <: A, A38 <: A, A39 <: A, A40 <: A, A41 <: A, A42 <: A, A43 <: A, A44 <: A, A45 <: A, A46 <: A, A47 <: A, A48 <: A, A49 <: A, A50 <: A, A51 <: A, A52 <: A, A53 <: A, A54 <: A, A55 <: A, A56 <: A, A57 <: A, A58 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58)): Shapely[A, SealedTrait58[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58]] = new Shapely[A, SealedTrait58[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58]] {
    def to(a: A): SealedTrait58[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58] = A.ordinal(a) match {
      case 0 => SealedTrait58._1(a.asInstanceOf[A1])
      case 1 => SealedTrait58._2(a.asInstanceOf[A2])
      case 2 => SealedTrait58._3(a.asInstanceOf[A3])
      case 3 => SealedTrait58._4(a.asInstanceOf[A4])
      case 4 => SealedTrait58._5(a.asInstanceOf[A5])
      case 5 => SealedTrait58._6(a.asInstanceOf[A6])
      case 6 => SealedTrait58._7(a.asInstanceOf[A7])
      case 7 => SealedTrait58._8(a.asInstanceOf[A8])
      case 8 => SealedTrait58._9(a.asInstanceOf[A9])
      case 9 => SealedTrait58._10(a.asInstanceOf[A10])
      case 10 => SealedTrait58._11(a.asInstanceOf[A11])
      case 11 => SealedTrait58._12(a.asInstanceOf[A12])
      case 12 => SealedTrait58._13(a.asInstanceOf[A13])
      case 13 => SealedTrait58._14(a.asInstanceOf[A14])
      case 14 => SealedTrait58._15(a.asInstanceOf[A15])
      case 15 => SealedTrait58._16(a.asInstanceOf[A16])
      case 16 => SealedTrait58._17(a.asInstanceOf[A17])
      case 17 => SealedTrait58._18(a.asInstanceOf[A18])
      case 18 => SealedTrait58._19(a.asInstanceOf[A19])
      case 19 => SealedTrait58._20(a.asInstanceOf[A20])
      case 20 => SealedTrait58._21(a.asInstanceOf[A21])
      case 21 => SealedTrait58._22(a.asInstanceOf[A22])
      case 22 => SealedTrait58._23(a.asInstanceOf[A23])
      case 23 => SealedTrait58._24(a.asInstanceOf[A24])
      case 24 => SealedTrait58._25(a.asInstanceOf[A25])
      case 25 => SealedTrait58._26(a.asInstanceOf[A26])
      case 26 => SealedTrait58._27(a.asInstanceOf[A27])
      case 27 => SealedTrait58._28(a.asInstanceOf[A28])
      case 28 => SealedTrait58._29(a.asInstanceOf[A29])
      case 29 => SealedTrait58._30(a.asInstanceOf[A30])
      case 30 => SealedTrait58._31(a.asInstanceOf[A31])
      case 31 => SealedTrait58._32(a.asInstanceOf[A32])
      case 32 => SealedTrait58._33(a.asInstanceOf[A33])
      case 33 => SealedTrait58._34(a.asInstanceOf[A34])
      case 34 => SealedTrait58._35(a.asInstanceOf[A35])
      case 35 => SealedTrait58._36(a.asInstanceOf[A36])
      case 36 => SealedTrait58._37(a.asInstanceOf[A37])
      case 37 => SealedTrait58._38(a.asInstanceOf[A38])
      case 38 => SealedTrait58._39(a.asInstanceOf[A39])
      case 39 => SealedTrait58._40(a.asInstanceOf[A40])
      case 40 => SealedTrait58._41(a.asInstanceOf[A41])
      case 41 => SealedTrait58._42(a.asInstanceOf[A42])
      case 42 => SealedTrait58._43(a.asInstanceOf[A43])
      case 43 => SealedTrait58._44(a.asInstanceOf[A44])
      case 44 => SealedTrait58._45(a.asInstanceOf[A45])
      case 45 => SealedTrait58._46(a.asInstanceOf[A46])
      case 46 => SealedTrait58._47(a.asInstanceOf[A47])
      case 47 => SealedTrait58._48(a.asInstanceOf[A48])
      case 48 => SealedTrait58._49(a.asInstanceOf[A49])
      case 49 => SealedTrait58._50(a.asInstanceOf[A50])
      case 50 => SealedTrait58._51(a.asInstanceOf[A51])
      case 51 => SealedTrait58._52(a.asInstanceOf[A52])
      case 52 => SealedTrait58._53(a.asInstanceOf[A53])
      case 53 => SealedTrait58._54(a.asInstanceOf[A54])
      case 54 => SealedTrait58._55(a.asInstanceOf[A55])
      case 55 => SealedTrait58._56(a.asInstanceOf[A56])
      case 56 => SealedTrait58._57(a.asInstanceOf[A57])
      case 57 => SealedTrait58._58(a.asInstanceOf[A58])
    }
    def from(s: SealedTrait58[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58]): A = s.value
  }

  implicit def sealedtrait59[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A, A28 <: A, A29 <: A, A30 <: A, A31 <: A, A32 <: A, A33 <: A, A34 <: A, A35 <: A, A36 <: A, A37 <: A, A38 <: A, A39 <: A, A40 <: A, A41 <: A, A42 <: A, A43 <: A, A44 <: A, A45 <: A, A46 <: A, A47 <: A, A48 <: A, A49 <: A, A50 <: A, A51 <: A, A52 <: A, A53 <: A, A54 <: A, A55 <: A, A56 <: A, A57 <: A, A58 <: A, A59 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, A59)): Shapely[A, SealedTrait59[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, A59]] = new Shapely[A, SealedTrait59[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, A59]] {
    def to(a: A): SealedTrait59[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, A59] = A.ordinal(a) match {
      case 0 => SealedTrait59._1(a.asInstanceOf[A1])
      case 1 => SealedTrait59._2(a.asInstanceOf[A2])
      case 2 => SealedTrait59._3(a.asInstanceOf[A3])
      case 3 => SealedTrait59._4(a.asInstanceOf[A4])
      case 4 => SealedTrait59._5(a.asInstanceOf[A5])
      case 5 => SealedTrait59._6(a.asInstanceOf[A6])
      case 6 => SealedTrait59._7(a.asInstanceOf[A7])
      case 7 => SealedTrait59._8(a.asInstanceOf[A8])
      case 8 => SealedTrait59._9(a.asInstanceOf[A9])
      case 9 => SealedTrait59._10(a.asInstanceOf[A10])
      case 10 => SealedTrait59._11(a.asInstanceOf[A11])
      case 11 => SealedTrait59._12(a.asInstanceOf[A12])
      case 12 => SealedTrait59._13(a.asInstanceOf[A13])
      case 13 => SealedTrait59._14(a.asInstanceOf[A14])
      case 14 => SealedTrait59._15(a.asInstanceOf[A15])
      case 15 => SealedTrait59._16(a.asInstanceOf[A16])
      case 16 => SealedTrait59._17(a.asInstanceOf[A17])
      case 17 => SealedTrait59._18(a.asInstanceOf[A18])
      case 18 => SealedTrait59._19(a.asInstanceOf[A19])
      case 19 => SealedTrait59._20(a.asInstanceOf[A20])
      case 20 => SealedTrait59._21(a.asInstanceOf[A21])
      case 21 => SealedTrait59._22(a.asInstanceOf[A22])
      case 22 => SealedTrait59._23(a.asInstanceOf[A23])
      case 23 => SealedTrait59._24(a.asInstanceOf[A24])
      case 24 => SealedTrait59._25(a.asInstanceOf[A25])
      case 25 => SealedTrait59._26(a.asInstanceOf[A26])
      case 26 => SealedTrait59._27(a.asInstanceOf[A27])
      case 27 => SealedTrait59._28(a.asInstanceOf[A28])
      case 28 => SealedTrait59._29(a.asInstanceOf[A29])
      case 29 => SealedTrait59._30(a.asInstanceOf[A30])
      case 30 => SealedTrait59._31(a.asInstanceOf[A31])
      case 31 => SealedTrait59._32(a.asInstanceOf[A32])
      case 32 => SealedTrait59._33(a.asInstanceOf[A33])
      case 33 => SealedTrait59._34(a.asInstanceOf[A34])
      case 34 => SealedTrait59._35(a.asInstanceOf[A35])
      case 35 => SealedTrait59._36(a.asInstanceOf[A36])
      case 36 => SealedTrait59._37(a.asInstanceOf[A37])
      case 37 => SealedTrait59._38(a.asInstanceOf[A38])
      case 38 => SealedTrait59._39(a.asInstanceOf[A39])
      case 39 => SealedTrait59._40(a.asInstanceOf[A40])
      case 40 => SealedTrait59._41(a.asInstanceOf[A41])
      case 41 => SealedTrait59._42(a.asInstanceOf[A42])
      case 42 => SealedTrait59._43(a.asInstanceOf[A43])
      case 43 => SealedTrait59._44(a.asInstanceOf[A44])
      case 44 => SealedTrait59._45(a.asInstanceOf[A45])
      case 45 => SealedTrait59._46(a.asInstanceOf[A46])
      case 46 => SealedTrait59._47(a.asInstanceOf[A47])
      case 47 => SealedTrait59._48(a.asInstanceOf[A48])
      case 48 => SealedTrait59._49(a.asInstanceOf[A49])
      case 49 => SealedTrait59._50(a.asInstanceOf[A50])
      case 50 => SealedTrait59._51(a.asInstanceOf[A51])
      case 51 => SealedTrait59._52(a.asInstanceOf[A52])
      case 52 => SealedTrait59._53(a.asInstanceOf[A53])
      case 53 => SealedTrait59._54(a.asInstanceOf[A54])
      case 54 => SealedTrait59._55(a.asInstanceOf[A55])
      case 55 => SealedTrait59._56(a.asInstanceOf[A56])
      case 56 => SealedTrait59._57(a.asInstanceOf[A57])
      case 57 => SealedTrait59._58(a.asInstanceOf[A58])
      case 58 => SealedTrait59._59(a.asInstanceOf[A59])
    }
    def from(s: SealedTrait59[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, A59]): A = s.value
  }

  implicit def sealedtrait60[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A, A28 <: A, A29 <: A, A30 <: A, A31 <: A, A32 <: A, A33 <: A, A34 <: A, A35 <: A, A36 <: A, A37 <: A, A38 <: A, A39 <: A, A40 <: A, A41 <: A, A42 <: A, A43 <: A, A44 <: A, A45 <: A, A46 <: A, A47 <: A, A48 <: A, A49 <: A, A50 <: A, A51 <: A, A52 <: A, A53 <: A, A54 <: A, A55 <: A, A56 <: A, A57 <: A, A58 <: A, A59 <: A, A60 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, A59, A60)): Shapely[A, SealedTrait60[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, A59, A60]] = new Shapely[A, SealedTrait60[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, A59, A60]] {
    def to(a: A): SealedTrait60[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, A59, A60] = A.ordinal(a) match {
      case 0 => SealedTrait60._1(a.asInstanceOf[A1])
      case 1 => SealedTrait60._2(a.asInstanceOf[A2])
      case 2 => SealedTrait60._3(a.asInstanceOf[A3])
      case 3 => SealedTrait60._4(a.asInstanceOf[A4])
      case 4 => SealedTrait60._5(a.asInstanceOf[A5])
      case 5 => SealedTrait60._6(a.asInstanceOf[A6])
      case 6 => SealedTrait60._7(a.asInstanceOf[A7])
      case 7 => SealedTrait60._8(a.asInstanceOf[A8])
      case 8 => SealedTrait60._9(a.asInstanceOf[A9])
      case 9 => SealedTrait60._10(a.asInstanceOf[A10])
      case 10 => SealedTrait60._11(a.asInstanceOf[A11])
      case 11 => SealedTrait60._12(a.asInstanceOf[A12])
      case 12 => SealedTrait60._13(a.asInstanceOf[A13])
      case 13 => SealedTrait60._14(a.asInstanceOf[A14])
      case 14 => SealedTrait60._15(a.asInstanceOf[A15])
      case 15 => SealedTrait60._16(a.asInstanceOf[A16])
      case 16 => SealedTrait60._17(a.asInstanceOf[A17])
      case 17 => SealedTrait60._18(a.asInstanceOf[A18])
      case 18 => SealedTrait60._19(a.asInstanceOf[A19])
      case 19 => SealedTrait60._20(a.asInstanceOf[A20])
      case 20 => SealedTrait60._21(a.asInstanceOf[A21])
      case 21 => SealedTrait60._22(a.asInstanceOf[A22])
      case 22 => SealedTrait60._23(a.asInstanceOf[A23])
      case 23 => SealedTrait60._24(a.asInstanceOf[A24])
      case 24 => SealedTrait60._25(a.asInstanceOf[A25])
      case 25 => SealedTrait60._26(a.asInstanceOf[A26])
      case 26 => SealedTrait60._27(a.asInstanceOf[A27])
      case 27 => SealedTrait60._28(a.asInstanceOf[A28])
      case 28 => SealedTrait60._29(a.asInstanceOf[A29])
      case 29 => SealedTrait60._30(a.asInstanceOf[A30])
      case 30 => SealedTrait60._31(a.asInstanceOf[A31])
      case 31 => SealedTrait60._32(a.asInstanceOf[A32])
      case 32 => SealedTrait60._33(a.asInstanceOf[A33])
      case 33 => SealedTrait60._34(a.asInstanceOf[A34])
      case 34 => SealedTrait60._35(a.asInstanceOf[A35])
      case 35 => SealedTrait60._36(a.asInstanceOf[A36])
      case 36 => SealedTrait60._37(a.asInstanceOf[A37])
      case 37 => SealedTrait60._38(a.asInstanceOf[A38])
      case 38 => SealedTrait60._39(a.asInstanceOf[A39])
      case 39 => SealedTrait60._40(a.asInstanceOf[A40])
      case 40 => SealedTrait60._41(a.asInstanceOf[A41])
      case 41 => SealedTrait60._42(a.asInstanceOf[A42])
      case 42 => SealedTrait60._43(a.asInstanceOf[A43])
      case 43 => SealedTrait60._44(a.asInstanceOf[A44])
      case 44 => SealedTrait60._45(a.asInstanceOf[A45])
      case 45 => SealedTrait60._46(a.asInstanceOf[A46])
      case 46 => SealedTrait60._47(a.asInstanceOf[A47])
      case 47 => SealedTrait60._48(a.asInstanceOf[A48])
      case 48 => SealedTrait60._49(a.asInstanceOf[A49])
      case 49 => SealedTrait60._50(a.asInstanceOf[A50])
      case 50 => SealedTrait60._51(a.asInstanceOf[A51])
      case 51 => SealedTrait60._52(a.asInstanceOf[A52])
      case 52 => SealedTrait60._53(a.asInstanceOf[A53])
      case 53 => SealedTrait60._54(a.asInstanceOf[A54])
      case 54 => SealedTrait60._55(a.asInstanceOf[A55])
      case 55 => SealedTrait60._56(a.asInstanceOf[A56])
      case 56 => SealedTrait60._57(a.asInstanceOf[A57])
      case 57 => SealedTrait60._58(a.asInstanceOf[A58])
      case 58 => SealedTrait60._59(a.asInstanceOf[A59])
      case 59 => SealedTrait60._60(a.asInstanceOf[A60])
    }
    def from(s: SealedTrait60[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, A59, A60]): A = s.value
  }

  implicit def sealedtrait61[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A, A28 <: A, A29 <: A, A30 <: A, A31 <: A, A32 <: A, A33 <: A, A34 <: A, A35 <: A, A36 <: A, A37 <: A, A38 <: A, A39 <: A, A40 <: A, A41 <: A, A42 <: A, A43 <: A, A44 <: A, A45 <: A, A46 <: A, A47 <: A, A48 <: A, A49 <: A, A50 <: A, A51 <: A, A52 <: A, A53 <: A, A54 <: A, A55 <: A, A56 <: A, A57 <: A, A58 <: A, A59 <: A, A60 <: A, A61 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, A59, A60, A61)): Shapely[A, SealedTrait61[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, A59, A60, A61]] = new Shapely[A, SealedTrait61[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, A59, A60, A61]] {
    def to(a: A): SealedTrait61[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, A59, A60, A61] = A.ordinal(a) match {
      case 0 => SealedTrait61._1(a.asInstanceOf[A1])
      case 1 => SealedTrait61._2(a.asInstanceOf[A2])
      case 2 => SealedTrait61._3(a.asInstanceOf[A3])
      case 3 => SealedTrait61._4(a.asInstanceOf[A4])
      case 4 => SealedTrait61._5(a.asInstanceOf[A5])
      case 5 => SealedTrait61._6(a.asInstanceOf[A6])
      case 6 => SealedTrait61._7(a.asInstanceOf[A7])
      case 7 => SealedTrait61._8(a.asInstanceOf[A8])
      case 8 => SealedTrait61._9(a.asInstanceOf[A9])
      case 9 => SealedTrait61._10(a.asInstanceOf[A10])
      case 10 => SealedTrait61._11(a.asInstanceOf[A11])
      case 11 => SealedTrait61._12(a.asInstanceOf[A12])
      case 12 => SealedTrait61._13(a.asInstanceOf[A13])
      case 13 => SealedTrait61._14(a.asInstanceOf[A14])
      case 14 => SealedTrait61._15(a.asInstanceOf[A15])
      case 15 => SealedTrait61._16(a.asInstanceOf[A16])
      case 16 => SealedTrait61._17(a.asInstanceOf[A17])
      case 17 => SealedTrait61._18(a.asInstanceOf[A18])
      case 18 => SealedTrait61._19(a.asInstanceOf[A19])
      case 19 => SealedTrait61._20(a.asInstanceOf[A20])
      case 20 => SealedTrait61._21(a.asInstanceOf[A21])
      case 21 => SealedTrait61._22(a.asInstanceOf[A22])
      case 22 => SealedTrait61._23(a.asInstanceOf[A23])
      case 23 => SealedTrait61._24(a.asInstanceOf[A24])
      case 24 => SealedTrait61._25(a.asInstanceOf[A25])
      case 25 => SealedTrait61._26(a.asInstanceOf[A26])
      case 26 => SealedTrait61._27(a.asInstanceOf[A27])
      case 27 => SealedTrait61._28(a.asInstanceOf[A28])
      case 28 => SealedTrait61._29(a.asInstanceOf[A29])
      case 29 => SealedTrait61._30(a.asInstanceOf[A30])
      case 30 => SealedTrait61._31(a.asInstanceOf[A31])
      case 31 => SealedTrait61._32(a.asInstanceOf[A32])
      case 32 => SealedTrait61._33(a.asInstanceOf[A33])
      case 33 => SealedTrait61._34(a.asInstanceOf[A34])
      case 34 => SealedTrait61._35(a.asInstanceOf[A35])
      case 35 => SealedTrait61._36(a.asInstanceOf[A36])
      case 36 => SealedTrait61._37(a.asInstanceOf[A37])
      case 37 => SealedTrait61._38(a.asInstanceOf[A38])
      case 38 => SealedTrait61._39(a.asInstanceOf[A39])
      case 39 => SealedTrait61._40(a.asInstanceOf[A40])
      case 40 => SealedTrait61._41(a.asInstanceOf[A41])
      case 41 => SealedTrait61._42(a.asInstanceOf[A42])
      case 42 => SealedTrait61._43(a.asInstanceOf[A43])
      case 43 => SealedTrait61._44(a.asInstanceOf[A44])
      case 44 => SealedTrait61._45(a.asInstanceOf[A45])
      case 45 => SealedTrait61._46(a.asInstanceOf[A46])
      case 46 => SealedTrait61._47(a.asInstanceOf[A47])
      case 47 => SealedTrait61._48(a.asInstanceOf[A48])
      case 48 => SealedTrait61._49(a.asInstanceOf[A49])
      case 49 => SealedTrait61._50(a.asInstanceOf[A50])
      case 50 => SealedTrait61._51(a.asInstanceOf[A51])
      case 51 => SealedTrait61._52(a.asInstanceOf[A52])
      case 52 => SealedTrait61._53(a.asInstanceOf[A53])
      case 53 => SealedTrait61._54(a.asInstanceOf[A54])
      case 54 => SealedTrait61._55(a.asInstanceOf[A55])
      case 55 => SealedTrait61._56(a.asInstanceOf[A56])
      case 56 => SealedTrait61._57(a.asInstanceOf[A57])
      case 57 => SealedTrait61._58(a.asInstanceOf[A58])
      case 58 => SealedTrait61._59(a.asInstanceOf[A59])
      case 59 => SealedTrait61._60(a.asInstanceOf[A60])
      case 60 => SealedTrait61._61(a.asInstanceOf[A61])
    }
    def from(s: SealedTrait61[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, A59, A60, A61]): A = s.value
  }

  implicit def sealedtrait62[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A, A28 <: A, A29 <: A, A30 <: A, A31 <: A, A32 <: A, A33 <: A, A34 <: A, A35 <: A, A36 <: A, A37 <: A, A38 <: A, A39 <: A, A40 <: A, A41 <: A, A42 <: A, A43 <: A, A44 <: A, A45 <: A, A46 <: A, A47 <: A, A48 <: A, A49 <: A, A50 <: A, A51 <: A, A52 <: A, A53 <: A, A54 <: A, A55 <: A, A56 <: A, A57 <: A, A58 <: A, A59 <: A, A60 <: A, A61 <: A, A62 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, A59, A60, A61, A62)): Shapely[A, SealedTrait62[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, A59, A60, A61, A62]] = new Shapely[A, SealedTrait62[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, A59, A60, A61, A62]] {
    def to(a: A): SealedTrait62[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, A59, A60, A61, A62] = A.ordinal(a) match {
      case 0 => SealedTrait62._1(a.asInstanceOf[A1])
      case 1 => SealedTrait62._2(a.asInstanceOf[A2])
      case 2 => SealedTrait62._3(a.asInstanceOf[A3])
      case 3 => SealedTrait62._4(a.asInstanceOf[A4])
      case 4 => SealedTrait62._5(a.asInstanceOf[A5])
      case 5 => SealedTrait62._6(a.asInstanceOf[A6])
      case 6 => SealedTrait62._7(a.asInstanceOf[A7])
      case 7 => SealedTrait62._8(a.asInstanceOf[A8])
      case 8 => SealedTrait62._9(a.asInstanceOf[A9])
      case 9 => SealedTrait62._10(a.asInstanceOf[A10])
      case 10 => SealedTrait62._11(a.asInstanceOf[A11])
      case 11 => SealedTrait62._12(a.asInstanceOf[A12])
      case 12 => SealedTrait62._13(a.asInstanceOf[A13])
      case 13 => SealedTrait62._14(a.asInstanceOf[A14])
      case 14 => SealedTrait62._15(a.asInstanceOf[A15])
      case 15 => SealedTrait62._16(a.asInstanceOf[A16])
      case 16 => SealedTrait62._17(a.asInstanceOf[A17])
      case 17 => SealedTrait62._18(a.asInstanceOf[A18])
      case 18 => SealedTrait62._19(a.asInstanceOf[A19])
      case 19 => SealedTrait62._20(a.asInstanceOf[A20])
      case 20 => SealedTrait62._21(a.asInstanceOf[A21])
      case 21 => SealedTrait62._22(a.asInstanceOf[A22])
      case 22 => SealedTrait62._23(a.asInstanceOf[A23])
      case 23 => SealedTrait62._24(a.asInstanceOf[A24])
      case 24 => SealedTrait62._25(a.asInstanceOf[A25])
      case 25 => SealedTrait62._26(a.asInstanceOf[A26])
      case 26 => SealedTrait62._27(a.asInstanceOf[A27])
      case 27 => SealedTrait62._28(a.asInstanceOf[A28])
      case 28 => SealedTrait62._29(a.asInstanceOf[A29])
      case 29 => SealedTrait62._30(a.asInstanceOf[A30])
      case 30 => SealedTrait62._31(a.asInstanceOf[A31])
      case 31 => SealedTrait62._32(a.asInstanceOf[A32])
      case 32 => SealedTrait62._33(a.asInstanceOf[A33])
      case 33 => SealedTrait62._34(a.asInstanceOf[A34])
      case 34 => SealedTrait62._35(a.asInstanceOf[A35])
      case 35 => SealedTrait62._36(a.asInstanceOf[A36])
      case 36 => SealedTrait62._37(a.asInstanceOf[A37])
      case 37 => SealedTrait62._38(a.asInstanceOf[A38])
      case 38 => SealedTrait62._39(a.asInstanceOf[A39])
      case 39 => SealedTrait62._40(a.asInstanceOf[A40])
      case 40 => SealedTrait62._41(a.asInstanceOf[A41])
      case 41 => SealedTrait62._42(a.asInstanceOf[A42])
      case 42 => SealedTrait62._43(a.asInstanceOf[A43])
      case 43 => SealedTrait62._44(a.asInstanceOf[A44])
      case 44 => SealedTrait62._45(a.asInstanceOf[A45])
      case 45 => SealedTrait62._46(a.asInstanceOf[A46])
      case 46 => SealedTrait62._47(a.asInstanceOf[A47])
      case 47 => SealedTrait62._48(a.asInstanceOf[A48])
      case 48 => SealedTrait62._49(a.asInstanceOf[A49])
      case 49 => SealedTrait62._50(a.asInstanceOf[A50])
      case 50 => SealedTrait62._51(a.asInstanceOf[A51])
      case 51 => SealedTrait62._52(a.asInstanceOf[A52])
      case 52 => SealedTrait62._53(a.asInstanceOf[A53])
      case 53 => SealedTrait62._54(a.asInstanceOf[A54])
      case 54 => SealedTrait62._55(a.asInstanceOf[A55])
      case 55 => SealedTrait62._56(a.asInstanceOf[A56])
      case 56 => SealedTrait62._57(a.asInstanceOf[A57])
      case 57 => SealedTrait62._58(a.asInstanceOf[A58])
      case 58 => SealedTrait62._59(a.asInstanceOf[A59])
      case 59 => SealedTrait62._60(a.asInstanceOf[A60])
      case 60 => SealedTrait62._61(a.asInstanceOf[A61])
      case 61 => SealedTrait62._62(a.asInstanceOf[A62])
    }
    def from(s: SealedTrait62[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, A59, A60, A61, A62]): A = s.value
  }

  implicit def sealedtrait63[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A, A28 <: A, A29 <: A, A30 <: A, A31 <: A, A32 <: A, A33 <: A, A34 <: A, A35 <: A, A36 <: A, A37 <: A, A38 <: A, A39 <: A, A40 <: A, A41 <: A, A42 <: A, A43 <: A, A44 <: A, A45 <: A, A46 <: A, A47 <: A, A48 <: A, A49 <: A, A50 <: A, A51 <: A, A52 <: A, A53 <: A, A54 <: A, A55 <: A, A56 <: A, A57 <: A, A58 <: A, A59 <: A, A60 <: A, A61 <: A, A62 <: A, A63 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, A59, A60, A61, A62, A63)): Shapely[A, SealedTrait63[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, A59, A60, A61, A62, A63]] = new Shapely[A, SealedTrait63[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, A59, A60, A61, A62, A63]] {
    def to(a: A): SealedTrait63[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, A59, A60, A61, A62, A63] = A.ordinal(a) match {
      case 0 => SealedTrait63._1(a.asInstanceOf[A1])
      case 1 => SealedTrait63._2(a.asInstanceOf[A2])
      case 2 => SealedTrait63._3(a.asInstanceOf[A3])
      case 3 => SealedTrait63._4(a.asInstanceOf[A4])
      case 4 => SealedTrait63._5(a.asInstanceOf[A5])
      case 5 => SealedTrait63._6(a.asInstanceOf[A6])
      case 6 => SealedTrait63._7(a.asInstanceOf[A7])
      case 7 => SealedTrait63._8(a.asInstanceOf[A8])
      case 8 => SealedTrait63._9(a.asInstanceOf[A9])
      case 9 => SealedTrait63._10(a.asInstanceOf[A10])
      case 10 => SealedTrait63._11(a.asInstanceOf[A11])
      case 11 => SealedTrait63._12(a.asInstanceOf[A12])
      case 12 => SealedTrait63._13(a.asInstanceOf[A13])
      case 13 => SealedTrait63._14(a.asInstanceOf[A14])
      case 14 => SealedTrait63._15(a.asInstanceOf[A15])
      case 15 => SealedTrait63._16(a.asInstanceOf[A16])
      case 16 => SealedTrait63._17(a.asInstanceOf[A17])
      case 17 => SealedTrait63._18(a.asInstanceOf[A18])
      case 18 => SealedTrait63._19(a.asInstanceOf[A19])
      case 19 => SealedTrait63._20(a.asInstanceOf[A20])
      case 20 => SealedTrait63._21(a.asInstanceOf[A21])
      case 21 => SealedTrait63._22(a.asInstanceOf[A22])
      case 22 => SealedTrait63._23(a.asInstanceOf[A23])
      case 23 => SealedTrait63._24(a.asInstanceOf[A24])
      case 24 => SealedTrait63._25(a.asInstanceOf[A25])
      case 25 => SealedTrait63._26(a.asInstanceOf[A26])
      case 26 => SealedTrait63._27(a.asInstanceOf[A27])
      case 27 => SealedTrait63._28(a.asInstanceOf[A28])
      case 28 => SealedTrait63._29(a.asInstanceOf[A29])
      case 29 => SealedTrait63._30(a.asInstanceOf[A30])
      case 30 => SealedTrait63._31(a.asInstanceOf[A31])
      case 31 => SealedTrait63._32(a.asInstanceOf[A32])
      case 32 => SealedTrait63._33(a.asInstanceOf[A33])
      case 33 => SealedTrait63._34(a.asInstanceOf[A34])
      case 34 => SealedTrait63._35(a.asInstanceOf[A35])
      case 35 => SealedTrait63._36(a.asInstanceOf[A36])
      case 36 => SealedTrait63._37(a.asInstanceOf[A37])
      case 37 => SealedTrait63._38(a.asInstanceOf[A38])
      case 38 => SealedTrait63._39(a.asInstanceOf[A39])
      case 39 => SealedTrait63._40(a.asInstanceOf[A40])
      case 40 => SealedTrait63._41(a.asInstanceOf[A41])
      case 41 => SealedTrait63._42(a.asInstanceOf[A42])
      case 42 => SealedTrait63._43(a.asInstanceOf[A43])
      case 43 => SealedTrait63._44(a.asInstanceOf[A44])
      case 44 => SealedTrait63._45(a.asInstanceOf[A45])
      case 45 => SealedTrait63._46(a.asInstanceOf[A46])
      case 46 => SealedTrait63._47(a.asInstanceOf[A47])
      case 47 => SealedTrait63._48(a.asInstanceOf[A48])
      case 48 => SealedTrait63._49(a.asInstanceOf[A49])
      case 49 => SealedTrait63._50(a.asInstanceOf[A50])
      case 50 => SealedTrait63._51(a.asInstanceOf[A51])
      case 51 => SealedTrait63._52(a.asInstanceOf[A52])
      case 52 => SealedTrait63._53(a.asInstanceOf[A53])
      case 53 => SealedTrait63._54(a.asInstanceOf[A54])
      case 54 => SealedTrait63._55(a.asInstanceOf[A55])
      case 55 => SealedTrait63._56(a.asInstanceOf[A56])
      case 56 => SealedTrait63._57(a.asInstanceOf[A57])
      case 57 => SealedTrait63._58(a.asInstanceOf[A58])
      case 58 => SealedTrait63._59(a.asInstanceOf[A59])
      case 59 => SealedTrait63._60(a.asInstanceOf[A60])
      case 60 => SealedTrait63._61(a.asInstanceOf[A61])
      case 61 => SealedTrait63._62(a.asInstanceOf[A62])
      case 62 => SealedTrait63._63(a.asInstanceOf[A63])
    }
    def from(s: SealedTrait63[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, A59, A60, A61, A62, A63]): A = s.value
  }

  implicit def sealedtrait64[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A, A28 <: A, A29 <: A, A30 <: A, A31 <: A, A32 <: A, A33 <: A, A34 <: A, A35 <: A, A36 <: A, A37 <: A, A38 <: A, A39 <: A, A40 <: A, A41 <: A, A42 <: A, A43 <: A, A44 <: A, A45 <: A, A46 <: A, A47 <: A, A48 <: A, A49 <: A, A50 <: A, A51 <: A, A52 <: A, A53 <: A, A54 <: A, A55 <: A, A56 <: A, A57 <: A, A58 <: A, A59 <: A, A60 <: A, A61 <: A, A62 <: A, A63 <: A, A64 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, A59, A60, A61, A62, A63, A64)): Shapely[A, SealedTrait64[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, A59, A60, A61, A62, A63, A64]] = new Shapely[A, SealedTrait64[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, A59, A60, A61, A62, A63, A64]] {
    def to(a: A): SealedTrait64[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, A59, A60, A61, A62, A63, A64] = A.ordinal(a) match {
      case 0 => SealedTrait64._1(a.asInstanceOf[A1])
      case 1 => SealedTrait64._2(a.asInstanceOf[A2])
      case 2 => SealedTrait64._3(a.asInstanceOf[A3])
      case 3 => SealedTrait64._4(a.asInstanceOf[A4])
      case 4 => SealedTrait64._5(a.asInstanceOf[A5])
      case 5 => SealedTrait64._6(a.asInstanceOf[A6])
      case 6 => SealedTrait64._7(a.asInstanceOf[A7])
      case 7 => SealedTrait64._8(a.asInstanceOf[A8])
      case 8 => SealedTrait64._9(a.asInstanceOf[A9])
      case 9 => SealedTrait64._10(a.asInstanceOf[A10])
      case 10 => SealedTrait64._11(a.asInstanceOf[A11])
      case 11 => SealedTrait64._12(a.asInstanceOf[A12])
      case 12 => SealedTrait64._13(a.asInstanceOf[A13])
      case 13 => SealedTrait64._14(a.asInstanceOf[A14])
      case 14 => SealedTrait64._15(a.asInstanceOf[A15])
      case 15 => SealedTrait64._16(a.asInstanceOf[A16])
      case 16 => SealedTrait64._17(a.asInstanceOf[A17])
      case 17 => SealedTrait64._18(a.asInstanceOf[A18])
      case 18 => SealedTrait64._19(a.asInstanceOf[A19])
      case 19 => SealedTrait64._20(a.asInstanceOf[A20])
      case 20 => SealedTrait64._21(a.asInstanceOf[A21])
      case 21 => SealedTrait64._22(a.asInstanceOf[A22])
      case 22 => SealedTrait64._23(a.asInstanceOf[A23])
      case 23 => SealedTrait64._24(a.asInstanceOf[A24])
      case 24 => SealedTrait64._25(a.asInstanceOf[A25])
      case 25 => SealedTrait64._26(a.asInstanceOf[A26])
      case 26 => SealedTrait64._27(a.asInstanceOf[A27])
      case 27 => SealedTrait64._28(a.asInstanceOf[A28])
      case 28 => SealedTrait64._29(a.asInstanceOf[A29])
      case 29 => SealedTrait64._30(a.asInstanceOf[A30])
      case 30 => SealedTrait64._31(a.asInstanceOf[A31])
      case 31 => SealedTrait64._32(a.asInstanceOf[A32])
      case 32 => SealedTrait64._33(a.asInstanceOf[A33])
      case 33 => SealedTrait64._34(a.asInstanceOf[A34])
      case 34 => SealedTrait64._35(a.asInstanceOf[A35])
      case 35 => SealedTrait64._36(a.asInstanceOf[A36])
      case 36 => SealedTrait64._37(a.asInstanceOf[A37])
      case 37 => SealedTrait64._38(a.asInstanceOf[A38])
      case 38 => SealedTrait64._39(a.asInstanceOf[A39])
      case 39 => SealedTrait64._40(a.asInstanceOf[A40])
      case 40 => SealedTrait64._41(a.asInstanceOf[A41])
      case 41 => SealedTrait64._42(a.asInstanceOf[A42])
      case 42 => SealedTrait64._43(a.asInstanceOf[A43])
      case 43 => SealedTrait64._44(a.asInstanceOf[A44])
      case 44 => SealedTrait64._45(a.asInstanceOf[A45])
      case 45 => SealedTrait64._46(a.asInstanceOf[A46])
      case 46 => SealedTrait64._47(a.asInstanceOf[A47])
      case 47 => SealedTrait64._48(a.asInstanceOf[A48])
      case 48 => SealedTrait64._49(a.asInstanceOf[A49])
      case 49 => SealedTrait64._50(a.asInstanceOf[A50])
      case 50 => SealedTrait64._51(a.asInstanceOf[A51])
      case 51 => SealedTrait64._52(a.asInstanceOf[A52])
      case 52 => SealedTrait64._53(a.asInstanceOf[A53])
      case 53 => SealedTrait64._54(a.asInstanceOf[A54])
      case 54 => SealedTrait64._55(a.asInstanceOf[A55])
      case 55 => SealedTrait64._56(a.asInstanceOf[A56])
      case 56 => SealedTrait64._57(a.asInstanceOf[A57])
      case 57 => SealedTrait64._58(a.asInstanceOf[A58])
      case 58 => SealedTrait64._59(a.asInstanceOf[A59])
      case 59 => SealedTrait64._60(a.asInstanceOf[A60])
      case 60 => SealedTrait64._61(a.asInstanceOf[A61])
      case 61 => SealedTrait64._62(a.asInstanceOf[A62])
      case 62 => SealedTrait64._63(a.asInstanceOf[A63])
      case 63 => SealedTrait64._64(a.asInstanceOf[A64])
    }
    def from(s: SealedTrait64[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, A59, A60, A61, A62, A63, A64]): A = s.value
  }

}