package com.piotrzawada.driversdeliverymanagement;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.ArrayList;
import java.util.Scanner;
@Configuration
public class Menu {
    ArrayList<Driver> driversData;
    ArrayList<Route> routesData;

    public Menu(ArrayList<Driver> driversData, ArrayList<Route> routesData) {
        this.driversData = driversData;
        this.routesData = routesData;
    }
    @Bean
    public void simpleMenu() {
        Scanner scanner = new Scanner(System.in);

        for (;;) {
            System.out.println();
            System.out.println("Select one of below options:");
            printOptions();
            String option = scanner.nextLine();
            Print print = new Print();
            switch (option) {
                case  "1":
                    print.printDrivers(driversData);
                    break;

                case  "2":
                    print.printRoutes(routesData);
                    break;

                case  "3":
                    print.printAvailableDrivers(driversData);
                    break;

                case  "4":
                    System.out.println("Under Construction");
                    break;

                case  "5":
                    return;

                default:
                    System.out.println("Wrong Input");
            }
            System.out.println();
            System.out.println("For back to Menu press any key and confirm by ENTER");
            scanner.nextLine();

        }
    }

    public void printOptions() {
        System.out.println("1. All Drivers");
        System.out.println("2. All Routes");
        System.out.println("3. Available  Drivers");
        System.out.println("4. Create and Show Roster");
        System.out.println("5. Exit");
    }
}
