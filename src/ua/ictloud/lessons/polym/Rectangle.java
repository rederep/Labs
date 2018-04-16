package ua.ictloud.lessons.polym;

/**
 * Created by student on 16-Apr-18.
 */
public class Rectangle extends Square {
    private int width;

    public Rectangle(int height, int width) {
        super(height);
        this.width = width;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                '}';
    }
}
