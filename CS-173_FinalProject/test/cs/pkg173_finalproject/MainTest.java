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
    public void testComputeCost() {
        System.out.println("computeCost");
        int sectionInput = 3;
        int seats = 5;
        int expResult = 1000;
        int result = Main.computeCost(sectionInput, seats);
        assertEquals(expResult, result);
    }
    
}
