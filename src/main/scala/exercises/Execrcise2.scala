package exercises

import scala.annotation.tailrec

object Execrcise2 extends App {

  @tailrec
  def concatenateTailRec(aString: String, n: Int, accumulator: String): String = {
    if(n <=0) accumulator
    else concatenateTailRec(aString, n - 1, aString + accumulator)
  }

  println(concatenateTailRec("hello", 3, ""))

  def isPrime(n: Int): Boolean = {
    @tailrec
    def isPrimeTailrec(t: Int, isStillPrime: Boolean): Boolean =
      if (!isStillPrime) false
      else if (t <= 1) true
      else isPrimeTailrec(t - 1, n % t != 0 && isStillPrime)

    isPrimeTailrec(n / 2, true)
  }
  println(isPrime(2003))
  println(isPrime(629))

  def fibonacci(n: Int): Int = {
    def fiboTailRec(i: Int, last: Int, nextToLast: Int): Int = {
      if(i >= n) last
      else fiboTailRec(i + 1, last + nextToLast, last)
    }

    if(n <= 2) 1
    else fiboTailRec(3,1,1)
  }
  println(fibonacci(8))


}
