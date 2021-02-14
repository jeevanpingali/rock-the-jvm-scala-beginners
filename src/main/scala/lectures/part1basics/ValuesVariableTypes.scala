package lectures.part1basics

object ValuesVariableTypes extends App {

  val x: Int = 42
  println(x)

//  x = 2

  val sString: String = "hello"
  val anotherString = "goodbye"

  val aBoolean: Boolean = true
  val aChar: Char = 'a'
  val anInt: Int = x
  val aShort: Short = 4343
  val aLong: Long = 4646464564345454L
  val aFloat: Float = 22323.23F
  val aDouble: Double = 3.14

  // variables
  var aVariable: Int = 4
  aVariable = 5 // side affects
  aVariable += 7

}
