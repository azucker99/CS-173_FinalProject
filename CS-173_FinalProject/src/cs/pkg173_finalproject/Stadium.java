/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs.pkg173_finalproject;
import java.util.ArrayList;

/**
 *
 * @author azuck
 */
public class Stadium {
    private int numSeats; // Number of seats bought
    public ArrayList<String> section; // Seat level (e.g. nosbleeds, etc.) 
    public ArrayList<String> schedule; // Event schedule for particular stadium 
    private String stadiumName; // Name of the stadium
    private int totalSeats; // Max number of seats available 
    private ArrayList<Integer> seatsPerGame; // Total seats - seats bought 
    private ArrayList<Integer> pricePerSection; // Section price
    
public Stadium(Integer _totalSeats, String _stadiumName) {
    this.totalSeats = _totalSeats;
    this.numSeats = _totalSeats;
    this.schedule = new ArrayList<String>();
    this.section = new ArrayList<String>();
    this.stadiumName = _stadiumName;
    this.seatsPerGame = new ArrayList<Integer>();
    this.pricePerSection = new ArrayList<Integer>();
    
    
}

    /**
     * @return the numSeats
     */
    public int getNumSeats() {
        return numSeats;
    }
    
    public int getTotalSeats() {
        return totalSeats;
    }

    /**
     * @return the section
     */
    public ArrayList<String> getSection() {
        return section;
    }
    
    public ArrayList<Integer> getPricePerSection() {
        return pricePerSection;
    }

    /**
     * @param section the section to set
     */
    public void setSection(ArrayList<String> section) {
        this.section = section;
    }


    /**
     * @return the Schedule
     */
    public ArrayList<String> getSchedule() {
        return schedule;
    }
    
    public ArrayList<Integer> getSeatsPerGame() {
        return seatsPerGame;
    }

    /**
     * @param Schedule the Schedule to set
     */
    public void setSchedule(ArrayList<String> Schedule) {
        this.schedule = Schedule;
    }
    public void printStadium() {
        System.out.println("Stadium Name: "+stadiumName+" Number of Seats Available: "+ numSeats);

    }
    // Replaces total seats withs seat availability (i.e. decreases total seats available)
    public void buyTickets(int seatsBought, int sectionInput) {
        seatsPerGame.set(sectionInput, totalSeats - seatsBought);
    }
}
