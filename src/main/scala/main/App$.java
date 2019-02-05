package scala.main;

object App {

  def main(args: Array[String]): Unit = {

    val g = Graph(1 ~ 2, 2 ~ 3, 4 ~ 5)

    val test = g.get(2)

    val res = test.weakComponent.edges

    println(res)
  }

}
