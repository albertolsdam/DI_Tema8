/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correcto;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author scorp
 */
public class MasGrandeTest {
    
    public MasGrandeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    /**
     * Test of max method, of class MasGrande.
     */
    @Test
    public void testMaxCardinalidad() {
        System.out.println("Max - Test Cardinalidad");
        int[] a = new int[]{};
        assertEquals(0, MasGrande.max(a));
        
        a = new int[]{1};
        assertEquals(1, MasGrande.max(a));
        
        a = new int[]{2,3,4};
        assertEquals(4, MasGrande.max(a));
        
        a = new int[]{-8,-3,-4};
        assertEquals(-3, MasGrande.max(a));
    }
    
    @Test
    public void testMaxOrden() {
        System.out.println("Max - Test Orden");
        int[] a = new int[]{5,3,9};
        assertEquals(9, MasGrande.max(a));
        a = new int[]{3,4,5};
        assertEquals(5, MasGrande.max(a));
        a = new int[]{5,4,3};
        assertEquals(5, MasGrande.max(a));
    }
    
    @Test
    public void testMaxRango() {
        System.out.println("Max - Test Rango");
        int[] a = new int[]{-2147483647,2147483647};
        assertEquals(2147483647, MasGrande.max(a));
    }
    
    
    @Test(expected = NullPointerException.class)
    public void testMaxExistencia() {
        System.out.println("Max - Test Existencia");
        int[] a = new int[]{};
        assertEquals(0, MasGrande.max(a));
        a = null;
        assertEquals(0, MasGrande.max(a));
    }
    
    @Test(timeout = 1000)
    public void testMaxTiempo() {
        System.out.println("Max - Test Tiempo");
        int[] a = new int[]{123,62,21,1123,3,629,24};
        assertEquals(1123, MasGrande.max(a));
    }
    
}
