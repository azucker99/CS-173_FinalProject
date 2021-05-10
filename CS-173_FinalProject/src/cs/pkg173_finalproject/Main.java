/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs.pkg173_finalproject;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author azuck
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // Creating the stadiums with total number of seats 
        Stadium Citizens = new Stadium(2000, "Citizens");
        Stadium Wells = new Stadium(2000, "Wells");
        // Adding the stadiums to an ArrayList
        ArrayList<Stadium> stadiums = new ArrayList<Stadium>();
        stadiums.add(Citizens);
        stadiums.add(Wells);

        // Citizens Sections with the assoicated price below 
        Citizens.section = new ArrayList<String>();
        Citizens.getSection().add("Section 1");
        Citizens.getPricePerSection().add(100);
        Citizens.getSection().add("Section 2");
        Citizens.getPricePerSection().add(150);
        Citizens.getSection().add("Section 3");
        Citizens.getPricePerSection().add(200);

        // Citizens Schedule and giving each game a unique amount of seats per section
        Citizens.schedule = new ArrayList<String>();
        Citizens.getSchedule().add("Game 1: May 18 - Marlins @ Phillies");
        Citizens.getSeatsPerGame().add(Citizens.getTotalSeats());
        Citizens.getSchedule().add("Game 2: May 19 - Marlins @ Phillies");
        Citizens.getSeatsPerGame().add(Citizens.getTotalSeats());
        Citizens.getSchedule().add("Game 3: May 20 - Marlins @ Phillies");
        Citizens.getSeatsPerGame().add(Citizens.getTotalSeats());
        Citizens.getSchedule().add("Game 4: May 21 - Red Sox @ Phillies");
        Citizens.getSeatsPerGame().add(Citizens.getTotalSeats());
        Citizens.getSchedule().add("Game 5: May 22 - Red Sox @ Phillies");
        Citizens.getSeatsPerGame().add(Citizens.getTotalSeats());
        Citizens.getSchedule().add("Game 6: May 23 - Red Sox @ Phillies");
        Citizens.getSeatsPerGame().add(Citizens.getTotalSeats());

        // Wells Fargo Sections with the associated price below
        Wells.section = new ArrayList<String>();
        Wells.section.add("Section 1");
        Wells.getPricePerSection().add(100);
        Wells.getSection().add("Section 2");
        Wells.getPricePerSection().add(150);
        Wells.getSection().add("Section 3");
        Wells.getPricePerSection().add(200);

        // Wells Schedule and giving each game a unique amount of tickets per section
        Wells.getSchedule().add("Game 1: May 8: Pistons @ Sixers");
        Wells.getSeatsPerGame().add(Wells.getTotalSeats());
        Wells.getSchedule().add("Game 2: May l4: Magic @ Sixers");
        Wells.getSeatsPerGame().add(Wells.getTotalSeats());
        Wells.getSchedule().add("Game 3: May 16: Magic @ Sixers");
        Wells.getSeatsPerGame().add(Wells.getTotalSeats());

        // Choosing a stadium
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose a stadium:");
        for (int i = 0; i < stadiums.size(); i++) {
            System.out.print((i + 1) + " "); // Printing out the options for stadiums
            stadiums.get(i).printStadium(); // Printing out the stadium and the number of available seats
        }
        String location = scanner.nextLine(); // Person puts in their choice
        int input = -1; // Initializing an input value
        // Exception handling to make sure user puts in allowed value
        try {
            input = Integer.parseInt(location); // parses location string and return a numerical input
        } catch (Exception e) {
            System.out.println("Invalid Input.");
        }
        Stadium ofChoice = null; // New stadium object which user will designate their choice
        if (input > 0 && input < stadiums.size() + 1) {
            ofChoice = stadiums.get(input - 1); // Stadium ofChoice is the option the user chooses 
            ofChoice.printStadium(); // Prints out stadium ofChoice
        } else {
            System.out.println("Please choose a stadium > 0 or < " + stadiums.size() + 1);
        }

        // Choosing a game
        System.out.println("Please choose a game:");
        // Prints out schedule for designated stadium 
        for (int i = 0; i < ofChoice.schedule.size(); i++) {
            System.out.print((i + 1) + " ");
       
            System.out.println(ofChoice.schedule.get(i));
        }
        String game = scanner.nextLine(); // Person puts in numerical choice for game
        input = -1;
        try {
            input = Integer.parseInt(game);
        } catch (Exception e) {
            System.out.println("Invalid Input.");
        }
        String  gameOfChoice = null; // Initialzing a gameOfChoice object
        if (input > 0 && input <= ofChoice.schedule.size()) {
            gameOfChoice = ofChoice.schedule.get(input - 1); // gameOfChoice is the option the user chooses
            System.out.println(gameOfChoice); // Prints the game the user chooses
        } else {
            System.out.println("Please choose a game > 0 or < " + ofChoice.schedule.size() + 1);
        }
        
        // Choosing a section 
        System.out.println("Please choose a seat section:");
        for (int i = 0; i < ofChoice.section.size(); i++) {
            System.out.print((i + 1) + " ");
       
            System.out.println(ofChoice.section.get(i) + " " + ofChoice.getPricePerSection().get(i));
        }
        int sectionInput = scanner.nextInt(); // User chooses section
        String sectionOfChoice = null; // Initializng sectionOfChoice object
        // User chooses section within the three available sections
        if (sectionInput > 0 && sectionInput < ofChoice.section.size() + 1) {
            sectionOfChoice = ofChoice.section.get(sectionInput - 1);
            System.out.println(sectionOfChoice);
        } else {
            System.out.println("Please choose a section > 0 or < " + (ofChoice.section.size() + 1));
        }
        
        // Selecting how many tickets you want 
        System.out.println("Please select how many tickets you would like:");
        int seats = scanner.nextInt();
        ofChoice.buyTickets(seats, sectionInput - 1 ); // ofStadium object calls buyTickets method to subtract number
        // of tickets from total tickets for that game
         
        
        // Calculates and prints the total cost for the buyer
        int cost = computeCost(sectionInput, seats);
        System.out.println("Your total cost for the " + gameOfChoice + " is " + "$" + cost + ".00.");
        System.out.println("Enjoy the game!");
            
        
        // Prints out the new amount for total tickets that the stadium has
        for (int i : ofChoice.getSeatsPerGame()) {
            for (String j : ofChoice.getSchedule()) {
                    System.out.println("There are " + i + " remaining tickets for " + j + ".");
            }
        }
                

    }
    
    // Function to compute cost of tickets
    public static int computeCost(int sectionInput, int seats) {
        String  gameOfChoice = null;
        int cost = 0;
        if (sectionInput == 1) {
            cost = seats * 100;
        } else if (sectionInput == 2) {
            cost = seats * 150;
        } else if (sectionInput == 3){
            cost = seats * 200;
        }
        return cost;
    }
       
    
}
