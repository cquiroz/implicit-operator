import algebra.ring.AdditiveSemigroup
import algebra.ring.CommutativeSemiring
import algebra.Semigroup
import algebra.Monoid

final class AdditiveSemigroupOps[A](lhs: A)(implicit as: AdditiveSemigroup[A]) {
  def +(rhs: A): A = as.plus(rhs, lhs)
}

trait AdditiveSemigroupSyntax {
  implicit def additiveSemigroupOps[A: AdditiveSemigroup](
      a: A
  ): AdditiveSemigroupOps[A] = new AdditiveSemigroupOps(a)
}

object syntax {
  object additiveSemigroup extends AdditiveSemigroupSyntax
}

object App {
  def main(args: Array[String]): Unit = {
    import syntax.additiveSemigroup._
    implicit def IntAlgebra[A]: AdditiveSemigroup[Map[Int, A]] = ???

    def res[A]: Map[Int, A] = {
      val a: Map[Int, A] = Map.empty
      val b: Map[Int, A] = Map.empty
      a + b
    }
  }

}
