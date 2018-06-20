package ua.ictloud.lessons.jdbch2.itcloud.service;

import ua.ictloud.lessons.jdbch2.itcloud.dao.CarDAO;
import ua.ictloud.lessons.jdbch2.itcloud.dao.DriverDAO;
import ua.ictloud.lessons.jdbch2.itcloud.dao.impl.CarDAOH2Impl;
import ua.ictloud.lessons.jdbch2.itcloud.dao.impl.DriverDAOH2Impl;
import ua.ictloud.lessons.jdbch2.itcloud.dao.impl.Factory;
import ua.ictloud.lessons.jdbch2.itcloud.exception.DriverLastNameUniqueExp;
import ua.ictloud.lessons.jdbch2.itcloud.exception.DriverNotFoundExp;
import ua.ictloud.lessons.jdbch2.itcloud.model.Driver;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by student on 15-Jun-18.
 */
public class DriverService {
    private DriverDAO driverDAO;

    public DriverService() {
        //this.driverDAO = new DriverDAOH2Impl();                 //instance??????
        this.driverDAO = Factory.getInstance();
    }
    public void addDriver (Driver driver) throws DriverLastNameUniqueExp, SQLException {
        driverDAO.addDriver(driver);
    }

    public List<Driver> getAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public void updateDriver(Driver driver) throws DriverLastNameUniqueExp {
        driverDAO.updateDriver(driver);
    }

    public void deleteDriver(int driverID) throws DriverNotFoundExp {
        driverDAO.deleteDriver(driverID);
    }


}

