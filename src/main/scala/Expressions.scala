object Class extends App{

  class Car(var x: Int = 0, var y: Int = 0) {
    def move(dx: Integer, dy: Integer) {
      x = x + dx
      y = y + dy
    }
  }

  val c1 = new Car(10,5)
  val c2 = new Car(y = 5)
  c1.move(2,5)
  println(c1.x)
  println(c2.x + " " + c2.y)

  class Point {
    private var _x = 0
    private var _y = 0
    private val bound = 100

    def x = _x
    def x_= (newValue: Int): Unit = {
      if (newValue < bound) _x = newValue else printWarning
    }

    def y = _y
    def y_= (newValue: Int): Unit = {
      if (newValue < bound) _y = newValue else printWarning
    }

    private def printWarning = println("WARNING: Out of bounds")
  }
  val point1 = new Point
  point1.x = 99
  point1.y = 101 // prints the warning
  point1.y =15
  println(point1.x)
  println(point1.y)
}
