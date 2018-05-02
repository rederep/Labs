package ua.ictloud.lessons.enums;

/**
 * Created by student on 02-May-18.
 */
public class Main {
    public static void main(String[] args) {
        for (DaysOfWeek daysOfWeek : DaysOfWeek.values()) {
            System.out.println(daysOfWeek + "---" + daysOfWeek.getDay() + "---" + daysOfWeek.getShortDay());
            System.out.println(daysOfWeek.name() + "---" + daysOfWeek.ordinal());
            System.out.println();

        }
        DaysOfWeek d1 = DaysOfWeek.MONDAY;
        DaysOfWeek d2 = DaysOfWeek.MONDAY;
        DaysOfWeek d3 = DaysOfWeek.SUNDAY;
        System.out.println();
        System.out.println(d1 == d2);
        System.out.println(d1 == d3);
        System.out.println(d1.compareTo(d2));
    }
}
