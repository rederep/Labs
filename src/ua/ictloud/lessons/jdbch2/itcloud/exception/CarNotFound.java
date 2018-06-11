package ua.ictloud.lessons.jdbch2.itcloud.exception;

/**
 * Created by student on 11-Jun-18.
 */
public class CarNotFound extends Exception {
    @Override
    public String getMessage() {
        return "Car not found";
    }
}
