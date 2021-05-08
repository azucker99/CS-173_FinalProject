/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs.pkg173_finalproject;
import java.util.Scanner;

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
        
        makeNewStadium();
        // Creating the stadiums: Citizens Bank Park (Phillies) and Wells Fargo Center (Sixers)
        Stadium Citizens = new Stadium();
        Stadium Wells = new Stadium();
        
        // Citizens Sections
        Citizens.section = new ArrayList<String>();
        Citizens.section.add("Section 1");
        Citizens.section.add("Section 2");
        Citizens.section.add("Section 3");
        
        // Citizens Schedule
        Citizens.schedule = new ArrayList<String>();
        Citizens.schedule.add("Game 1: May 18 - Marlins @ Phillies");
        Citizens.schedule.add("Game 2: May 19 - Marlins @ Phillies");
        Citizens.schedule.add("Game 3: May 20 - Marlins @ Phillies");
        Citizens.schedule.add("Game 4: May 21 - Red Sox @ Phillies");
        Citizens.schedule.add("Game 5: May 22 - Red Sox @ Phillies");
        Citizens.schedule.add("Game 6: May 23 - Red Sox @ Phillies");
        
        // Wells Fargo Sections
        Wells.section = new ArrayList<String>();
        Wells.section.add("Section 1");
        Wells.section.add("Section 2");
        Wells.section.add("Section 3");
        
        // Wells Schedule
        Wells.schedule.add("Game 1: May 8: Pistons @ Sixers");
        Wells.schedule.add("Game 2: May l4: Magic @ Sixers");
        Wells.schedule.add("Game 3: May 16: Magic @ Sixers");
        
        
        for(String Csection : Citizens.section) {
            System.out.println(Csection);
        }
        
        for(String Cschedule : Citizens.schedule) {
            System.out.println(Cschedule);
        }
        
        for(String Wsection : Wells.section) {
            System.out.println(Wsection);
        }
        
        for(String Wschedule : Wells.schedule) {
            System.out.println(Wschedule);
        }
        
        
        
    }
    
  /* public static double getPrice(String game, String seatCategory, char section,  
    */
    public static Stadium makeNewStadium() {
        Stadium stadium = new Stadium();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose a game:");
        /*System.out.println("May 18: Marlins @ Phillies");
        System.out.println("May 19: Marlins @ Phillies");
        System.out.println("May 20: Marlins @ Phillies");
        System.out.println("May 21: Red Sox @ Phillies");
        System.out.println("May 22: Red Sox @ Phillies");
        System.out.println("May 23: Red Sox @ Phillies");*/
        
        
        // add do loop
        String game = scanner.nextLine();
        System.out.println("Please choose a seat category:");
        System.out.println(Citizens.schedule);
        
        String seatCategory = scanner.nextLine();
        System.out.println("Please choose a seat section:");
        String section = scanner.next();
        System.out.println("Please select how many tickets you would like:");
        int seats = scanner.nextInt(); 
        stadium.getSection().add(section);
        return stadium;
        }
}
