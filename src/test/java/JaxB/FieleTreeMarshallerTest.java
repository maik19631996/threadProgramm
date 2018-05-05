/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JaxB;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
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
public class FieleTreeMarshallerTest {
    
    public FieleTreeMarshallerTest() {
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
     * Test of marshallTo method, of class FieleTreeMarshaller.
     */
    @Test
    public void testMarshallTo() throws Exception {
        System.out.println("marshallTo");
        Verzeichnis rootVerzeichnis = new Verzeichnis();
        rootVerzeichnis.grosse = "50MB";
        rootVerzeichnis.name = "myFirsttestFile";
        ArrayList<Datei> datein = new ArrayList<Datei>();
        Datei datei = new Datei();
        datei.grosse = "50k";
        datei.name = "cool File";
        datein.add(datei);
                
        rootVerzeichnis.subFileList = datein;
        FieleTreeMarshaller instance = new FieleTreeMarshaller();
        OutputStream expResult = null;
        ByteArrayOutputStream result = (ByteArrayOutputStream) instance.marshallTo(rootVerzeichnis);
        String xmlString = new String(result.toByteArray());
        System.out.print(xmlString);
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }
    
}
