package com.company;

public class Airline {
    // Declaring the variables.

    /**
     * @param airlineId
     * @param name
     * @param alias
     * @param IATA
     * @param ICAO
     * @param callsign
     * @param country
     * @param active
     */
    private int airlineId;
    private String name;
    private String alias;
    private String IATA;
    private String ICAO;
    private String callsign;
    private String country;
    private String active;

    // A constructor.
    public Airline(
            int airlineId, String airlineName,
            String airlineAlias, String IATA,
            String ICAO, String callsign,
            String country, String active) {
        this.airlineId = airlineId;
        this.name = airlineName;
        this.alias = airlineAlias;
        this.IATA = IATA;
        this.ICAO = ICAO;
        this.callsign = callsign;
        this.country = country;
        this.active = active;
    }

    // Setters.

    /**
     * This function sets the airline ID to the given ID.
     * 
     * @param id The id of the airline
     */
    public void setAirlineID(int id) {
        this.airlineId = id;
    }

    /**
     * This function sets the name of the airline.
     * 
     * @param name The name of the airline.
     */
    public void setAirlineName(String name) {
        this.name = name;
    }

    /**
     * This function sets the alias of the airline
     * 
     * @param alias The alias of the airline.
     */
    public void setAirlineAlias(String alias) {
        this.alias = alias;
    }

    /**
     * This function sets the IATA code of the airline
     * 
     * @param IATA The IATA code of the airline.
     */
    public void setAirlineIATA(String IATA) {
        this.IATA = IATA;
    }

    /**
     * This function sets the ICAO of the airline
     * 
     * @param ICAO The ICAO code of the airline.
     */
    public void setAirlineICAO(String ICAO) {
        this.ICAO = ICAO;
    }

    /**
     * This function sets the airline callsign.
     * 
     * @param callsign The callsign of the airline.
     */
    public void setAirlineCallsign(String callsign) {
        this.callsign = callsign;
    }

    /**
     * This function sets the country of the airline.
     * 
     * @param country The country of the airline
     */
    public void setAirlineCountry(String country) {
        this.country = country;
    }

    /**
     * This function sets the active status of the airline
     * 
     * @param active This is a boolean value that indicates whether the airline is
     *               active or not.
     */
    public void setAirlineActive(String active) {
        this.active = active;
    }

    // Getters

    /**
     * This function returns the airline ID of the flight
     * 
     * @return The airline ID
     */
    public int getAirlineID() {
        return this.airlineId;
    }

    /**
     * This function returns the name of the airline
     * 
     * @return The name of the airline.
     */
    public String getAirlineName() {
        return this.name;
    }

    /**
     * This function returns the alias of the airline
     * 
     * @return The alias of the airline.
     */
    public String getAirlineAlias() {
        return this.alias;
    }

    /**
     * This function returns the IATA code of the airline
     * 
     * @return The IATA code of the airline.
     */
    public String getAirlineIATA() {
        return this.IATA;
    }

    /**
     * This function returns the ICAO code of the airline
     * 
     * @return The ICAO code of the airline.
     */
    public String getAirlineICAO() {
        return this.ICAO;
    }

    /**
     * This function returns the callsign of the airline
     * 
     * @return The callsign of the airline.
     */
    public String getAirlineCallsign() {
        return this.callsign;
    }

    /**
     * This function returns the country of the airline
     * 
     * @return The country of the airline.
     */
    public String getAirlineCountry() {
        return this.country;
    }

    /**
     * This function returns the active status of the airline
     * 
     * @return The active status of the airline.
     */
    public String getAirlineActive() {
        return this.active;
    }

}