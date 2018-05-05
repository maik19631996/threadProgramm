/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JaxB;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author maik
 */
public class DateiTest {
    
    public DateiTest() {
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
     * Test of getName method, of class Datei.
     */
    @org.junit.Test
    public void testGetName() {
        System.out.println("getName");
        Datei instance = new Datei();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Datei.
     */
    @org.junit.Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Datei instance = new Datei();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
  //      fail("The test case is a prototype.");
    }

    /**
     * Test of getGrosse method, of class Datei.
     */
    @org.junit.Test
    public void testGetGrosse() {
        System.out.println("getGrosse");
        Datei instance = new Datei();
        String expResult = "";
        String result = instance.getGrosse();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setGrosse method, of class Datei.
     */
    @org.junit.Test
    public void testSetGrosse() {
        System.out.println("setGrosse");
        String grosse = "";
        Datei instance = new Datei();
        instance.setGrosse(grosse);
        // TODO review the generated test code and remove the default call to fail.
  //      fail("The test case is a prototype.");
    }
    
}
