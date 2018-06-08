package ua.ictloud.lessons.jdbch2.itcloud;

import ua.ictloud.lessons.jdbch2.itcloud.dao.CarDAO;
import ua.ictloud.lessons.jdbch2.itcloud.dao.impl.CarDAOH2Impl;
import ua.ictloud.lessons.jdbch2.itcloud.model.Car;

/**
 * Created by student on 08-Jun-18.
 */
public class Main {
    public static void main(String[] args) {
        CarDAO carDAO = new CarDAOH2Impl();
        carDAO.addcar(new Car("Audi", 1999, 260));
        carDAO.addcar(new Car("Ford", 1980, 240));
        carDAO.addcar(new Car("Opel", 2008, 120));
        System.out.println(carDAO.getAllCars());
    }
}
