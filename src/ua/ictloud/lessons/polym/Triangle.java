package ua.ictloud.lessons.polym;

/**
 * Created by student on 16-Apr-18.
 */
public class Triangle extends Figure {
    private int height;
    private int width;

    public Triangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea() {
        return (1.0 / 2.0) * (double) width * (double)height;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }
}
