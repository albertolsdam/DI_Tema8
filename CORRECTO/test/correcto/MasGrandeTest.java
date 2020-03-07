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
        assertEquals(MasGrande.max(a), 0);
        a = new int[]{1};
        assertEquals(MasGrande.max(a), 1);
        a = new int[]{2,3,4};
        assertEquals(MasGrande.max(a), 4);
    }
    
    @Test
    public void testMaxOrden() {
        System.out.println("Max - Test Orden");
        int[] a = new int[]{5,3,9};
        assertEquals(MasGrande.max(a), 9);
        a = new int[]{3,4,5};
        assertEquals(MasGrande.max(a), 5);
        a = new int[]{5,4,3};
        assertEquals(MasGrande.max(a), 5);
    }
    
    @Test
    public void testMaxRango() {
        System.out.println("Max - Test Rango");
        int[] a = new int[]{-2147483647,2147483647};
        assertEquals(MasGrande.max(a), 2147483647);
    }
    
    
    @Test(expected = NullPointerException.class)
    public void testMaxExistencia() {
        System.out.println("Max - Test Existencia");
        int[] a = new int[]{};
        assertEquals(MasGrande.max(a), 0);
        a = null;
        assertEquals(MasGrande.max(a), 0);
    }
    
    @Test(timeout = 1000)
    public void testMaxTiempo() {
        System.out.println("Max - Test Tiempo");
        int[] a = new int[]{123,62,21,1123,3,629,24};
        assertEquals(MasGrande.max(a), 1123);
    }
    
}
