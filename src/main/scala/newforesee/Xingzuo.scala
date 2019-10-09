package newforesee

import java.text.SimpleDateFormat

import org.joda.time.LocalDate

/**
 * xxx
 * creat by newforesee 2019/10/8
 */
object Xingzuo {

  def main(args: Array[String]): Unit = {
    getAgeByBirth("1995-11-15")
  }

  def evaluate(birth: String) = {
    if (birth.isEmpty) null
    else {

      getConstellation(birth.split("-")(1).toInt, birth.split("-")(2).toInt)

    }

  }

  def getConstellation(month: Int, day: Int) = {
    var arr = Array(20, 19, 21, 21, 21, 22, 23, 23, 23, 23, 22, 22);
    "魔羯水瓶双鱼牡羊金牛双子巨蟹狮子处女天秤天蝎射手魔羯".substring(month * 2 - (if (day < arr(month - 1)) 2 else 0), month * 2 - (if (day < arr(month - 1)) 2 else 0) + 2)
  }

  def getAgeByBirth(birth:String) ={
    val format = new SimpleDateFormat("yyyy-MM-dd")
    val bir: LocalDate = LocalDate.parse(birth)
    bir
//    val date = format.parse(birth)
//    Calendar.getInstance().setTime(new Date())

  }
}
