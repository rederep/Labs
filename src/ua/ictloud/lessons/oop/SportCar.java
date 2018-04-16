package ua.ictloud.lessons.oop;

/**
 * Created by student on 11-Apr-18.
 */
public class SportCar extends Car{
    private boolean isSpolier;
    static {
        System.out.println("SC statick block 1");
    }
    {
        System.out.println("SC block 1");
    }
    public SportCar() {
        System.out.println("SC cons");
    }

    public SportCar(boolean isSpolier) {
        this.isSpolier = isSpolier;
        System.out.println("SC cons 1");
    }

    public SportCar(double maxSpeed, String colour, boolean isSpolier) {
        super(maxSpeed, colour);
        this.isSpolier = isSpolier;
        System.out.println("SC cons 3");
    }


    public boolean isSpolier() {
        super.colour="";
        showPr();
        return isSpolier;
    }

    public void setSpolier(boolean spolier) {
        isSpolier = spolier;
        colour="red";
        maxSpeed=999.9;

    }

    @Override
    public void showPu(){
        System.out.println("i am sport car");
    }
}
