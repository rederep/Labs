package univerbig.controller;

import univerbig.domain.Administrator;
import univerbig.service.AdministratorService;

import java.util.Scanner;

/**
 * Created by student on 27-Apr-18.
 */
public class MainController {
    private AdministratorService service = new AdministratorService();

    public void doWork() {
        showHelloMMessage();
        while (true) {
            showMenu();
            makeChoice();
            System.out.println();
        }
    }

    private void showHelloMMessage() {
        System.out.println("*****************");
        System.out.println("University pizdec");
        System.out.println("*****************");
        System.out.println();
    }

    private void showMenu() {
        System.out.println("Make your choice:");
        System.out.println("1. Show list of Administrator");
        System.out.println("2. Add new Administrator");
        System.out.println("3. Remove Administrator");
        System.out.println("0. Exit");
        System.out.print("Enter Value: ");

    }

    public void makeChoice() {
        Scanner s = new Scanner(System.in);
        int  choice = s.nextInt();

        switch (choice) {
            case 1: {
                showListAdministrators();
                break;
            }
            case 2: {
                addNewAdministrators();
                break;
            }
            case 3: {
                deleteAdministrator();
                break;
            }
            case 0: {
                System.out.println("Fuck off!");
                System.exit(1);
            }
            default: {
                System.out.println("You are stupid: wrong choice");
            }

        }
    }

    private void showListAdministrators() {
        service.printAdministrators(service.getAllAdministrators());
    }

    private void addNewAdministrators() {
        Administrator administrator = new Administrator();
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first Name: ");
        String firstName = s.nextLine();
        System.out.print("Enter last Name: ");
        String lastName = s.nextLine();
        System.out.print("Enter meddle Name: ");
        String middletName = s.nextLine();
        System.out.print("Enter typing speed: ");
        int typingSpeed = s.nextInt();
        administrator.setFirstNAme(firstName);
        administrator.setLastNAme(lastName);
        administrator.setMiddleNAme(middletName);
        administrator.setTypingSpeed(typingSpeed);

        service.addAdministrator(administrator);
    }

    private void deleteAdministrator() {
        System.out.println("NO-NO-NO WTF");
    }
}
