package com.piotrzawada.driversdeliverymanagement;

import java.util.ArrayList;

public class Print {
    final String driversHeader = "drivers";
    final String routesHeader = "routes";

    void printDrivers(ArrayList<Driver> drivers) {
        printHeader(driversHeader);
        for (Driver driver: drivers) {
            System.out.println();
            System.out.printf("%-13s",driver.id);
            System.out.printf("%-13s",driver.name);
            System.out.printf("%-13s",driver.runs);
            System.out.printf("%-13s",driver.location);
            System.out.printf("%-13s",driver.status);
        }
    }

    void printRoutes(ArrayList<Route> routes) {
        printHeader(routesHeader);
        for (Route route : routes) {
            System.out.println();
            System.out.printf("%-13s", route.id);
            System.out.printf("%-13s", route.firstLoc);
            System.out.printf("%-13s", route.lastLoc);
            System.out.printf("%-13s", route.stops);
        }
    }

    void printAvailableDrivers(ArrayList<Driver> drivers){
        printHeader(driversHeader);
        for (Driver driver : drivers) {
            if (driver.status.equals("available")){
                System.out.println();
                System.out.printf("%-13s",driver.id);
                System.out.printf("%-13s",driver.name);
                System.out.printf("%-13s",driver.runs);
                System.out.printf("%-13s",driver.location);
                System.out.printf("%-13s",driver.status);
            }
        }
    }

    private void printHeader(String header) {
        if (header.equals("drivers")) {
            System.out.println("Driver ID    Name         Routes       Location     Status");
        } else {
            System.out.println("Run ID       FirstDrop    LastDrop     Stops");
        }
        System.out.print("---------------------------------------------------------------------------");
    }
}
