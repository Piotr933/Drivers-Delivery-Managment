package com.piotrzawada.driversdeliverymanagement;

public class Driver {
    final String id, name, runs, location, status;

    public Driver(String id, String name, String runs, String location, String status) {
        this.id = id;
        this.name = name;
        this.runs = runs;
        this.location = location;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRuns() {
        return runs;
    }

    public String getLocation() {
        return location;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", runs='" + runs + '\'' +
                ", location='" + location + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
