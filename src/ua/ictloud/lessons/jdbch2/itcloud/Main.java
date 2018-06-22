package ua.ictloud.lessons.jdbch2.itcloud;

import ua.ictloud.lessons.jdbch2.itcloud.controller.DriverController;
import ua.ictloud.lessons.jdbch2.itcloud.dao.CarDAO;
import ua.ictloud.lessons.jdbch2.itcloud.dao.DriverDAO;
import ua.ictloud.lessons.jdbch2.itcloud.dao.impl.CarDAOH2Impl;
import ua.ictloud.lessons.jdbch2.itcloud.dao.impl.DriverDAOH2Impl;
import ua.ictloud.lessons.jdbch2.itcloud.dto.DriverDTO;
import ua.ictloud.lessons.jdbch2.itcloud.exception.CarNotFound;
import ua.ictloud.lessons.jdbch2.itcloud.exception.DriverLastNameUniqueExp;
import ua.ictloud.lessons.jdbch2.itcloud.exception.DriverNotFoundExp;
import ua.ictloud.lessons.jdbch2.itcloud.model.Car;
import ua.ictloud.lessons.jdbch2.itcloud.model.Driver;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

/**
 * Created by student on 08-Jun-18.
 */
public class Main {
    public static void main(String[] args) throws DriverLastNameUniqueExp, SQLException {
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


        //       DriverDAO driverDAO = new DriverDAOH2Impl();
//        try {
//            driverDAO.addDriver(new Driver("Roma", "Petrov", 15, new StringBuilder("1D")));
//            driverDAO.addDriver(new Driver("Vasya", "Lazarev", 16, new StringBuilder("2D")));
//            driverDAO.addDriver(new Driver("Vasya2", "Lazarev", 16, new StringBuilder("2D")));
//            driverDAO.addDriver(new Driver("Ivan", "Mentov", 28, new StringBuilder("1S")));
//        } catch (DriverLastNameUniqueExp e) {
//         //   e.printStackTrace();
//            System.out.println(e.getMessage());
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        System.out.println(driverDAO.getAllDrivers());
//        System.out.println();
//
//
//        Driver d1 = driverDAO.getAllDrivers().get(2);
//        System.out.println("Try to update..." + d1);
//        //d1.setLastName("Lazarev");
//        d1.setLastName("MentovNew");
//
//        try {
//            driverDAO.updateDriver(d1);
//        } catch (DriverLastNameUniqueExp e) {
//            System.out.println(e.getMessage());
//        }
//        System.out.println(driverDAO.getAllDrivers());
//        System.out.println( );

//        try {
//            driverDAO.deleteDriver(3);
//        } catch (DriverNotFoundExp driverNotFoundExp) {
//            System.out.println(driverNotFoundExp.getMessage());
//        }
//        System.out.println(driverDAO.getAllDrivers());

////       with service
//        DriverController drv = new DriverController();
//        drv.startDriver();

        CarDAO carDAO = new CarDAOH2Impl();
        DriverDAO driverDAO = new DriverDAOH2Impl();

//        try {
//            driverDAO.addDriver(new Driver("Vova", "Petrov",10, new StringBuilder("2D")));
//            driverDAO.addDriver(new Driver("Vova1", "Petrov1",10, new StringBuilder("1D")));
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
        //     carDAO.addcar(new Car("bmw",1500,320));
        //       carDAO.addcar(new Car("audi",2000,320));


//        Driver d1 = new Driver("N", UUID.randomUUID().toString(), 3, new StringBuilder("1D"),
//                Arrays.asList(new Car("Tyek", 2015, 320),
//                        new Car("Tetk", 2015, 320)));
//        driverDAO.addDriver(d1);

  //     System.out.println(driverDAO.getAllDrivers());
               for (Driver driver : driverDAO.getAllDrivers()) {
            System.out.println(driver);
              }


        //Пример с транзаакциями
        Car car1 = carDAO.getAllCars().get(1);
        System.out.println(car1);
        car1.setModel("111");      //лимит поля 3  поставили
        car1.setYear(777779999);
        carDAO.updateCar(car1);
        System.out.println(carDAO.getAllCars().get(1));


       for (DriverDTO driverDTO : getAllDriversDTO()){
           System.out.println(driverDTO);
       }

    }

    //пример вызова класса DTO, для уменьшения передоваемой инфы, нужно в SERVICE
    public static List<DriverDTO> getAllDriversDTO(){
        DriverDAO driverDAO = new DriverDAOH2Impl();
        List<DriverDTO> driverDTOS = new ArrayList<>();
        for (Driver driver : driverDAO.getAllDrivers()) {
            driverDTOS.add(DriverDTO.toDTO(driver));
        }
        return driverDTOS;
    }



}
