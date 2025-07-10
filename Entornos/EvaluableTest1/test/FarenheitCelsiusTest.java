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
public class FarenheitCelsiusTest {
    
    public FarenheitCelsiusTest() {
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
    
    @Test
    public void testCelsiusToFarenheit() {
        System.out.println("CelsiusToFarenheit");
        double celsius = 15;
        FarenheitCelsius instance = new FarenheitCelsius();
        double expResult = 59;
        double result = instance.CelsiusToFarenheit(celsius);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testFarenheitToCelsius() {
        System.out.println("FarenheitToCelsius");
        double farenheit = 59;
        FarenheitCelsius instance = new FarenheitCelsius();
        double expResult = 15;
        double result = instance.FarenheitToCelsius(farenheit);
        assertEquals(expResult, result, 0.0);
    }

   @Test
    public void testCelsiusToFarenheit_Negative() {
        System.out.println("CelsiusToFarenheit -5°C");
        double celsius = -5;
        FarenheitCelsius instance = new FarenheitCelsius();
        double expResult = 23;
        double result = instance.CelsiusToFarenheit(celsius);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testFarenheitToCelsius_Negative() {
        System.out.println("FarenheitToCelsius -40°F");
        double farenheit = -40;
        FarenheitCelsius instance = new FarenheitCelsius();
        double expResult = -40;
        double result = instance.FarenheitToCelsius(farenheit);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testFarenheitToCelsius_32F() {
        System.out.println("FarenheitToCelsius 32°F");
        double farenheit = 32;
        FarenheitCelsius instance = new FarenheitCelsius();
        double expResult = 0;
        double result = instance.FarenheitToCelsius(farenheit);
        assertEquals(expResult, result, 0.0);
    }
    
}
