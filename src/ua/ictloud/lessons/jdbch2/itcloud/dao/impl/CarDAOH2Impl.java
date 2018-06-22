package ua.ictloud.lessons.jdbch2.itcloud.dao.impl;

import ua.ictloud.lessons.jdbch2.itcloud.dao.CarDAO;
import ua.ictloud.lessons.jdbch2.itcloud.exception.CarNotFound;
import ua.ictloud.lessons.jdbch2.itcloud.model.Car;
import ua.ictloud.lessons.jdbch2.itcloud.model.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static ua.ictloud.lessons.jdbch2.itcloud.dao.impl.ConnectionFactory.getInstance;

/**
 * Created by student on 08-Jun-18.
 */
public class CarDAOH2Impl implements CarDAO {

    private static final String CREATE_CAR_TABLE = "CREATE TABLE IF NOT EXISTS cars (" +    //Через Statement
            Car.ID + " INT(11) PRIMARY KEY AUTO_INCREMENT, " +
            Car.MAXSPEED + " DOUBLE(11), " +
            Car.MODEL + " VARCHAR(3), " +
            Car.YEAR + " INT(4), " +
            Car.DRIVER_ID + " INT(11) REFERENCES drivers("+Driver.ID+")"+
            ");";
    private static final String CREATE_DRIVER_TABLE = "CREATE TABLE IF NOT EXISTS drivers (" +
            ua.ictloud.lessons.jdbch2.itcloud.model.Driver.ID + " INT(11) PRIMARY KEY AUTO_INCREMENT, " +
            ua.ictloud.lessons.jdbch2.itcloud.model.Driver.FIRSTNAME + " VARCHAR(50), " +
            ua.ictloud.lessons.jdbch2.itcloud.model.Driver.LASTNAME + " VARCHAR(50) UNIQUE, " +
            ua.ictloud.lessons.jdbch2.itcloud.model.Driver.EXP + " INT(4), " +
            Driver.CATEGORY + " VARCHAR(5)" +
            ");";
    private static final String GET_ALL_CARS = "SELECT * FROM cars;";
    //  private static final String INSERT_CAR = "INSERT INTO cars(" + Car.MAXSPEED + ", " + Car.MODEL + ", " + Car.YEAR + ") VALUES (?, ?, ?);";   // ? - заменяет неизвестное поле или параметр через PreparedStatement
    private static final String INSERT_CAR = String.format("INSERT INTO cars(%s, %s, %s, %s) VALUES (?, ?, ?, ?);", Car.MAXSPEED, Car.MODEL, Car.YEAR, Car.DRIVER_ID);
    private static final String DELETE_CAR_BY_ID = String.format("DELETE FROM cars WHERE %s=?", Car.ID);
    private static final String UPDATE_CAR = String.format("UPDATE cars SET %s = ?, %s = ?, %s = ?  WHERE %s = ?;",
            Car.MODEL, Car.MAXSPEED, Car.YEAR, Car.ID);
    private Connection conn;
    private PreparedStatement pst = null;
    private Statement stmt = null;
    private ResultSet rs = null;

    public CarDAOH2Impl() {
        createTableIfNotExists();
    }

    @Override
    public void addcar(Car car) {

        try {
            conn = getInstance().getConnection();
            pst = conn.prepareStatement(INSERT_CAR);
            pst.setDouble(1, car.getMaxSpeed());    //задаем значения имена полей в таблице по счету ? в INSERT_CAR
            pst.setString(2, car.getModel());
            pst.setInt(3, car.getYear());
            pst.setInt(4, car.getDriver().getId());
            pst.execute();                        //запуск запроса
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            getInstance().closePreparedStatement(pst);
            getInstance().closeConnection(conn);
        }
    }

    @Override
    public List<Car> getAllCars() {
        List<Car> result = new ArrayList<>();
        try {
            conn = getInstance().getConnection();
            stmt = conn.createStatement();
            rs = stmt.executeQuery(GET_ALL_CARS);
            while (rs.next()) {
                Car car = new Car();
                car.setId(rs.getInt(Car.ID));
                car.setMaxSpeed(rs.getDouble(Car.MAXSPEED));
                car.setModel(rs.getString(Car.MODEL));
                car.setYear(rs.getInt(Car.YEAR));

                result.add(car);
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
    public void update2Car(Car car) {

    }

    @Override
    public void updateCar(Car car) {
        try {
            conn = getInstance().getConnection();
                    conn.setAutoCommit(false);   //отк автоматичи подтверждение транзакции ТРАНЗАКЦИЯ
                    pst = conn.prepareStatement(UPDATE_CAR);
                    pst.setString(1, car.getModel());
                    pst.setDouble(2, car.getMaxSpeed());
                    pst.setInt(3, car.getYear());
       //             pst.setInt(4, car.getDriver().getId());
                    pst.setInt(4, car.getId());
                    pst.execute();
               conn.commit();   //запускаем коммит         ТРАНЗАКЦИЯ
        } catch (SQLException e) {
            try {
                conn.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            e.printStackTrace();
        } finally {
            getInstance().closeResaultSet(rs);
            getInstance().closePreparedStatement(pst);
            getInstance().closeConnection(conn);
        }
    }

    @Override
    public void deleteCar(int carId) throws CarNotFound {
        try {
            conn = getInstance().getConnection();
            pst = conn.prepareStatement(DELETE_CAR_BY_ID);
            pst.setInt(1,carId);
        //    pst.execute();
            int result = pst.executeUpdate();
            if (result ==0){
                throw new CarNotFound();
            }
           pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            getInstance().closePreparedStatement(pst);
            getInstance().closeConnection(conn);
        }


    }



    private void createTableIfNotExists() {
        try {
            conn = getInstance().getConnection();
            stmt = conn.createStatement();
            stmt.execute(CREATE_DRIVER_TABLE);
            stmt.execute(CREATE_CAR_TABLE);

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            getInstance().closeStatement(stmt);
            getInstance().closeConnection(conn);
        }
    }
}
