package newforesee

import java.text.SimpleDateFormat
import java.util.{Calendar, Date}

/**
 * xxx
 * creat by newforesee 2019/10/8
 */
object Xingzuo {

  def main(args: Array[String]): Unit = {

  }

  def evaluate(birth: String) = {
    if (birth.isEmpty) null
    else {

      getConstellation(birth.split("-")(1), birth.split("-")(2))

    }

  }

  def getConstellation(imouth: String, iday: String) = {
    val month = imouth.toInt
    val day = iday.toInt
    var s = "魔羯水瓶双鱼牡羊金牛双子巨蟹狮子处女天秤天蝎射手魔羯"
    var arr = Array(20, 19, 21, 21, 21, 22, 23, 23, 23, 23, 22, 22);
    s.substring(month * 2 - (if (day < arr(month - 1)) 2 else 0), month * 2 - (if (day < arr(month - 1)) 2 else 0) + 2)

  }

  def getAgeByBirth(birth:String) ={
    val format = new SimpleDateFormat("yyyy-MM-dd")
    val date = format.parse(birth)
    Calendar.getInstance().setTime(new Date())

  }
}
