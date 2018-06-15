package ua.ictloud.lessons.jdbch2.itcloud.controller;

import ua.ictloud.lessons.jdbch2.itcloud.exception.DriverLastNameUniqueExp;
import ua.ictloud.lessons.jdbch2.itcloud.exception.DriverNotFoundExp;
import ua.ictloud.lessons.jdbch2.itcloud.model.Driver;
import ua.ictloud.lessons.jdbch2.itcloud.service.DriverService;
import univerbig.controller.MainController;

import java.sql.SQLException;
import java.util.Scanner;

/**
 * Created by student on 15-Jun-18.
 */
public class DriverController {
    private static Driver instance;
    private DriverService driverService = new DriverService();

    public void startDriver() {
        showMessage();
        while (true) {
            mainMenu();
            makeChoice();
            System.out.println();
        }

    }

    private void showMessage() {
        System.out.println("****************");
        System.out.println("WOrk with Driver");
        System.out.println("****************");
        System.out.println();
    }


    private void mainMenu() {
        System.out.println("Make your choice:");
        System.out.println("1. Show list Drivers");
        System.out.println("2. Add new Driver");
        System.out.println("3. Update Driver");
        System.out.println("4. Remove Driver");
        System.out.println("0. Exit");
        System.out.print("Enter Value: ");
    }

    private void makeChoice() {
        Scanner s = new Scanner(System.in);
        int choice = s.nextInt();
        switch (choice) {
            case 1: {
                showListDrivers();
                break;
            }
            case 2: {
                addNewDriver();
                break;
            }
            case 3: {
                updateDriver();
                break;
            }
            case 4: {
                deleteDriver();
                break;
            }
            case 0: {
                System.out.println("Good by!");
                System.exit(1);
            }
            default: {
                System.out.println("You are stupid: wrong choice");
            }

        }
    }

    private void showListDrivers() {
        System.out.println(driverService.getAllDrivers());
    }

    private void addNewDriver() {
        Driver driver = enterDrivarInfo();
        try {
            driverService.addDriver(driver);
        } catch (DriverLastNameUniqueExp driverLastNameUniqueExp) {
            driverLastNameUniqueExp.getMessage();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void updateDriver() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID by who must be update");
        Driver driver = getInstance();
        driver = driverService.getAllDrivers().get(sc.nextInt());


        driver = enterDrivarInfo();

// НЕДОДЕЛАЛ !!!!!
        try {
            driverService.updateDriver(driver);
        } catch (DriverLastNameUniqueExp driverLastNameUniqueExp) {
            driverLastNameUniqueExp.getMessage();
        }

    }

    private void deleteDriver() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID by who must be deleted");
        try {
            driverService.deleteDriver(sc.nextInt());
        } catch (DriverNotFoundExp driverNotFoundExp) {
            driverNotFoundExp.getMessage();
        }
    }


    private Driver enterDrivarInfo() {
        Driver driver = getInstance();
        Scanner s = new Scanner(System.in);
        System.out.print("Enter First Name: ");
        String firstName = s.nextLine();
        System.out.print("Enter Last Name: ");
        String lastName = s.nextLine();
        System.out.print("Enter Experience: ");
        int exp = s.nextInt();
        System.out.print("Enter Category: ");
        String tmp = s.nextLine();
        StringBuilder category = new StringBuilder(tmp);
        driver.setFirstName(firstName);
        driver.setLastName(lastName);
        driver.setExp(exp);
        driver.setCategory(category);
        return driver;
    }


    private static Driver getInstance() {
        if (instance == null) {
            instance = new Driver();
        }
        return instance;
    }

}
