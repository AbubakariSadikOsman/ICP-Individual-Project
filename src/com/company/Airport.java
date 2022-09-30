package com.company;

public class Airport {
    // Declaring the variables.

    /**
     * @param airportID
     * @param airportName
     * @param city
     * @param country
     * @param IATA
     * @param ICAO
     * @param latitude
     * @param longitude
     */
    private int airportID;
    private String airportName;
    private String city;
    private String country;
    private String IATA;
    private String ICAO;
    private String latitude;
    private String longitude;

    // A constructor.
    public Airport(
            int airportID, String airportName,
            String city, String country,
            String IATA, String ICAO,
            String latitude, String longitude) {
        this.airportID = airportID;
        this.airportName = airportName;
        this.city = city;
        this.country = country;
        this.IATA = IATA;
        this.ICAO = ICAO;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    // Setters

    /**
     * This function sets the airportID variable to the value of the id parameter.
     * 
     * @param id The ID of the airport
     */
    public void setAirportID(int id) {
        this.airportID = id;
    }

    /**
     * This function sets the airport name to the value of the parameter name.
     * 
     * @param name The name of the airport.
     */
    public void setAirportName(String name) {
        this.airportName = name;
    }

    /**
     * This function sets the city of the airport.
     * 
     * @param city The city where the airport is located.
     */
    public void setAirportCity(String city) {
        this.city = city;
    }

    /**
     * This function sets the country of the airport.
     * 
     * @param country The country of the airport
     */
    public void setAirportCountry(String country) {
        this.country = country;
    }

    /**
     * This function sets the IATA code of the airport
     * 
     * @param IATA The IATA code of the airport.
     */
    public void setAirportIATA(String IATA) {
        this.IATA = IATA;
    }

    /**
     * This function sets the ICAO of the airport
     * 
     * @param ICAO The ICAO code of the airport.
     */
    public void setAirportICAO(String ICAO) {
        this.ICAO = ICAO;
    }

    /**
     * This function sets the latitude of the airport
     * 
     * @param latitude The latitude of the airport
     */
    public void setAirportLatitude(String latitude) {
        this.latitude = latitude;
    }

    /**
     * This function sets the longitude of the airport.
     * 
     * @param longitude The longitude of the airport
     */
    public void setAirportLongitude(String longitude) {
        this.longitude = longitude;
    }

    // Getters

    /**
     * This function returns the airportID of the airport
     * 
     * @return The airportID
     */
    public int getAirportID() {
        return this.airportID;
    }

    /**
     * This function returns the name of the airport
     * 
     * @return The airport name.
     */
    public String getAirportName() {
        return this.airportName;
    }

    /**
     * This function returns the city of the airport.
     * 
     * @return The city of the airport.
     */
    public String getAirportCity() {
        return this.city;
    }

    /**
     * This function returns the country of the airport
     * 
     * @return The country of the airport.
     */
    public String getAirportCountry() {
        return this.country;
    }

    /**
     * This function returns the IATA code of the airport.
     * 
     * @return The IATA code of the airport.
     */
    public String getAirportIATA() {
        return this.IATA;
    }

    /**
     * This function returns the ICAO code of the airport
     * 
     * @return The ICAO code of the airport.
     */
    public String getAirportICAO() {
        return this.ICAO;
    }

    /**
     * If the latitude is not a number, set it to 0.00 and return it.
     * 
     * @return The latitude of the airport.
     */
    public double getAirportLatitude() {
        try {
            return Double.parseDouble(this.latitude);
        } catch (NumberFormatException nfe) {
            // System.out.println(nfe.getStackTrace());
            this.latitude = "0.00";
            return Double.parseDouble(this.latitude);
        }
    }

    /**
     * If the longitude is not a number, set it to 0.00 and return it
     * 
     * @return The longitude of the airport.
     */
    public double getAirportLongitude() {
        try {
            return Double.parseDouble(this.longitude);
        } catch (NumberFormatException nfe) {
            // System.out.println(nfe.getStackTrace());
            this.longitude = "0.00";
            return Double.parseDouble(this.longitude);
        }
    }
}
