package ua.ictloud.lessons.java8.instant_time.Test;

import java.time.LocalDate;
import java.util.Date;

public class Subscription {
    private LocalDate startSubs;
    private LocalDate endSubs;
    public Type type;



    public Subscription(LocalDate startSubs, LocalDate endSubs) {
        this.startSubs = startSubs;
        this.endSubs = endSubs;
    }

    public enum Type{
        BASIC,
        LARGE,
        PRO,
        KING;
    }

    public Subscription(Type type) {
        this.type = type;
    }

    

}
