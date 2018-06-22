package ua.ictloud.lessons.jdbch2.itcloud.dto;

import ua.ictloud.lessons.jdbch2.itcloud.model.Car;
import ua.ictloud.lessons.jdbch2.itcloud.model.Driver;

import java.util.ArrayList;
import java.util.List;
                                //просто хранит информацию для удобного отображения
                                //в этом классе (DriverDTO) можно хранить в методы  toDTO а fromDTO только в слое service
public class DriverDTO {
    private  int id;
    private String firstName;
    private String lastName;

    private List<String> cars;    //лист моделей авто

    public static DriverDTO toDTO(Driver driver){
        DriverDTO driverDTO = new DriverDTO();
        driverDTO.firstName = driver.getFirstName();
        driverDTO.id = driver.getId();
        driverDTO.lastName = driver.getLastName();
        driverDTO.cars = new ArrayList<>();

        if (driver.getCars()!=null){
            for (Car car : driver.getCars()) {
                driverDTO.cars.add(car.getModel());
            }
        }

        return driverDTO;
    }

    @Override
    public String toString() {
        return "DriverDTO{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", cars=" + cars +
                '}';
    }
}

