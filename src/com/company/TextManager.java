package com.company;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class TextManager {
    /**
     * It creates a file called filename and writes the strings "Accra, Ghana" and
     * "Winnipeg, Canada"
     * to it
     * 
     * @param filename The name of the file to write to.
     */

    public static void inputTextWriter(String filename) {
        try {
            BufferedWriter myWriter = new BufferedWriter(new FileWriter(filename));
            Scanner input = new Scanner(System.in);

            System.out.println("Enter the cities and countries separated by ','");
            String init_position = input.nextLine();
            String destination = input.nextLine();
            myWriter.write(init_position + "\n");
            myWriter.write(destination);
            input.close();
            myWriter.close();
        } catch (IOException e) {
            System.out.println(e.getStackTrace());
        }
    }

    /**
     * It reads the contents of a file and returns an array of strings, where each
     * string is a line
     * from the file
     * 
     * @param filename the name of the file to read from
     * @return An ArrayList of Strings
     */
    public static ArrayList<String> readOutput(String filename) {
        ArrayList<String> output = new ArrayList<>();
        try {
            File file = new File(filename);
            Scanner myReader = new Scanner(file);
            while (myReader.hasNextLine()) {
                output.add(myReader.nextLine());
            }
            myReader.close();

        } catch (FileNotFoundException fnfe) {
            System.out.println(fnfe.getMessage());
        }
        return output;
    }

    /**
     * This function writes the final output to a file
     * 
     * @param filepath the path to the file you want to write to
     */
    public static void writeFinalOutputToFile(String filepath) {
        ArrayList<Airport> visitedAiports = FindRoute.breadthFirstSearch();
        try {
            BufferedWriter myWriter = new BufferedWriter(new FileWriter(filepath));
            // ArrayList<Airport> revArrayList = new ArrayList<>();
            // for (int i = visitedAiports.size() - 1; i >= 0; i--) {
            //     revArrayList.add(visitedAiports.get(i));
            // }

            // int i = 0;
            // int stops = 0;
            // while (i < revArrayList.size() - 1) {
            //     myWriter.write(revArrayList.get(i).getAirportICAO()
            //             + " from " + revArrayList.get(i).getAirportIATA() + " to "
            //             + revArrayList.get(i + 1).getAirportIATA()
            //             + " 0 stops\n");
            //     i++;
            // }
            ArrayList<Route> visitedRoutes = FindRoute.getSuccessRoutes();
            ArrayList<Route> revArrayList = new ArrayList<>();
            for (int i = visitedRoutes.size() - 1; i >= 0; i--) {
                revArrayList.add(visitedRoutes.get(i));
            }

            int i = 0;
            int stops = 0;
            String a = "";
            
            while (i < revArrayList.size()-1) {
                myWriter.write(revArrayList.get(i).getAirlineCode()
                        + " from " + revArrayList.get(i).getSourceAirport() + " to "
                        + revArrayList.get(i).getDestinationAirport() + " "
                        + Integer.toString(revArrayList.get(i).getStops()) +" stops\n");
                        stops += revArrayList.get(i).getStops();
                a = revArrayList.get(i).getDestinationAirport();
                i++;
            }
            myWriter.write(FindRoute.dRoute().getAirlineCode()
                        + " from " + a + " to "
                        + FindRoute.dRoute().getDestinationAirport() + " "
                        + Integer.toString(FindRoute.dRoute().getStops()) +" stops\n");

            myWriter.write("Total flights: " + Integer.toString(visitedAiports.size()) + "\n");
            myWriter.write("Total additional stops: " + Integer.toString(FindRoute.dRoute().getStops() + stops));
            myWriter.close();
        } catch (IOException e) {
            System.out.println(e.getStackTrace());
        }
    }

}