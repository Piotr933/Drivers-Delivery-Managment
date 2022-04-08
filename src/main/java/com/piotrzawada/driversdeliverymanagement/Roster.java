package com.piotrzawada.driversdeliverymanagement;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Roster {
    LinkedHashMap <Route, Driver> roster;
    ArrayList<Route> routesData;
    ArrayList<Driver> driversData;


    public Roster(ArrayList<Route> routesData, ArrayList<Driver> driversData) {
        this.roster = new LinkedHashMap<>();
        this.routesData = routesData;
        this.driversData = driversData;
        buildRoster();
    }

    public LinkedHashMap<Route, Driver> getRoster() {
        return roster;
    }

    public void setRoster(LinkedHashMap<Route, Driver> roster) {
        this.roster = roster;
    }

    public LinkedHashMap<Route, Driver> buildRoster() {
        ArrayList<Driver> availableDrivers = getAvailableDrivers(driversData);

        for (Route route: routesData) {
            Driver driver = assignDriver(availableDrivers,route);
            roster.put(route,driver);
            availableDrivers.remove(driver);
        }
        if (!availableDrivers.isEmpty()) {
            int c = 0;
            for (Driver driver: availableDrivers) {
             c++;
             roster.put(new Route("Spare " + c, "n/a",  "n/a", "n/a" ), driver);
            }
        }
        return roster;
    }

    private ArrayList<Driver> getAvailableDrivers(ArrayList<Driver> driversData) {
        ArrayList<Driver> list = new ArrayList<>();
        for (Driver driver : driversData) {
            if (driver.status.equals("available")) {
                list.add(driver);
            }
        }
        return list;
    }

    private Driver assignDriver(ArrayList<Driver> availableDrivers, Route route) {
        for (Driver driver : availableDrivers) {
            if (driver.runs.contains(route.id) && driver.location.equals(route.lastLoc)) {
                return driver;
            }
        }
        for (Driver driver : availableDrivers) {
            if (driver.runs.contains(route.id)) {
                return driver;
            }
        }
        for (Driver driver : availableDrivers) {
            if (driver.location.equals(route.lastLoc)) {
                return driver;
            }
        }
        for (Driver driver : availableDrivers) {
            return driver;
        }
        return new Driver("n/a","n/a","n/a","n/a","n/a");
       }

}


