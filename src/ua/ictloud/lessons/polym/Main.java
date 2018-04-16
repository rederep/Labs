package ua.ictloud.lessons.polym;

/**
 * Created by student on 16-Apr-18.     ПОЛИМОРФИЗ
 */
public class Main {
    public static void main(String[] args) {
        // FigureUtil figureUtil = new FigureUtil(); // убрали т.к. статик поставили
        Figure s = new Square(3);
        Figure c = new Circle(3.33);
        Figure[] mas = new Figure[5];

        mas[0] = s;
        mas[1] = c;
        mas[2] = new Triangle(4, 6);
        mas[3] = new Rectangle(5, 5);
        mas[4] = new Cube(6);               //площадь

//        System.out.println("Square area = " + s.getArea());
//        System.out.println("Circle area = " + c.getArea());

        FigureUtil figureUtil = FigureUtil.getInstance();   //CИНГЛТОЛ
        FigureUtil figureUtil2 = FigureUtil.getInstance();
        System.out.println(figureUtil == figureUtil2);
        System.out.println();


        // System.out.println(mas[0]);
        for (Figure ma : mas) {
            FigureUtil.printInfo(ma);
            System.out.println(ma.getArea());
        }

    }
}
