package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class FindRoute {
    // Declaring the instance variables that will be used in the class.
    private static ArrayList<Route> routes = ListOfRoutes.routes("Project Files/routes.csv");
    private static HashMap<Integer, Airport> airports = ListOfAirports.mapOfAirports("Project Files/airports.csv");
    private static ArrayList<String> paths = TextManager.readOutput("Project Files/input.csv");
    private static String[] start = paths.get(0).split(",");
    private static String[] destination = paths.get(1).split(",");
    private static String startCity = start[0];
    private static String startCountry = start[1];
    private static String destinationCity = destination[0];
    private static ArrayList<Route> succRoutes = new ArrayList<>();
    // private static String destinationCountry = destination[1];
    private static Route desRoute;

    /**
     * Return the airport object that matches the city and country passed in.
     * 
     * @param city    The city of the airport
     * @param country The country of the airport
     * @return The airport object is being returned.
     */
    public static Airport sourceAirport(String city, String country) {
        Airport airport = null;
        for (Airport airpt : airports.values()) {
            if (airpt.getAirportCity().equals(city)) {
                airport = airpt;
            }
        }
        return airport;
    }

    public static ArrayList<Route>getSuccessRoutes() {    
        for (Airport airport : breadthFirstSearch()) {
            for (Route route : routes) {
                if ((route.getSourceAirportID() == airport.getAirportID())) {
                    succRoutes.add(route);
                    break;
                }
            }
        }
        return succRoutes;
    }
    /**
     * This function takes in a city and country and returns the airport object that
     * matches the city
     * and country
     * 
     * @param city    The city of the destination airport
     * @param country The country of the airport
     * @return The airport object is being returned.
     */
    public static Airport destinationAirport(String city, String country) {
        Airport airport = null;
        for (Airport airpt : airports.values()) {
            if (airpt.getAirportCity().equals(city)) {
                airport = airpt;
            }
        }
        return airport;
    }

    /**
     * Given an airport, return a list of all airports that can be reached from that
     * airport
     * 
     * @param airport The airport whose successors you want to find
     * @return The successors of the airport.
     */
    public static ArrayList<Airport> successors(Airport airport) {
        ArrayList<Airport> succAirports = new ArrayList<>();
        for (Route route : routes) {
            if (route.getSourceAirportID() == (airport.getAirportID())) {
                Airport suc_airport = airports.get(route.getDestinationAirportID());
                if (suc_airport != null && route != null)
                    succAirports.add(suc_airport);
            }
        }
        return succAirports;
    }

    public static Route dRoute() {
        return desRoute;
    }

    /**
     * This function checks if the airport is a destination airport
     * 
     * @param airport the airport that is being checked to see if it is a
     *                destination
     * @return A boolean value.
     */
    public static boolean isDestination(Airport airport) {
        boolean checker = false;
        for (Airport airpt : airports.values()) {
            if (airpt.getAirportCity().equals(destinationCity)) {
                for (Route route : routes) {
                    if ((route.getSourceAirportID() == airport.getAirportID()) &&
                            route.getDestinationAirportID() == airpt.getAirportID()) {
                                desRoute = route;
                        checker = true;
                    }
                }
            }
        }
        return checker;
    }

    /**
     * We start with a source airport, and then we add it to a queue. We then check
     * if the source
     * airport is the destination airport. If it is, we return the solution path. If
     * it isn't, we add
     * the source airport to a set of explored airports. We then loop through the
     * successors of the
     * source airport, and add them to the queue if they aren't in the queue or the
     * set of explored
     * airports. We then check if the successor is the destination airport. If it
     * is, we return the
     * solution path. If it isn't, we add the successor to the queue
     * 
     * @return The solution path is being returned.
     */
    public static ArrayList<Airport> breadthFirstSearch() {
        Airport airport = sourceAirport(startCity, startCountry);
        Node node = new Node(airport);

        if (isDestination(airport)) {
            return node.solutionPath();
        } else {
            Queue<Node> frontier = new LinkedList<>();
            frontier.add(node);
            HashSet<Airport> explored = new HashSet<>();

            while (!frontier.isEmpty()) {
                Node exploredNode = frontier.remove();
                explored.add(exploredNode.getState());

                ArrayList<Airport> successors = successors(exploredNode.getState());
                for (int index = 0; index < successors.size(); index++) {
                    Node child = new Node(successors.get(index), exploredNode);
                    if ((!explored.contains(child.getState())) &&
                            (!frontier.contains(child))) {
                        if (isDestination(child.getState())) {
                            return child.solutionPath();
                        } else {
                            frontier.add(child);
                        }
                    }
                }
            }
            return null;
        }
    } 
}
