package ua.ictloud.lessons.enums;

/**
 * Created by student on 02-May-18.    массив констант стриргов + с любым конструктором внутри
 */
public enum DaysOfWeek {
    MONDAY(1, "MON"),
    TUESDAY(2, "TU"),
    WEDNESDAY(3, "WED"),
    THURSDAY(4, "TH"),
    FRIDAY(5, "FR"),
    SATURDAY(6, "ST"),
    SUNDAY(7, "SUN");

    private int day;
    private String shortDay;


    DaysOfWeek(int i, String shortDay) {
        this.day = i;
        this.shortDay = shortDay;
    }

    public String getShortDay() {
        return shortDay;
    }

    public int getDay() {
        return day;
    }
}
