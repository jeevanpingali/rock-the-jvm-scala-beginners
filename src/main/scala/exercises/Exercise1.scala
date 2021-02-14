package exercises

object Exercise1 extends App {
  def greeting(name: String, age: Int) = {
    "Hi, my name is " + name + " and I am " + age + " years old."
  }

  println("John", 17)

  def factorial(numbers: Array[Int], result: Int = 1): Int = {
    if(numbers.size == 0) {
      println("Number is zero")
      result
    }
    else {
      println(s"calling factorial in recurssive ${numbers.length} - result: $result")
      factorial(numbers.takeRight(numbers.size - 1), numbers(0) * result)
    }
  }

  println(factorial(Array(1,2,3, 4)))

  def factorial1(n: Int): Int = {
    if(n <= 0) 1
    else n * factorial1(n - 1)
  }

  println(factorial1(5))


  def fibonacci(n: Int): Int = {
    if(n <= 2) 1
    else fibonacci(n - 1) + fibonacci(n - 2)
  }

  println(fibonacci(8))

  def isPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean = {
      if(t <= 1) true
      else n % t != 0 && isPrimeUntil(t - 1)
    }

    isPrimeUntil(n / 2)
  }

  println(isPrime(37))
  println(isPrime(2003))
  println(isPrime(37 * 17))

}
