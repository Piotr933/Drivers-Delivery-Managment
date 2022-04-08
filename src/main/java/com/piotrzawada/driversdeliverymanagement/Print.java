package com.piotrzawada.driversdeliverymanagement;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Print {
    final String driversHeader = "drivers";
    final String routesHeader = "routes";
    final String rosterHeader = "roster";

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

    void printRoster(Roster roster) {
        LinkedHashMap<Route, Driver> rosterMap = roster.getRoster();
        printHeader(rosterHeader);
        for (Route route : rosterMap.keySet()) {
            System.out.println();
            System.out.printf("%-13s",route.id);
            System.out.printf("%-13s",rosterMap.get(route).name);
        }
        System.out.println();
    }

    private void printHeader(String header) {

        switch (header) {
            case "drivers" -> System.out.println("Driver ID    Name         Routes       Location     Status");
            case "routes" -> System.out.println("Run ID       FirstDrop    LastDrop     Stops");
            case "roster" -> System.out.println("Run ID    Driver Name");
            default -> System.out.println("Error - Something goes wrong");
        }
    }
}
