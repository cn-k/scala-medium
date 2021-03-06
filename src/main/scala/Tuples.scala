object Tuples extends App{
  val ingredients: (String, Int) = ("Cake", 25)
  val (name, quantity) = ingredients
  println(name) // Sugar
  println(quantity) // 25
  val planets: Seq[(String, Double)] =
    List(("Mercury", 57.9), ("Venus", 108.2), ("Earth", 149.6),
      ("Mars", 227.9), ("Jupiter", 778.3))
  planets.foreach{
    case ("Earth", distance) =>
      println(s"Our planet is $distance million kilometers from the sun")
    case _ =>
  }
  val numPairs: Seq[(Int, Int)] = List((2, 5), (3, -7), (20, 56))
  for ((a, b) <- numPairs) {
    println(a * b)
  }
}
