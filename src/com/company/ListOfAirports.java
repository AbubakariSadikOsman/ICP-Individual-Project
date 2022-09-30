package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.HashMap;

public class ListOfAirports {
    /**
     * This function takes in a filepath and returns a HashMap of Airport objects
     * with the airport ID
     * as the key
     * 
     * @param filepath The path to the file containing the airport data.
     * @return A HashMap of Airport objects.
     */
    public static HashMap<Integer, Airport> mapOfAirports(String filepath) {
        HashMap<Integer, Airport> airports = new HashMap<>();

        try {
            File file = new File(filepath);
            Scanner myReader = new Scanner(file, "UTF-8");
            while (myReader.hasNextLine()) {
                String[] airport = myReader.nextLine().split(",");
                airports.put(Integer.parseInt(airport[0]),
                        new Airport(
                                Integer.parseInt(airport[0]),
                                airport[1], airport[2], airport[3],
                                airport[4], airport[5], airport[6],
                                airport[7]));
            }
            myReader.close();
        } catch (FileNotFoundException fnfe) {
            System.out.println("File Not Found Error: File path might not exist or not in current directory");
        }
        return airports;
    }
}
