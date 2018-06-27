package ua.ictloud.lessons.java8.instant_time;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Instant n1 = Instant.now();
        Thread.sleep(1000);
        Instant n2 = Instant.now();
        System.out.println(n1.toString() + "     " + n2);
        System.out.println(n1.compareTo(n2));

        System.out.println(Duration.between(n1, n2).getSeconds());  // разниса в сек
        System.out.println(n1.isAfter(n2));
        System.out.println(n1.isBefore(n2));
        System.out.println(n1.getEpochSecond());

        System.out.println(n1.plus(3, ChronoUnit.DAYS)); //долбваляем 3 дня
        System.out.println("----------------");

        LocalDate ld1 = LocalDate.now();     //только с днями
        System.out.println(ld1);
        System.out.println("+ 1 Day: " + ld1.plus(1, ChronoUnit.MONTHS));  //добавляем день
        LocalDate ld2 = LocalDate.of(2020, 12, 21);   //добавляем дату ручками
        System.out.println(ld1.getYear() + " is leap \t" + ld1.isLeapYear());        //высокосноть годы
        System.out.println(ld2.getYear() + " is leap \t" + ld2.isLeapYear());
        System.out.println("----------------------");

        LocalTime lt1 = LocalTime.now();
        System.out.println(lt1);
        LocalTime lt2 = LocalTime.of(13,13,13);
        System.out.println(lt2);
        System.out.println(lt2.plusHours(1001));  //+ часов
        System.out.println("----------------------");

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);


    }
}
