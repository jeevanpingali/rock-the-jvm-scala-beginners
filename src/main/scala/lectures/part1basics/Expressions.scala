package lectures.part1basics

object Expressions extends App {
  val x = 1 + 2 // Expression
  println(x)

  println(2 + 3 * 4) // Match expression
  // + - * / & | ^ << >> >>> (right shift with zero extension)
  println(1 == x)

  // == != > >= < <=

  println(!(1 == x))

  var aVariable = 2
  aVariable += 3 // -= *= /=
  println(aVariable)

  // Instructions vs Expressions

  val aCondition = true
  val aConditionedValue = if(aCondition) 5 else 3 // IF EXPRESSION
  println(aConditionedValue)
  println(if(aCondition) 5 else 3)

  // LOOPS - discouraged
  var i = 0
  while(i < 10) {
    println(i)
    i += 1
  }

  // NEVER WRITE THIS AGAIN

  // EVERYTHING IN Scala IS AN Expression

  val aWeirdValue = (aVariable = 3) // UNIT = void
  println(aWeirdValue)

  // Code Blocks

  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if(z > 2)
      "hello"
    else "goodbye"
  }

}
