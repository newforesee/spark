package newforesee.test

import org.apache.spark.sql.DataFrame
import org.apache.spark.sql.functions._

/**
  * xxx
  * creat by newforesee 2019-09-09
  */
object TestWnl extends Test {

  import spark.implicits._

  override def run(): Unit = {
    val wnl: DataFrame = spark.read
      .option("header", true)
      .csv("/Users/newforesee/Intellij Project/Spark/src/main/resources/wnl.csv")


    wnl.where($"公历日期" like "2019/7%").show()
    wnl.printSchema()
  }
}
