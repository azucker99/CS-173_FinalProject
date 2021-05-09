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

        // Creating the stadiums: Citizens Bank Park (Phillies) and Wells Fargo Center (Sixers)
        Stadium Citizens = new Stadium(2000, "Citizens");
        Stadium Wells = new Stadium(2000, "Wells");
        ArrayList<Stadium> stadiums = new ArrayList<Stadium>();
        stadiums.add(Citizens);
        stadiums.add(Wells);

        // Citizens Sections
        Citizens.section = new ArrayList<String>();
        Citizens.section.add("Section 1");
        Citizens.pricePerSection.add(100);
        Citizens.section.add("Section 2");
        Citizens.pricePerSection.add(150);
        Citizens.section.add("Section 3");
        Citizens.pricePerSection.add(200);

        // Citizens Schedule
        Citizens.schedule = new ArrayList<String>();
        Citizens.schedule.add("Game 1: May 18 - Marlins @ Phillies");
        Citizens.seatsPerGame.add(Citizens.totalSeats);
        Citizens.schedule.add("Game 2: May 19 - Marlins @ Phillies");
        Citizens.seatsPerGame.add(Citizens.totalSeats);
        Citizens.schedule.add("Game 3: May 20 - Marlins @ Phillies");
        Citizens.seatsPerGame.add(Citizens.totalSeats);
        Citizens.schedule.add("Game 4: May 21 - Red Sox @ Phillies");
        Citizens.seatsPerGame.add(Citizens.totalSeats);
        Citizens.schedule.add("Game 5: May 22 - Red Sox @ Phillies");
        Citizens.seatsPerGame.add(Citizens.totalSeats);
        Citizens.schedule.add("Game 6: May 23 - Red Sox @ Phillies");
        Citizens.seatsPerGame.add(Citizens.totalSeats);

        // Wells Fargo Sections
        Wells.section = new ArrayList<String>();
        Wells.section.add("Section 1");
        Wells.pricePerSection.add(100);
        Wells.section.add("Section 2");
        Wells.pricePerSection.add(150);
        Wells.section.add("Section 3");
        Wells.pricePerSection.add(200);

        // Wells Schedule
        Wells.schedule.add("Game 1: May 8: Pistons @ Sixers");
        Wells.seatsPerGame.add(Wells.totalSeats);
        Wells.schedule.add("Game 2: May l4: Magic @ Sixers");
        Wells.seatsPerGame.add(Wells.totalSeats);
        Wells.schedule.add("Game 3: May 16: Magic @ Sixers");
        Wells.seatsPerGame.add(Wells.totalSeats);

        System.out.println("Please choose a stadium:");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < stadiums.size(); i++) {
            System.out.print((i + 1) + " ");
       
            stadiums.get(i).printStadium();
        }
        String location = scanner.nextLine();
        int input = -1;
        try {
            input = Integer.parseInt(location);
        } catch (Exception e) {
            System.out.println("Invalid Input.");
        }
        Stadium ofChoice = null;
        if (input > 0 && input < stadiums.size() + 1) {
            ofChoice = stadiums.get(input - 1);
            ofChoice.printStadium();
        } else {
            System.out.println("Please choose a stadium > 0 or < " + stadiums.size() + 1);
        }

        System.out.println("Please choose a game:");
        for (int i = 0; i < ofChoice.schedule.size(); i++) {
            System.out.print((i + 1) + " ");
       
            System.out.println(ofChoice.schedule.get(i));
        }
        String game = scanner.nextLine();
        input = -1;
        try {
            input = Integer.parseInt(game);
        } catch (Exception e) {
            System.out.println("Invalid Input.");
        }
        String  gameOfChoice = null;
        if (input > 0 && input < ofChoice.schedule.size() + 1) {
            gameOfChoice = ofChoice.schedule.get(input - 1);
            System.out.println(gameOfChoice);
        } else {
            System.out.println("Please choose a game > 0 or < " + ofChoice.schedule.size() + 1);
        }
        System.out.println("Please choose a seat section:");
        for (int i = 0; i < ofChoice.section.size(); i++) {
            System.out.print((i + 1) + " ");
       
            System.out.println(ofChoice.section.get(i) + " " + ofChoice.pricePerSection.get(i));
        }
        int sectionInput = scanner.nextInt();
        String sectionOfChoice = null;
        if (sectionInput > 0 && sectionInput < ofChoice.section.size() + 1) {
            sectionOfChoice = ofChoice.section.get(sectionInput - 1);
            System.out.println(sectionOfChoice);
        } else {
            System.out.println("Please choose a section > 0 or < " + ofChoice.section.size() + 1);
        }
         
        System.out.println("Please select how many tickets you would like:");
        int seats = scanner.nextInt();
        ofChoice.buyTickets(seats, sectionInput - 1 );
        for ( int i : ofChoice.seatsPerGame) {
            System.out.println(i);
        }
                

    }

    
}
