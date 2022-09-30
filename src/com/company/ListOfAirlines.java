package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

/**
 * It reads in a CSV file, creates an ArrayList of Airline objects,
 * and returns the map of airlines
 */
public class ListOfAirlines {

    /**
     * This function takes a filename as a parameter and returns a HashMap of
     * Airline objects
     * 
     * @param filename the name of the file to be read
     * @return A HashMap of Airline objects.
     */
    public static HashMap<Integer, Airline> mapOfAirlines(String filename) {
        HashMap<Integer, Airline> airlines = new HashMap<>();
        try {
            File file = new File(filename);
            Scanner myReader = new Scanner(file, "UTF-8");
            while (myReader.hasNextLine()) {
                String[] airline = myReader.nextLine().split(",");
                airlines.put(Integer.parseInt(airline[0]),
                        new Airline(
                                Integer.parseInt(airline[0]),
                                airline[1], airline[2], airline[3],
                                airline[4], airline[5], airline[6],
                                airline[7]));
            }
            myReader.close();
        } catch (FileNotFoundException fnfe) {
            System.out.println(fnfe.getMessage());
        }
        return airlines;
    }
}
