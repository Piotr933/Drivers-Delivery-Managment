package com.piotrzawada.driversdeliverymanagement;

import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;



import java.io.IOException;
import java.util.ArrayList;

public class LoadData {
    CSVParser driversParser;
    CSVParser routesParser;

    public LoadData(String driversData, String routesData) throws IOException {
        driversParser = ReadCsvFile.getCsvParser(driversData);
        routesParser = ReadCsvFile.getCsvParser(routesData);
    }

    public ArrayList loadDriversInfo() {
        final int driverID = 0;
        final int driverName = 1;
        final int routeKnowledge = 2;
        final int address = 3;
        final int status = 4;
        ArrayList<Driver> drivers = new ArrayList<Driver>();
        for (CSVRecord record : driversParser) {
            drivers.add(new Driver(record.get(driverID), record.get(driverName), record.get(routeKnowledge),
                    record.get(address), record.get(status)));
        }
        return drivers;
    }


    public ArrayList loadRoutesInfo() {
        final int routeID = 0;
        final int firstLoc = 1;
        final int lastLoc = 2;
        final int nrDrops = 3;
        ArrayList<Route> routes = new ArrayList<Route>();
        for (CSVRecord record : routesParser) {
            routes.add(new Route(record.get(routeID),record.get(firstLoc),record.get(lastLoc),record.get(nrDrops)));
        }
        return routes;
    }
}
