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
        
        makeNewStadium
        
        
        
        
        
    }
    
  /* public static double getPrice(String game, String seatCategory, char section,  
    */
    public static Stadium makeNewStadium() {
        Stadium stadium = new Stadium();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose a game:");
        // add do loop
        String game = scanner.nextLine();
        System.out.println("Please choose a seat category:");
        String seatCategory = scanner.nextLine();
        System.out.println("Please choose a seat section:");
        String section = scanner.next();
        System.out.println("Please select how many tickets you would like:");
        int seats = scanner.nextInt(); 
        stadium.getSection().add(section);
        return stadium;
        }
}
