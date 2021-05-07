package lectures.part1basics

object DefaultArgs extends App {
  def trFactorial(n: Int, acc: Int = 1): Int =
    if(n < 1) acc
    else trFactorial(n-1, n * acc)

  val fact10 = trFactorial(10)

  def savePicture(format: String = "jpg", width: Int = 800, height: Int = 600): Unit = println("saving picture")

  savePicture("jpg", 800, 600)
  savePicture(width = 1600)
  savePicture(width = 1600, height = 200, format = "bmp")
}
