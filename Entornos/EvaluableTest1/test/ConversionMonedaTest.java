/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author migue
 */
public class ConversionMonedaTest {
    
    public ConversionMonedaTest() {
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
     * Test of dolarEuro method, of class ConversionMoneda.
     */
    @Test
    public void testDolarEuro() {
        System.out.println("dolarEuro");
        double Dolar = 10.5;
        ConversionMoneda instance = new ConversionMoneda();
        double expResult = 8.92;
        double result = instance.dolarEuro(Dolar);
        assertEquals(expResult, result, 0);
       
    }

    /**
     * Test of euroDolar method, of class ConversionMoneda.
     */
    @Test
    public void testEuroDolar() {
        System.out.println("euroDolar");
        double Euro = 20.30;
        ConversionMoneda instance = new ConversionMoneda();
        double expResult = 23.88;
        double result = instance.euroDolar(Euro);
        assertEquals(expResult, result, 0);
        
    }
    
}
