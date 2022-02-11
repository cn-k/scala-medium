object Traits extends App{

  trait Adder[A] {
    def add(a:A): A
  }
 class IntAdder(b:Int) extends Adder[Int]{
   override def add(a: Int): Int = a + b
 }
  class StringAdder(b:String) extends Adder[String]{
    override def add(a: String): String = a + " " + b
  }
  val x = new IntAdder(2)
  val y = new StringAdder("test")
  println(x.add(3))
  println(y.add("deneme"))
}
