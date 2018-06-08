package ua.ictloud.lessons.jdbch2.itcloud.dao;


import ua.ictloud.lessons.jdbch2.itcloud.model.Car;

import java.util.List;

/**
 * Created by student on 08-Jun-18.
 */
public interface CarDAO {
void addcar (Car car);
    List<Car> getAllCars();
    void update2Car(Car car);
    void updateCar(Car car);
}
