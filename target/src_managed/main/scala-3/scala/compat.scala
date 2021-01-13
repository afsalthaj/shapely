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
      case 0 => SealedTrait._1(a.asInstanceOf[A1])
    }
    def from(s: SealedTrait1[A, A1]): A = s.value
  }

  implicit def sealedtrait2[A, A1 <: A, A2 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2)): Shapely[A, SealedTrait2[A, A1, A2]] = new Shapely[A, SealedTrait2[A, A1, A2]] {
    def to(a: A): SealedTrait2[A, A1, A2] = A.ordinal(a) match {
      case 0 => SealedTrait._1(a.asInstanceOf[A1])
      case 1 => SealedTrait._2(a.asInstanceOf[A2])
    }
    def from(s: SealedTrait2[A, A1, A2]): A = s.value
  }

  implicit def sealedtrait3[A, A1 <: A, A2 <: A, A3 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3)): Shapely[A, SealedTrait3[A, A1, A2, A3]] = new Shapely[A, SealedTrait3[A, A1, A2, A3]] {
    def to(a: A): SealedTrait3[A, A1, A2, A3] = A.ordinal(a) match {
      case 0 => SealedTrait._1(a.asInstanceOf[A1])
      case 1 => SealedTrait._2(a.asInstanceOf[A2])
      case 2 => SealedTrait._3(a.asInstanceOf[A3])
    }
    def from(s: SealedTrait3[A, A1, A2, A3]): A = s.value
  }

  implicit def sealedtrait4[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4)): Shapely[A, SealedTrait4[A, A1, A2, A3, A4]] = new Shapely[A, SealedTrait4[A, A1, A2, A3, A4]] {
    def to(a: A): SealedTrait4[A, A1, A2, A3, A4] = A.ordinal(a) match {
      case 0 => SealedTrait._1(a.asInstanceOf[A1])
      case 1 => SealedTrait._2(a.asInstanceOf[A2])
      case 2 => SealedTrait._3(a.asInstanceOf[A3])
      case 3 => SealedTrait._4(a.asInstanceOf[A4])
    }
    def from(s: SealedTrait4[A, A1, A2, A3, A4]): A = s.value
  }

  implicit def sealedtrait5[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5)): Shapely[A, SealedTrait5[A, A1, A2, A3, A4, A5]] = new Shapely[A, SealedTrait5[A, A1, A2, A3, A4, A5]] {
    def to(a: A): SealedTrait5[A, A1, A2, A3, A4, A5] = A.ordinal(a) match {
      case 0 => SealedTrait._1(a.asInstanceOf[A1])
      case 1 => SealedTrait._2(a.asInstanceOf[A2])
      case 2 => SealedTrait._3(a.asInstanceOf[A3])
      case 3 => SealedTrait._4(a.asInstanceOf[A4])
      case 4 => SealedTrait._5(a.asInstanceOf[A5])
    }
    def from(s: SealedTrait5[A, A1, A2, A3, A4, A5]): A = s.value
  }

  implicit def sealedtrait6[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6)): Shapely[A, SealedTrait6[A, A1, A2, A3, A4, A5, A6]] = new Shapely[A, SealedTrait6[A, A1, A2, A3, A4, A5, A6]] {
    def to(a: A): SealedTrait6[A, A1, A2, A3, A4, A5, A6] = A.ordinal(a) match {
      case 0 => SealedTrait._1(a.asInstanceOf[A1])
      case 1 => SealedTrait._2(a.asInstanceOf[A2])
      case 2 => SealedTrait._3(a.asInstanceOf[A3])
      case 3 => SealedTrait._4(a.asInstanceOf[A4])
      case 4 => SealedTrait._5(a.asInstanceOf[A5])
      case 5 => SealedTrait._6(a.asInstanceOf[A6])
    }
    def from(s: SealedTrait6[A, A1, A2, A3, A4, A5, A6]): A = s.value
  }

  implicit def sealedtrait7[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7)): Shapely[A, SealedTrait7[A, A1, A2, A3, A4, A5, A6, A7]] = new Shapely[A, SealedTrait7[A, A1, A2, A3, A4, A5, A6, A7]] {
    def to(a: A): SealedTrait7[A, A1, A2, A3, A4, A5, A6, A7] = A.ordinal(a) match {
      case 0 => SealedTrait._1(a.asInstanceOf[A1])
      case 1 => SealedTrait._2(a.asInstanceOf[A2])
      case 2 => SealedTrait._3(a.asInstanceOf[A3])
      case 3 => SealedTrait._4(a.asInstanceOf[A4])
      case 4 => SealedTrait._5(a.asInstanceOf[A5])
      case 5 => SealedTrait._6(a.asInstanceOf[A6])
      case 6 => SealedTrait._7(a.asInstanceOf[A7])
    }
    def from(s: SealedTrait7[A, A1, A2, A3, A4, A5, A6, A7]): A = s.value
  }

  implicit def sealedtrait8[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8)): Shapely[A, SealedTrait8[A, A1, A2, A3, A4, A5, A6, A7, A8]] = new Shapely[A, SealedTrait8[A, A1, A2, A3, A4, A5, A6, A7, A8]] {
    def to(a: A): SealedTrait8[A, A1, A2, A3, A4, A5, A6, A7, A8] = A.ordinal(a) match {
      case 0 => SealedTrait._1(a.asInstanceOf[A1])
      case 1 => SealedTrait._2(a.asInstanceOf[A2])
      case 2 => SealedTrait._3(a.asInstanceOf[A3])
      case 3 => SealedTrait._4(a.asInstanceOf[A4])
      case 4 => SealedTrait._5(a.asInstanceOf[A5])
      case 5 => SealedTrait._6(a.asInstanceOf[A6])
      case 6 => SealedTrait._7(a.asInstanceOf[A7])
      case 7 => SealedTrait._8(a.asInstanceOf[A8])
    }
    def from(s: SealedTrait8[A, A1, A2, A3, A4, A5, A6, A7, A8]): A = s.value
  }

  implicit def sealedtrait9[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9)): Shapely[A, SealedTrait9[A, A1, A2, A3, A4, A5, A6, A7, A8, A9]] = new Shapely[A, SealedTrait9[A, A1, A2, A3, A4, A5, A6, A7, A8, A9]] {
    def to(a: A): SealedTrait9[A, A1, A2, A3, A4, A5, A6, A7, A8, A9] = A.ordinal(a) match {
      case 0 => SealedTrait._1(a.asInstanceOf[A1])
      case 1 => SealedTrait._2(a.asInstanceOf[A2])
      case 2 => SealedTrait._3(a.asInstanceOf[A3])
      case 3 => SealedTrait._4(a.asInstanceOf[A4])
      case 4 => SealedTrait._5(a.asInstanceOf[A5])
      case 5 => SealedTrait._6(a.asInstanceOf[A6])
      case 6 => SealedTrait._7(a.asInstanceOf[A7])
      case 7 => SealedTrait._8(a.asInstanceOf[A8])
      case 8 => SealedTrait._9(a.asInstanceOf[A9])
    }
    def from(s: SealedTrait9[A, A1, A2, A3, A4, A5, A6, A7, A8, A9]): A = s.value
  }

  implicit def sealedtrait10[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10)): Shapely[A, SealedTrait10[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10]] = new Shapely[A, SealedTrait10[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10]] {
    def to(a: A): SealedTrait10[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10] = A.ordinal(a) match {
      case 0 => SealedTrait._1(a.asInstanceOf[A1])
      case 1 => SealedTrait._2(a.asInstanceOf[A2])
      case 2 => SealedTrait._3(a.asInstanceOf[A3])
      case 3 => SealedTrait._4(a.asInstanceOf[A4])
      case 4 => SealedTrait._5(a.asInstanceOf[A5])
      case 5 => SealedTrait._6(a.asInstanceOf[A6])
      case 6 => SealedTrait._7(a.asInstanceOf[A7])
      case 7 => SealedTrait._8(a.asInstanceOf[A8])
      case 8 => SealedTrait._9(a.asInstanceOf[A9])
      case 9 => SealedTrait._10(a.asInstanceOf[A10])
    }
    def from(s: SealedTrait10[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10]): A = s.value
  }

  implicit def sealedtrait11[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11)): Shapely[A, SealedTrait11[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11]] = new Shapely[A, SealedTrait11[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11]] {
    def to(a: A): SealedTrait11[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11] = A.ordinal(a) match {
      case 0 => SealedTrait._1(a.asInstanceOf[A1])
      case 1 => SealedTrait._2(a.asInstanceOf[A2])
      case 2 => SealedTrait._3(a.asInstanceOf[A3])
      case 3 => SealedTrait._4(a.asInstanceOf[A4])
      case 4 => SealedTrait._5(a.asInstanceOf[A5])
      case 5 => SealedTrait._6(a.asInstanceOf[A6])
      case 6 => SealedTrait._7(a.asInstanceOf[A7])
      case 7 => SealedTrait._8(a.asInstanceOf[A8])
      case 8 => SealedTrait._9(a.asInstanceOf[A9])
      case 9 => SealedTrait._10(a.asInstanceOf[A10])
      case 10 => SealedTrait._11(a.asInstanceOf[A11])
    }
    def from(s: SealedTrait11[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11]): A = s.value
  }

  implicit def sealedtrait12[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12)): Shapely[A, SealedTrait12[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12]] = new Shapely[A, SealedTrait12[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12]] {
    def to(a: A): SealedTrait12[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12] = A.ordinal(a) match {
      case 0 => SealedTrait._1(a.asInstanceOf[A1])
      case 1 => SealedTrait._2(a.asInstanceOf[A2])
      case 2 => SealedTrait._3(a.asInstanceOf[A3])
      case 3 => SealedTrait._4(a.asInstanceOf[A4])
      case 4 => SealedTrait._5(a.asInstanceOf[A5])
      case 5 => SealedTrait._6(a.asInstanceOf[A6])
      case 6 => SealedTrait._7(a.asInstanceOf[A7])
      case 7 => SealedTrait._8(a.asInstanceOf[A8])
      case 8 => SealedTrait._9(a.asInstanceOf[A9])
      case 9 => SealedTrait._10(a.asInstanceOf[A10])
      case 10 => SealedTrait._11(a.asInstanceOf[A11])
      case 11 => SealedTrait._12(a.asInstanceOf[A12])
    }
    def from(s: SealedTrait12[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12]): A = s.value
  }

  implicit def sealedtrait13[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13)): Shapely[A, SealedTrait13[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13]] = new Shapely[A, SealedTrait13[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13]] {
    def to(a: A): SealedTrait13[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13] = A.ordinal(a) match {
      case 0 => SealedTrait._1(a.asInstanceOf[A1])
      case 1 => SealedTrait._2(a.asInstanceOf[A2])
      case 2 => SealedTrait._3(a.asInstanceOf[A3])
      case 3 => SealedTrait._4(a.asInstanceOf[A4])
      case 4 => SealedTrait._5(a.asInstanceOf[A5])
      case 5 => SealedTrait._6(a.asInstanceOf[A6])
      case 6 => SealedTrait._7(a.asInstanceOf[A7])
      case 7 => SealedTrait._8(a.asInstanceOf[A8])
      case 8 => SealedTrait._9(a.asInstanceOf[A9])
      case 9 => SealedTrait._10(a.asInstanceOf[A10])
      case 10 => SealedTrait._11(a.asInstanceOf[A11])
      case 11 => SealedTrait._12(a.asInstanceOf[A12])
      case 12 => SealedTrait._13(a.asInstanceOf[A13])
    }
    def from(s: SealedTrait13[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13]): A = s.value
  }

  implicit def sealedtrait14[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14)): Shapely[A, SealedTrait14[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14]] = new Shapely[A, SealedTrait14[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14]] {
    def to(a: A): SealedTrait14[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14] = A.ordinal(a) match {
      case 0 => SealedTrait._1(a.asInstanceOf[A1])
      case 1 => SealedTrait._2(a.asInstanceOf[A2])
      case 2 => SealedTrait._3(a.asInstanceOf[A3])
      case 3 => SealedTrait._4(a.asInstanceOf[A4])
      case 4 => SealedTrait._5(a.asInstanceOf[A5])
      case 5 => SealedTrait._6(a.asInstanceOf[A6])
      case 6 => SealedTrait._7(a.asInstanceOf[A7])
      case 7 => SealedTrait._8(a.asInstanceOf[A8])
      case 8 => SealedTrait._9(a.asInstanceOf[A9])
      case 9 => SealedTrait._10(a.asInstanceOf[A10])
      case 10 => SealedTrait._11(a.asInstanceOf[A11])
      case 11 => SealedTrait._12(a.asInstanceOf[A12])
      case 12 => SealedTrait._13(a.asInstanceOf[A13])
      case 13 => SealedTrait._14(a.asInstanceOf[A14])
    }
    def from(s: SealedTrait14[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14]): A = s.value
  }

  implicit def sealedtrait15[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15)): Shapely[A, SealedTrait15[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15]] = new Shapely[A, SealedTrait15[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15]] {
    def to(a: A): SealedTrait15[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15] = A.ordinal(a) match {
      case 0 => SealedTrait._1(a.asInstanceOf[A1])
      case 1 => SealedTrait._2(a.asInstanceOf[A2])
      case 2 => SealedTrait._3(a.asInstanceOf[A3])
      case 3 => SealedTrait._4(a.asInstanceOf[A4])
      case 4 => SealedTrait._5(a.asInstanceOf[A5])
      case 5 => SealedTrait._6(a.asInstanceOf[A6])
      case 6 => SealedTrait._7(a.asInstanceOf[A7])
      case 7 => SealedTrait._8(a.asInstanceOf[A8])
      case 8 => SealedTrait._9(a.asInstanceOf[A9])
      case 9 => SealedTrait._10(a.asInstanceOf[A10])
      case 10 => SealedTrait._11(a.asInstanceOf[A11])
      case 11 => SealedTrait._12(a.asInstanceOf[A12])
      case 12 => SealedTrait._13(a.asInstanceOf[A13])
      case 13 => SealedTrait._14(a.asInstanceOf[A14])
      case 14 => SealedTrait._15(a.asInstanceOf[A15])
    }
    def from(s: SealedTrait15[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15]): A = s.value
  }

  implicit def sealedtrait16[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16)): Shapely[A, SealedTrait16[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16]] = new Shapely[A, SealedTrait16[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16]] {
    def to(a: A): SealedTrait16[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16] = A.ordinal(a) match {
      case 0 => SealedTrait._1(a.asInstanceOf[A1])
      case 1 => SealedTrait._2(a.asInstanceOf[A2])
      case 2 => SealedTrait._3(a.asInstanceOf[A3])
      case 3 => SealedTrait._4(a.asInstanceOf[A4])
      case 4 => SealedTrait._5(a.asInstanceOf[A5])
      case 5 => SealedTrait._6(a.asInstanceOf[A6])
      case 6 => SealedTrait._7(a.asInstanceOf[A7])
      case 7 => SealedTrait._8(a.asInstanceOf[A8])
      case 8 => SealedTrait._9(a.asInstanceOf[A9])
      case 9 => SealedTrait._10(a.asInstanceOf[A10])
      case 10 => SealedTrait._11(a.asInstanceOf[A11])
      case 11 => SealedTrait._12(a.asInstanceOf[A12])
      case 12 => SealedTrait._13(a.asInstanceOf[A13])
      case 13 => SealedTrait._14(a.asInstanceOf[A14])
      case 14 => SealedTrait._15(a.asInstanceOf[A15])
      case 15 => SealedTrait._16(a.asInstanceOf[A16])
    }
    def from(s: SealedTrait16[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16]): A = s.value
  }

  implicit def sealedtrait17[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17)): Shapely[A, SealedTrait17[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17]] = new Shapely[A, SealedTrait17[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17]] {
    def to(a: A): SealedTrait17[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17] = A.ordinal(a) match {
      case 0 => SealedTrait._1(a.asInstanceOf[A1])
      case 1 => SealedTrait._2(a.asInstanceOf[A2])
      case 2 => SealedTrait._3(a.asInstanceOf[A3])
      case 3 => SealedTrait._4(a.asInstanceOf[A4])
      case 4 => SealedTrait._5(a.asInstanceOf[A5])
      case 5 => SealedTrait._6(a.asInstanceOf[A6])
      case 6 => SealedTrait._7(a.asInstanceOf[A7])
      case 7 => SealedTrait._8(a.asInstanceOf[A8])
      case 8 => SealedTrait._9(a.asInstanceOf[A9])
      case 9 => SealedTrait._10(a.asInstanceOf[A10])
      case 10 => SealedTrait._11(a.asInstanceOf[A11])
      case 11 => SealedTrait._12(a.asInstanceOf[A12])
      case 12 => SealedTrait._13(a.asInstanceOf[A13])
      case 13 => SealedTrait._14(a.asInstanceOf[A14])
      case 14 => SealedTrait._15(a.asInstanceOf[A15])
      case 15 => SealedTrait._16(a.asInstanceOf[A16])
      case 16 => SealedTrait._17(a.asInstanceOf[A17])
    }
    def from(s: SealedTrait17[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17]): A = s.value
  }

  implicit def sealedtrait18[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18)): Shapely[A, SealedTrait18[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18]] = new Shapely[A, SealedTrait18[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18]] {
    def to(a: A): SealedTrait18[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18] = A.ordinal(a) match {
      case 0 => SealedTrait._1(a.asInstanceOf[A1])
      case 1 => SealedTrait._2(a.asInstanceOf[A2])
      case 2 => SealedTrait._3(a.asInstanceOf[A3])
      case 3 => SealedTrait._4(a.asInstanceOf[A4])
      case 4 => SealedTrait._5(a.asInstanceOf[A5])
      case 5 => SealedTrait._6(a.asInstanceOf[A6])
      case 6 => SealedTrait._7(a.asInstanceOf[A7])
      case 7 => SealedTrait._8(a.asInstanceOf[A8])
      case 8 => SealedTrait._9(a.asInstanceOf[A9])
      case 9 => SealedTrait._10(a.asInstanceOf[A10])
      case 10 => SealedTrait._11(a.asInstanceOf[A11])
      case 11 => SealedTrait._12(a.asInstanceOf[A12])
      case 12 => SealedTrait._13(a.asInstanceOf[A13])
      case 13 => SealedTrait._14(a.asInstanceOf[A14])
      case 14 => SealedTrait._15(a.asInstanceOf[A15])
      case 15 => SealedTrait._16(a.asInstanceOf[A16])
      case 16 => SealedTrait._17(a.asInstanceOf[A17])
      case 17 => SealedTrait._18(a.asInstanceOf[A18])
    }
    def from(s: SealedTrait18[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18]): A = s.value
  }

  implicit def sealedtrait19[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19)): Shapely[A, SealedTrait19[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19]] = new Shapely[A, SealedTrait19[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19]] {
    def to(a: A): SealedTrait19[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19] = A.ordinal(a) match {
      case 0 => SealedTrait._1(a.asInstanceOf[A1])
      case 1 => SealedTrait._2(a.asInstanceOf[A2])
      case 2 => SealedTrait._3(a.asInstanceOf[A3])
      case 3 => SealedTrait._4(a.asInstanceOf[A4])
      case 4 => SealedTrait._5(a.asInstanceOf[A5])
      case 5 => SealedTrait._6(a.asInstanceOf[A6])
      case 6 => SealedTrait._7(a.asInstanceOf[A7])
      case 7 => SealedTrait._8(a.asInstanceOf[A8])
      case 8 => SealedTrait._9(a.asInstanceOf[A9])
      case 9 => SealedTrait._10(a.asInstanceOf[A10])
      case 10 => SealedTrait._11(a.asInstanceOf[A11])
      case 11 => SealedTrait._12(a.asInstanceOf[A12])
      case 12 => SealedTrait._13(a.asInstanceOf[A13])
      case 13 => SealedTrait._14(a.asInstanceOf[A14])
      case 14 => SealedTrait._15(a.asInstanceOf[A15])
      case 15 => SealedTrait._16(a.asInstanceOf[A16])
      case 16 => SealedTrait._17(a.asInstanceOf[A17])
      case 17 => SealedTrait._18(a.asInstanceOf[A18])
      case 18 => SealedTrait._19(a.asInstanceOf[A19])
    }
    def from(s: SealedTrait19[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19]): A = s.value
  }

  implicit def sealedtrait20[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20)): Shapely[A, SealedTrait20[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20]] = new Shapely[A, SealedTrait20[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20]] {
    def to(a: A): SealedTrait20[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20] = A.ordinal(a) match {
      case 0 => SealedTrait._1(a.asInstanceOf[A1])
      case 1 => SealedTrait._2(a.asInstanceOf[A2])
      case 2 => SealedTrait._3(a.asInstanceOf[A3])
      case 3 => SealedTrait._4(a.asInstanceOf[A4])
      case 4 => SealedTrait._5(a.asInstanceOf[A5])
      case 5 => SealedTrait._6(a.asInstanceOf[A6])
      case 6 => SealedTrait._7(a.asInstanceOf[A7])
      case 7 => SealedTrait._8(a.asInstanceOf[A8])
      case 8 => SealedTrait._9(a.asInstanceOf[A9])
      case 9 => SealedTrait._10(a.asInstanceOf[A10])
      case 10 => SealedTrait._11(a.asInstanceOf[A11])
      case 11 => SealedTrait._12(a.asInstanceOf[A12])
      case 12 => SealedTrait._13(a.asInstanceOf[A13])
      case 13 => SealedTrait._14(a.asInstanceOf[A14])
      case 14 => SealedTrait._15(a.asInstanceOf[A15])
      case 15 => SealedTrait._16(a.asInstanceOf[A16])
      case 16 => SealedTrait._17(a.asInstanceOf[A17])
      case 17 => SealedTrait._18(a.asInstanceOf[A18])
      case 18 => SealedTrait._19(a.asInstanceOf[A19])
      case 19 => SealedTrait._20(a.asInstanceOf[A20])
    }
    def from(s: SealedTrait20[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20]): A = s.value
  }

  implicit def sealedtrait21[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21)): Shapely[A, SealedTrait21[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21]] = new Shapely[A, SealedTrait21[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21]] {
    def to(a: A): SealedTrait21[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21] = A.ordinal(a) match {
      case 0 => SealedTrait._1(a.asInstanceOf[A1])
      case 1 => SealedTrait._2(a.asInstanceOf[A2])
      case 2 => SealedTrait._3(a.asInstanceOf[A3])
      case 3 => SealedTrait._4(a.asInstanceOf[A4])
      case 4 => SealedTrait._5(a.asInstanceOf[A5])
      case 5 => SealedTrait._6(a.asInstanceOf[A6])
      case 6 => SealedTrait._7(a.asInstanceOf[A7])
      case 7 => SealedTrait._8(a.asInstanceOf[A8])
      case 8 => SealedTrait._9(a.asInstanceOf[A9])
      case 9 => SealedTrait._10(a.asInstanceOf[A10])
      case 10 => SealedTrait._11(a.asInstanceOf[A11])
      case 11 => SealedTrait._12(a.asInstanceOf[A12])
      case 12 => SealedTrait._13(a.asInstanceOf[A13])
      case 13 => SealedTrait._14(a.asInstanceOf[A14])
      case 14 => SealedTrait._15(a.asInstanceOf[A15])
      case 15 => SealedTrait._16(a.asInstanceOf[A16])
      case 16 => SealedTrait._17(a.asInstanceOf[A17])
      case 17 => SealedTrait._18(a.asInstanceOf[A18])
      case 18 => SealedTrait._19(a.asInstanceOf[A19])
      case 19 => SealedTrait._20(a.asInstanceOf[A20])
      case 20 => SealedTrait._21(a.asInstanceOf[A21])
    }
    def from(s: SealedTrait21[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21]): A = s.value
  }

  implicit def sealedtrait22[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22)): Shapely[A, SealedTrait22[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22]] = new Shapely[A, SealedTrait22[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22]] {
    def to(a: A): SealedTrait22[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22] = A.ordinal(a) match {
      case 0 => SealedTrait._1(a.asInstanceOf[A1])
      case 1 => SealedTrait._2(a.asInstanceOf[A2])
      case 2 => SealedTrait._3(a.asInstanceOf[A3])
      case 3 => SealedTrait._4(a.asInstanceOf[A4])
      case 4 => SealedTrait._5(a.asInstanceOf[A5])
      case 5 => SealedTrait._6(a.asInstanceOf[A6])
      case 6 => SealedTrait._7(a.asInstanceOf[A7])
      case 7 => SealedTrait._8(a.asInstanceOf[A8])
      case 8 => SealedTrait._9(a.asInstanceOf[A9])
      case 9 => SealedTrait._10(a.asInstanceOf[A10])
      case 10 => SealedTrait._11(a.asInstanceOf[A11])
      case 11 => SealedTrait._12(a.asInstanceOf[A12])
      case 12 => SealedTrait._13(a.asInstanceOf[A13])
      case 13 => SealedTrait._14(a.asInstanceOf[A14])
      case 14 => SealedTrait._15(a.asInstanceOf[A15])
      case 15 => SealedTrait._16(a.asInstanceOf[A16])
      case 16 => SealedTrait._17(a.asInstanceOf[A17])
      case 17 => SealedTrait._18(a.asInstanceOf[A18])
      case 18 => SealedTrait._19(a.asInstanceOf[A19])
      case 19 => SealedTrait._20(a.asInstanceOf[A20])
      case 20 => SealedTrait._21(a.asInstanceOf[A21])
      case 21 => SealedTrait._22(a.asInstanceOf[A22])
    }
    def from(s: SealedTrait22[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22]): A = s.value
  }

  implicit def sealedtrait23[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23)): Shapely[A, SealedTrait23[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23]] = new Shapely[A, SealedTrait23[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23]] {
    def to(a: A): SealedTrait23[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23] = A.ordinal(a) match {
      case 0 => SealedTrait._1(a.asInstanceOf[A1])
      case 1 => SealedTrait._2(a.asInstanceOf[A2])
      case 2 => SealedTrait._3(a.asInstanceOf[A3])
      case 3 => SealedTrait._4(a.asInstanceOf[A4])
      case 4 => SealedTrait._5(a.asInstanceOf[A5])
      case 5 => SealedTrait._6(a.asInstanceOf[A6])
      case 6 => SealedTrait._7(a.asInstanceOf[A7])
      case 7 => SealedTrait._8(a.asInstanceOf[A8])
      case 8 => SealedTrait._9(a.asInstanceOf[A9])
      case 9 => SealedTrait._10(a.asInstanceOf[A10])
      case 10 => SealedTrait._11(a.asInstanceOf[A11])
      case 11 => SealedTrait._12(a.asInstanceOf[A12])
      case 12 => SealedTrait._13(a.asInstanceOf[A13])
      case 13 => SealedTrait._14(a.asInstanceOf[A14])
      case 14 => SealedTrait._15(a.asInstanceOf[A15])
      case 15 => SealedTrait._16(a.asInstanceOf[A16])
      case 16 => SealedTrait._17(a.asInstanceOf[A17])
      case 17 => SealedTrait._18(a.asInstanceOf[A18])
      case 18 => SealedTrait._19(a.asInstanceOf[A19])
      case 19 => SealedTrait._20(a.asInstanceOf[A20])
      case 20 => SealedTrait._21(a.asInstanceOf[A21])
      case 21 => SealedTrait._22(a.asInstanceOf[A22])
      case 22 => SealedTrait._23(a.asInstanceOf[A23])
    }
    def from(s: SealedTrait23[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23]): A = s.value
  }

  implicit def sealedtrait24[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24)): Shapely[A, SealedTrait24[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24]] = new Shapely[A, SealedTrait24[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24]] {
    def to(a: A): SealedTrait24[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24] = A.ordinal(a) match {
      case 0 => SealedTrait._1(a.asInstanceOf[A1])
      case 1 => SealedTrait._2(a.asInstanceOf[A2])
      case 2 => SealedTrait._3(a.asInstanceOf[A3])
      case 3 => SealedTrait._4(a.asInstanceOf[A4])
      case 4 => SealedTrait._5(a.asInstanceOf[A5])
      case 5 => SealedTrait._6(a.asInstanceOf[A6])
      case 6 => SealedTrait._7(a.asInstanceOf[A7])
      case 7 => SealedTrait._8(a.asInstanceOf[A8])
      case 8 => SealedTrait._9(a.asInstanceOf[A9])
      case 9 => SealedTrait._10(a.asInstanceOf[A10])
      case 10 => SealedTrait._11(a.asInstanceOf[A11])
      case 11 => SealedTrait._12(a.asInstanceOf[A12])
      case 12 => SealedTrait._13(a.asInstanceOf[A13])
      case 13 => SealedTrait._14(a.asInstanceOf[A14])
      case 14 => SealedTrait._15(a.asInstanceOf[A15])
      case 15 => SealedTrait._16(a.asInstanceOf[A16])
      case 16 => SealedTrait._17(a.asInstanceOf[A17])
      case 17 => SealedTrait._18(a.asInstanceOf[A18])
      case 18 => SealedTrait._19(a.asInstanceOf[A19])
      case 19 => SealedTrait._20(a.asInstanceOf[A20])
      case 20 => SealedTrait._21(a.asInstanceOf[A21])
      case 21 => SealedTrait._22(a.asInstanceOf[A22])
      case 22 => SealedTrait._23(a.asInstanceOf[A23])
      case 23 => SealedTrait._24(a.asInstanceOf[A24])
    }
    def from(s: SealedTrait24[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24]): A = s.value
  }

  implicit def sealedtrait25[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25)): Shapely[A, SealedTrait25[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25]] = new Shapely[A, SealedTrait25[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25]] {
    def to(a: A): SealedTrait25[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25] = A.ordinal(a) match {
      case 0 => SealedTrait._1(a.asInstanceOf[A1])
      case 1 => SealedTrait._2(a.asInstanceOf[A2])
      case 2 => SealedTrait._3(a.asInstanceOf[A3])
      case 3 => SealedTrait._4(a.asInstanceOf[A4])
      case 4 => SealedTrait._5(a.asInstanceOf[A5])
      case 5 => SealedTrait._6(a.asInstanceOf[A6])
      case 6 => SealedTrait._7(a.asInstanceOf[A7])
      case 7 => SealedTrait._8(a.asInstanceOf[A8])
      case 8 => SealedTrait._9(a.asInstanceOf[A9])
      case 9 => SealedTrait._10(a.asInstanceOf[A10])
      case 10 => SealedTrait._11(a.asInstanceOf[A11])
      case 11 => SealedTrait._12(a.asInstanceOf[A12])
      case 12 => SealedTrait._13(a.asInstanceOf[A13])
      case 13 => SealedTrait._14(a.asInstanceOf[A14])
      case 14 => SealedTrait._15(a.asInstanceOf[A15])
      case 15 => SealedTrait._16(a.asInstanceOf[A16])
      case 16 => SealedTrait._17(a.asInstanceOf[A17])
      case 17 => SealedTrait._18(a.asInstanceOf[A18])
      case 18 => SealedTrait._19(a.asInstanceOf[A19])
      case 19 => SealedTrait._20(a.asInstanceOf[A20])
      case 20 => SealedTrait._21(a.asInstanceOf[A21])
      case 21 => SealedTrait._22(a.asInstanceOf[A22])
      case 22 => SealedTrait._23(a.asInstanceOf[A23])
      case 23 => SealedTrait._24(a.asInstanceOf[A24])
      case 24 => SealedTrait._25(a.asInstanceOf[A25])
    }
    def from(s: SealedTrait25[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25]): A = s.value
  }

  implicit def sealedtrait26[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26)): Shapely[A, SealedTrait26[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26]] = new Shapely[A, SealedTrait26[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26]] {
    def to(a: A): SealedTrait26[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26] = A.ordinal(a) match {
      case 0 => SealedTrait._1(a.asInstanceOf[A1])
      case 1 => SealedTrait._2(a.asInstanceOf[A2])
      case 2 => SealedTrait._3(a.asInstanceOf[A3])
      case 3 => SealedTrait._4(a.asInstanceOf[A4])
      case 4 => SealedTrait._5(a.asInstanceOf[A5])
      case 5 => SealedTrait._6(a.asInstanceOf[A6])
      case 6 => SealedTrait._7(a.asInstanceOf[A7])
      case 7 => SealedTrait._8(a.asInstanceOf[A8])
      case 8 => SealedTrait._9(a.asInstanceOf[A9])
      case 9 => SealedTrait._10(a.asInstanceOf[A10])
      case 10 => SealedTrait._11(a.asInstanceOf[A11])
      case 11 => SealedTrait._12(a.asInstanceOf[A12])
      case 12 => SealedTrait._13(a.asInstanceOf[A13])
      case 13 => SealedTrait._14(a.asInstanceOf[A14])
      case 14 => SealedTrait._15(a.asInstanceOf[A15])
      case 15 => SealedTrait._16(a.asInstanceOf[A16])
      case 16 => SealedTrait._17(a.asInstanceOf[A17])
      case 17 => SealedTrait._18(a.asInstanceOf[A18])
      case 18 => SealedTrait._19(a.asInstanceOf[A19])
      case 19 => SealedTrait._20(a.asInstanceOf[A20])
      case 20 => SealedTrait._21(a.asInstanceOf[A21])
      case 21 => SealedTrait._22(a.asInstanceOf[A22])
      case 22 => SealedTrait._23(a.asInstanceOf[A23])
      case 23 => SealedTrait._24(a.asInstanceOf[A24])
      case 24 => SealedTrait._25(a.asInstanceOf[A25])
      case 25 => SealedTrait._26(a.asInstanceOf[A26])
    }
    def from(s: SealedTrait26[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26]): A = s.value
  }

  implicit def sealedtrait27[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27)): Shapely[A, SealedTrait27[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27]] = new Shapely[A, SealedTrait27[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27]] {
    def to(a: A): SealedTrait27[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27] = A.ordinal(a) match {
      case 0 => SealedTrait._1(a.asInstanceOf[A1])
      case 1 => SealedTrait._2(a.asInstanceOf[A2])
      case 2 => SealedTrait._3(a.asInstanceOf[A3])
      case 3 => SealedTrait._4(a.asInstanceOf[A4])
      case 4 => SealedTrait._5(a.asInstanceOf[A5])
      case 5 => SealedTrait._6(a.asInstanceOf[A6])
      case 6 => SealedTrait._7(a.asInstanceOf[A7])
      case 7 => SealedTrait._8(a.asInstanceOf[A8])
      case 8 => SealedTrait._9(a.asInstanceOf[A9])
      case 9 => SealedTrait._10(a.asInstanceOf[A10])
      case 10 => SealedTrait._11(a.asInstanceOf[A11])
      case 11 => SealedTrait._12(a.asInstanceOf[A12])
      case 12 => SealedTrait._13(a.asInstanceOf[A13])
      case 13 => SealedTrait._14(a.asInstanceOf[A14])
      case 14 => SealedTrait._15(a.asInstanceOf[A15])
      case 15 => SealedTrait._16(a.asInstanceOf[A16])
      case 16 => SealedTrait._17(a.asInstanceOf[A17])
      case 17 => SealedTrait._18(a.asInstanceOf[A18])
      case 18 => SealedTrait._19(a.asInstanceOf[A19])
      case 19 => SealedTrait._20(a.asInstanceOf[A20])
      case 20 => SealedTrait._21(a.asInstanceOf[A21])
      case 21 => SealedTrait._22(a.asInstanceOf[A22])
      case 22 => SealedTrait._23(a.asInstanceOf[A23])
      case 23 => SealedTrait._24(a.asInstanceOf[A24])
      case 24 => SealedTrait._25(a.asInstanceOf[A25])
      case 25 => SealedTrait._26(a.asInstanceOf[A26])
      case 26 => SealedTrait._27(a.asInstanceOf[A27])
    }
    def from(s: SealedTrait27[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27]): A = s.value
  }

  implicit def sealedtrait28[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A, A28 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28)): Shapely[A, SealedTrait28[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28]] = new Shapely[A, SealedTrait28[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28]] {
    def to(a: A): SealedTrait28[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28] = A.ordinal(a) match {
      case 0 => SealedTrait._1(a.asInstanceOf[A1])
      case 1 => SealedTrait._2(a.asInstanceOf[A2])
      case 2 => SealedTrait._3(a.asInstanceOf[A3])
      case 3 => SealedTrait._4(a.asInstanceOf[A4])
      case 4 => SealedTrait._5(a.asInstanceOf[A5])
      case 5 => SealedTrait._6(a.asInstanceOf[A6])
      case 6 => SealedTrait._7(a.asInstanceOf[A7])
      case 7 => SealedTrait._8(a.asInstanceOf[A8])
      case 8 => SealedTrait._9(a.asInstanceOf[A9])
      case 9 => SealedTrait._10(a.asInstanceOf[A10])
      case 10 => SealedTrait._11(a.asInstanceOf[A11])
      case 11 => SealedTrait._12(a.asInstanceOf[A12])
      case 12 => SealedTrait._13(a.asInstanceOf[A13])
      case 13 => SealedTrait._14(a.asInstanceOf[A14])
      case 14 => SealedTrait._15(a.asInstanceOf[A15])
      case 15 => SealedTrait._16(a.asInstanceOf[A16])
      case 16 => SealedTrait._17(a.asInstanceOf[A17])
      case 17 => SealedTrait._18(a.asInstanceOf[A18])
      case 18 => SealedTrait._19(a.asInstanceOf[A19])
      case 19 => SealedTrait._20(a.asInstanceOf[A20])
      case 20 => SealedTrait._21(a.asInstanceOf[A21])
      case 21 => SealedTrait._22(a.asInstanceOf[A22])
      case 22 => SealedTrait._23(a.asInstanceOf[A23])
      case 23 => SealedTrait._24(a.asInstanceOf[A24])
      case 24 => SealedTrait._25(a.asInstanceOf[A25])
      case 25 => SealedTrait._26(a.asInstanceOf[A26])
      case 26 => SealedTrait._27(a.asInstanceOf[A27])
      case 27 => SealedTrait._28(a.asInstanceOf[A28])
    }
    def from(s: SealedTrait28[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28]): A = s.value
  }

  implicit def sealedtrait29[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A, A28 <: A, A29 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29)): Shapely[A, SealedTrait29[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29]] = new Shapely[A, SealedTrait29[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29]] {
    def to(a: A): SealedTrait29[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29] = A.ordinal(a) match {
      case 0 => SealedTrait._1(a.asInstanceOf[A1])
      case 1 => SealedTrait._2(a.asInstanceOf[A2])
      case 2 => SealedTrait._3(a.asInstanceOf[A3])
      case 3 => SealedTrait._4(a.asInstanceOf[A4])
      case 4 => SealedTrait._5(a.asInstanceOf[A5])
      case 5 => SealedTrait._6(a.asInstanceOf[A6])
      case 6 => SealedTrait._7(a.asInstanceOf[A7])
      case 7 => SealedTrait._8(a.asInstanceOf[A8])
      case 8 => SealedTrait._9(a.asInstanceOf[A9])
      case 9 => SealedTrait._10(a.asInstanceOf[A10])
      case 10 => SealedTrait._11(a.asInstanceOf[A11])
      case 11 => SealedTrait._12(a.asInstanceOf[A12])
      case 12 => SealedTrait._13(a.asInstanceOf[A13])
      case 13 => SealedTrait._14(a.asInstanceOf[A14])
      case 14 => SealedTrait._15(a.asInstanceOf[A15])
      case 15 => SealedTrait._16(a.asInstanceOf[A16])
      case 16 => SealedTrait._17(a.asInstanceOf[A17])
      case 17 => SealedTrait._18(a.asInstanceOf[A18])
      case 18 => SealedTrait._19(a.asInstanceOf[A19])
      case 19 => SealedTrait._20(a.asInstanceOf[A20])
      case 20 => SealedTrait._21(a.asInstanceOf[A21])
      case 21 => SealedTrait._22(a.asInstanceOf[A22])
      case 22 => SealedTrait._23(a.asInstanceOf[A23])
      case 23 => SealedTrait._24(a.asInstanceOf[A24])
      case 24 => SealedTrait._25(a.asInstanceOf[A25])
      case 25 => SealedTrait._26(a.asInstanceOf[A26])
      case 26 => SealedTrait._27(a.asInstanceOf[A27])
      case 27 => SealedTrait._28(a.asInstanceOf[A28])
      case 28 => SealedTrait._29(a.asInstanceOf[A29])
    }
    def from(s: SealedTrait29[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29]): A = s.value
  }

  implicit def sealedtrait30[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A, A28 <: A, A29 <: A, A30 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30)): Shapely[A, SealedTrait30[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30]] = new Shapely[A, SealedTrait30[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30]] {
    def to(a: A): SealedTrait30[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30] = A.ordinal(a) match {
      case 0 => SealedTrait._1(a.asInstanceOf[A1])
      case 1 => SealedTrait._2(a.asInstanceOf[A2])
      case 2 => SealedTrait._3(a.asInstanceOf[A3])
      case 3 => SealedTrait._4(a.asInstanceOf[A4])
      case 4 => SealedTrait._5(a.asInstanceOf[A5])
      case 5 => SealedTrait._6(a.asInstanceOf[A6])
      case 6 => SealedTrait._7(a.asInstanceOf[A7])
      case 7 => SealedTrait._8(a.asInstanceOf[A8])
      case 8 => SealedTrait._9(a.asInstanceOf[A9])
      case 9 => SealedTrait._10(a.asInstanceOf[A10])
      case 10 => SealedTrait._11(a.asInstanceOf[A11])
      case 11 => SealedTrait._12(a.asInstanceOf[A12])
      case 12 => SealedTrait._13(a.asInstanceOf[A13])
      case 13 => SealedTrait._14(a.asInstanceOf[A14])
      case 14 => SealedTrait._15(a.asInstanceOf[A15])
      case 15 => SealedTrait._16(a.asInstanceOf[A16])
      case 16 => SealedTrait._17(a.asInstanceOf[A17])
      case 17 => SealedTrait._18(a.asInstanceOf[A18])
      case 18 => SealedTrait._19(a.asInstanceOf[A19])
      case 19 => SealedTrait._20(a.asInstanceOf[A20])
      case 20 => SealedTrait._21(a.asInstanceOf[A21])
      case 21 => SealedTrait._22(a.asInstanceOf[A22])
      case 22 => SealedTrait._23(a.asInstanceOf[A23])
      case 23 => SealedTrait._24(a.asInstanceOf[A24])
      case 24 => SealedTrait._25(a.asInstanceOf[A25])
      case 25 => SealedTrait._26(a.asInstanceOf[A26])
      case 26 => SealedTrait._27(a.asInstanceOf[A27])
      case 27 => SealedTrait._28(a.asInstanceOf[A28])
      case 28 => SealedTrait._29(a.asInstanceOf[A29])
      case 29 => SealedTrait._30(a.asInstanceOf[A30])
    }
    def from(s: SealedTrait30[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30]): A = s.value
  }

  implicit def sealedtrait31[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A, A28 <: A, A29 <: A, A30 <: A, A31 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31)): Shapely[A, SealedTrait31[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31]] = new Shapely[A, SealedTrait31[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31]] {
    def to(a: A): SealedTrait31[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31] = A.ordinal(a) match {
      case 0 => SealedTrait._1(a.asInstanceOf[A1])
      case 1 => SealedTrait._2(a.asInstanceOf[A2])
      case 2 => SealedTrait._3(a.asInstanceOf[A3])
      case 3 => SealedTrait._4(a.asInstanceOf[A4])
      case 4 => SealedTrait._5(a.asInstanceOf[A5])
      case 5 => SealedTrait._6(a.asInstanceOf[A6])
      case 6 => SealedTrait._7(a.asInstanceOf[A7])
      case 7 => SealedTrait._8(a.asInstanceOf[A8])
      case 8 => SealedTrait._9(a.asInstanceOf[A9])
      case 9 => SealedTrait._10(a.asInstanceOf[A10])
      case 10 => SealedTrait._11(a.asInstanceOf[A11])
      case 11 => SealedTrait._12(a.asInstanceOf[A12])
      case 12 => SealedTrait._13(a.asInstanceOf[A13])
      case 13 => SealedTrait._14(a.asInstanceOf[A14])
      case 14 => SealedTrait._15(a.asInstanceOf[A15])
      case 15 => SealedTrait._16(a.asInstanceOf[A16])
      case 16 => SealedTrait._17(a.asInstanceOf[A17])
      case 17 => SealedTrait._18(a.asInstanceOf[A18])
      case 18 => SealedTrait._19(a.asInstanceOf[A19])
      case 19 => SealedTrait._20(a.asInstanceOf[A20])
      case 20 => SealedTrait._21(a.asInstanceOf[A21])
      case 21 => SealedTrait._22(a.asInstanceOf[A22])
      case 22 => SealedTrait._23(a.asInstanceOf[A23])
      case 23 => SealedTrait._24(a.asInstanceOf[A24])
      case 24 => SealedTrait._25(a.asInstanceOf[A25])
      case 25 => SealedTrait._26(a.asInstanceOf[A26])
      case 26 => SealedTrait._27(a.asInstanceOf[A27])
      case 27 => SealedTrait._28(a.asInstanceOf[A28])
      case 28 => SealedTrait._29(a.asInstanceOf[A29])
      case 29 => SealedTrait._30(a.asInstanceOf[A30])
      case 30 => SealedTrait._31(a.asInstanceOf[A31])
    }
    def from(s: SealedTrait31[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31]): A = s.value
  }

  implicit def sealedtrait32[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A, A28 <: A, A29 <: A, A30 <: A, A31 <: A, A32 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32)): Shapely[A, SealedTrait32[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32]] = new Shapely[A, SealedTrait32[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32]] {
    def to(a: A): SealedTrait32[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32] = A.ordinal(a) match {
      case 0 => SealedTrait._1(a.asInstanceOf[A1])
      case 1 => SealedTrait._2(a.asInstanceOf[A2])
      case 2 => SealedTrait._3(a.asInstanceOf[A3])
      case 3 => SealedTrait._4(a.asInstanceOf[A4])
      case 4 => SealedTrait._5(a.asInstanceOf[A5])
      case 5 => SealedTrait._6(a.asInstanceOf[A6])
      case 6 => SealedTrait._7(a.asInstanceOf[A7])
      case 7 => SealedTrait._8(a.asInstanceOf[A8])
      case 8 => SealedTrait._9(a.asInstanceOf[A9])
      case 9 => SealedTrait._10(a.asInstanceOf[A10])
      case 10 => SealedTrait._11(a.asInstanceOf[A11])
      case 11 => SealedTrait._12(a.asInstanceOf[A12])
      case 12 => SealedTrait._13(a.asInstanceOf[A13])
      case 13 => SealedTrait._14(a.asInstanceOf[A14])
      case 14 => SealedTrait._15(a.asInstanceOf[A15])
      case 15 => SealedTrait._16(a.asInstanceOf[A16])
      case 16 => SealedTrait._17(a.asInstanceOf[A17])
      case 17 => SealedTrait._18(a.asInstanceOf[A18])
      case 18 => SealedTrait._19(a.asInstanceOf[A19])
      case 19 => SealedTrait._20(a.asInstanceOf[A20])
      case 20 => SealedTrait._21(a.asInstanceOf[A21])
      case 21 => SealedTrait._22(a.asInstanceOf[A22])
      case 22 => SealedTrait._23(a.asInstanceOf[A23])
      case 23 => SealedTrait._24(a.asInstanceOf[A24])
      case 24 => SealedTrait._25(a.asInstanceOf[A25])
      case 25 => SealedTrait._26(a.asInstanceOf[A26])
      case 26 => SealedTrait._27(a.asInstanceOf[A27])
      case 27 => SealedTrait._28(a.asInstanceOf[A28])
      case 28 => SealedTrait._29(a.asInstanceOf[A29])
      case 29 => SealedTrait._30(a.asInstanceOf[A30])
      case 30 => SealedTrait._31(a.asInstanceOf[A31])
      case 31 => SealedTrait._32(a.asInstanceOf[A32])
    }
    def from(s: SealedTrait32[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32]): A = s.value
  }

  implicit def sealedtrait33[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A, A28 <: A, A29 <: A, A30 <: A, A31 <: A, A32 <: A, A33 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33)): Shapely[A, SealedTrait33[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33]] = new Shapely[A, SealedTrait33[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33]] {
    def to(a: A): SealedTrait33[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33] = A.ordinal(a) match {
      case 0 => SealedTrait._1(a.asInstanceOf[A1])
      case 1 => SealedTrait._2(a.asInstanceOf[A2])
      case 2 => SealedTrait._3(a.asInstanceOf[A3])
      case 3 => SealedTrait._4(a.asInstanceOf[A4])
      case 4 => SealedTrait._5(a.asInstanceOf[A5])
      case 5 => SealedTrait._6(a.asInstanceOf[A6])
      case 6 => SealedTrait._7(a.asInstanceOf[A7])
      case 7 => SealedTrait._8(a.asInstanceOf[A8])
      case 8 => SealedTrait._9(a.asInstanceOf[A9])
      case 9 => SealedTrait._10(a.asInstanceOf[A10])
      case 10 => SealedTrait._11(a.asInstanceOf[A11])
      case 11 => SealedTrait._12(a.asInstanceOf[A12])
      case 12 => SealedTrait._13(a.asInstanceOf[A13])
      case 13 => SealedTrait._14(a.asInstanceOf[A14])
      case 14 => SealedTrait._15(a.asInstanceOf[A15])
      case 15 => SealedTrait._16(a.asInstanceOf[A16])
      case 16 => SealedTrait._17(a.asInstanceOf[A17])
      case 17 => SealedTrait._18(a.asInstanceOf[A18])
      case 18 => SealedTrait._19(a.asInstanceOf[A19])
      case 19 => SealedTrait._20(a.asInstanceOf[A20])
      case 20 => SealedTrait._21(a.asInstanceOf[A21])
      case 21 => SealedTrait._22(a.asInstanceOf[A22])
      case 22 => SealedTrait._23(a.asInstanceOf[A23])
      case 23 => SealedTrait._24(a.asInstanceOf[A24])
      case 24 => SealedTrait._25(a.asInstanceOf[A25])
      case 25 => SealedTrait._26(a.asInstanceOf[A26])
      case 26 => SealedTrait._27(a.asInstanceOf[A27])
      case 27 => SealedTrait._28(a.asInstanceOf[A28])
      case 28 => SealedTrait._29(a.asInstanceOf[A29])
      case 29 => SealedTrait._30(a.asInstanceOf[A30])
      case 30 => SealedTrait._31(a.asInstanceOf[A31])
      case 31 => SealedTrait._32(a.asInstanceOf[A32])
      case 32 => SealedTrait._33(a.asInstanceOf[A33])
    }
    def from(s: SealedTrait33[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33]): A = s.value
  }

  implicit def sealedtrait34[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A, A28 <: A, A29 <: A, A30 <: A, A31 <: A, A32 <: A, A33 <: A, A34 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34)): Shapely[A, SealedTrait34[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34]] = new Shapely[A, SealedTrait34[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34]] {
    def to(a: A): SealedTrait34[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34] = A.ordinal(a) match {
      case 0 => SealedTrait._1(a.asInstanceOf[A1])
      case 1 => SealedTrait._2(a.asInstanceOf[A2])
      case 2 => SealedTrait._3(a.asInstanceOf[A3])
      case 3 => SealedTrait._4(a.asInstanceOf[A4])
      case 4 => SealedTrait._5(a.asInstanceOf[A5])
      case 5 => SealedTrait._6(a.asInstanceOf[A6])
      case 6 => SealedTrait._7(a.asInstanceOf[A7])
      case 7 => SealedTrait._8(a.asInstanceOf[A8])
      case 8 => SealedTrait._9(a.asInstanceOf[A9])
      case 9 => SealedTrait._10(a.asInstanceOf[A10])
      case 10 => SealedTrait._11(a.asInstanceOf[A11])
      case 11 => SealedTrait._12(a.asInstanceOf[A12])
      case 12 => SealedTrait._13(a.asInstanceOf[A13])
      case 13 => SealedTrait._14(a.asInstanceOf[A14])
      case 14 => SealedTrait._15(a.asInstanceOf[A15])
      case 15 => SealedTrait._16(a.asInstanceOf[A16])
      case 16 => SealedTrait._17(a.asInstanceOf[A17])
      case 17 => SealedTrait._18(a.asInstanceOf[A18])
      case 18 => SealedTrait._19(a.asInstanceOf[A19])
      case 19 => SealedTrait._20(a.asInstanceOf[A20])
      case 20 => SealedTrait._21(a.asInstanceOf[A21])
      case 21 => SealedTrait._22(a.asInstanceOf[A22])
      case 22 => SealedTrait._23(a.asInstanceOf[A23])
      case 23 => SealedTrait._24(a.asInstanceOf[A24])
      case 24 => SealedTrait._25(a.asInstanceOf[A25])
      case 25 => SealedTrait._26(a.asInstanceOf[A26])
      case 26 => SealedTrait._27(a.asInstanceOf[A27])
      case 27 => SealedTrait._28(a.asInstanceOf[A28])
      case 28 => SealedTrait._29(a.asInstanceOf[A29])
      case 29 => SealedTrait._30(a.asInstanceOf[A30])
      case 30 => SealedTrait._31(a.asInstanceOf[A31])
      case 31 => SealedTrait._32(a.asInstanceOf[A32])
      case 32 => SealedTrait._33(a.asInstanceOf[A33])
      case 33 => SealedTrait._34(a.asInstanceOf[A34])
    }
    def from(s: SealedTrait34[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34]): A = s.value
  }

  implicit def sealedtrait35[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A, A28 <: A, A29 <: A, A30 <: A, A31 <: A, A32 <: A, A33 <: A, A34 <: A, A35 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35)): Shapely[A, SealedTrait35[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35]] = new Shapely[A, SealedTrait35[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35]] {
    def to(a: A): SealedTrait35[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35] = A.ordinal(a) match {
      case 0 => SealedTrait._1(a.asInstanceOf[A1])
      case 1 => SealedTrait._2(a.asInstanceOf[A2])
      case 2 => SealedTrait._3(a.asInstanceOf[A3])
      case 3 => SealedTrait._4(a.asInstanceOf[A4])
      case 4 => SealedTrait._5(a.asInstanceOf[A5])
      case 5 => SealedTrait._6(a.asInstanceOf[A6])
      case 6 => SealedTrait._7(a.asInstanceOf[A7])
      case 7 => SealedTrait._8(a.asInstanceOf[A8])
      case 8 => SealedTrait._9(a.asInstanceOf[A9])
      case 9 => SealedTrait._10(a.asInstanceOf[A10])
      case 10 => SealedTrait._11(a.asInstanceOf[A11])
      case 11 => SealedTrait._12(a.asInstanceOf[A12])
      case 12 => SealedTrait._13(a.asInstanceOf[A13])
      case 13 => SealedTrait._14(a.asInstanceOf[A14])
      case 14 => SealedTrait._15(a.asInstanceOf[A15])
      case 15 => SealedTrait._16(a.asInstanceOf[A16])
      case 16 => SealedTrait._17(a.asInstanceOf[A17])
      case 17 => SealedTrait._18(a.asInstanceOf[A18])
      case 18 => SealedTrait._19(a.asInstanceOf[A19])
      case 19 => SealedTrait._20(a.asInstanceOf[A20])
      case 20 => SealedTrait._21(a.asInstanceOf[A21])
      case 21 => SealedTrait._22(a.asInstanceOf[A22])
      case 22 => SealedTrait._23(a.asInstanceOf[A23])
      case 23 => SealedTrait._24(a.asInstanceOf[A24])
      case 24 => SealedTrait._25(a.asInstanceOf[A25])
      case 25 => SealedTrait._26(a.asInstanceOf[A26])
      case 26 => SealedTrait._27(a.asInstanceOf[A27])
      case 27 => SealedTrait._28(a.asInstanceOf[A28])
      case 28 => SealedTrait._29(a.asInstanceOf[A29])
      case 29 => SealedTrait._30(a.asInstanceOf[A30])
      case 30 => SealedTrait._31(a.asInstanceOf[A31])
      case 31 => SealedTrait._32(a.asInstanceOf[A32])
      case 32 => SealedTrait._33(a.asInstanceOf[A33])
      case 33 => SealedTrait._34(a.asInstanceOf[A34])
      case 34 => SealedTrait._35(a.asInstanceOf[A35])
    }
    def from(s: SealedTrait35[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35]): A = s.value
  }

  implicit def sealedtrait36[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A, A28 <: A, A29 <: A, A30 <: A, A31 <: A, A32 <: A, A33 <: A, A34 <: A, A35 <: A, A36 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36)): Shapely[A, SealedTrait36[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36]] = new Shapely[A, SealedTrait36[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36]] {
    def to(a: A): SealedTrait36[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36] = A.ordinal(a) match {
      case 0 => SealedTrait._1(a.asInstanceOf[A1])
      case 1 => SealedTrait._2(a.asInstanceOf[A2])
      case 2 => SealedTrait._3(a.asInstanceOf[A3])
      case 3 => SealedTrait._4(a.asInstanceOf[A4])
      case 4 => SealedTrait._5(a.asInstanceOf[A5])
      case 5 => SealedTrait._6(a.asInstanceOf[A6])
      case 6 => SealedTrait._7(a.asInstanceOf[A7])
      case 7 => SealedTrait._8(a.asInstanceOf[A8])
      case 8 => SealedTrait._9(a.asInstanceOf[A9])
      case 9 => SealedTrait._10(a.asInstanceOf[A10])
      case 10 => SealedTrait._11(a.asInstanceOf[A11])
      case 11 => SealedTrait._12(a.asInstanceOf[A12])
      case 12 => SealedTrait._13(a.asInstanceOf[A13])
      case 13 => SealedTrait._14(a.asInstanceOf[A14])
      case 14 => SealedTrait._15(a.asInstanceOf[A15])
      case 15 => SealedTrait._16(a.asInstanceOf[A16])
      case 16 => SealedTrait._17(a.asInstanceOf[A17])
      case 17 => SealedTrait._18(a.asInstanceOf[A18])
      case 18 => SealedTrait._19(a.asInstanceOf[A19])
      case 19 => SealedTrait._20(a.asInstanceOf[A20])
      case 20 => SealedTrait._21(a.asInstanceOf[A21])
      case 21 => SealedTrait._22(a.asInstanceOf[A22])
      case 22 => SealedTrait._23(a.asInstanceOf[A23])
      case 23 => SealedTrait._24(a.asInstanceOf[A24])
      case 24 => SealedTrait._25(a.asInstanceOf[A25])
      case 25 => SealedTrait._26(a.asInstanceOf[A26])
      case 26 => SealedTrait._27(a.asInstanceOf[A27])
      case 27 => SealedTrait._28(a.asInstanceOf[A28])
      case 28 => SealedTrait._29(a.asInstanceOf[A29])
      case 29 => SealedTrait._30(a.asInstanceOf[A30])
      case 30 => SealedTrait._31(a.asInstanceOf[A31])
      case 31 => SealedTrait._32(a.asInstanceOf[A32])
      case 32 => SealedTrait._33(a.asInstanceOf[A33])
      case 33 => SealedTrait._34(a.asInstanceOf[A34])
      case 34 => SealedTrait._35(a.asInstanceOf[A35])
      case 35 => SealedTrait._36(a.asInstanceOf[A36])
    }
    def from(s: SealedTrait36[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36]): A = s.value
  }

  implicit def sealedtrait37[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A, A28 <: A, A29 <: A, A30 <: A, A31 <: A, A32 <: A, A33 <: A, A34 <: A, A35 <: A, A36 <: A, A37 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37)): Shapely[A, SealedTrait37[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37]] = new Shapely[A, SealedTrait37[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37]] {
    def to(a: A): SealedTrait37[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37] = A.ordinal(a) match {
      case 0 => SealedTrait._1(a.asInstanceOf[A1])
      case 1 => SealedTrait._2(a.asInstanceOf[A2])
      case 2 => SealedTrait._3(a.asInstanceOf[A3])
      case 3 => SealedTrait._4(a.asInstanceOf[A4])
      case 4 => SealedTrait._5(a.asInstanceOf[A5])
      case 5 => SealedTrait._6(a.asInstanceOf[A6])
      case 6 => SealedTrait._7(a.asInstanceOf[A7])
      case 7 => SealedTrait._8(a.asInstanceOf[A8])
      case 8 => SealedTrait._9(a.asInstanceOf[A9])
      case 9 => SealedTrait._10(a.asInstanceOf[A10])
      case 10 => SealedTrait._11(a.asInstanceOf[A11])
      case 11 => SealedTrait._12(a.asInstanceOf[A12])
      case 12 => SealedTrait._13(a.asInstanceOf[A13])
      case 13 => SealedTrait._14(a.asInstanceOf[A14])
      case 14 => SealedTrait._15(a.asInstanceOf[A15])
      case 15 => SealedTrait._16(a.asInstanceOf[A16])
      case 16 => SealedTrait._17(a.asInstanceOf[A17])
      case 17 => SealedTrait._18(a.asInstanceOf[A18])
      case 18 => SealedTrait._19(a.asInstanceOf[A19])
      case 19 => SealedTrait._20(a.asInstanceOf[A20])
      case 20 => SealedTrait._21(a.asInstanceOf[A21])
      case 21 => SealedTrait._22(a.asInstanceOf[A22])
      case 22 => SealedTrait._23(a.asInstanceOf[A23])
      case 23 => SealedTrait._24(a.asInstanceOf[A24])
      case 24 => SealedTrait._25(a.asInstanceOf[A25])
      case 25 => SealedTrait._26(a.asInstanceOf[A26])
      case 26 => SealedTrait._27(a.asInstanceOf[A27])
      case 27 => SealedTrait._28(a.asInstanceOf[A28])
      case 28 => SealedTrait._29(a.asInstanceOf[A29])
      case 29 => SealedTrait._30(a.asInstanceOf[A30])
      case 30 => SealedTrait._31(a.asInstanceOf[A31])
      case 31 => SealedTrait._32(a.asInstanceOf[A32])
      case 32 => SealedTrait._33(a.asInstanceOf[A33])
      case 33 => SealedTrait._34(a.asInstanceOf[A34])
      case 34 => SealedTrait._35(a.asInstanceOf[A35])
      case 35 => SealedTrait._36(a.asInstanceOf[A36])
      case 36 => SealedTrait._37(a.asInstanceOf[A37])
    }
    def from(s: SealedTrait37[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37]): A = s.value
  }

  implicit def sealedtrait38[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A, A28 <: A, A29 <: A, A30 <: A, A31 <: A, A32 <: A, A33 <: A, A34 <: A, A35 <: A, A36 <: A, A37 <: A, A38 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38)): Shapely[A, SealedTrait38[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38]] = new Shapely[A, SealedTrait38[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38]] {
    def to(a: A): SealedTrait38[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38] = A.ordinal(a) match {
      case 0 => SealedTrait._1(a.asInstanceOf[A1])
      case 1 => SealedTrait._2(a.asInstanceOf[A2])
      case 2 => SealedTrait._3(a.asInstanceOf[A3])
      case 3 => SealedTrait._4(a.asInstanceOf[A4])
      case 4 => SealedTrait._5(a.asInstanceOf[A5])
      case 5 => SealedTrait._6(a.asInstanceOf[A6])
      case 6 => SealedTrait._7(a.asInstanceOf[A7])
      case 7 => SealedTrait._8(a.asInstanceOf[A8])
      case 8 => SealedTrait._9(a.asInstanceOf[A9])
      case 9 => SealedTrait._10(a.asInstanceOf[A10])
      case 10 => SealedTrait._11(a.asInstanceOf[A11])
      case 11 => SealedTrait._12(a.asInstanceOf[A12])
      case 12 => SealedTrait._13(a.asInstanceOf[A13])
      case 13 => SealedTrait._14(a.asInstanceOf[A14])
      case 14 => SealedTrait._15(a.asInstanceOf[A15])
      case 15 => SealedTrait._16(a.asInstanceOf[A16])
      case 16 => SealedTrait._17(a.asInstanceOf[A17])
      case 17 => SealedTrait._18(a.asInstanceOf[A18])
      case 18 => SealedTrait._19(a.asInstanceOf[A19])
      case 19 => SealedTrait._20(a.asInstanceOf[A20])
      case 20 => SealedTrait._21(a.asInstanceOf[A21])
      case 21 => SealedTrait._22(a.asInstanceOf[A22])
      case 22 => SealedTrait._23(a.asInstanceOf[A23])
      case 23 => SealedTrait._24(a.asInstanceOf[A24])
      case 24 => SealedTrait._25(a.asInstanceOf[A25])
      case 25 => SealedTrait._26(a.asInstanceOf[A26])
      case 26 => SealedTrait._27(a.asInstanceOf[A27])
      case 27 => SealedTrait._28(a.asInstanceOf[A28])
      case 28 => SealedTrait._29(a.asInstanceOf[A29])
      case 29 => SealedTrait._30(a.asInstanceOf[A30])
      case 30 => SealedTrait._31(a.asInstanceOf[A31])
      case 31 => SealedTrait._32(a.asInstanceOf[A32])
      case 32 => SealedTrait._33(a.asInstanceOf[A33])
      case 33 => SealedTrait._34(a.asInstanceOf[A34])
      case 34 => SealedTrait._35(a.asInstanceOf[A35])
      case 35 => SealedTrait._36(a.asInstanceOf[A36])
      case 36 => SealedTrait._37(a.asInstanceOf[A37])
      case 37 => SealedTrait._38(a.asInstanceOf[A38])
    }
    def from(s: SealedTrait38[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38]): A = s.value
  }

  implicit def sealedtrait39[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A, A28 <: A, A29 <: A, A30 <: A, A31 <: A, A32 <: A, A33 <: A, A34 <: A, A35 <: A, A36 <: A, A37 <: A, A38 <: A, A39 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39)): Shapely[A, SealedTrait39[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39]] = new Shapely[A, SealedTrait39[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39]] {
    def to(a: A): SealedTrait39[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39] = A.ordinal(a) match {
      case 0 => SealedTrait._1(a.asInstanceOf[A1])
      case 1 => SealedTrait._2(a.asInstanceOf[A2])
      case 2 => SealedTrait._3(a.asInstanceOf[A3])
      case 3 => SealedTrait._4(a.asInstanceOf[A4])
      case 4 => SealedTrait._5(a.asInstanceOf[A5])
      case 5 => SealedTrait._6(a.asInstanceOf[A6])
      case 6 => SealedTrait._7(a.asInstanceOf[A7])
      case 7 => SealedTrait._8(a.asInstanceOf[A8])
      case 8 => SealedTrait._9(a.asInstanceOf[A9])
      case 9 => SealedTrait._10(a.asInstanceOf[A10])
      case 10 => SealedTrait._11(a.asInstanceOf[A11])
      case 11 => SealedTrait._12(a.asInstanceOf[A12])
      case 12 => SealedTrait._13(a.asInstanceOf[A13])
      case 13 => SealedTrait._14(a.asInstanceOf[A14])
      case 14 => SealedTrait._15(a.asInstanceOf[A15])
      case 15 => SealedTrait._16(a.asInstanceOf[A16])
      case 16 => SealedTrait._17(a.asInstanceOf[A17])
      case 17 => SealedTrait._18(a.asInstanceOf[A18])
      case 18 => SealedTrait._19(a.asInstanceOf[A19])
      case 19 => SealedTrait._20(a.asInstanceOf[A20])
      case 20 => SealedTrait._21(a.asInstanceOf[A21])
      case 21 => SealedTrait._22(a.asInstanceOf[A22])
      case 22 => SealedTrait._23(a.asInstanceOf[A23])
      case 23 => SealedTrait._24(a.asInstanceOf[A24])
      case 24 => SealedTrait._25(a.asInstanceOf[A25])
      case 25 => SealedTrait._26(a.asInstanceOf[A26])
      case 26 => SealedTrait._27(a.asInstanceOf[A27])
      case 27 => SealedTrait._28(a.asInstanceOf[A28])
      case 28 => SealedTrait._29(a.asInstanceOf[A29])
      case 29 => SealedTrait._30(a.asInstanceOf[A30])
      case 30 => SealedTrait._31(a.asInstanceOf[A31])
      case 31 => SealedTrait._32(a.asInstanceOf[A32])
      case 32 => SealedTrait._33(a.asInstanceOf[A33])
      case 33 => SealedTrait._34(a.asInstanceOf[A34])
      case 34 => SealedTrait._35(a.asInstanceOf[A35])
      case 35 => SealedTrait._36(a.asInstanceOf[A36])
      case 36 => SealedTrait._37(a.asInstanceOf[A37])
      case 37 => SealedTrait._38(a.asInstanceOf[A38])
      case 38 => SealedTrait._39(a.asInstanceOf[A39])
    }
    def from(s: SealedTrait39[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39]): A = s.value
  }

  implicit def sealedtrait40[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A, A28 <: A, A29 <: A, A30 <: A, A31 <: A, A32 <: A, A33 <: A, A34 <: A, A35 <: A, A36 <: A, A37 <: A, A38 <: A, A39 <: A, A40 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40)): Shapely[A, SealedTrait40[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40]] = new Shapely[A, SealedTrait40[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40]] {
    def to(a: A): SealedTrait40[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40] = A.ordinal(a) match {
      case 0 => SealedTrait._1(a.asInstanceOf[A1])
      case 1 => SealedTrait._2(a.asInstanceOf[A2])
      case 2 => SealedTrait._3(a.asInstanceOf[A3])
      case 3 => SealedTrait._4(a.asInstanceOf[A4])
      case 4 => SealedTrait._5(a.asInstanceOf[A5])
      case 5 => SealedTrait._6(a.asInstanceOf[A6])
      case 6 => SealedTrait._7(a.asInstanceOf[A7])
      case 7 => SealedTrait._8(a.asInstanceOf[A8])
      case 8 => SealedTrait._9(a.asInstanceOf[A9])
      case 9 => SealedTrait._10(a.asInstanceOf[A10])
      case 10 => SealedTrait._11(a.asInstanceOf[A11])
      case 11 => SealedTrait._12(a.asInstanceOf[A12])
      case 12 => SealedTrait._13(a.asInstanceOf[A13])
      case 13 => SealedTrait._14(a.asInstanceOf[A14])
      case 14 => SealedTrait._15(a.asInstanceOf[A15])
      case 15 => SealedTrait._16(a.asInstanceOf[A16])
      case 16 => SealedTrait._17(a.asInstanceOf[A17])
      case 17 => SealedTrait._18(a.asInstanceOf[A18])
      case 18 => SealedTrait._19(a.asInstanceOf[A19])
      case 19 => SealedTrait._20(a.asInstanceOf[A20])
      case 20 => SealedTrait._21(a.asInstanceOf[A21])
      case 21 => SealedTrait._22(a.asInstanceOf[A22])
      case 22 => SealedTrait._23(a.asInstanceOf[A23])
      case 23 => SealedTrait._24(a.asInstanceOf[A24])
      case 24 => SealedTrait._25(a.asInstanceOf[A25])
      case 25 => SealedTrait._26(a.asInstanceOf[A26])
      case 26 => SealedTrait._27(a.asInstanceOf[A27])
      case 27 => SealedTrait._28(a.asInstanceOf[A28])
      case 28 => SealedTrait._29(a.asInstanceOf[A29])
      case 29 => SealedTrait._30(a.asInstanceOf[A30])
      case 30 => SealedTrait._31(a.asInstanceOf[A31])
      case 31 => SealedTrait._32(a.asInstanceOf[A32])
      case 32 => SealedTrait._33(a.asInstanceOf[A33])
      case 33 => SealedTrait._34(a.asInstanceOf[A34])
      case 34 => SealedTrait._35(a.asInstanceOf[A35])
      case 35 => SealedTrait._36(a.asInstanceOf[A36])
      case 36 => SealedTrait._37(a.asInstanceOf[A37])
      case 37 => SealedTrait._38(a.asInstanceOf[A38])
      case 38 => SealedTrait._39(a.asInstanceOf[A39])
      case 39 => SealedTrait._40(a.asInstanceOf[A40])
    }
    def from(s: SealedTrait40[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40]): A = s.value
  }

  implicit def sealedtrait41[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A, A28 <: A, A29 <: A, A30 <: A, A31 <: A, A32 <: A, A33 <: A, A34 <: A, A35 <: A, A36 <: A, A37 <: A, A38 <: A, A39 <: A, A40 <: A, A41 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41)): Shapely[A, SealedTrait41[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41]] = new Shapely[A, SealedTrait41[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41]] {
    def to(a: A): SealedTrait41[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41] = A.ordinal(a) match {
      case 0 => SealedTrait._1(a.asInstanceOf[A1])
      case 1 => SealedTrait._2(a.asInstanceOf[A2])
      case 2 => SealedTrait._3(a.asInstanceOf[A3])
      case 3 => SealedTrait._4(a.asInstanceOf[A4])
      case 4 => SealedTrait._5(a.asInstanceOf[A5])
      case 5 => SealedTrait._6(a.asInstanceOf[A6])
      case 6 => SealedTrait._7(a.asInstanceOf[A7])
      case 7 => SealedTrait._8(a.asInstanceOf[A8])
      case 8 => SealedTrait._9(a.asInstanceOf[A9])
      case 9 => SealedTrait._10(a.asInstanceOf[A10])
      case 10 => SealedTrait._11(a.asInstanceOf[A11])
      case 11 => SealedTrait._12(a.asInstanceOf[A12])
      case 12 => SealedTrait._13(a.asInstanceOf[A13])
      case 13 => SealedTrait._14(a.asInstanceOf[A14])
      case 14 => SealedTrait._15(a.asInstanceOf[A15])
      case 15 => SealedTrait._16(a.asInstanceOf[A16])
      case 16 => SealedTrait._17(a.asInstanceOf[A17])
      case 17 => SealedTrait._18(a.asInstanceOf[A18])
      case 18 => SealedTrait._19(a.asInstanceOf[A19])
      case 19 => SealedTrait._20(a.asInstanceOf[A20])
      case 20 => SealedTrait._21(a.asInstanceOf[A21])
      case 21 => SealedTrait._22(a.asInstanceOf[A22])
      case 22 => SealedTrait._23(a.asInstanceOf[A23])
      case 23 => SealedTrait._24(a.asInstanceOf[A24])
      case 24 => SealedTrait._25(a.asInstanceOf[A25])
      case 25 => SealedTrait._26(a.asInstanceOf[A26])
      case 26 => SealedTrait._27(a.asInstanceOf[A27])
      case 27 => SealedTrait._28(a.asInstanceOf[A28])
      case 28 => SealedTrait._29(a.asInstanceOf[A29])
      case 29 => SealedTrait._30(a.asInstanceOf[A30])
      case 30 => SealedTrait._31(a.asInstanceOf[A31])
      case 31 => SealedTrait._32(a.asInstanceOf[A32])
      case 32 => SealedTrait._33(a.asInstanceOf[A33])
      case 33 => SealedTrait._34(a.asInstanceOf[A34])
      case 34 => SealedTrait._35(a.asInstanceOf[A35])
      case 35 => SealedTrait._36(a.asInstanceOf[A36])
      case 36 => SealedTrait._37(a.asInstanceOf[A37])
      case 37 => SealedTrait._38(a.asInstanceOf[A38])
      case 38 => SealedTrait._39(a.asInstanceOf[A39])
      case 39 => SealedTrait._40(a.asInstanceOf[A40])
      case 40 => SealedTrait._41(a.asInstanceOf[A41])
    }
    def from(s: SealedTrait41[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41]): A = s.value
  }

  implicit def sealedtrait42[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A, A28 <: A, A29 <: A, A30 <: A, A31 <: A, A32 <: A, A33 <: A, A34 <: A, A35 <: A, A36 <: A, A37 <: A, A38 <: A, A39 <: A, A40 <: A, A41 <: A, A42 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42)): Shapely[A, SealedTrait42[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42]] = new Shapely[A, SealedTrait42[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42]] {
    def to(a: A): SealedTrait42[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42] = A.ordinal(a) match {
      case 0 => SealedTrait._1(a.asInstanceOf[A1])
      case 1 => SealedTrait._2(a.asInstanceOf[A2])
      case 2 => SealedTrait._3(a.asInstanceOf[A3])
      case 3 => SealedTrait._4(a.asInstanceOf[A4])
      case 4 => SealedTrait._5(a.asInstanceOf[A5])
      case 5 => SealedTrait._6(a.asInstanceOf[A6])
      case 6 => SealedTrait._7(a.asInstanceOf[A7])
      case 7 => SealedTrait._8(a.asInstanceOf[A8])
      case 8 => SealedTrait._9(a.asInstanceOf[A9])
      case 9 => SealedTrait._10(a.asInstanceOf[A10])
      case 10 => SealedTrait._11(a.asInstanceOf[A11])
      case 11 => SealedTrait._12(a.asInstanceOf[A12])
      case 12 => SealedTrait._13(a.asInstanceOf[A13])
      case 13 => SealedTrait._14(a.asInstanceOf[A14])
      case 14 => SealedTrait._15(a.asInstanceOf[A15])
      case 15 => SealedTrait._16(a.asInstanceOf[A16])
      case 16 => SealedTrait._17(a.asInstanceOf[A17])
      case 17 => SealedTrait._18(a.asInstanceOf[A18])
      case 18 => SealedTrait._19(a.asInstanceOf[A19])
      case 19 => SealedTrait._20(a.asInstanceOf[A20])
      case 20 => SealedTrait._21(a.asInstanceOf[A21])
      case 21 => SealedTrait._22(a.asInstanceOf[A22])
      case 22 => SealedTrait._23(a.asInstanceOf[A23])
      case 23 => SealedTrait._24(a.asInstanceOf[A24])
      case 24 => SealedTrait._25(a.asInstanceOf[A25])
      case 25 => SealedTrait._26(a.asInstanceOf[A26])
      case 26 => SealedTrait._27(a.asInstanceOf[A27])
      case 27 => SealedTrait._28(a.asInstanceOf[A28])
      case 28 => SealedTrait._29(a.asInstanceOf[A29])
      case 29 => SealedTrait._30(a.asInstanceOf[A30])
      case 30 => SealedTrait._31(a.asInstanceOf[A31])
      case 31 => SealedTrait._32(a.asInstanceOf[A32])
      case 32 => SealedTrait._33(a.asInstanceOf[A33])
      case 33 => SealedTrait._34(a.asInstanceOf[A34])
      case 34 => SealedTrait._35(a.asInstanceOf[A35])
      case 35 => SealedTrait._36(a.asInstanceOf[A36])
      case 36 => SealedTrait._37(a.asInstanceOf[A37])
      case 37 => SealedTrait._38(a.asInstanceOf[A38])
      case 38 => SealedTrait._39(a.asInstanceOf[A39])
      case 39 => SealedTrait._40(a.asInstanceOf[A40])
      case 40 => SealedTrait._41(a.asInstanceOf[A41])
      case 41 => SealedTrait._42(a.asInstanceOf[A42])
    }
    def from(s: SealedTrait42[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42]): A = s.value
  }

  implicit def sealedtrait43[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A, A28 <: A, A29 <: A, A30 <: A, A31 <: A, A32 <: A, A33 <: A, A34 <: A, A35 <: A, A36 <: A, A37 <: A, A38 <: A, A39 <: A, A40 <: A, A41 <: A, A42 <: A, A43 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43)): Shapely[A, SealedTrait43[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43]] = new Shapely[A, SealedTrait43[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43]] {
    def to(a: A): SealedTrait43[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43] = A.ordinal(a) match {
      case 0 => SealedTrait._1(a.asInstanceOf[A1])
      case 1 => SealedTrait._2(a.asInstanceOf[A2])
      case 2 => SealedTrait._3(a.asInstanceOf[A3])
      case 3 => SealedTrait._4(a.asInstanceOf[A4])
      case 4 => SealedTrait._5(a.asInstanceOf[A5])
      case 5 => SealedTrait._6(a.asInstanceOf[A6])
      case 6 => SealedTrait._7(a.asInstanceOf[A7])
      case 7 => SealedTrait._8(a.asInstanceOf[A8])
      case 8 => SealedTrait._9(a.asInstanceOf[A9])
      case 9 => SealedTrait._10(a.asInstanceOf[A10])
      case 10 => SealedTrait._11(a.asInstanceOf[A11])
      case 11 => SealedTrait._12(a.asInstanceOf[A12])
      case 12 => SealedTrait._13(a.asInstanceOf[A13])
      case 13 => SealedTrait._14(a.asInstanceOf[A14])
      case 14 => SealedTrait._15(a.asInstanceOf[A15])
      case 15 => SealedTrait._16(a.asInstanceOf[A16])
      case 16 => SealedTrait._17(a.asInstanceOf[A17])
      case 17 => SealedTrait._18(a.asInstanceOf[A18])
      case 18 => SealedTrait._19(a.asInstanceOf[A19])
      case 19 => SealedTrait._20(a.asInstanceOf[A20])
      case 20 => SealedTrait._21(a.asInstanceOf[A21])
      case 21 => SealedTrait._22(a.asInstanceOf[A22])
      case 22 => SealedTrait._23(a.asInstanceOf[A23])
      case 23 => SealedTrait._24(a.asInstanceOf[A24])
      case 24 => SealedTrait._25(a.asInstanceOf[A25])
      case 25 => SealedTrait._26(a.asInstanceOf[A26])
      case 26 => SealedTrait._27(a.asInstanceOf[A27])
      case 27 => SealedTrait._28(a.asInstanceOf[A28])
      case 28 => SealedTrait._29(a.asInstanceOf[A29])
      case 29 => SealedTrait._30(a.asInstanceOf[A30])
      case 30 => SealedTrait._31(a.asInstanceOf[A31])
      case 31 => SealedTrait._32(a.asInstanceOf[A32])
      case 32 => SealedTrait._33(a.asInstanceOf[A33])
      case 33 => SealedTrait._34(a.asInstanceOf[A34])
      case 34 => SealedTrait._35(a.asInstanceOf[A35])
      case 35 => SealedTrait._36(a.asInstanceOf[A36])
      case 36 => SealedTrait._37(a.asInstanceOf[A37])
      case 37 => SealedTrait._38(a.asInstanceOf[A38])
      case 38 => SealedTrait._39(a.asInstanceOf[A39])
      case 39 => SealedTrait._40(a.asInstanceOf[A40])
      case 40 => SealedTrait._41(a.asInstanceOf[A41])
      case 41 => SealedTrait._42(a.asInstanceOf[A42])
      case 42 => SealedTrait._43(a.asInstanceOf[A43])
    }
    def from(s: SealedTrait43[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43]): A = s.value
  }

  implicit def sealedtrait44[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A, A28 <: A, A29 <: A, A30 <: A, A31 <: A, A32 <: A, A33 <: A, A34 <: A, A35 <: A, A36 <: A, A37 <: A, A38 <: A, A39 <: A, A40 <: A, A41 <: A, A42 <: A, A43 <: A, A44 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44)): Shapely[A, SealedTrait44[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44]] = new Shapely[A, SealedTrait44[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44]] {
    def to(a: A): SealedTrait44[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44] = A.ordinal(a) match {
      case 0 => SealedTrait._1(a.asInstanceOf[A1])
      case 1 => SealedTrait._2(a.asInstanceOf[A2])
      case 2 => SealedTrait._3(a.asInstanceOf[A3])
      case 3 => SealedTrait._4(a.asInstanceOf[A4])
      case 4 => SealedTrait._5(a.asInstanceOf[A5])
      case 5 => SealedTrait._6(a.asInstanceOf[A6])
      case 6 => SealedTrait._7(a.asInstanceOf[A7])
      case 7 => SealedTrait._8(a.asInstanceOf[A8])
      case 8 => SealedTrait._9(a.asInstanceOf[A9])
      case 9 => SealedTrait._10(a.asInstanceOf[A10])
      case 10 => SealedTrait._11(a.asInstanceOf[A11])
      case 11 => SealedTrait._12(a.asInstanceOf[A12])
      case 12 => SealedTrait._13(a.asInstanceOf[A13])
      case 13 => SealedTrait._14(a.asInstanceOf[A14])
      case 14 => SealedTrait._15(a.asInstanceOf[A15])
      case 15 => SealedTrait._16(a.asInstanceOf[A16])
      case 16 => SealedTrait._17(a.asInstanceOf[A17])
      case 17 => SealedTrait._18(a.asInstanceOf[A18])
      case 18 => SealedTrait._19(a.asInstanceOf[A19])
      case 19 => SealedTrait._20(a.asInstanceOf[A20])
      case 20 => SealedTrait._21(a.asInstanceOf[A21])
      case 21 => SealedTrait._22(a.asInstanceOf[A22])
      case 22 => SealedTrait._23(a.asInstanceOf[A23])
      case 23 => SealedTrait._24(a.asInstanceOf[A24])
      case 24 => SealedTrait._25(a.asInstanceOf[A25])
      case 25 => SealedTrait._26(a.asInstanceOf[A26])
      case 26 => SealedTrait._27(a.asInstanceOf[A27])
      case 27 => SealedTrait._28(a.asInstanceOf[A28])
      case 28 => SealedTrait._29(a.asInstanceOf[A29])
      case 29 => SealedTrait._30(a.asInstanceOf[A30])
      case 30 => SealedTrait._31(a.asInstanceOf[A31])
      case 31 => SealedTrait._32(a.asInstanceOf[A32])
      case 32 => SealedTrait._33(a.asInstanceOf[A33])
      case 33 => SealedTrait._34(a.asInstanceOf[A34])
      case 34 => SealedTrait._35(a.asInstanceOf[A35])
      case 35 => SealedTrait._36(a.asInstanceOf[A36])
      case 36 => SealedTrait._37(a.asInstanceOf[A37])
      case 37 => SealedTrait._38(a.asInstanceOf[A38])
      case 38 => SealedTrait._39(a.asInstanceOf[A39])
      case 39 => SealedTrait._40(a.asInstanceOf[A40])
      case 40 => SealedTrait._41(a.asInstanceOf[A41])
      case 41 => SealedTrait._42(a.asInstanceOf[A42])
      case 42 => SealedTrait._43(a.asInstanceOf[A43])
      case 43 => SealedTrait._44(a.asInstanceOf[A44])
    }
    def from(s: SealedTrait44[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44]): A = s.value
  }

  implicit def sealedtrait45[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A, A28 <: A, A29 <: A, A30 <: A, A31 <: A, A32 <: A, A33 <: A, A34 <: A, A35 <: A, A36 <: A, A37 <: A, A38 <: A, A39 <: A, A40 <: A, A41 <: A, A42 <: A, A43 <: A, A44 <: A, A45 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45)): Shapely[A, SealedTrait45[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45]] = new Shapely[A, SealedTrait45[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45]] {
    def to(a: A): SealedTrait45[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45] = A.ordinal(a) match {
      case 0 => SealedTrait._1(a.asInstanceOf[A1])
      case 1 => SealedTrait._2(a.asInstanceOf[A2])
      case 2 => SealedTrait._3(a.asInstanceOf[A3])
      case 3 => SealedTrait._4(a.asInstanceOf[A4])
      case 4 => SealedTrait._5(a.asInstanceOf[A5])
      case 5 => SealedTrait._6(a.asInstanceOf[A6])
      case 6 => SealedTrait._7(a.asInstanceOf[A7])
      case 7 => SealedTrait._8(a.asInstanceOf[A8])
      case 8 => SealedTrait._9(a.asInstanceOf[A9])
      case 9 => SealedTrait._10(a.asInstanceOf[A10])
      case 10 => SealedTrait._11(a.asInstanceOf[A11])
      case 11 => SealedTrait._12(a.asInstanceOf[A12])
      case 12 => SealedTrait._13(a.asInstanceOf[A13])
      case 13 => SealedTrait._14(a.asInstanceOf[A14])
      case 14 => SealedTrait._15(a.asInstanceOf[A15])
      case 15 => SealedTrait._16(a.asInstanceOf[A16])
      case 16 => SealedTrait._17(a.asInstanceOf[A17])
      case 17 => SealedTrait._18(a.asInstanceOf[A18])
      case 18 => SealedTrait._19(a.asInstanceOf[A19])
      case 19 => SealedTrait._20(a.asInstanceOf[A20])
      case 20 => SealedTrait._21(a.asInstanceOf[A21])
      case 21 => SealedTrait._22(a.asInstanceOf[A22])
      case 22 => SealedTrait._23(a.asInstanceOf[A23])
      case 23 => SealedTrait._24(a.asInstanceOf[A24])
      case 24 => SealedTrait._25(a.asInstanceOf[A25])
      case 25 => SealedTrait._26(a.asInstanceOf[A26])
      case 26 => SealedTrait._27(a.asInstanceOf[A27])
      case 27 => SealedTrait._28(a.asInstanceOf[A28])
      case 28 => SealedTrait._29(a.asInstanceOf[A29])
      case 29 => SealedTrait._30(a.asInstanceOf[A30])
      case 30 => SealedTrait._31(a.asInstanceOf[A31])
      case 31 => SealedTrait._32(a.asInstanceOf[A32])
      case 32 => SealedTrait._33(a.asInstanceOf[A33])
      case 33 => SealedTrait._34(a.asInstanceOf[A34])
      case 34 => SealedTrait._35(a.asInstanceOf[A35])
      case 35 => SealedTrait._36(a.asInstanceOf[A36])
      case 36 => SealedTrait._37(a.asInstanceOf[A37])
      case 37 => SealedTrait._38(a.asInstanceOf[A38])
      case 38 => SealedTrait._39(a.asInstanceOf[A39])
      case 39 => SealedTrait._40(a.asInstanceOf[A40])
      case 40 => SealedTrait._41(a.asInstanceOf[A41])
      case 41 => SealedTrait._42(a.asInstanceOf[A42])
      case 42 => SealedTrait._43(a.asInstanceOf[A43])
      case 43 => SealedTrait._44(a.asInstanceOf[A44])
      case 44 => SealedTrait._45(a.asInstanceOf[A45])
    }
    def from(s: SealedTrait45[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45]): A = s.value
  }

  implicit def sealedtrait46[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A, A28 <: A, A29 <: A, A30 <: A, A31 <: A, A32 <: A, A33 <: A, A34 <: A, A35 <: A, A36 <: A, A37 <: A, A38 <: A, A39 <: A, A40 <: A, A41 <: A, A42 <: A, A43 <: A, A44 <: A, A45 <: A, A46 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46)): Shapely[A, SealedTrait46[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46]] = new Shapely[A, SealedTrait46[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46]] {
    def to(a: A): SealedTrait46[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46] = A.ordinal(a) match {
      case 0 => SealedTrait._1(a.asInstanceOf[A1])
      case 1 => SealedTrait._2(a.asInstanceOf[A2])
      case 2 => SealedTrait._3(a.asInstanceOf[A3])
      case 3 => SealedTrait._4(a.asInstanceOf[A4])
      case 4 => SealedTrait._5(a.asInstanceOf[A5])
      case 5 => SealedTrait._6(a.asInstanceOf[A6])
      case 6 => SealedTrait._7(a.asInstanceOf[A7])
      case 7 => SealedTrait._8(a.asInstanceOf[A8])
      case 8 => SealedTrait._9(a.asInstanceOf[A9])
      case 9 => SealedTrait._10(a.asInstanceOf[A10])
      case 10 => SealedTrait._11(a.asInstanceOf[A11])
      case 11 => SealedTrait._12(a.asInstanceOf[A12])
      case 12 => SealedTrait._13(a.asInstanceOf[A13])
      case 13 => SealedTrait._14(a.asInstanceOf[A14])
      case 14 => SealedTrait._15(a.asInstanceOf[A15])
      case 15 => SealedTrait._16(a.asInstanceOf[A16])
      case 16 => SealedTrait._17(a.asInstanceOf[A17])
      case 17 => SealedTrait._18(a.asInstanceOf[A18])
      case 18 => SealedTrait._19(a.asInstanceOf[A19])
      case 19 => SealedTrait._20(a.asInstanceOf[A20])
      case 20 => SealedTrait._21(a.asInstanceOf[A21])
      case 21 => SealedTrait._22(a.asInstanceOf[A22])
      case 22 => SealedTrait._23(a.asInstanceOf[A23])
      case 23 => SealedTrait._24(a.asInstanceOf[A24])
      case 24 => SealedTrait._25(a.asInstanceOf[A25])
      case 25 => SealedTrait._26(a.asInstanceOf[A26])
      case 26 => SealedTrait._27(a.asInstanceOf[A27])
      case 27 => SealedTrait._28(a.asInstanceOf[A28])
      case 28 => SealedTrait._29(a.asInstanceOf[A29])
      case 29 => SealedTrait._30(a.asInstanceOf[A30])
      case 30 => SealedTrait._31(a.asInstanceOf[A31])
      case 31 => SealedTrait._32(a.asInstanceOf[A32])
      case 32 => SealedTrait._33(a.asInstanceOf[A33])
      case 33 => SealedTrait._34(a.asInstanceOf[A34])
      case 34 => SealedTrait._35(a.asInstanceOf[A35])
      case 35 => SealedTrait._36(a.asInstanceOf[A36])
      case 36 => SealedTrait._37(a.asInstanceOf[A37])
      case 37 => SealedTrait._38(a.asInstanceOf[A38])
      case 38 => SealedTrait._39(a.asInstanceOf[A39])
      case 39 => SealedTrait._40(a.asInstanceOf[A40])
      case 40 => SealedTrait._41(a.asInstanceOf[A41])
      case 41 => SealedTrait._42(a.asInstanceOf[A42])
      case 42 => SealedTrait._43(a.asInstanceOf[A43])
      case 43 => SealedTrait._44(a.asInstanceOf[A44])
      case 44 => SealedTrait._45(a.asInstanceOf[A45])
      case 45 => SealedTrait._46(a.asInstanceOf[A46])
    }
    def from(s: SealedTrait46[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46]): A = s.value
  }

  implicit def sealedtrait47[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A, A28 <: A, A29 <: A, A30 <: A, A31 <: A, A32 <: A, A33 <: A, A34 <: A, A35 <: A, A36 <: A, A37 <: A, A38 <: A, A39 <: A, A40 <: A, A41 <: A, A42 <: A, A43 <: A, A44 <: A, A45 <: A, A46 <: A, A47 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47)): Shapely[A, SealedTrait47[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47]] = new Shapely[A, SealedTrait47[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47]] {
    def to(a: A): SealedTrait47[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47] = A.ordinal(a) match {
      case 0 => SealedTrait._1(a.asInstanceOf[A1])
      case 1 => SealedTrait._2(a.asInstanceOf[A2])
      case 2 => SealedTrait._3(a.asInstanceOf[A3])
      case 3 => SealedTrait._4(a.asInstanceOf[A4])
      case 4 => SealedTrait._5(a.asInstanceOf[A5])
      case 5 => SealedTrait._6(a.asInstanceOf[A6])
      case 6 => SealedTrait._7(a.asInstanceOf[A7])
      case 7 => SealedTrait._8(a.asInstanceOf[A8])
      case 8 => SealedTrait._9(a.asInstanceOf[A9])
      case 9 => SealedTrait._10(a.asInstanceOf[A10])
      case 10 => SealedTrait._11(a.asInstanceOf[A11])
      case 11 => SealedTrait._12(a.asInstanceOf[A12])
      case 12 => SealedTrait._13(a.asInstanceOf[A13])
      case 13 => SealedTrait._14(a.asInstanceOf[A14])
      case 14 => SealedTrait._15(a.asInstanceOf[A15])
      case 15 => SealedTrait._16(a.asInstanceOf[A16])
      case 16 => SealedTrait._17(a.asInstanceOf[A17])
      case 17 => SealedTrait._18(a.asInstanceOf[A18])
      case 18 => SealedTrait._19(a.asInstanceOf[A19])
      case 19 => SealedTrait._20(a.asInstanceOf[A20])
      case 20 => SealedTrait._21(a.asInstanceOf[A21])
      case 21 => SealedTrait._22(a.asInstanceOf[A22])
      case 22 => SealedTrait._23(a.asInstanceOf[A23])
      case 23 => SealedTrait._24(a.asInstanceOf[A24])
      case 24 => SealedTrait._25(a.asInstanceOf[A25])
      case 25 => SealedTrait._26(a.asInstanceOf[A26])
      case 26 => SealedTrait._27(a.asInstanceOf[A27])
      case 27 => SealedTrait._28(a.asInstanceOf[A28])
      case 28 => SealedTrait._29(a.asInstanceOf[A29])
      case 29 => SealedTrait._30(a.asInstanceOf[A30])
      case 30 => SealedTrait._31(a.asInstanceOf[A31])
      case 31 => SealedTrait._32(a.asInstanceOf[A32])
      case 32 => SealedTrait._33(a.asInstanceOf[A33])
      case 33 => SealedTrait._34(a.asInstanceOf[A34])
      case 34 => SealedTrait._35(a.asInstanceOf[A35])
      case 35 => SealedTrait._36(a.asInstanceOf[A36])
      case 36 => SealedTrait._37(a.asInstanceOf[A37])
      case 37 => SealedTrait._38(a.asInstanceOf[A38])
      case 38 => SealedTrait._39(a.asInstanceOf[A39])
      case 39 => SealedTrait._40(a.asInstanceOf[A40])
      case 40 => SealedTrait._41(a.asInstanceOf[A41])
      case 41 => SealedTrait._42(a.asInstanceOf[A42])
      case 42 => SealedTrait._43(a.asInstanceOf[A43])
      case 43 => SealedTrait._44(a.asInstanceOf[A44])
      case 44 => SealedTrait._45(a.asInstanceOf[A45])
      case 45 => SealedTrait._46(a.asInstanceOf[A46])
      case 46 => SealedTrait._47(a.asInstanceOf[A47])
    }
    def from(s: SealedTrait47[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47]): A = s.value
  }

  implicit def sealedtrait48[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A, A28 <: A, A29 <: A, A30 <: A, A31 <: A, A32 <: A, A33 <: A, A34 <: A, A35 <: A, A36 <: A, A37 <: A, A38 <: A, A39 <: A, A40 <: A, A41 <: A, A42 <: A, A43 <: A, A44 <: A, A45 <: A, A46 <: A, A47 <: A, A48 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48)): Shapely[A, SealedTrait48[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48]] = new Shapely[A, SealedTrait48[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48]] {
    def to(a: A): SealedTrait48[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48] = A.ordinal(a) match {
      case 0 => SealedTrait._1(a.asInstanceOf[A1])
      case 1 => SealedTrait._2(a.asInstanceOf[A2])
      case 2 => SealedTrait._3(a.asInstanceOf[A3])
      case 3 => SealedTrait._4(a.asInstanceOf[A4])
      case 4 => SealedTrait._5(a.asInstanceOf[A5])
      case 5 => SealedTrait._6(a.asInstanceOf[A6])
      case 6 => SealedTrait._7(a.asInstanceOf[A7])
      case 7 => SealedTrait._8(a.asInstanceOf[A8])
      case 8 => SealedTrait._9(a.asInstanceOf[A9])
      case 9 => SealedTrait._10(a.asInstanceOf[A10])
      case 10 => SealedTrait._11(a.asInstanceOf[A11])
      case 11 => SealedTrait._12(a.asInstanceOf[A12])
      case 12 => SealedTrait._13(a.asInstanceOf[A13])
      case 13 => SealedTrait._14(a.asInstanceOf[A14])
      case 14 => SealedTrait._15(a.asInstanceOf[A15])
      case 15 => SealedTrait._16(a.asInstanceOf[A16])
      case 16 => SealedTrait._17(a.asInstanceOf[A17])
      case 17 => SealedTrait._18(a.asInstanceOf[A18])
      case 18 => SealedTrait._19(a.asInstanceOf[A19])
      case 19 => SealedTrait._20(a.asInstanceOf[A20])
      case 20 => SealedTrait._21(a.asInstanceOf[A21])
      case 21 => SealedTrait._22(a.asInstanceOf[A22])
      case 22 => SealedTrait._23(a.asInstanceOf[A23])
      case 23 => SealedTrait._24(a.asInstanceOf[A24])
      case 24 => SealedTrait._25(a.asInstanceOf[A25])
      case 25 => SealedTrait._26(a.asInstanceOf[A26])
      case 26 => SealedTrait._27(a.asInstanceOf[A27])
      case 27 => SealedTrait._28(a.asInstanceOf[A28])
      case 28 => SealedTrait._29(a.asInstanceOf[A29])
      case 29 => SealedTrait._30(a.asInstanceOf[A30])
      case 30 => SealedTrait._31(a.asInstanceOf[A31])
      case 31 => SealedTrait._32(a.asInstanceOf[A32])
      case 32 => SealedTrait._33(a.asInstanceOf[A33])
      case 33 => SealedTrait._34(a.asInstanceOf[A34])
      case 34 => SealedTrait._35(a.asInstanceOf[A35])
      case 35 => SealedTrait._36(a.asInstanceOf[A36])
      case 36 => SealedTrait._37(a.asInstanceOf[A37])
      case 37 => SealedTrait._38(a.asInstanceOf[A38])
      case 38 => SealedTrait._39(a.asInstanceOf[A39])
      case 39 => SealedTrait._40(a.asInstanceOf[A40])
      case 40 => SealedTrait._41(a.asInstanceOf[A41])
      case 41 => SealedTrait._42(a.asInstanceOf[A42])
      case 42 => SealedTrait._43(a.asInstanceOf[A43])
      case 43 => SealedTrait._44(a.asInstanceOf[A44])
      case 44 => SealedTrait._45(a.asInstanceOf[A45])
      case 45 => SealedTrait._46(a.asInstanceOf[A46])
      case 46 => SealedTrait._47(a.asInstanceOf[A47])
      case 47 => SealedTrait._48(a.asInstanceOf[A48])
    }
    def from(s: SealedTrait48[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48]): A = s.value
  }

  implicit def sealedtrait49[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A, A28 <: A, A29 <: A, A30 <: A, A31 <: A, A32 <: A, A33 <: A, A34 <: A, A35 <: A, A36 <: A, A37 <: A, A38 <: A, A39 <: A, A40 <: A, A41 <: A, A42 <: A, A43 <: A, A44 <: A, A45 <: A, A46 <: A, A47 <: A, A48 <: A, A49 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49)): Shapely[A, SealedTrait49[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49]] = new Shapely[A, SealedTrait49[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49]] {
    def to(a: A): SealedTrait49[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49] = A.ordinal(a) match {
      case 0 => SealedTrait._1(a.asInstanceOf[A1])
      case 1 => SealedTrait._2(a.asInstanceOf[A2])
      case 2 => SealedTrait._3(a.asInstanceOf[A3])
      case 3 => SealedTrait._4(a.asInstanceOf[A4])
      case 4 => SealedTrait._5(a.asInstanceOf[A5])
      case 5 => SealedTrait._6(a.asInstanceOf[A6])
      case 6 => SealedTrait._7(a.asInstanceOf[A7])
      case 7 => SealedTrait._8(a.asInstanceOf[A8])
      case 8 => SealedTrait._9(a.asInstanceOf[A9])
      case 9 => SealedTrait._10(a.asInstanceOf[A10])
      case 10 => SealedTrait._11(a.asInstanceOf[A11])
      case 11 => SealedTrait._12(a.asInstanceOf[A12])
      case 12 => SealedTrait._13(a.asInstanceOf[A13])
      case 13 => SealedTrait._14(a.asInstanceOf[A14])
      case 14 => SealedTrait._15(a.asInstanceOf[A15])
      case 15 => SealedTrait._16(a.asInstanceOf[A16])
      case 16 => SealedTrait._17(a.asInstanceOf[A17])
      case 17 => SealedTrait._18(a.asInstanceOf[A18])
      case 18 => SealedTrait._19(a.asInstanceOf[A19])
      case 19 => SealedTrait._20(a.asInstanceOf[A20])
      case 20 => SealedTrait._21(a.asInstanceOf[A21])
      case 21 => SealedTrait._22(a.asInstanceOf[A22])
      case 22 => SealedTrait._23(a.asInstanceOf[A23])
      case 23 => SealedTrait._24(a.asInstanceOf[A24])
      case 24 => SealedTrait._25(a.asInstanceOf[A25])
      case 25 => SealedTrait._26(a.asInstanceOf[A26])
      case 26 => SealedTrait._27(a.asInstanceOf[A27])
      case 27 => SealedTrait._28(a.asInstanceOf[A28])
      case 28 => SealedTrait._29(a.asInstanceOf[A29])
      case 29 => SealedTrait._30(a.asInstanceOf[A30])
      case 30 => SealedTrait._31(a.asInstanceOf[A31])
      case 31 => SealedTrait._32(a.asInstanceOf[A32])
      case 32 => SealedTrait._33(a.asInstanceOf[A33])
      case 33 => SealedTrait._34(a.asInstanceOf[A34])
      case 34 => SealedTrait._35(a.asInstanceOf[A35])
      case 35 => SealedTrait._36(a.asInstanceOf[A36])
      case 36 => SealedTrait._37(a.asInstanceOf[A37])
      case 37 => SealedTrait._38(a.asInstanceOf[A38])
      case 38 => SealedTrait._39(a.asInstanceOf[A39])
      case 39 => SealedTrait._40(a.asInstanceOf[A40])
      case 40 => SealedTrait._41(a.asInstanceOf[A41])
      case 41 => SealedTrait._42(a.asInstanceOf[A42])
      case 42 => SealedTrait._43(a.asInstanceOf[A43])
      case 43 => SealedTrait._44(a.asInstanceOf[A44])
      case 44 => SealedTrait._45(a.asInstanceOf[A45])
      case 45 => SealedTrait._46(a.asInstanceOf[A46])
      case 46 => SealedTrait._47(a.asInstanceOf[A47])
      case 47 => SealedTrait._48(a.asInstanceOf[A48])
      case 48 => SealedTrait._49(a.asInstanceOf[A49])
    }
    def from(s: SealedTrait49[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49]): A = s.value
  }

  implicit def sealedtrait50[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A, A28 <: A, A29 <: A, A30 <: A, A31 <: A, A32 <: A, A33 <: A, A34 <: A, A35 <: A, A36 <: A, A37 <: A, A38 <: A, A39 <: A, A40 <: A, A41 <: A, A42 <: A, A43 <: A, A44 <: A, A45 <: A, A46 <: A, A47 <: A, A48 <: A, A49 <: A, A50 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50)): Shapely[A, SealedTrait50[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50]] = new Shapely[A, SealedTrait50[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50]] {
    def to(a: A): SealedTrait50[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50] = A.ordinal(a) match {
      case 0 => SealedTrait._1(a.asInstanceOf[A1])
      case 1 => SealedTrait._2(a.asInstanceOf[A2])
      case 2 => SealedTrait._3(a.asInstanceOf[A3])
      case 3 => SealedTrait._4(a.asInstanceOf[A4])
      case 4 => SealedTrait._5(a.asInstanceOf[A5])
      case 5 => SealedTrait._6(a.asInstanceOf[A6])
      case 6 => SealedTrait._7(a.asInstanceOf[A7])
      case 7 => SealedTrait._8(a.asInstanceOf[A8])
      case 8 => SealedTrait._9(a.asInstanceOf[A9])
      case 9 => SealedTrait._10(a.asInstanceOf[A10])
      case 10 => SealedTrait._11(a.asInstanceOf[A11])
      case 11 => SealedTrait._12(a.asInstanceOf[A12])
      case 12 => SealedTrait._13(a.asInstanceOf[A13])
      case 13 => SealedTrait._14(a.asInstanceOf[A14])
      case 14 => SealedTrait._15(a.asInstanceOf[A15])
      case 15 => SealedTrait._16(a.asInstanceOf[A16])
      case 16 => SealedTrait._17(a.asInstanceOf[A17])
      case 17 => SealedTrait._18(a.asInstanceOf[A18])
      case 18 => SealedTrait._19(a.asInstanceOf[A19])
      case 19 => SealedTrait._20(a.asInstanceOf[A20])
      case 20 => SealedTrait._21(a.asInstanceOf[A21])
      case 21 => SealedTrait._22(a.asInstanceOf[A22])
      case 22 => SealedTrait._23(a.asInstanceOf[A23])
      case 23 => SealedTrait._24(a.asInstanceOf[A24])
      case 24 => SealedTrait._25(a.asInstanceOf[A25])
      case 25 => SealedTrait._26(a.asInstanceOf[A26])
      case 26 => SealedTrait._27(a.asInstanceOf[A27])
      case 27 => SealedTrait._28(a.asInstanceOf[A28])
      case 28 => SealedTrait._29(a.asInstanceOf[A29])
      case 29 => SealedTrait._30(a.asInstanceOf[A30])
      case 30 => SealedTrait._31(a.asInstanceOf[A31])
      case 31 => SealedTrait._32(a.asInstanceOf[A32])
      case 32 => SealedTrait._33(a.asInstanceOf[A33])
      case 33 => SealedTrait._34(a.asInstanceOf[A34])
      case 34 => SealedTrait._35(a.asInstanceOf[A35])
      case 35 => SealedTrait._36(a.asInstanceOf[A36])
      case 36 => SealedTrait._37(a.asInstanceOf[A37])
      case 37 => SealedTrait._38(a.asInstanceOf[A38])
      case 38 => SealedTrait._39(a.asInstanceOf[A39])
      case 39 => SealedTrait._40(a.asInstanceOf[A40])
      case 40 => SealedTrait._41(a.asInstanceOf[A41])
      case 41 => SealedTrait._42(a.asInstanceOf[A42])
      case 42 => SealedTrait._43(a.asInstanceOf[A43])
      case 43 => SealedTrait._44(a.asInstanceOf[A44])
      case 44 => SealedTrait._45(a.asInstanceOf[A45])
      case 45 => SealedTrait._46(a.asInstanceOf[A46])
      case 46 => SealedTrait._47(a.asInstanceOf[A47])
      case 47 => SealedTrait._48(a.asInstanceOf[A48])
      case 48 => SealedTrait._49(a.asInstanceOf[A49])
      case 49 => SealedTrait._50(a.asInstanceOf[A50])
    }
    def from(s: SealedTrait50[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50]): A = s.value
  }

  implicit def sealedtrait51[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A, A28 <: A, A29 <: A, A30 <: A, A31 <: A, A32 <: A, A33 <: A, A34 <: A, A35 <: A, A36 <: A, A37 <: A, A38 <: A, A39 <: A, A40 <: A, A41 <: A, A42 <: A, A43 <: A, A44 <: A, A45 <: A, A46 <: A, A47 <: A, A48 <: A, A49 <: A, A50 <: A, A51 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51)): Shapely[A, SealedTrait51[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51]] = new Shapely[A, SealedTrait51[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51]] {
    def to(a: A): SealedTrait51[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51] = A.ordinal(a) match {
      case 0 => SealedTrait._1(a.asInstanceOf[A1])
      case 1 => SealedTrait._2(a.asInstanceOf[A2])
      case 2 => SealedTrait._3(a.asInstanceOf[A3])
      case 3 => SealedTrait._4(a.asInstanceOf[A4])
      case 4 => SealedTrait._5(a.asInstanceOf[A5])
      case 5 => SealedTrait._6(a.asInstanceOf[A6])
      case 6 => SealedTrait._7(a.asInstanceOf[A7])
      case 7 => SealedTrait._8(a.asInstanceOf[A8])
      case 8 => SealedTrait._9(a.asInstanceOf[A9])
      case 9 => SealedTrait._10(a.asInstanceOf[A10])
      case 10 => SealedTrait._11(a.asInstanceOf[A11])
      case 11 => SealedTrait._12(a.asInstanceOf[A12])
      case 12 => SealedTrait._13(a.asInstanceOf[A13])
      case 13 => SealedTrait._14(a.asInstanceOf[A14])
      case 14 => SealedTrait._15(a.asInstanceOf[A15])
      case 15 => SealedTrait._16(a.asInstanceOf[A16])
      case 16 => SealedTrait._17(a.asInstanceOf[A17])
      case 17 => SealedTrait._18(a.asInstanceOf[A18])
      case 18 => SealedTrait._19(a.asInstanceOf[A19])
      case 19 => SealedTrait._20(a.asInstanceOf[A20])
      case 20 => SealedTrait._21(a.asInstanceOf[A21])
      case 21 => SealedTrait._22(a.asInstanceOf[A22])
      case 22 => SealedTrait._23(a.asInstanceOf[A23])
      case 23 => SealedTrait._24(a.asInstanceOf[A24])
      case 24 => SealedTrait._25(a.asInstanceOf[A25])
      case 25 => SealedTrait._26(a.asInstanceOf[A26])
      case 26 => SealedTrait._27(a.asInstanceOf[A27])
      case 27 => SealedTrait._28(a.asInstanceOf[A28])
      case 28 => SealedTrait._29(a.asInstanceOf[A29])
      case 29 => SealedTrait._30(a.asInstanceOf[A30])
      case 30 => SealedTrait._31(a.asInstanceOf[A31])
      case 31 => SealedTrait._32(a.asInstanceOf[A32])
      case 32 => SealedTrait._33(a.asInstanceOf[A33])
      case 33 => SealedTrait._34(a.asInstanceOf[A34])
      case 34 => SealedTrait._35(a.asInstanceOf[A35])
      case 35 => SealedTrait._36(a.asInstanceOf[A36])
      case 36 => SealedTrait._37(a.asInstanceOf[A37])
      case 37 => SealedTrait._38(a.asInstanceOf[A38])
      case 38 => SealedTrait._39(a.asInstanceOf[A39])
      case 39 => SealedTrait._40(a.asInstanceOf[A40])
      case 40 => SealedTrait._41(a.asInstanceOf[A41])
      case 41 => SealedTrait._42(a.asInstanceOf[A42])
      case 42 => SealedTrait._43(a.asInstanceOf[A43])
      case 43 => SealedTrait._44(a.asInstanceOf[A44])
      case 44 => SealedTrait._45(a.asInstanceOf[A45])
      case 45 => SealedTrait._46(a.asInstanceOf[A46])
      case 46 => SealedTrait._47(a.asInstanceOf[A47])
      case 47 => SealedTrait._48(a.asInstanceOf[A48])
      case 48 => SealedTrait._49(a.asInstanceOf[A49])
      case 49 => SealedTrait._50(a.asInstanceOf[A50])
      case 50 => SealedTrait._51(a.asInstanceOf[A51])
    }
    def from(s: SealedTrait51[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51]): A = s.value
  }

  implicit def sealedtrait52[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A, A28 <: A, A29 <: A, A30 <: A, A31 <: A, A32 <: A, A33 <: A, A34 <: A, A35 <: A, A36 <: A, A37 <: A, A38 <: A, A39 <: A, A40 <: A, A41 <: A, A42 <: A, A43 <: A, A44 <: A, A45 <: A, A46 <: A, A47 <: A, A48 <: A, A49 <: A, A50 <: A, A51 <: A, A52 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52)): Shapely[A, SealedTrait52[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52]] = new Shapely[A, SealedTrait52[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52]] {
    def to(a: A): SealedTrait52[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52] = A.ordinal(a) match {
      case 0 => SealedTrait._1(a.asInstanceOf[A1])
      case 1 => SealedTrait._2(a.asInstanceOf[A2])
      case 2 => SealedTrait._3(a.asInstanceOf[A3])
      case 3 => SealedTrait._4(a.asInstanceOf[A4])
      case 4 => SealedTrait._5(a.asInstanceOf[A5])
      case 5 => SealedTrait._6(a.asInstanceOf[A6])
      case 6 => SealedTrait._7(a.asInstanceOf[A7])
      case 7 => SealedTrait._8(a.asInstanceOf[A8])
      case 8 => SealedTrait._9(a.asInstanceOf[A9])
      case 9 => SealedTrait._10(a.asInstanceOf[A10])
      case 10 => SealedTrait._11(a.asInstanceOf[A11])
      case 11 => SealedTrait._12(a.asInstanceOf[A12])
      case 12 => SealedTrait._13(a.asInstanceOf[A13])
      case 13 => SealedTrait._14(a.asInstanceOf[A14])
      case 14 => SealedTrait._15(a.asInstanceOf[A15])
      case 15 => SealedTrait._16(a.asInstanceOf[A16])
      case 16 => SealedTrait._17(a.asInstanceOf[A17])
      case 17 => SealedTrait._18(a.asInstanceOf[A18])
      case 18 => SealedTrait._19(a.asInstanceOf[A19])
      case 19 => SealedTrait._20(a.asInstanceOf[A20])
      case 20 => SealedTrait._21(a.asInstanceOf[A21])
      case 21 => SealedTrait._22(a.asInstanceOf[A22])
      case 22 => SealedTrait._23(a.asInstanceOf[A23])
      case 23 => SealedTrait._24(a.asInstanceOf[A24])
      case 24 => SealedTrait._25(a.asInstanceOf[A25])
      case 25 => SealedTrait._26(a.asInstanceOf[A26])
      case 26 => SealedTrait._27(a.asInstanceOf[A27])
      case 27 => SealedTrait._28(a.asInstanceOf[A28])
      case 28 => SealedTrait._29(a.asInstanceOf[A29])
      case 29 => SealedTrait._30(a.asInstanceOf[A30])
      case 30 => SealedTrait._31(a.asInstanceOf[A31])
      case 31 => SealedTrait._32(a.asInstanceOf[A32])
      case 32 => SealedTrait._33(a.asInstanceOf[A33])
      case 33 => SealedTrait._34(a.asInstanceOf[A34])
      case 34 => SealedTrait._35(a.asInstanceOf[A35])
      case 35 => SealedTrait._36(a.asInstanceOf[A36])
      case 36 => SealedTrait._37(a.asInstanceOf[A37])
      case 37 => SealedTrait._38(a.asInstanceOf[A38])
      case 38 => SealedTrait._39(a.asInstanceOf[A39])
      case 39 => SealedTrait._40(a.asInstanceOf[A40])
      case 40 => SealedTrait._41(a.asInstanceOf[A41])
      case 41 => SealedTrait._42(a.asInstanceOf[A42])
      case 42 => SealedTrait._43(a.asInstanceOf[A43])
      case 43 => SealedTrait._44(a.asInstanceOf[A44])
      case 44 => SealedTrait._45(a.asInstanceOf[A45])
      case 45 => SealedTrait._46(a.asInstanceOf[A46])
      case 46 => SealedTrait._47(a.asInstanceOf[A47])
      case 47 => SealedTrait._48(a.asInstanceOf[A48])
      case 48 => SealedTrait._49(a.asInstanceOf[A49])
      case 49 => SealedTrait._50(a.asInstanceOf[A50])
      case 50 => SealedTrait._51(a.asInstanceOf[A51])
      case 51 => SealedTrait._52(a.asInstanceOf[A52])
    }
    def from(s: SealedTrait52[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52]): A = s.value
  }

  implicit def sealedtrait53[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A, A28 <: A, A29 <: A, A30 <: A, A31 <: A, A32 <: A, A33 <: A, A34 <: A, A35 <: A, A36 <: A, A37 <: A, A38 <: A, A39 <: A, A40 <: A, A41 <: A, A42 <: A, A43 <: A, A44 <: A, A45 <: A, A46 <: A, A47 <: A, A48 <: A, A49 <: A, A50 <: A, A51 <: A, A52 <: A, A53 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53)): Shapely[A, SealedTrait53[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53]] = new Shapely[A, SealedTrait53[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53]] {
    def to(a: A): SealedTrait53[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53] = A.ordinal(a) match {
      case 0 => SealedTrait._1(a.asInstanceOf[A1])
      case 1 => SealedTrait._2(a.asInstanceOf[A2])
      case 2 => SealedTrait._3(a.asInstanceOf[A3])
      case 3 => SealedTrait._4(a.asInstanceOf[A4])
      case 4 => SealedTrait._5(a.asInstanceOf[A5])
      case 5 => SealedTrait._6(a.asInstanceOf[A6])
      case 6 => SealedTrait._7(a.asInstanceOf[A7])
      case 7 => SealedTrait._8(a.asInstanceOf[A8])
      case 8 => SealedTrait._9(a.asInstanceOf[A9])
      case 9 => SealedTrait._10(a.asInstanceOf[A10])
      case 10 => SealedTrait._11(a.asInstanceOf[A11])
      case 11 => SealedTrait._12(a.asInstanceOf[A12])
      case 12 => SealedTrait._13(a.asInstanceOf[A13])
      case 13 => SealedTrait._14(a.asInstanceOf[A14])
      case 14 => SealedTrait._15(a.asInstanceOf[A15])
      case 15 => SealedTrait._16(a.asInstanceOf[A16])
      case 16 => SealedTrait._17(a.asInstanceOf[A17])
      case 17 => SealedTrait._18(a.asInstanceOf[A18])
      case 18 => SealedTrait._19(a.asInstanceOf[A19])
      case 19 => SealedTrait._20(a.asInstanceOf[A20])
      case 20 => SealedTrait._21(a.asInstanceOf[A21])
      case 21 => SealedTrait._22(a.asInstanceOf[A22])
      case 22 => SealedTrait._23(a.asInstanceOf[A23])
      case 23 => SealedTrait._24(a.asInstanceOf[A24])
      case 24 => SealedTrait._25(a.asInstanceOf[A25])
      case 25 => SealedTrait._26(a.asInstanceOf[A26])
      case 26 => SealedTrait._27(a.asInstanceOf[A27])
      case 27 => SealedTrait._28(a.asInstanceOf[A28])
      case 28 => SealedTrait._29(a.asInstanceOf[A29])
      case 29 => SealedTrait._30(a.asInstanceOf[A30])
      case 30 => SealedTrait._31(a.asInstanceOf[A31])
      case 31 => SealedTrait._32(a.asInstanceOf[A32])
      case 32 => SealedTrait._33(a.asInstanceOf[A33])
      case 33 => SealedTrait._34(a.asInstanceOf[A34])
      case 34 => SealedTrait._35(a.asInstanceOf[A35])
      case 35 => SealedTrait._36(a.asInstanceOf[A36])
      case 36 => SealedTrait._37(a.asInstanceOf[A37])
      case 37 => SealedTrait._38(a.asInstanceOf[A38])
      case 38 => SealedTrait._39(a.asInstanceOf[A39])
      case 39 => SealedTrait._40(a.asInstanceOf[A40])
      case 40 => SealedTrait._41(a.asInstanceOf[A41])
      case 41 => SealedTrait._42(a.asInstanceOf[A42])
      case 42 => SealedTrait._43(a.asInstanceOf[A43])
      case 43 => SealedTrait._44(a.asInstanceOf[A44])
      case 44 => SealedTrait._45(a.asInstanceOf[A45])
      case 45 => SealedTrait._46(a.asInstanceOf[A46])
      case 46 => SealedTrait._47(a.asInstanceOf[A47])
      case 47 => SealedTrait._48(a.asInstanceOf[A48])
      case 48 => SealedTrait._49(a.asInstanceOf[A49])
      case 49 => SealedTrait._50(a.asInstanceOf[A50])
      case 50 => SealedTrait._51(a.asInstanceOf[A51])
      case 51 => SealedTrait._52(a.asInstanceOf[A52])
      case 52 => SealedTrait._53(a.asInstanceOf[A53])
    }
    def from(s: SealedTrait53[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53]): A = s.value
  }

  implicit def sealedtrait54[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A, A28 <: A, A29 <: A, A30 <: A, A31 <: A, A32 <: A, A33 <: A, A34 <: A, A35 <: A, A36 <: A, A37 <: A, A38 <: A, A39 <: A, A40 <: A, A41 <: A, A42 <: A, A43 <: A, A44 <: A, A45 <: A, A46 <: A, A47 <: A, A48 <: A, A49 <: A, A50 <: A, A51 <: A, A52 <: A, A53 <: A, A54 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54)): Shapely[A, SealedTrait54[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54]] = new Shapely[A, SealedTrait54[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54]] {
    def to(a: A): SealedTrait54[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54] = A.ordinal(a) match {
      case 0 => SealedTrait._1(a.asInstanceOf[A1])
      case 1 => SealedTrait._2(a.asInstanceOf[A2])
      case 2 => SealedTrait._3(a.asInstanceOf[A3])
      case 3 => SealedTrait._4(a.asInstanceOf[A4])
      case 4 => SealedTrait._5(a.asInstanceOf[A5])
      case 5 => SealedTrait._6(a.asInstanceOf[A6])
      case 6 => SealedTrait._7(a.asInstanceOf[A7])
      case 7 => SealedTrait._8(a.asInstanceOf[A8])
      case 8 => SealedTrait._9(a.asInstanceOf[A9])
      case 9 => SealedTrait._10(a.asInstanceOf[A10])
      case 10 => SealedTrait._11(a.asInstanceOf[A11])
      case 11 => SealedTrait._12(a.asInstanceOf[A12])
      case 12 => SealedTrait._13(a.asInstanceOf[A13])
      case 13 => SealedTrait._14(a.asInstanceOf[A14])
      case 14 => SealedTrait._15(a.asInstanceOf[A15])
      case 15 => SealedTrait._16(a.asInstanceOf[A16])
      case 16 => SealedTrait._17(a.asInstanceOf[A17])
      case 17 => SealedTrait._18(a.asInstanceOf[A18])
      case 18 => SealedTrait._19(a.asInstanceOf[A19])
      case 19 => SealedTrait._20(a.asInstanceOf[A20])
      case 20 => SealedTrait._21(a.asInstanceOf[A21])
      case 21 => SealedTrait._22(a.asInstanceOf[A22])
      case 22 => SealedTrait._23(a.asInstanceOf[A23])
      case 23 => SealedTrait._24(a.asInstanceOf[A24])
      case 24 => SealedTrait._25(a.asInstanceOf[A25])
      case 25 => SealedTrait._26(a.asInstanceOf[A26])
      case 26 => SealedTrait._27(a.asInstanceOf[A27])
      case 27 => SealedTrait._28(a.asInstanceOf[A28])
      case 28 => SealedTrait._29(a.asInstanceOf[A29])
      case 29 => SealedTrait._30(a.asInstanceOf[A30])
      case 30 => SealedTrait._31(a.asInstanceOf[A31])
      case 31 => SealedTrait._32(a.asInstanceOf[A32])
      case 32 => SealedTrait._33(a.asInstanceOf[A33])
      case 33 => SealedTrait._34(a.asInstanceOf[A34])
      case 34 => SealedTrait._35(a.asInstanceOf[A35])
      case 35 => SealedTrait._36(a.asInstanceOf[A36])
      case 36 => SealedTrait._37(a.asInstanceOf[A37])
      case 37 => SealedTrait._38(a.asInstanceOf[A38])
      case 38 => SealedTrait._39(a.asInstanceOf[A39])
      case 39 => SealedTrait._40(a.asInstanceOf[A40])
      case 40 => SealedTrait._41(a.asInstanceOf[A41])
      case 41 => SealedTrait._42(a.asInstanceOf[A42])
      case 42 => SealedTrait._43(a.asInstanceOf[A43])
      case 43 => SealedTrait._44(a.asInstanceOf[A44])
      case 44 => SealedTrait._45(a.asInstanceOf[A45])
      case 45 => SealedTrait._46(a.asInstanceOf[A46])
      case 46 => SealedTrait._47(a.asInstanceOf[A47])
      case 47 => SealedTrait._48(a.asInstanceOf[A48])
      case 48 => SealedTrait._49(a.asInstanceOf[A49])
      case 49 => SealedTrait._50(a.asInstanceOf[A50])
      case 50 => SealedTrait._51(a.asInstanceOf[A51])
      case 51 => SealedTrait._52(a.asInstanceOf[A52])
      case 52 => SealedTrait._53(a.asInstanceOf[A53])
      case 53 => SealedTrait._54(a.asInstanceOf[A54])
    }
    def from(s: SealedTrait54[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54]): A = s.value
  }

  implicit def sealedtrait55[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A, A28 <: A, A29 <: A, A30 <: A, A31 <: A, A32 <: A, A33 <: A, A34 <: A, A35 <: A, A36 <: A, A37 <: A, A38 <: A, A39 <: A, A40 <: A, A41 <: A, A42 <: A, A43 <: A, A44 <: A, A45 <: A, A46 <: A, A47 <: A, A48 <: A, A49 <: A, A50 <: A, A51 <: A, A52 <: A, A53 <: A, A54 <: A, A55 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55)): Shapely[A, SealedTrait55[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55]] = new Shapely[A, SealedTrait55[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55]] {
    def to(a: A): SealedTrait55[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55] = A.ordinal(a) match {
      case 0 => SealedTrait._1(a.asInstanceOf[A1])
      case 1 => SealedTrait._2(a.asInstanceOf[A2])
      case 2 => SealedTrait._3(a.asInstanceOf[A3])
      case 3 => SealedTrait._4(a.asInstanceOf[A4])
      case 4 => SealedTrait._5(a.asInstanceOf[A5])
      case 5 => SealedTrait._6(a.asInstanceOf[A6])
      case 6 => SealedTrait._7(a.asInstanceOf[A7])
      case 7 => SealedTrait._8(a.asInstanceOf[A8])
      case 8 => SealedTrait._9(a.asInstanceOf[A9])
      case 9 => SealedTrait._10(a.asInstanceOf[A10])
      case 10 => SealedTrait._11(a.asInstanceOf[A11])
      case 11 => SealedTrait._12(a.asInstanceOf[A12])
      case 12 => SealedTrait._13(a.asInstanceOf[A13])
      case 13 => SealedTrait._14(a.asInstanceOf[A14])
      case 14 => SealedTrait._15(a.asInstanceOf[A15])
      case 15 => SealedTrait._16(a.asInstanceOf[A16])
      case 16 => SealedTrait._17(a.asInstanceOf[A17])
      case 17 => SealedTrait._18(a.asInstanceOf[A18])
      case 18 => SealedTrait._19(a.asInstanceOf[A19])
      case 19 => SealedTrait._20(a.asInstanceOf[A20])
      case 20 => SealedTrait._21(a.asInstanceOf[A21])
      case 21 => SealedTrait._22(a.asInstanceOf[A22])
      case 22 => SealedTrait._23(a.asInstanceOf[A23])
      case 23 => SealedTrait._24(a.asInstanceOf[A24])
      case 24 => SealedTrait._25(a.asInstanceOf[A25])
      case 25 => SealedTrait._26(a.asInstanceOf[A26])
      case 26 => SealedTrait._27(a.asInstanceOf[A27])
      case 27 => SealedTrait._28(a.asInstanceOf[A28])
      case 28 => SealedTrait._29(a.asInstanceOf[A29])
      case 29 => SealedTrait._30(a.asInstanceOf[A30])
      case 30 => SealedTrait._31(a.asInstanceOf[A31])
      case 31 => SealedTrait._32(a.asInstanceOf[A32])
      case 32 => SealedTrait._33(a.asInstanceOf[A33])
      case 33 => SealedTrait._34(a.asInstanceOf[A34])
      case 34 => SealedTrait._35(a.asInstanceOf[A35])
      case 35 => SealedTrait._36(a.asInstanceOf[A36])
      case 36 => SealedTrait._37(a.asInstanceOf[A37])
      case 37 => SealedTrait._38(a.asInstanceOf[A38])
      case 38 => SealedTrait._39(a.asInstanceOf[A39])
      case 39 => SealedTrait._40(a.asInstanceOf[A40])
      case 40 => SealedTrait._41(a.asInstanceOf[A41])
      case 41 => SealedTrait._42(a.asInstanceOf[A42])
      case 42 => SealedTrait._43(a.asInstanceOf[A43])
      case 43 => SealedTrait._44(a.asInstanceOf[A44])
      case 44 => SealedTrait._45(a.asInstanceOf[A45])
      case 45 => SealedTrait._46(a.asInstanceOf[A46])
      case 46 => SealedTrait._47(a.asInstanceOf[A47])
      case 47 => SealedTrait._48(a.asInstanceOf[A48])
      case 48 => SealedTrait._49(a.asInstanceOf[A49])
      case 49 => SealedTrait._50(a.asInstanceOf[A50])
      case 50 => SealedTrait._51(a.asInstanceOf[A51])
      case 51 => SealedTrait._52(a.asInstanceOf[A52])
      case 52 => SealedTrait._53(a.asInstanceOf[A53])
      case 53 => SealedTrait._54(a.asInstanceOf[A54])
      case 54 => SealedTrait._55(a.asInstanceOf[A55])
    }
    def from(s: SealedTrait55[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55]): A = s.value
  }

  implicit def sealedtrait56[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A, A28 <: A, A29 <: A, A30 <: A, A31 <: A, A32 <: A, A33 <: A, A34 <: A, A35 <: A, A36 <: A, A37 <: A, A38 <: A, A39 <: A, A40 <: A, A41 <: A, A42 <: A, A43 <: A, A44 <: A, A45 <: A, A46 <: A, A47 <: A, A48 <: A, A49 <: A, A50 <: A, A51 <: A, A52 <: A, A53 <: A, A54 <: A, A55 <: A, A56 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56)): Shapely[A, SealedTrait56[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56]] = new Shapely[A, SealedTrait56[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56]] {
    def to(a: A): SealedTrait56[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56] = A.ordinal(a) match {
      case 0 => SealedTrait._1(a.asInstanceOf[A1])
      case 1 => SealedTrait._2(a.asInstanceOf[A2])
      case 2 => SealedTrait._3(a.asInstanceOf[A3])
      case 3 => SealedTrait._4(a.asInstanceOf[A4])
      case 4 => SealedTrait._5(a.asInstanceOf[A5])
      case 5 => SealedTrait._6(a.asInstanceOf[A6])
      case 6 => SealedTrait._7(a.asInstanceOf[A7])
      case 7 => SealedTrait._8(a.asInstanceOf[A8])
      case 8 => SealedTrait._9(a.asInstanceOf[A9])
      case 9 => SealedTrait._10(a.asInstanceOf[A10])
      case 10 => SealedTrait._11(a.asInstanceOf[A11])
      case 11 => SealedTrait._12(a.asInstanceOf[A12])
      case 12 => SealedTrait._13(a.asInstanceOf[A13])
      case 13 => SealedTrait._14(a.asInstanceOf[A14])
      case 14 => SealedTrait._15(a.asInstanceOf[A15])
      case 15 => SealedTrait._16(a.asInstanceOf[A16])
      case 16 => SealedTrait._17(a.asInstanceOf[A17])
      case 17 => SealedTrait._18(a.asInstanceOf[A18])
      case 18 => SealedTrait._19(a.asInstanceOf[A19])
      case 19 => SealedTrait._20(a.asInstanceOf[A20])
      case 20 => SealedTrait._21(a.asInstanceOf[A21])
      case 21 => SealedTrait._22(a.asInstanceOf[A22])
      case 22 => SealedTrait._23(a.asInstanceOf[A23])
      case 23 => SealedTrait._24(a.asInstanceOf[A24])
      case 24 => SealedTrait._25(a.asInstanceOf[A25])
      case 25 => SealedTrait._26(a.asInstanceOf[A26])
      case 26 => SealedTrait._27(a.asInstanceOf[A27])
      case 27 => SealedTrait._28(a.asInstanceOf[A28])
      case 28 => SealedTrait._29(a.asInstanceOf[A29])
      case 29 => SealedTrait._30(a.asInstanceOf[A30])
      case 30 => SealedTrait._31(a.asInstanceOf[A31])
      case 31 => SealedTrait._32(a.asInstanceOf[A32])
      case 32 => SealedTrait._33(a.asInstanceOf[A33])
      case 33 => SealedTrait._34(a.asInstanceOf[A34])
      case 34 => SealedTrait._35(a.asInstanceOf[A35])
      case 35 => SealedTrait._36(a.asInstanceOf[A36])
      case 36 => SealedTrait._37(a.asInstanceOf[A37])
      case 37 => SealedTrait._38(a.asInstanceOf[A38])
      case 38 => SealedTrait._39(a.asInstanceOf[A39])
      case 39 => SealedTrait._40(a.asInstanceOf[A40])
      case 40 => SealedTrait._41(a.asInstanceOf[A41])
      case 41 => SealedTrait._42(a.asInstanceOf[A42])
      case 42 => SealedTrait._43(a.asInstanceOf[A43])
      case 43 => SealedTrait._44(a.asInstanceOf[A44])
      case 44 => SealedTrait._45(a.asInstanceOf[A45])
      case 45 => SealedTrait._46(a.asInstanceOf[A46])
      case 46 => SealedTrait._47(a.asInstanceOf[A47])
      case 47 => SealedTrait._48(a.asInstanceOf[A48])
      case 48 => SealedTrait._49(a.asInstanceOf[A49])
      case 49 => SealedTrait._50(a.asInstanceOf[A50])
      case 50 => SealedTrait._51(a.asInstanceOf[A51])
      case 51 => SealedTrait._52(a.asInstanceOf[A52])
      case 52 => SealedTrait._53(a.asInstanceOf[A53])
      case 53 => SealedTrait._54(a.asInstanceOf[A54])
      case 54 => SealedTrait._55(a.asInstanceOf[A55])
      case 55 => SealedTrait._56(a.asInstanceOf[A56])
    }
    def from(s: SealedTrait56[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56]): A = s.value
  }

  implicit def sealedtrait57[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A, A28 <: A, A29 <: A, A30 <: A, A31 <: A, A32 <: A, A33 <: A, A34 <: A, A35 <: A, A36 <: A, A37 <: A, A38 <: A, A39 <: A, A40 <: A, A41 <: A, A42 <: A, A43 <: A, A44 <: A, A45 <: A, A46 <: A, A47 <: A, A48 <: A, A49 <: A, A50 <: A, A51 <: A, A52 <: A, A53 <: A, A54 <: A, A55 <: A, A56 <: A, A57 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57)): Shapely[A, SealedTrait57[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57]] = new Shapely[A, SealedTrait57[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57]] {
    def to(a: A): SealedTrait57[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57] = A.ordinal(a) match {
      case 0 => SealedTrait._1(a.asInstanceOf[A1])
      case 1 => SealedTrait._2(a.asInstanceOf[A2])
      case 2 => SealedTrait._3(a.asInstanceOf[A3])
      case 3 => SealedTrait._4(a.asInstanceOf[A4])
      case 4 => SealedTrait._5(a.asInstanceOf[A5])
      case 5 => SealedTrait._6(a.asInstanceOf[A6])
      case 6 => SealedTrait._7(a.asInstanceOf[A7])
      case 7 => SealedTrait._8(a.asInstanceOf[A8])
      case 8 => SealedTrait._9(a.asInstanceOf[A9])
      case 9 => SealedTrait._10(a.asInstanceOf[A10])
      case 10 => SealedTrait._11(a.asInstanceOf[A11])
      case 11 => SealedTrait._12(a.asInstanceOf[A12])
      case 12 => SealedTrait._13(a.asInstanceOf[A13])
      case 13 => SealedTrait._14(a.asInstanceOf[A14])
      case 14 => SealedTrait._15(a.asInstanceOf[A15])
      case 15 => SealedTrait._16(a.asInstanceOf[A16])
      case 16 => SealedTrait._17(a.asInstanceOf[A17])
      case 17 => SealedTrait._18(a.asInstanceOf[A18])
      case 18 => SealedTrait._19(a.asInstanceOf[A19])
      case 19 => SealedTrait._20(a.asInstanceOf[A20])
      case 20 => SealedTrait._21(a.asInstanceOf[A21])
      case 21 => SealedTrait._22(a.asInstanceOf[A22])
      case 22 => SealedTrait._23(a.asInstanceOf[A23])
      case 23 => SealedTrait._24(a.asInstanceOf[A24])
      case 24 => SealedTrait._25(a.asInstanceOf[A25])
      case 25 => SealedTrait._26(a.asInstanceOf[A26])
      case 26 => SealedTrait._27(a.asInstanceOf[A27])
      case 27 => SealedTrait._28(a.asInstanceOf[A28])
      case 28 => SealedTrait._29(a.asInstanceOf[A29])
      case 29 => SealedTrait._30(a.asInstanceOf[A30])
      case 30 => SealedTrait._31(a.asInstanceOf[A31])
      case 31 => SealedTrait._32(a.asInstanceOf[A32])
      case 32 => SealedTrait._33(a.asInstanceOf[A33])
      case 33 => SealedTrait._34(a.asInstanceOf[A34])
      case 34 => SealedTrait._35(a.asInstanceOf[A35])
      case 35 => SealedTrait._36(a.asInstanceOf[A36])
      case 36 => SealedTrait._37(a.asInstanceOf[A37])
      case 37 => SealedTrait._38(a.asInstanceOf[A38])
      case 38 => SealedTrait._39(a.asInstanceOf[A39])
      case 39 => SealedTrait._40(a.asInstanceOf[A40])
      case 40 => SealedTrait._41(a.asInstanceOf[A41])
      case 41 => SealedTrait._42(a.asInstanceOf[A42])
      case 42 => SealedTrait._43(a.asInstanceOf[A43])
      case 43 => SealedTrait._44(a.asInstanceOf[A44])
      case 44 => SealedTrait._45(a.asInstanceOf[A45])
      case 45 => SealedTrait._46(a.asInstanceOf[A46])
      case 46 => SealedTrait._47(a.asInstanceOf[A47])
      case 47 => SealedTrait._48(a.asInstanceOf[A48])
      case 48 => SealedTrait._49(a.asInstanceOf[A49])
      case 49 => SealedTrait._50(a.asInstanceOf[A50])
      case 50 => SealedTrait._51(a.asInstanceOf[A51])
      case 51 => SealedTrait._52(a.asInstanceOf[A52])
      case 52 => SealedTrait._53(a.asInstanceOf[A53])
      case 53 => SealedTrait._54(a.asInstanceOf[A54])
      case 54 => SealedTrait._55(a.asInstanceOf[A55])
      case 55 => SealedTrait._56(a.asInstanceOf[A56])
      case 56 => SealedTrait._57(a.asInstanceOf[A57])
    }
    def from(s: SealedTrait57[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57]): A = s.value
  }

  implicit def sealedtrait58[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A, A28 <: A, A29 <: A, A30 <: A, A31 <: A, A32 <: A, A33 <: A, A34 <: A, A35 <: A, A36 <: A, A37 <: A, A38 <: A, A39 <: A, A40 <: A, A41 <: A, A42 <: A, A43 <: A, A44 <: A, A45 <: A, A46 <: A, A47 <: A, A48 <: A, A49 <: A, A50 <: A, A51 <: A, A52 <: A, A53 <: A, A54 <: A, A55 <: A, A56 <: A, A57 <: A, A58 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58)): Shapely[A, SealedTrait58[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58]] = new Shapely[A, SealedTrait58[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58]] {
    def to(a: A): SealedTrait58[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58] = A.ordinal(a) match {
      case 0 => SealedTrait._1(a.asInstanceOf[A1])
      case 1 => SealedTrait._2(a.asInstanceOf[A2])
      case 2 => SealedTrait._3(a.asInstanceOf[A3])
      case 3 => SealedTrait._4(a.asInstanceOf[A4])
      case 4 => SealedTrait._5(a.asInstanceOf[A5])
      case 5 => SealedTrait._6(a.asInstanceOf[A6])
      case 6 => SealedTrait._7(a.asInstanceOf[A7])
      case 7 => SealedTrait._8(a.asInstanceOf[A8])
      case 8 => SealedTrait._9(a.asInstanceOf[A9])
      case 9 => SealedTrait._10(a.asInstanceOf[A10])
      case 10 => SealedTrait._11(a.asInstanceOf[A11])
      case 11 => SealedTrait._12(a.asInstanceOf[A12])
      case 12 => SealedTrait._13(a.asInstanceOf[A13])
      case 13 => SealedTrait._14(a.asInstanceOf[A14])
      case 14 => SealedTrait._15(a.asInstanceOf[A15])
      case 15 => SealedTrait._16(a.asInstanceOf[A16])
      case 16 => SealedTrait._17(a.asInstanceOf[A17])
      case 17 => SealedTrait._18(a.asInstanceOf[A18])
      case 18 => SealedTrait._19(a.asInstanceOf[A19])
      case 19 => SealedTrait._20(a.asInstanceOf[A20])
      case 20 => SealedTrait._21(a.asInstanceOf[A21])
      case 21 => SealedTrait._22(a.asInstanceOf[A22])
      case 22 => SealedTrait._23(a.asInstanceOf[A23])
      case 23 => SealedTrait._24(a.asInstanceOf[A24])
      case 24 => SealedTrait._25(a.asInstanceOf[A25])
      case 25 => SealedTrait._26(a.asInstanceOf[A26])
      case 26 => SealedTrait._27(a.asInstanceOf[A27])
      case 27 => SealedTrait._28(a.asInstanceOf[A28])
      case 28 => SealedTrait._29(a.asInstanceOf[A29])
      case 29 => SealedTrait._30(a.asInstanceOf[A30])
      case 30 => SealedTrait._31(a.asInstanceOf[A31])
      case 31 => SealedTrait._32(a.asInstanceOf[A32])
      case 32 => SealedTrait._33(a.asInstanceOf[A33])
      case 33 => SealedTrait._34(a.asInstanceOf[A34])
      case 34 => SealedTrait._35(a.asInstanceOf[A35])
      case 35 => SealedTrait._36(a.asInstanceOf[A36])
      case 36 => SealedTrait._37(a.asInstanceOf[A37])
      case 37 => SealedTrait._38(a.asInstanceOf[A38])
      case 38 => SealedTrait._39(a.asInstanceOf[A39])
      case 39 => SealedTrait._40(a.asInstanceOf[A40])
      case 40 => SealedTrait._41(a.asInstanceOf[A41])
      case 41 => SealedTrait._42(a.asInstanceOf[A42])
      case 42 => SealedTrait._43(a.asInstanceOf[A43])
      case 43 => SealedTrait._44(a.asInstanceOf[A44])
      case 44 => SealedTrait._45(a.asInstanceOf[A45])
      case 45 => SealedTrait._46(a.asInstanceOf[A46])
      case 46 => SealedTrait._47(a.asInstanceOf[A47])
      case 47 => SealedTrait._48(a.asInstanceOf[A48])
      case 48 => SealedTrait._49(a.asInstanceOf[A49])
      case 49 => SealedTrait._50(a.asInstanceOf[A50])
      case 50 => SealedTrait._51(a.asInstanceOf[A51])
      case 51 => SealedTrait._52(a.asInstanceOf[A52])
      case 52 => SealedTrait._53(a.asInstanceOf[A53])
      case 53 => SealedTrait._54(a.asInstanceOf[A54])
      case 54 => SealedTrait._55(a.asInstanceOf[A55])
      case 55 => SealedTrait._56(a.asInstanceOf[A56])
      case 56 => SealedTrait._57(a.asInstanceOf[A57])
      case 57 => SealedTrait._58(a.asInstanceOf[A58])
    }
    def from(s: SealedTrait58[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58]): A = s.value
  }

  implicit def sealedtrait59[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A, A28 <: A, A29 <: A, A30 <: A, A31 <: A, A32 <: A, A33 <: A, A34 <: A, A35 <: A, A36 <: A, A37 <: A, A38 <: A, A39 <: A, A40 <: A, A41 <: A, A42 <: A, A43 <: A, A44 <: A, A45 <: A, A46 <: A, A47 <: A, A48 <: A, A49 <: A, A50 <: A, A51 <: A, A52 <: A, A53 <: A, A54 <: A, A55 <: A, A56 <: A, A57 <: A, A58 <: A, A59 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, A59)): Shapely[A, SealedTrait59[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, A59]] = new Shapely[A, SealedTrait59[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, A59]] {
    def to(a: A): SealedTrait59[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, A59] = A.ordinal(a) match {
      case 0 => SealedTrait._1(a.asInstanceOf[A1])
      case 1 => SealedTrait._2(a.asInstanceOf[A2])
      case 2 => SealedTrait._3(a.asInstanceOf[A3])
      case 3 => SealedTrait._4(a.asInstanceOf[A4])
      case 4 => SealedTrait._5(a.asInstanceOf[A5])
      case 5 => SealedTrait._6(a.asInstanceOf[A6])
      case 6 => SealedTrait._7(a.asInstanceOf[A7])
      case 7 => SealedTrait._8(a.asInstanceOf[A8])
      case 8 => SealedTrait._9(a.asInstanceOf[A9])
      case 9 => SealedTrait._10(a.asInstanceOf[A10])
      case 10 => SealedTrait._11(a.asInstanceOf[A11])
      case 11 => SealedTrait._12(a.asInstanceOf[A12])
      case 12 => SealedTrait._13(a.asInstanceOf[A13])
      case 13 => SealedTrait._14(a.asInstanceOf[A14])
      case 14 => SealedTrait._15(a.asInstanceOf[A15])
      case 15 => SealedTrait._16(a.asInstanceOf[A16])
      case 16 => SealedTrait._17(a.asInstanceOf[A17])
      case 17 => SealedTrait._18(a.asInstanceOf[A18])
      case 18 => SealedTrait._19(a.asInstanceOf[A19])
      case 19 => SealedTrait._20(a.asInstanceOf[A20])
      case 20 => SealedTrait._21(a.asInstanceOf[A21])
      case 21 => SealedTrait._22(a.asInstanceOf[A22])
      case 22 => SealedTrait._23(a.asInstanceOf[A23])
      case 23 => SealedTrait._24(a.asInstanceOf[A24])
      case 24 => SealedTrait._25(a.asInstanceOf[A25])
      case 25 => SealedTrait._26(a.asInstanceOf[A26])
      case 26 => SealedTrait._27(a.asInstanceOf[A27])
      case 27 => SealedTrait._28(a.asInstanceOf[A28])
      case 28 => SealedTrait._29(a.asInstanceOf[A29])
      case 29 => SealedTrait._30(a.asInstanceOf[A30])
      case 30 => SealedTrait._31(a.asInstanceOf[A31])
      case 31 => SealedTrait._32(a.asInstanceOf[A32])
      case 32 => SealedTrait._33(a.asInstanceOf[A33])
      case 33 => SealedTrait._34(a.asInstanceOf[A34])
      case 34 => SealedTrait._35(a.asInstanceOf[A35])
      case 35 => SealedTrait._36(a.asInstanceOf[A36])
      case 36 => SealedTrait._37(a.asInstanceOf[A37])
      case 37 => SealedTrait._38(a.asInstanceOf[A38])
      case 38 => SealedTrait._39(a.asInstanceOf[A39])
      case 39 => SealedTrait._40(a.asInstanceOf[A40])
      case 40 => SealedTrait._41(a.asInstanceOf[A41])
      case 41 => SealedTrait._42(a.asInstanceOf[A42])
      case 42 => SealedTrait._43(a.asInstanceOf[A43])
      case 43 => SealedTrait._44(a.asInstanceOf[A44])
      case 44 => SealedTrait._45(a.asInstanceOf[A45])
      case 45 => SealedTrait._46(a.asInstanceOf[A46])
      case 46 => SealedTrait._47(a.asInstanceOf[A47])
      case 47 => SealedTrait._48(a.asInstanceOf[A48])
      case 48 => SealedTrait._49(a.asInstanceOf[A49])
      case 49 => SealedTrait._50(a.asInstanceOf[A50])
      case 50 => SealedTrait._51(a.asInstanceOf[A51])
      case 51 => SealedTrait._52(a.asInstanceOf[A52])
      case 52 => SealedTrait._53(a.asInstanceOf[A53])
      case 53 => SealedTrait._54(a.asInstanceOf[A54])
      case 54 => SealedTrait._55(a.asInstanceOf[A55])
      case 55 => SealedTrait._56(a.asInstanceOf[A56])
      case 56 => SealedTrait._57(a.asInstanceOf[A57])
      case 57 => SealedTrait._58(a.asInstanceOf[A58])
      case 58 => SealedTrait._59(a.asInstanceOf[A59])
    }
    def from(s: SealedTrait59[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, A59]): A = s.value
  }

  implicit def sealedtrait60[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A, A28 <: A, A29 <: A, A30 <: A, A31 <: A, A32 <: A, A33 <: A, A34 <: A, A35 <: A, A36 <: A, A37 <: A, A38 <: A, A39 <: A, A40 <: A, A41 <: A, A42 <: A, A43 <: A, A44 <: A, A45 <: A, A46 <: A, A47 <: A, A48 <: A, A49 <: A, A50 <: A, A51 <: A, A52 <: A, A53 <: A, A54 <: A, A55 <: A, A56 <: A, A57 <: A, A58 <: A, A59 <: A, A60 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, A59, A60)): Shapely[A, SealedTrait60[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, A59, A60]] = new Shapely[A, SealedTrait60[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, A59, A60]] {
    def to(a: A): SealedTrait60[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, A59, A60] = A.ordinal(a) match {
      case 0 => SealedTrait._1(a.asInstanceOf[A1])
      case 1 => SealedTrait._2(a.asInstanceOf[A2])
      case 2 => SealedTrait._3(a.asInstanceOf[A3])
      case 3 => SealedTrait._4(a.asInstanceOf[A4])
      case 4 => SealedTrait._5(a.asInstanceOf[A5])
      case 5 => SealedTrait._6(a.asInstanceOf[A6])
      case 6 => SealedTrait._7(a.asInstanceOf[A7])
      case 7 => SealedTrait._8(a.asInstanceOf[A8])
      case 8 => SealedTrait._9(a.asInstanceOf[A9])
      case 9 => SealedTrait._10(a.asInstanceOf[A10])
      case 10 => SealedTrait._11(a.asInstanceOf[A11])
      case 11 => SealedTrait._12(a.asInstanceOf[A12])
      case 12 => SealedTrait._13(a.asInstanceOf[A13])
      case 13 => SealedTrait._14(a.asInstanceOf[A14])
      case 14 => SealedTrait._15(a.asInstanceOf[A15])
      case 15 => SealedTrait._16(a.asInstanceOf[A16])
      case 16 => SealedTrait._17(a.asInstanceOf[A17])
      case 17 => SealedTrait._18(a.asInstanceOf[A18])
      case 18 => SealedTrait._19(a.asInstanceOf[A19])
      case 19 => SealedTrait._20(a.asInstanceOf[A20])
      case 20 => SealedTrait._21(a.asInstanceOf[A21])
      case 21 => SealedTrait._22(a.asInstanceOf[A22])
      case 22 => SealedTrait._23(a.asInstanceOf[A23])
      case 23 => SealedTrait._24(a.asInstanceOf[A24])
      case 24 => SealedTrait._25(a.asInstanceOf[A25])
      case 25 => SealedTrait._26(a.asInstanceOf[A26])
      case 26 => SealedTrait._27(a.asInstanceOf[A27])
      case 27 => SealedTrait._28(a.asInstanceOf[A28])
      case 28 => SealedTrait._29(a.asInstanceOf[A29])
      case 29 => SealedTrait._30(a.asInstanceOf[A30])
      case 30 => SealedTrait._31(a.asInstanceOf[A31])
      case 31 => SealedTrait._32(a.asInstanceOf[A32])
      case 32 => SealedTrait._33(a.asInstanceOf[A33])
      case 33 => SealedTrait._34(a.asInstanceOf[A34])
      case 34 => SealedTrait._35(a.asInstanceOf[A35])
      case 35 => SealedTrait._36(a.asInstanceOf[A36])
      case 36 => SealedTrait._37(a.asInstanceOf[A37])
      case 37 => SealedTrait._38(a.asInstanceOf[A38])
      case 38 => SealedTrait._39(a.asInstanceOf[A39])
      case 39 => SealedTrait._40(a.asInstanceOf[A40])
      case 40 => SealedTrait._41(a.asInstanceOf[A41])
      case 41 => SealedTrait._42(a.asInstanceOf[A42])
      case 42 => SealedTrait._43(a.asInstanceOf[A43])
      case 43 => SealedTrait._44(a.asInstanceOf[A44])
      case 44 => SealedTrait._45(a.asInstanceOf[A45])
      case 45 => SealedTrait._46(a.asInstanceOf[A46])
      case 46 => SealedTrait._47(a.asInstanceOf[A47])
      case 47 => SealedTrait._48(a.asInstanceOf[A48])
      case 48 => SealedTrait._49(a.asInstanceOf[A49])
      case 49 => SealedTrait._50(a.asInstanceOf[A50])
      case 50 => SealedTrait._51(a.asInstanceOf[A51])
      case 51 => SealedTrait._52(a.asInstanceOf[A52])
      case 52 => SealedTrait._53(a.asInstanceOf[A53])
      case 53 => SealedTrait._54(a.asInstanceOf[A54])
      case 54 => SealedTrait._55(a.asInstanceOf[A55])
      case 55 => SealedTrait._56(a.asInstanceOf[A56])
      case 56 => SealedTrait._57(a.asInstanceOf[A57])
      case 57 => SealedTrait._58(a.asInstanceOf[A58])
      case 58 => SealedTrait._59(a.asInstanceOf[A59])
      case 59 => SealedTrait._60(a.asInstanceOf[A60])
    }
    def from(s: SealedTrait60[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, A59, A60]): A = s.value
  }

  implicit def sealedtrait61[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A, A28 <: A, A29 <: A, A30 <: A, A31 <: A, A32 <: A, A33 <: A, A34 <: A, A35 <: A, A36 <: A, A37 <: A, A38 <: A, A39 <: A, A40 <: A, A41 <: A, A42 <: A, A43 <: A, A44 <: A, A45 <: A, A46 <: A, A47 <: A, A48 <: A, A49 <: A, A50 <: A, A51 <: A, A52 <: A, A53 <: A, A54 <: A, A55 <: A, A56 <: A, A57 <: A, A58 <: A, A59 <: A, A60 <: A, A61 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, A59, A60, A61)): Shapely[A, SealedTrait61[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, A59, A60, A61]] = new Shapely[A, SealedTrait61[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, A59, A60, A61]] {
    def to(a: A): SealedTrait61[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, A59, A60, A61] = A.ordinal(a) match {
      case 0 => SealedTrait._1(a.asInstanceOf[A1])
      case 1 => SealedTrait._2(a.asInstanceOf[A2])
      case 2 => SealedTrait._3(a.asInstanceOf[A3])
      case 3 => SealedTrait._4(a.asInstanceOf[A4])
      case 4 => SealedTrait._5(a.asInstanceOf[A5])
      case 5 => SealedTrait._6(a.asInstanceOf[A6])
      case 6 => SealedTrait._7(a.asInstanceOf[A7])
      case 7 => SealedTrait._8(a.asInstanceOf[A8])
      case 8 => SealedTrait._9(a.asInstanceOf[A9])
      case 9 => SealedTrait._10(a.asInstanceOf[A10])
      case 10 => SealedTrait._11(a.asInstanceOf[A11])
      case 11 => SealedTrait._12(a.asInstanceOf[A12])
      case 12 => SealedTrait._13(a.asInstanceOf[A13])
      case 13 => SealedTrait._14(a.asInstanceOf[A14])
      case 14 => SealedTrait._15(a.asInstanceOf[A15])
      case 15 => SealedTrait._16(a.asInstanceOf[A16])
      case 16 => SealedTrait._17(a.asInstanceOf[A17])
      case 17 => SealedTrait._18(a.asInstanceOf[A18])
      case 18 => SealedTrait._19(a.asInstanceOf[A19])
      case 19 => SealedTrait._20(a.asInstanceOf[A20])
      case 20 => SealedTrait._21(a.asInstanceOf[A21])
      case 21 => SealedTrait._22(a.asInstanceOf[A22])
      case 22 => SealedTrait._23(a.asInstanceOf[A23])
      case 23 => SealedTrait._24(a.asInstanceOf[A24])
      case 24 => SealedTrait._25(a.asInstanceOf[A25])
      case 25 => SealedTrait._26(a.asInstanceOf[A26])
      case 26 => SealedTrait._27(a.asInstanceOf[A27])
      case 27 => SealedTrait._28(a.asInstanceOf[A28])
      case 28 => SealedTrait._29(a.asInstanceOf[A29])
      case 29 => SealedTrait._30(a.asInstanceOf[A30])
      case 30 => SealedTrait._31(a.asInstanceOf[A31])
      case 31 => SealedTrait._32(a.asInstanceOf[A32])
      case 32 => SealedTrait._33(a.asInstanceOf[A33])
      case 33 => SealedTrait._34(a.asInstanceOf[A34])
      case 34 => SealedTrait._35(a.asInstanceOf[A35])
      case 35 => SealedTrait._36(a.asInstanceOf[A36])
      case 36 => SealedTrait._37(a.asInstanceOf[A37])
      case 37 => SealedTrait._38(a.asInstanceOf[A38])
      case 38 => SealedTrait._39(a.asInstanceOf[A39])
      case 39 => SealedTrait._40(a.asInstanceOf[A40])
      case 40 => SealedTrait._41(a.asInstanceOf[A41])
      case 41 => SealedTrait._42(a.asInstanceOf[A42])
      case 42 => SealedTrait._43(a.asInstanceOf[A43])
      case 43 => SealedTrait._44(a.asInstanceOf[A44])
      case 44 => SealedTrait._45(a.asInstanceOf[A45])
      case 45 => SealedTrait._46(a.asInstanceOf[A46])
      case 46 => SealedTrait._47(a.asInstanceOf[A47])
      case 47 => SealedTrait._48(a.asInstanceOf[A48])
      case 48 => SealedTrait._49(a.asInstanceOf[A49])
      case 49 => SealedTrait._50(a.asInstanceOf[A50])
      case 50 => SealedTrait._51(a.asInstanceOf[A51])
      case 51 => SealedTrait._52(a.asInstanceOf[A52])
      case 52 => SealedTrait._53(a.asInstanceOf[A53])
      case 53 => SealedTrait._54(a.asInstanceOf[A54])
      case 54 => SealedTrait._55(a.asInstanceOf[A55])
      case 55 => SealedTrait._56(a.asInstanceOf[A56])
      case 56 => SealedTrait._57(a.asInstanceOf[A57])
      case 57 => SealedTrait._58(a.asInstanceOf[A58])
      case 58 => SealedTrait._59(a.asInstanceOf[A59])
      case 59 => SealedTrait._60(a.asInstanceOf[A60])
      case 60 => SealedTrait._61(a.asInstanceOf[A61])
    }
    def from(s: SealedTrait61[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, A59, A60, A61]): A = s.value
  }

  implicit def sealedtrait62[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A, A28 <: A, A29 <: A, A30 <: A, A31 <: A, A32 <: A, A33 <: A, A34 <: A, A35 <: A, A36 <: A, A37 <: A, A38 <: A, A39 <: A, A40 <: A, A41 <: A, A42 <: A, A43 <: A, A44 <: A, A45 <: A, A46 <: A, A47 <: A, A48 <: A, A49 <: A, A50 <: A, A51 <: A, A52 <: A, A53 <: A, A54 <: A, A55 <: A, A56 <: A, A57 <: A, A58 <: A, A59 <: A, A60 <: A, A61 <: A, A62 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, A59, A60, A61, A62)): Shapely[A, SealedTrait62[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, A59, A60, A61, A62]] = new Shapely[A, SealedTrait62[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, A59, A60, A61, A62]] {
    def to(a: A): SealedTrait62[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, A59, A60, A61, A62] = A.ordinal(a) match {
      case 0 => SealedTrait._1(a.asInstanceOf[A1])
      case 1 => SealedTrait._2(a.asInstanceOf[A2])
      case 2 => SealedTrait._3(a.asInstanceOf[A3])
      case 3 => SealedTrait._4(a.asInstanceOf[A4])
      case 4 => SealedTrait._5(a.asInstanceOf[A5])
      case 5 => SealedTrait._6(a.asInstanceOf[A6])
      case 6 => SealedTrait._7(a.asInstanceOf[A7])
      case 7 => SealedTrait._8(a.asInstanceOf[A8])
      case 8 => SealedTrait._9(a.asInstanceOf[A9])
      case 9 => SealedTrait._10(a.asInstanceOf[A10])
      case 10 => SealedTrait._11(a.asInstanceOf[A11])
      case 11 => SealedTrait._12(a.asInstanceOf[A12])
      case 12 => SealedTrait._13(a.asInstanceOf[A13])
      case 13 => SealedTrait._14(a.asInstanceOf[A14])
      case 14 => SealedTrait._15(a.asInstanceOf[A15])
      case 15 => SealedTrait._16(a.asInstanceOf[A16])
      case 16 => SealedTrait._17(a.asInstanceOf[A17])
      case 17 => SealedTrait._18(a.asInstanceOf[A18])
      case 18 => SealedTrait._19(a.asInstanceOf[A19])
      case 19 => SealedTrait._20(a.asInstanceOf[A20])
      case 20 => SealedTrait._21(a.asInstanceOf[A21])
      case 21 => SealedTrait._22(a.asInstanceOf[A22])
      case 22 => SealedTrait._23(a.asInstanceOf[A23])
      case 23 => SealedTrait._24(a.asInstanceOf[A24])
      case 24 => SealedTrait._25(a.asInstanceOf[A25])
      case 25 => SealedTrait._26(a.asInstanceOf[A26])
      case 26 => SealedTrait._27(a.asInstanceOf[A27])
      case 27 => SealedTrait._28(a.asInstanceOf[A28])
      case 28 => SealedTrait._29(a.asInstanceOf[A29])
      case 29 => SealedTrait._30(a.asInstanceOf[A30])
      case 30 => SealedTrait._31(a.asInstanceOf[A31])
      case 31 => SealedTrait._32(a.asInstanceOf[A32])
      case 32 => SealedTrait._33(a.asInstanceOf[A33])
      case 33 => SealedTrait._34(a.asInstanceOf[A34])
      case 34 => SealedTrait._35(a.asInstanceOf[A35])
      case 35 => SealedTrait._36(a.asInstanceOf[A36])
      case 36 => SealedTrait._37(a.asInstanceOf[A37])
      case 37 => SealedTrait._38(a.asInstanceOf[A38])
      case 38 => SealedTrait._39(a.asInstanceOf[A39])
      case 39 => SealedTrait._40(a.asInstanceOf[A40])
      case 40 => SealedTrait._41(a.asInstanceOf[A41])
      case 41 => SealedTrait._42(a.asInstanceOf[A42])
      case 42 => SealedTrait._43(a.asInstanceOf[A43])
      case 43 => SealedTrait._44(a.asInstanceOf[A44])
      case 44 => SealedTrait._45(a.asInstanceOf[A45])
      case 45 => SealedTrait._46(a.asInstanceOf[A46])
      case 46 => SealedTrait._47(a.asInstanceOf[A47])
      case 47 => SealedTrait._48(a.asInstanceOf[A48])
      case 48 => SealedTrait._49(a.asInstanceOf[A49])
      case 49 => SealedTrait._50(a.asInstanceOf[A50])
      case 50 => SealedTrait._51(a.asInstanceOf[A51])
      case 51 => SealedTrait._52(a.asInstanceOf[A52])
      case 52 => SealedTrait._53(a.asInstanceOf[A53])
      case 53 => SealedTrait._54(a.asInstanceOf[A54])
      case 54 => SealedTrait._55(a.asInstanceOf[A55])
      case 55 => SealedTrait._56(a.asInstanceOf[A56])
      case 56 => SealedTrait._57(a.asInstanceOf[A57])
      case 57 => SealedTrait._58(a.asInstanceOf[A58])
      case 58 => SealedTrait._59(a.asInstanceOf[A59])
      case 59 => SealedTrait._60(a.asInstanceOf[A60])
      case 60 => SealedTrait._61(a.asInstanceOf[A61])
      case 61 => SealedTrait._62(a.asInstanceOf[A62])
    }
    def from(s: SealedTrait62[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, A59, A60, A61, A62]): A = s.value
  }

  implicit def sealedtrait63[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A, A28 <: A, A29 <: A, A30 <: A, A31 <: A, A32 <: A, A33 <: A, A34 <: A, A35 <: A, A36 <: A, A37 <: A, A38 <: A, A39 <: A, A40 <: A, A41 <: A, A42 <: A, A43 <: A, A44 <: A, A45 <: A, A46 <: A, A47 <: A, A48 <: A, A49 <: A, A50 <: A, A51 <: A, A52 <: A, A53 <: A, A54 <: A, A55 <: A, A56 <: A, A57 <: A, A58 <: A, A59 <: A, A60 <: A, A61 <: A, A62 <: A, A63 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, A59, A60, A61, A62, A63)): Shapely[A, SealedTrait63[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, A59, A60, A61, A62, A63]] = new Shapely[A, SealedTrait63[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, A59, A60, A61, A62, A63]] {
    def to(a: A): SealedTrait63[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, A59, A60, A61, A62, A63] = A.ordinal(a) match {
      case 0 => SealedTrait._1(a.asInstanceOf[A1])
      case 1 => SealedTrait._2(a.asInstanceOf[A2])
      case 2 => SealedTrait._3(a.asInstanceOf[A3])
      case 3 => SealedTrait._4(a.asInstanceOf[A4])
      case 4 => SealedTrait._5(a.asInstanceOf[A5])
      case 5 => SealedTrait._6(a.asInstanceOf[A6])
      case 6 => SealedTrait._7(a.asInstanceOf[A7])
      case 7 => SealedTrait._8(a.asInstanceOf[A8])
      case 8 => SealedTrait._9(a.asInstanceOf[A9])
      case 9 => SealedTrait._10(a.asInstanceOf[A10])
      case 10 => SealedTrait._11(a.asInstanceOf[A11])
      case 11 => SealedTrait._12(a.asInstanceOf[A12])
      case 12 => SealedTrait._13(a.asInstanceOf[A13])
      case 13 => SealedTrait._14(a.asInstanceOf[A14])
      case 14 => SealedTrait._15(a.asInstanceOf[A15])
      case 15 => SealedTrait._16(a.asInstanceOf[A16])
      case 16 => SealedTrait._17(a.asInstanceOf[A17])
      case 17 => SealedTrait._18(a.asInstanceOf[A18])
      case 18 => SealedTrait._19(a.asInstanceOf[A19])
      case 19 => SealedTrait._20(a.asInstanceOf[A20])
      case 20 => SealedTrait._21(a.asInstanceOf[A21])
      case 21 => SealedTrait._22(a.asInstanceOf[A22])
      case 22 => SealedTrait._23(a.asInstanceOf[A23])
      case 23 => SealedTrait._24(a.asInstanceOf[A24])
      case 24 => SealedTrait._25(a.asInstanceOf[A25])
      case 25 => SealedTrait._26(a.asInstanceOf[A26])
      case 26 => SealedTrait._27(a.asInstanceOf[A27])
      case 27 => SealedTrait._28(a.asInstanceOf[A28])
      case 28 => SealedTrait._29(a.asInstanceOf[A29])
      case 29 => SealedTrait._30(a.asInstanceOf[A30])
      case 30 => SealedTrait._31(a.asInstanceOf[A31])
      case 31 => SealedTrait._32(a.asInstanceOf[A32])
      case 32 => SealedTrait._33(a.asInstanceOf[A33])
      case 33 => SealedTrait._34(a.asInstanceOf[A34])
      case 34 => SealedTrait._35(a.asInstanceOf[A35])
      case 35 => SealedTrait._36(a.asInstanceOf[A36])
      case 36 => SealedTrait._37(a.asInstanceOf[A37])
      case 37 => SealedTrait._38(a.asInstanceOf[A38])
      case 38 => SealedTrait._39(a.asInstanceOf[A39])
      case 39 => SealedTrait._40(a.asInstanceOf[A40])
      case 40 => SealedTrait._41(a.asInstanceOf[A41])
      case 41 => SealedTrait._42(a.asInstanceOf[A42])
      case 42 => SealedTrait._43(a.asInstanceOf[A43])
      case 43 => SealedTrait._44(a.asInstanceOf[A44])
      case 44 => SealedTrait._45(a.asInstanceOf[A45])
      case 45 => SealedTrait._46(a.asInstanceOf[A46])
      case 46 => SealedTrait._47(a.asInstanceOf[A47])
      case 47 => SealedTrait._48(a.asInstanceOf[A48])
      case 48 => SealedTrait._49(a.asInstanceOf[A49])
      case 49 => SealedTrait._50(a.asInstanceOf[A50])
      case 50 => SealedTrait._51(a.asInstanceOf[A51])
      case 51 => SealedTrait._52(a.asInstanceOf[A52])
      case 52 => SealedTrait._53(a.asInstanceOf[A53])
      case 53 => SealedTrait._54(a.asInstanceOf[A54])
      case 54 => SealedTrait._55(a.asInstanceOf[A55])
      case 55 => SealedTrait._56(a.asInstanceOf[A56])
      case 56 => SealedTrait._57(a.asInstanceOf[A57])
      case 57 => SealedTrait._58(a.asInstanceOf[A58])
      case 58 => SealedTrait._59(a.asInstanceOf[A59])
      case 59 => SealedTrait._60(a.asInstanceOf[A60])
      case 60 => SealedTrait._61(a.asInstanceOf[A61])
      case 61 => SealedTrait._62(a.asInstanceOf[A62])
      case 62 => SealedTrait._63(a.asInstanceOf[A63])
    }
    def from(s: SealedTrait63[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, A59, A60, A61, A62, A63]): A = s.value
  }

  implicit def sealedtrait64[A, A1 <: A, A2 <: A, A3 <: A, A4 <: A, A5 <: A, A6 <: A, A7 <: A, A8 <: A, A9 <: A, A10 <: A, A11 <: A, A12 <: A, A13 <: A, A14 <: A, A15 <: A, A16 <: A, A17 <: A, A18 <: A, A19 <: A, A20 <: A, A21 <: A, A22 <: A, A23 <: A, A24 <: A, A25 <: A, A26 <: A, A27 <: A, A28 <: A, A29 <: A, A30 <: A, A31 <: A, A32 <: A, A33 <: A, A34 <: A, A35 <: A, A36 <: A, A37 <: A, A38 <: A, A39 <: A, A40 <: A, A41 <: A, A42 <: A, A43 <: A, A44 <: A, A45 <: A, A46 <: A, A47 <: A, A48 <: A, A49 <: A, A50 <: A, A51 <: A, A52 <: A, A53 <: A, A54 <: A, A55 <: A, A56 <: A, A57 <: A, A58 <: A, A59 <: A, A60 <: A, A61 <: A, A62 <: A, A63 <: A, A64 <: A](implicit A: Mirror.SumOf[A], ev: A.MirroredElemTypes =:= (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, A59, A60, A61, A62, A63, A64)): Shapely[A, SealedTrait64[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, A59, A60, A61, A62, A63, A64]] = new Shapely[A, SealedTrait64[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, A59, A60, A61, A62, A63, A64]] {
    def to(a: A): SealedTrait64[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, A59, A60, A61, A62, A63, A64] = A.ordinal(a) match {
      case 0 => SealedTrait._1(a.asInstanceOf[A1])
      case 1 => SealedTrait._2(a.asInstanceOf[A2])
      case 2 => SealedTrait._3(a.asInstanceOf[A3])
      case 3 => SealedTrait._4(a.asInstanceOf[A4])
      case 4 => SealedTrait._5(a.asInstanceOf[A5])
      case 5 => SealedTrait._6(a.asInstanceOf[A6])
      case 6 => SealedTrait._7(a.asInstanceOf[A7])
      case 7 => SealedTrait._8(a.asInstanceOf[A8])
      case 8 => SealedTrait._9(a.asInstanceOf[A9])
      case 9 => SealedTrait._10(a.asInstanceOf[A10])
      case 10 => SealedTrait._11(a.asInstanceOf[A11])
      case 11 => SealedTrait._12(a.asInstanceOf[A12])
      case 12 => SealedTrait._13(a.asInstanceOf[A13])
      case 13 => SealedTrait._14(a.asInstanceOf[A14])
      case 14 => SealedTrait._15(a.asInstanceOf[A15])
      case 15 => SealedTrait._16(a.asInstanceOf[A16])
      case 16 => SealedTrait._17(a.asInstanceOf[A17])
      case 17 => SealedTrait._18(a.asInstanceOf[A18])
      case 18 => SealedTrait._19(a.asInstanceOf[A19])
      case 19 => SealedTrait._20(a.asInstanceOf[A20])
      case 20 => SealedTrait._21(a.asInstanceOf[A21])
      case 21 => SealedTrait._22(a.asInstanceOf[A22])
      case 22 => SealedTrait._23(a.asInstanceOf[A23])
      case 23 => SealedTrait._24(a.asInstanceOf[A24])
      case 24 => SealedTrait._25(a.asInstanceOf[A25])
      case 25 => SealedTrait._26(a.asInstanceOf[A26])
      case 26 => SealedTrait._27(a.asInstanceOf[A27])
      case 27 => SealedTrait._28(a.asInstanceOf[A28])
      case 28 => SealedTrait._29(a.asInstanceOf[A29])
      case 29 => SealedTrait._30(a.asInstanceOf[A30])
      case 30 => SealedTrait._31(a.asInstanceOf[A31])
      case 31 => SealedTrait._32(a.asInstanceOf[A32])
      case 32 => SealedTrait._33(a.asInstanceOf[A33])
      case 33 => SealedTrait._34(a.asInstanceOf[A34])
      case 34 => SealedTrait._35(a.asInstanceOf[A35])
      case 35 => SealedTrait._36(a.asInstanceOf[A36])
      case 36 => SealedTrait._37(a.asInstanceOf[A37])
      case 37 => SealedTrait._38(a.asInstanceOf[A38])
      case 38 => SealedTrait._39(a.asInstanceOf[A39])
      case 39 => SealedTrait._40(a.asInstanceOf[A40])
      case 40 => SealedTrait._41(a.asInstanceOf[A41])
      case 41 => SealedTrait._42(a.asInstanceOf[A42])
      case 42 => SealedTrait._43(a.asInstanceOf[A43])
      case 43 => SealedTrait._44(a.asInstanceOf[A44])
      case 44 => SealedTrait._45(a.asInstanceOf[A45])
      case 45 => SealedTrait._46(a.asInstanceOf[A46])
      case 46 => SealedTrait._47(a.asInstanceOf[A47])
      case 47 => SealedTrait._48(a.asInstanceOf[A48])
      case 48 => SealedTrait._49(a.asInstanceOf[A49])
      case 49 => SealedTrait._50(a.asInstanceOf[A50])
      case 50 => SealedTrait._51(a.asInstanceOf[A51])
      case 51 => SealedTrait._52(a.asInstanceOf[A52])
      case 52 => SealedTrait._53(a.asInstanceOf[A53])
      case 53 => SealedTrait._54(a.asInstanceOf[A54])
      case 54 => SealedTrait._55(a.asInstanceOf[A55])
      case 55 => SealedTrait._56(a.asInstanceOf[A56])
      case 56 => SealedTrait._57(a.asInstanceOf[A57])
      case 57 => SealedTrait._58(a.asInstanceOf[A58])
      case 58 => SealedTrait._59(a.asInstanceOf[A59])
      case 59 => SealedTrait._60(a.asInstanceOf[A60])
      case 60 => SealedTrait._61(a.asInstanceOf[A61])
      case 61 => SealedTrait._62(a.asInstanceOf[A62])
      case 62 => SealedTrait._63(a.asInstanceOf[A63])
      case 63 => SealedTrait._64(a.asInstanceOf[A64])
    }
    def from(s: SealedTrait64[A, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, A59, A60, A61, A62, A63, A64]): A = s.value
  }

}