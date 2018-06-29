package ua.ictloud.lessons.java8.instant_time.Test;

import java.time.LocalDate;
import java.util.Date;

public class Subscription {
    private LocalDate startSubs;
    private LocalDate endSubs;
    public Type type;

    public Subscription() {
    }

    public Subscription(LocalDate startSubs, Type type) {
        this.startSubs = startSubs;
        this.type = type;
        LocalDate date;
        switch (type) {
            case BASIC:{
                date = startSubs.plusMonths(3);
                break;}
            case LARGE:{
                date = startSubs.plusMonths(6);
                break;}
            case PRO:{
                date = startSubs.plusMonths(10);
                break;}
            case KING:{
                date = startSubs.plusYears(1);
                break; }
            default: {
                date = startSubs;
            }
        }
        this.endSubs = date;
    }

    public enum Type {
        BASIC,
        LARGE,
        PRO,
        KING;
    }

    /**
     * //java DOC
     *
     * @param type
     * @throws - none exception
     */

    @Override
    public String toString() {
        return "Subscription{" +
                "startSubs=" + startSubs +
                ", endSubs=" + endSubs +
                ", type=" + type +
                '}';
    }
}
