import scala.math.BigInt

object Factorial extends App {
  val total = 0
  def factorial(i: BigInt, x1: BigInt): BigInt = 
    if (i == 0) x1 else factorial(i-1, x1 * i)

  println(factorial(30000, 1))
}
