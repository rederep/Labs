package ua.ictloud.lessons.polym;

/**
 * Created by student on 16-Apr-18.
 */
public class Cube extends Square {
    public Cube(int height) {
        super(height);
    }

    @Override
    public double getArea() {
        return height * height * height;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
