package ua.ictloud.lessons.jdbch2.itcloud.exception;

/**
 * Created by student on 11-Jun-18.
 */
    public class DriverLastNameUniqueExp extends Exception {

    public DriverLastNameUniqueExp(String message) {
        super("Driver with same Last Name already is exists " + message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
