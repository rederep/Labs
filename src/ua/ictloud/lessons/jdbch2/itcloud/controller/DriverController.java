package ua.ictloud.lessons.jdbch2.itcloud.controller;

import sun.security.util.Length;
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
        Driver driverMain = driverService.getAllDrivers().get(sc.nextInt()-1);
        System.out.println("Update Driver: "+ driverMain.toString());
        Driver driverUpd = enterDrivarInfo();
        if (driverUpd.getLastName().length()!=0){
            driverMain.setLastName(driverUpd.getLastName());
        }
        if (driverUpd.getFirstName().length()!=0){
            driverMain.setFirstName(driverUpd.getFirstName());
        }
        if (driverUpd.getCategory().length()!=0){
            driverMain.setCategory(driverUpd.getCategory());
        }
        if (driverUpd.getExp()!=driverMain.getExp() && driverUpd.getExp()!=0){
            driverMain.setExp(driverUpd.getExp());
        }
        try {
            System.out.println("Update driver too: "+ driverMain.toString());
            driverService.updateDriver(driverMain);
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
      //  Driver driver = new Driver();
        Scanner s = new Scanner(System.in);
        System.out.print("Enter First Name: ");
        String firstName = s.nextLine();
        System.out.print("Enter Last Name: ");
        String lastName = s.nextLine();
        System.out.print("Enter Category: ");
        String tmp = s.nextLine();
        StringBuilder category = new StringBuilder(tmp);
        System.out.print("Enter Experience: ");
        int exp = 0;
        exp = s.nextInt();
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
