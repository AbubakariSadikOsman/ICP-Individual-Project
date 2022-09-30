package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ListOfRoutes {
    /**
     * This function takes a filepath as a string and returns an ArrayList of Route
     * objects
     * 
     * @param filepath the path to the file containing the routes
     * @return An ArrayList of Route objects.
     */
    public static ArrayList<Route> routes(String filepath) {
        ArrayList<Route> listOfRoutes = new ArrayList<>();
        try {
            File file = new File(filepath);
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                String[] route = reader.nextLine().split(",");
                listOfRoutes.add(
                        new Route(route));
            }
            reader.close();
        } catch (FileNotFoundException fnfe) {
            System.out.println(fnfe.getMessage());
        }
        return listOfRoutes;
    }
}
