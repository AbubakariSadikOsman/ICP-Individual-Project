package com.company;

public class Route {
    // Declaring the instance variables.
    /**
     * @param airlineCode
     * @param airlineID
     * @param sourceAirport
     * @param sourceAirportID
     * @param destinationAirport
     * @param destinationAirportID
     * @param codeshare
     * @param stops
     */
    private String airlineCode;
    private int airlineID;
    private String sourceAirport;
    private int sourceAirportID;
    private String destinationAirport;
    private int destinationAirportID;
    private String codeshare;
    private int stops;
    private String equipment;

    // A constructor.
    public Route(String[] routeReadLine) {
        this.airlineCode = routeReadLine[0];
        this.airlineID = Integer.parseInt(routeReadLine[1].contains("N") ? "0" : routeReadLine[1]);
        this.sourceAirport = routeReadLine[2];
        this.sourceAirportID = Integer.parseInt(routeReadLine[3].contains("N") ? "0" : routeReadLine[3]);
        this.destinationAirport = routeReadLine[4];
        this.destinationAirportID = Integer.parseInt(routeReadLine[5].contains("N") ? "0" : routeReadLine[5]);
        this.codeshare = routeReadLine[6].equals("") ? "N" : codeshare;
        this.stops = Integer.parseInt(routeReadLine[7].contains("N") ? "0" : routeReadLine[7]);
        this.equipment = routeReadLine[7];
    }

    // Getters

    /**
     * This function returns the airline code of the flight
     * 
     * @return The airlineCode
     */
    public String getAirlineCode() {
        return this.airlineCode;
    }

    /**
     * This function returns the airlineID of the flight
     * 
     * @return The airlineID
     */
    public int getAirlineID() {
        return this.airlineID;
    }

    /**
     * This function returns the source airport of the flight
     * 
     * @return The sourceAirport
     */
    public String getSourceAirport() {
        return this.sourceAirport;
    }

    /**
     * This function returns the source airport ID of the flight
     * 
     * @return The sourceAirportID
     */
    public int getSourceAirportID() {
        return this.sourceAirportID;
    }

    /**
     * This function returns the destination airport of the flight
     * 
     * @return The destination airport.
     */
    public String getDestinationAirport() {
        return this.destinationAirport;
    }

    /**
     * This function returns the destination airport ID of the flight
     * 
     * @return The destinationAirportID
     */
    public int getDestinationAirportID() {
        return this.destinationAirportID;
    }

    /**
     * This function returns the codeshare of the flight
     * 
     * @return The codeshare
     */
    public String getCodeShare() {
        return this.codeshare;
    }

    /**
     * This function returns the number of stops.
     * 
     * @return The number of stops
     */
    public int getStops() {
        return this.stops;
    }

    public String getEquipment() {
        return this.equipment;
    }

}
