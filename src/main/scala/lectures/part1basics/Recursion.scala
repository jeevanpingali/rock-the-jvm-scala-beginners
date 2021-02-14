package lectures.part1basics

object Recursion extends App {
  def factorial(n: Int): Int = {
    if(n <= 1) 1
    else {
      println("Computing factorial of " + n + " - I first need factorial of " + (n - 1))
      val result = n * factorial(n - 1)
      println("Computed factorial of " + n)
      result
    }
  }

  println(factorial(10))
//  println(factorial(5000))

  def anotherFactorial(n: BigInt): BigInt = {
    def factorialHelper(x: BigInt, accumulator: BigInt): BigInt =
      if(x <= 1) accumulator
      else factorialHelper(x - 1, x * accumulator)

    factorialHelper(n, 1)
  }

  println(anotherFactorial(5000))
}
