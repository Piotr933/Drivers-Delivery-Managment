package com.piotrzawada.driversdeliverymanagement;

public class Route {
    final String id, firstLoc, lastLoc, stops;

    public Route(String id, String firstLoc, String lastLoc, String stops) {
        this.id = id;
        this.firstLoc = firstLoc;
        this.lastLoc = lastLoc;
        this.stops = stops;
    }

    public String getId() {
        return id;
    }

    public String getFirstLoc() {
        return firstLoc;
    }

    public String getLastLoc() {
        return lastLoc;
    }

    public String getStops() {
        return stops;
    }
    @Override
    public String toString() {
        return "Route{" +
                "id='" + id + '\'' +
                ", firstLoc='" + firstLoc + '\'' +
                ", lastLoc='" + lastLoc + '\'' +
                ", stops='" + stops + '\'' +
                '}';
    }
}
