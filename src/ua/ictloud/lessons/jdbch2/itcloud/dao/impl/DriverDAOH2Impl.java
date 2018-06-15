package ua.ictloud.lessons.jdbch2.itcloud.dao.impl;

import ua.ictloud.lessons.jdbch2.itcloud.dao.DriverDAO;
import ua.ictloud.lessons.jdbch2.itcloud.exception.DriverLastNameUniqueExp;
import ua.ictloud.lessons.jdbch2.itcloud.exception.DriverNotFoundExp;
import ua.ictloud.lessons.jdbch2.itcloud.model.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static ua.ictloud.lessons.jdbch2.itcloud.dao.impl.ConnectionFactory.getInstance;

/**
 * Created by student on 11-Jun-18.
 */
public class DriverDAOH2Impl implements DriverDAO {
    private static final String CREATE_DRIVER_TABLE = "CREATE TABLE IF NOT EXISTS drivers (" +
            Driver.ID + " INT(11) PRIMARY KEY AUTO_INCREMENT, " +
            Driver.FIRSTNAME + " VARCHAR(50), " +
            Driver.LASTNAME + " VARCHAR(50) UNIQUE, " +
            Driver.EXP + " INT(4), " +
            Driver.CATEGORY + " VARCHAR(5)" +
            ");";
    private static final String GET_ALL_DRIVER = "SELECT * FROM drivers;";
    private static final String INSERT_DRIVER = String.format("INSERT INTO drivers(%s, %s, %s, %s) VALUES (?, ?, ?, ?);", Driver.FIRSTNAME, Driver.LASTNAME, Driver.EXP, Driver.CATEGORY);
    private static final String DELETE_DRIVER_BY_ID = String.format("DELETE FROM drivers WHERE %s=?", Driver.ID);
    private static final String FIND_COUNT_LAST_NAME = String.format("SELECT COUNT(%s) FROM drivers WHERE %s = ?;", Driver.LASTNAME, Driver.LASTNAME);
    private static final String FIND_COUNT_LAST_NAME_AND_ID = String.format("SELECT COUNT(%s) FROM drivers WHERE %s = ? AND %s != ?;", Driver.LASTNAME, Driver.LASTNAME, Driver.ID);
    private static final String UPDATE_DRIVER = String.format("UPDATE drivers SET %s = ?, %s = ?, %s = ?, %s = ? WHERE %s = ?;",
            Driver.FIRSTNAME, Driver.LASTNAME, Driver.EXP, Driver.CATEGORY, Driver.ID);

    private Connection conn;
    private PreparedStatement pst = null;
    private Statement stmt = null;
    private ResultSet rs = null;

    public DriverDAOH2Impl() {
        try {
            conn = getInstance().getConnection();
            stmt = conn.createStatement();
            stmt.execute(CREATE_DRIVER_TABLE);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            getInstance().closeStatement(stmt);
            getInstance().closeConnection(conn);
        }

    }

    @Override
    public void addDriver(Driver driver) throws DriverLastNameUniqueExp {
        try {
            conn = getInstance().getConnection();
            stmt = conn.createStatement();
            pst = conn.prepareStatement(FIND_COUNT_LAST_NAME);
            //      rs = stmt.executeQuery(FIND_COUNT_LAST_NAME);
            pst.setString(1, driver.getLastName());
            pst.execute();
            rs = pst.getResultSet();
            while (rs.next()) {
                //     System.out.println(rs.getInt(1));
                if (rs.getInt(1) <= 0) {
                    pst = conn.prepareStatement(INSERT_DRIVER);
                    pst.setString(1, driver.getFirstName());
                    pst.setString(2, driver.getLastName());
                    pst.setInt(3, driver.getExp());
                    pst.setString(4, String.valueOf(driver.getCategory()));
                    pst.execute();
                } else {
                    throw new DriverLastNameUniqueExp(driver.getLastName());
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            getInstance().closeResaultSet(rs);
            getInstance().closePreparedStatement(pst);
            getInstance().closeConnection(conn);
        }
    }

    @Override
    public List<Driver> getAllDrivers() {
        List<Driver> result = new ArrayList<>();
        try {
            conn = getInstance().getConnection();
            stmt = conn.createStatement();
            rs = stmt.executeQuery(GET_ALL_DRIVER);
            while (rs.next()) {
                Driver driver = new Driver();
                driver.setId(rs.getInt(Driver.ID));
                driver.setFirstName(rs.getString(Driver.FIRSTNAME));
                driver.setLastName(rs.getString(Driver.LASTNAME));
                driver.setExp(rs.getInt(Driver.EXP));
                driver.setCategory(new StringBuilder(rs.getString(Driver.CATEGORY)));
                result.add(driver);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            getInstance().closeResaultSet(rs);
            getInstance().closeStatement(stmt);
            getInstance().closeConnection(conn);

        }

        return result;
    }

    @Override
    public void updateDriver(Driver driver) throws DriverLastNameUniqueExp {
        try {
            conn = getInstance().getConnection();
            stmt = conn.createStatement();
            pst = conn.prepareStatement(FIND_COUNT_LAST_NAME_AND_ID);
            //      rs = stmt.executeQuery(FIND_COUNT_LAST_NAME);
            pst.setString(1, driver.getLastName());
            pst.setInt(2, driver.getId());
            pst.execute();
            rs = pst.getResultSet();
            while (rs.next()) {
                 //  System.out.println(rs.getInt(1));
                if (rs.getInt(1) <= 0) {

                    pst = conn.prepareStatement(UPDATE_DRIVER);
                    pst.setString(1, driver.getFirstName());
                    pst.setString(2, driver.getLastName());
                    pst.setInt(3, driver.getExp());
                    pst.setString(4, String.valueOf(driver.getCategory()));
                    pst.setInt(5, driver.getId());
                    pst.execute();
                } else {
                    throw new DriverLastNameUniqueExp(driver.getLastName());
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            getInstance().closeResaultSet(rs);
            getInstance().closePreparedStatement(pst);
            getInstance().closeConnection(conn);
        }
    }


    @Override
    public void deleteDriver(int driverId) throws DriverNotFoundExp {
        try {
            conn = getInstance().getConnection();
            pst = conn.prepareStatement(DELETE_DRIVER_BY_ID);
            pst.setInt(1, driverId);
            int isDeleteResult = pst.executeUpdate();
            if (isDeleteResult == 0) {
                throw new DriverNotFoundExp();
            }
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            getInstance().closePreparedStatement(pst);
            getInstance().closeConnection(conn);
        }


    }
}
