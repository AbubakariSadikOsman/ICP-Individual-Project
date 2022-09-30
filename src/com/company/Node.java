package com.company;

import java.util.ArrayList;

/**
 * The Node class is used to create a node object that contains an airport
 * object and a parent airport object
 */
public class Node {
    // Declaring instance variables
    private Airport startAirport;
    private Node parentAirport = null;

    // This is a constructor that takes in an airport object and sets the
    // startAirport to the airport object.
    public Node(Airport startAirport) {
        this.startAirport = startAirport;
    }

    // This is a constructor that takes in an airport object and a node object and
    // sets the
    // startAirport to the airport object and the parentAirport to the node object.
    public Node(Airport startAirport, Node parentAirport) {
        this.startAirport = startAirport;
        this.parentAirport = parentAirport;
    }

    /**
     * This function returns the startAirport of the flight
     * 
     * @return The startAirport
     */
    public Airport getState() {
        return this.startAirport;
    }

    public Node getParent() {
        return this.parentAirport;
    }

    /**
     * This function returns an ArrayList of Airport objects that represent the path
     * from the start
     * airport to the end airport
     * 
     * @return The solution path is being returned.
     */
    public ArrayList<Airport> solutionPath() {
        ArrayList<Airport> successorAirports = new ArrayList<Airport>();
        successorAirports.add(this.startAirport);

        Node currentParent = this.parentAirport;
        while (!(currentParent == null)) {
            successorAirports.add(currentParent.startAirport);
            currentParent = currentParent.parentAirport;
        }
        return successorAirports;
    }
}