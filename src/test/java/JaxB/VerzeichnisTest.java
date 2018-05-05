/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JaxB;

import java.util.ArrayList;
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
public class VerzeichnisTest {
    
    public VerzeichnisTest() {
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
     * Test of getSubDirectoryList method, of class Verzeichnis.
     */
    @org.junit.Test
    public void testGetSubDirectoryList() {
        System.out.println("getSubDirectoryList");
        Verzeichnis instance = new Verzeichnis();
        ArrayList<Verzeichnis> expResult = null;
        ArrayList<Verzeichnis> result = instance.getSubDirectoryList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSubDirectoryList method, of class Verzeichnis.
     */
    @org.junit.Test
    public void testSetSubDirectoryList() {
        System.out.println("setSubDirectoryList");
        ArrayList<Verzeichnis> subDirectoryList = null;
        Verzeichnis instance = new Verzeichnis();
        instance.setSubDirectoryList(subDirectoryList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSubFileList method, of class Verzeichnis.
     */
    @org.junit.Test
    public void testGetSubFileList() {
        System.out.println("getSubFileList");
        Verzeichnis instance = new Verzeichnis();
        ArrayList<Datei> expResult = null;
        ArrayList<Datei> result = instance.getSubFileList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSubFileList method, of class Verzeichnis.
     */
    @org.junit.Test
    public void testSetSubFileList() {
        System.out.println("setSubFileList");
        ArrayList<Datei> subFileList = null;
        Verzeichnis instance = new Verzeichnis();
        instance.setSubFileList(subFileList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
