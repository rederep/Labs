package ua.ictloud.lessons.coreclass;

import sun.util.calendar.ZoneInfo;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/**
 * Created by student on 25-May-18.
 */
public class DateCalendarMain {
    public static void main(String[] args) {
        Date date= new Date();                  //устарел класс,  получает значение когда создал new
        System.out.println(date);
        System.out.println(date.getTime());  //в милисекунах
        System.out.println();
        for (String s : TimeZone.getAvailableIDs()) {    //список доступных Тайм зонов
            System.out.println(s);
        }
        Calendar c = Calendar.getInstance(TimeZone.getTimeZone("Cuba"));
        System.out.println(c);
        System.out.println("hour " + c.get(Calendar.HOUR));
        System.out.println("minute " + c.get(Calendar.MINUTE));


        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(c.get(Calendar.MONTH));

    }
}
