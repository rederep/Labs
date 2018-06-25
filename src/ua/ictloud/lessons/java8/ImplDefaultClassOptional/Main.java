package ua.ictloud.lessons.java8.ImplDefaultClassOptional;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) throws Exception {
        ImplShow implShow = new ImplShow();
        implShow.showInfo();

        Dog.hello();

        ImplShow implShowTest = null;
        Optional<ImplShow> optional = Optional.ofNullable(implShowTest);  //Обертка для проверки инфы об обьекте

        if (implShowTest != null) {
            implShowTest.showInfo();
        } else {
            System.out.println("null");
        }

        System.out.println(optional.isPresent());    //возвращает инфо об обьекте
        implShowTest = optional.orElse(new ImplShow());  //создаем если null
        optional = Optional.ofNullable(implShowTest);  //опять засовываем в optianl наш обект созданный с помошью оптионала
        implShowTest = optional.get();   //засовываем c optianal наш обект в интерфейс (обрано верхнему)
        //  implShowTest = optional.orElseThrow(Exception::new); //выбрасует ошишибку т.к. в optinal уще null, но implShowTest уже записан

        implShowTest.showInfo();
        System.out.println();
        optional.ifPresent(System.out::println);  //если что-то есть то делаем что в скобках
        System.out.println(implShowTest);

        show(ImplShow::new);


    class ConsImpl implements Consumer<ImplShow>{
        @Override
        public void accept(ImplShow implShow) {
            System.out.println("My method " + implShow.toString());
        }
    }
    optional.ifPresent(new ConsImpl());

    }

    public static void show(Supplier<ImplShow> implShowSupplier) {   //Supplier - возвращает что-то, имеет только метод get, передаем ссылку на конструктор класса ImlShow
        implShowSupplier.get().showInfo();
    }
}
