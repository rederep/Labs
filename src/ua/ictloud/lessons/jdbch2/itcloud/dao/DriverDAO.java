package ua.ictloud.lessons.jdbch2.itcloud.dao;
import ua.ictloud.lessons.jdbch2.itcloud.exception.DriverLastNameUniqueExp;
import ua.ictloud.lessons.jdbch2.itcloud.exception.DriverNotFoundExp;
import ua.ictloud.lessons.jdbch2.itcloud.model.Driver;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by student on 11-Jun-18.
 */
public interface DriverDAO {
    void addDriver (Driver driver) throws SQLException, DriverLastNameUniqueExp;
    List<Driver> getAllDrivers();
    void updateDriver(Driver driver, int driverID) throws DriverLastNameUniqueExp;
    void deleteDriver(int driverId) throws DriverNotFoundExp;
}
