package ua.ictloud.lessons.java8.ImplDefaultClassOptional;

public interface Dog {
    default void showInfo(){
        System.out.println("I am the dog");
    }
    static void hello(){
        System.out.println("I am the static");
    }
}
