package ua.ictloud.lessons.jdbch2.itcloud;

import ua.ictloud.lessons.jdbch2.itcloud.dao.CarDAO;
import ua.ictloud.lessons.jdbch2.itcloud.dao.DriverDAO;
import ua.ictloud.lessons.jdbch2.itcloud.dao.impl.CarDAOH2Impl;
import ua.ictloud.lessons.jdbch2.itcloud.dao.impl.DriverDAOH2Impl;
import ua.ictloud.lessons.jdbch2.itcloud.exception.CarNotFound;
import ua.ictloud.lessons.jdbch2.itcloud.exception.DriverLastNameUniqueExp;
import ua.ictloud.lessons.jdbch2.itcloud.model.Car;
import ua.ictloud.lessons.jdbch2.itcloud.model.Driver;

import java.sql.SQLException;

/**
 * Created by student on 08-Jun-18.
 */
public class Main {
    public static void main(String[] args) {
//        CarDAO carDAO = new CarDAOH2Impl();
////        carDAO.addcar(new Car("Audi", 1999, 260));
////        carDAO.addcar(new Car("Ford", 1980, 240));
////        carDAO.addcar(new Car("Opel", 2008, 120));
//        System.out.println(carDAO.getAllCars());
//        try {
//            carDAO.deleteCar(3);
//        } catch (CarNotFound e) {
//            System.out.println(e.getMessage());
//        }
//        System.out.println(carDAO.getAllCars());


        DriverDAO driverDAO = new DriverDAOH2Impl();
        try {
        //    driverDAO.addDriver(new Driver("Pupkin", "Romans", 15, new StringBuilder("1D")));
            driverDAO.addDriver(new Driver("Vasyz", "Petrova", 16, new StringBuilder("2D")));
        } catch (DriverLastNameUniqueExp e) {
         //   e.printStackTrace();
            System.out.println(e.getMessage());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(driverDAO.getAllDrivers());
     //   driverDAO.updateDriver(new Driver("Pupkin", "Romans", 15, new StringBuilder("1D")),2);
        System.out.println();


    }


}
