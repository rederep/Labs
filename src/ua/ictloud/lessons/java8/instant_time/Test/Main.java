package ua.ictloud.lessons.java8.instant_time.Test;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Subscription(LocalDate.now(), Subscription.Type.BASIC));
        System.out.println(new Subscription(LocalDate.now(), Subscription.Type.PRO));
        System.out.println(new Subscription(LocalDate.now(), Subscription.Type.KING));


    }
}
