package ua.ictloud.lessons.pattern.strategy;

/**
 * Created by student on 30-May-18.
 */
public class Room {
    private Say s;

    public void setContext(Say s) {
        this.s = s;
    }  //!!!!!!!!!

    public void saySomething(){
        s.say();
    }

}
