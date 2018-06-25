package ua.ictloud.lessons.java8.ImplDefaultClassOptional;

//если несколько интерфейсов имеют один и тот же метод, то нужно его переобределить

public class ImplShow implements Show, Dog{
    @Override
    public void showInfo() {
        Dog.super.showInfo();
    }
}
