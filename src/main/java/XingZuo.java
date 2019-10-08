import com.google.common.base.Strings;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * xxx
 * creat by newforesee 2019/10/8
 */
public class XingZuo {
    public static void main(String[] args) {
        System.out.println(evaluate("1995-02-10"));
    }
    private static String evaluate(String str) {
        //1、检查输出参数是否正确
        if (Strings.isNullOrEmpty(str)) {
            return null;
        }
        String[] split = str.split("-");
        if (split.length < 3) {
            return "输入时间格式不正确(like:1991-10-23)";
        }
        String constellation = getConstellation(split[1], split[2]);
        int age = getAgeByBirth(str);

        return str+"\t"+constellation+"\t"+age;
    }

    private static String getConstellation(String imouth, String iday) {
        int mouth = Integer.parseInt(imouth);
        int day = Integer.parseInt(iday);
        switch (mouth) {
            case 1:
                if (day > 20)
                    return "水瓶";
                else return "摩羯";
            case 2:
                if (day > 18)
                    return "双鱼";
                else return "水瓶";
            case 3:
                if (day > 20)
                    return "白羊";
                else return "水瓶";
            case 4:
                if (day > 19)
                    return "金牛";
                else return "白羊";
            case 5:
                if (day > 20)
                    return "双子";
                else return "金牛";
            case 6:
                if (day > 21)
                    return "巨蟹";
                else return "双子";
            case 7:
                if (day > 22)
                    return "狮子";
                else return "巨蟹";
            case 8:
                if (day > 22)
                    return "处女";
                else return "狮子";
            case 9:
                if (day > 22)
                    return "天秤";
                else return "处女";
            case 10:
                if (day > 23)
                    return "天蝎";
                else return "天秤";
            case 11:
                if (day > 22)
                    return "射手";
                else return "天蝎";
            case 12:
                if (day > 21)
                    return "摩羯";
                else return "射手";
            default:
                return null;

        }
    }
    private static int getAgeByBirth(String date)  {
        int age ;
        try {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            Date birthday = format.parse(date);
            Calendar now = Calendar.getInstance();
            now.setTime(new Date());// 当前时间

            Calendar birth = Calendar.getInstance();
            birth.setTime(birthday);

            if (birth.after(now)) {
                //如果传入的时间，在当前时间的后面，返回0岁
                age = 0;
            } else {
                age = now.get(Calendar.YEAR) - birth.get(Calendar.YEAR);
                if (now.get(Calendar.DAY_OF_YEAR) > birth.get(Calendar.DAY_OF_YEAR)) {
                    age += 1;
                }
            }
            return age;
        } catch (Exception e) {
            return 0;
        }
    }



}
