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
    private int numSeats;
    private ArrayList<String> section;
    private String seatCategory;
    private ArrayList<Integer> seatAvailability;
    private ArrayList<String> schedule;
    
public Stadium () {
    this.numSeats = 32;
    this.schedule = new ArrayList<String>();
    this.section = new ArrayList<String>();
    
}

    /**
     * @return the numSeats
     */
    public int getNumSeats() {
        return numSeats;
    }

    /**
     * @param numSeats the numSeats to set
     */
    public void setNumSeats(int numSeats) {
        this.numSeats = numSeats;
    }

    /**
     * @return the section
     */
    public ArrayList<String> getSection() {
        return section;
    }

    /**
     * @param section the section to set
     */
    public void setSection(ArrayList<String> section) {
        this.section = section;
    }

    /**
     * @return the seatCategory
     */
    public String getSeatCategory() {
        return seatCategory;
    }

    /**
     * @param seatCategory the seatCategory to set
     */
    public void setSeatCategory(String seatCategory) {
        this.seatCategory = seatCategory;
    }

    /**
     * @return the seatAvailability
     */
    public ArrayList<Integer> getSeatAvailability() {
        return seatAvailability;
    }

    /**
     * @param seatAvailability the seatAvailability to set
     */
    public void setSeatAvailability(ArrayList<Integer> seatAvailability) {
        this.seatAvailability = seatAvailability;
    }

    /**
     * @return the Schedule
     */
    public ArrayList<String> getSchedule() {
        return schedule;
    }

    /**
     * @param Schedule the Schedule to set
     */
    public void setSchedule(ArrayList<String> Schedule) {
        this.schedule = Schedule;
    }

    
}
