package ua.ictloud.lessons.jdbch2.itcloud.dao.impl;

import ua.ictloud.lessons.jdbch2.itcloud.dao.CarDAO;
import ua.ictloud.lessons.jdbch2.itcloud.model.Car;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static ua.ictloud.lessons.jdbch2.itcloud.dao.impl.ConnectionFactory.getInstance;

/**
 * Created by student on 08-Jun-18.
 */
public class CarDAOH2Impl implements CarDAO {
    private static final String CREATE_CAR_TABLE = "CREATE TABLE IF NOT EXISTS cars (" +
            Car.ID + " INT(11) PRIMARY KEY AUTO_INCREMENT, " +
            Car.MAXSPEED + " DOUBLE(11), " +
            Car.MODEL + " VARCHAR(20), " +
            Car.YEAR + " INT(4)" +
            ");";
    private static final String GET_ALL_CARS = "SELECT * FROM cars;";
    //  private static final String INSERT_CAR = "INSERT INTO cars(" + Car.MAXSPEED + ", " + Car.MODEL + ", " + Car.YEAR + ") VALUES (?, ?, ?);";   // ? - заменяет неизвестное поле или параметр через PreparedStatement
    private static final String INSERT_CAR = String.format("INSERT INTO cars(%s, %s, %s) VALUES (?, ?, ?);", Car.MAXSPEED, Car.MODEL, Car.YEAR);

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

    }

    private void createTableIfNotExists() {
        try {
            conn = getInstance().getConnection();
            stmt = conn.createStatement();
            stmt.execute(CREATE_CAR_TABLE);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            getInstance().closeStatement(stmt);
            getInstance().closeConnection(conn);
        }
    }
}
