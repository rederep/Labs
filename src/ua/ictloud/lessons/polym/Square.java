package ua.ictloud.lessons.polym;

/**
 * Created by student on 16-Apr-18.
 */
public class Square extends Figure {
    protected int height;

    public Square(int height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return height * height;
    }

    @Override
    public String toString() {
        return "Square{" +
                "height=" + height +
                '}';
    }
}
