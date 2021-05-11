/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs.pkg173_finalproject;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author masyb
 */
public class MainTest {
    
    public MainTest() {
    }

    @Test
    public void testSection1() {
        System.out.println("computeCost");
        int sectionInput = 3;
        int seats = 5;
        int expResult = 500;
        int result = Main.computeCost(sectionInput, seats);
        assertEquals(expResult, result);
    }
     public void testSection2() {
        System.out.println("computeCost");
        int sectionInput = 2;
        int seats = 5;
        int expResult = 750;
        int result = Main.computeCost(sectionInput, seats);
        assertEquals(expResult, result);
    }
     public void testSection3() {
        System.out.println("computeCost");
        int sectionInput = 1;
        int seats = 5;
        int expResult = 1000;
        int result = Main.computeCost(sectionInput, seats);
        assertEquals(expResult, result);
    }
}
