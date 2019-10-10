package fr.ufrsciencestech.panier;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author qb157136
 */
public class OrangeTest {
    
    public OrangeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getPrix method, of class Orange.
     */
    @Test
    public void testGetPrix() {
    }

    /**
     * Test of getOrigine method, of class Orange.
     */
    @Test
    public void testGetOrigine() {
    }
    
    @Test
    public void testSiOrangeNonEquivalente(){
        Orange o1 = new Orange(0.6,"Esp");
        Orange o2 = new Orange(0.7,"Fra");
        assertFalse(o1.equals(o2)); 
        
    }
    @Test
    public void testSiOrangeEquivalente(){
        Orange o1 = new Orange(0.7,"Fra");
        Orange o2 = new Orange(0.7,"Fra");
        assertTrue(o1.equals(o2));
    }
    @Test
    public void testPrixSuperieurZero(){
        Orange o1 = new Orange(0.7,"Fra");
        assertTrue(o1.getPrix()>0);
    }
    @Test(expected = ArithmeticException.class)
    public void testPrixInferieurZero(){
        Orange o1 = new Orange(-1,"Fra");
        assertFalse(o1.getPrix()<=0);
    }
    
}
