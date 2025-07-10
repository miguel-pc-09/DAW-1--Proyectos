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
public class FactorialTest {

  

    @Test
    public void testFacotrial() {
        System.out.println("factorial");
        int numero = 3;
        Test1 instance = new Test1();
        int expResult = 6;
        int result = instance.factorial(numero);
        assertEquals(expResult, result);
    }

}
