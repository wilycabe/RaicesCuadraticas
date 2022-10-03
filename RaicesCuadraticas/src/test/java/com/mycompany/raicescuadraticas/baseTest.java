/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.raicescuadraticas;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author wilyc
 */
public class baseTest {
    
    public baseTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of comprobar_num method, of class base.
     */
    @Test
    public void testComprobar_num() {
        System.out.println("comprobar_num");
        String a = "1";
        base instance = new base();
        boolean expResult = false;
        boolean result = instance.comprobar_num(a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of constructor method, of class base.
     */
//    @Test
//    public void testConstructor() {
//        System.out.println("constructor");
//        base instance = new base();
//        instance.constructor();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of discriminante method, of class base.
     */
//    @Test
//    public void testDiscriminante() {
//        System.out.println("discriminante");
//        double a1 = 0.0;
//        double b1 = 0.0;
//        double c1 = 0.0;
//        base instance = new base();
//        double expResult = 0.0;
//        double result = instance.discriminante(a1, b1, c1);
//        assertEquals(expResult, result, 0);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of raices method, of class base.
//     */
//    @Test
//    public void testRaices() {
//        System.out.println("raices");
//        double a1 = 0.0;
//        double b1 = 0.0;
//        double c1 = 0.0;
//        base instance = new base();
//        instance.raices(a1, b1, c1);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of resultado method, of class base.
//     */
//    @Test
//    public void testResultado() {
//        System.out.println("resultado");
//        double a1 = 0.0;
//        double b1 = 0.0;
//        double c1 = 0.0;
//        base instance = new base();
//        instance.resultado(a1, b1, c1);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
