package ua.ictloud.lessons.pattern.strategy;

/**
 * Created by student on 30-May-18.
 */
public class CatSay implements Say{

    @Override
    public void say() {
        System.out.println("Hello i am a CAT");
    }
}
