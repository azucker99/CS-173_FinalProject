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
    public int numSeats;
    public ArrayList<String> section;
    public String seatCategory;
    public ArrayList<Integer> seatAvailability;
    public ArrayList<String> schedule;
    
public Stadium(Integer _numSeats) {
    this.numSeats = _numSeats;
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
