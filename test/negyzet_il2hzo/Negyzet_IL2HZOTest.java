/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negyzet_il2hzo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author jani
 */
public class Negyzet_IL2HZOTest {
    

    

    /**
     * Test of negyzet method, of class Negyzet_IL2HZO.
     */
    @Test
    public void testNegyzet() {
        System.out.println("negyzet");
        int Bemenet = 0;
        int expResult = 0;
        int result = Negyzet_IL2HZO.negyzet(Bemenet);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testNegyzet1() {
        System.out.println("negyzet");
        int Bemenet = 3;
        int expResult = 9;
        int result = Negyzet_IL2HZO.negyzet(Bemenet);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testNegyzet2() {
        System.out.println("negyzet");
        int Bemenet = -1;
        int expResult = -1;
        int result = Negyzet_IL2HZO.negyzet(Bemenet);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testNegyzet3() {
        System.out.println("negyzet");
        int Bemenet = 5;
        int expResult = 25;
        int result = Negyzet_IL2HZO.negyzet(Bemenet);
        assertEquals(expResult, result);
    }
    
    //@Test
    public void testNegyzet4() {
        System.out.println("negyzet");
        int Bemenet = 6;
        int expResult = 30;
        int result = Negyzet_IL2HZO.negyzet(Bemenet);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testNegyzet5() {
        System.out.println("negyzet");
        int Bemenet = 7;
        int expResult = 49;
        int result = Negyzet_IL2HZO.negyzet(Bemenet);
        assertEquals(expResult, result);
    }
    
}
