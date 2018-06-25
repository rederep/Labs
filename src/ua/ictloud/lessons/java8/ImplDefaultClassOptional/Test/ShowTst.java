package ua.ictloud.lessons.java8.ImplDefaultClassOptional.Test;

import java.util.Collection;

public interface ShowTst {
    static void show(Collection<?> collection) {
        collection.forEach(System.out::println);
    }
}
