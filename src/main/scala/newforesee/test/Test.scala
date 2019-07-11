package newforesee.test

import org.apache.log4j.Logger
import vegas._

object Test {
  def main(args: Array[String]): Unit = {
    val plot = Vegas("Results").
      withData(
        Seq(
          Map("x" -> 1, "y" -> 1,"Origin"->"a"),
          Map("x" -> 2, "y" -> 2,"Origin"->"b"),
          Map("x" -> 3, "y" -> 3,"Origin"->"c")
        )
      ).
      encodeX("x", Quant).
      encodeY("y", Quant).
      encodeColor(field="Origin", dataType= Nominal).
      mark(Point)
    plot.show

  }
}
