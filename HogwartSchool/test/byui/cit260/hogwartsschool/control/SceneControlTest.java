/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hogwartsschool.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Johnson
 */
public class SceneControlTest {
    
    public SceneControlTest() {
    }

    /**
     * Test of appartentMagnitude method, of class SceneControl.
     */
    @Test
    public void testAppartentMagnitude() {
        System.out.println("appartentMagnitude");
        
        // Test case one.
        System.out.println("Test case #1"); 
        
        double magnitude = 12;
        double distance = 200;
        
        SceneControl instance = new SceneControl();
        
        double expResult = 0.0003;
        double result = instance.appartentMagnitude(magnitude, distance);
        assertEquals(expResult, result, 0.0001);
        
        // Test case two.
        System.out.println("Test case #2"); 
        
        magnitude = 13;
        distance = -50;
        
        expResult = -999999;
        result = instance.appartentMagnitude(magnitude, distance);
        assertEquals(expResult, result, 0.0001);
        
        // Test case four.
        System.out.println("Test case #4"); 
        
        magnitude = 56;
        distance = 20;
        
        expResult = -999999;
        result = instance.appartentMagnitude(magnitude, distance);
        assertEquals(expResult, result, 0.0001);
    
        // Test case five.
        System.out.println("Test case #5"); 
        
        magnitude = 14;
        distance = 0;
        
        expResult = -999999;
        result = instance.appartentMagnitude(magnitude, distance);
        assertEquals(expResult, result, 0.0001);
        
        // Test case six.
        System.out.println("Test case #6"); 
        
        magnitude = -50;
        distance = 12;
        
        expResult = -0.3472;
        result = instance.appartentMagnitude(magnitude, distance);
        assertEquals(expResult, result, 0.0001);
         // Test case three.
        System.out.println("Test case #3"); 
        
        magnitude = 56;
        distance = 20;
        
        expResult = -999999;
        result = instance.appartentMagnitude(magnitude, distance);
        assertEquals(expResult, result, -999999);
        
    }
    
}
