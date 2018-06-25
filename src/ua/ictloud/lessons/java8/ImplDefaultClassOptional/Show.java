package ua.ictloud.lessons.java8.ImplDefaultClassOptional;

//если ставить default то будет реализация по умолчанию в этом методе, и переобределять не обязательно

public interface Show {
    default void showInfo() {
        System.out.println("ololo");
    }
    default void showInfo2() {
        System.out.println("ololo-2");
    }
}
