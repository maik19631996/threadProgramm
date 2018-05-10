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
     * Test of marshallTo method, of class FieleTreeMarshaller.t test a simple
     * case of xml Generation with Verzeichnis Schema
     */
    @Test
    public void testMarshallTo() throws Exception {
        System.out.println("marshallTo");
        Verzeichnis rootVerzeichnis = new Verzeichnis();
        rootVerzeichnis.grosse = "50MB";
        rootVerzeichnis.name = "myFirsttestFile";
        ArrayList<Datei> datein = new ArrayList<>();
        Datei datei = new Datei();
        datei.grosse = "50k";
        datei.name = "cool File";
        datein.add(datei);
        ArrayList<Verzeichnis> verzeichnisse = new ArrayList<>();
        Verzeichnis subdir = new Verzeichnis();
        subdir.grosse = "100k";
        subdir.name = "subdirName";
        verzeichnisse.add(subdir);
        rootVerzeichnis.subDirectoryList = verzeichnisse;

        rootVerzeichnis.subFileList = datein;
        FieleTreeMarshaller instance = new FieleTreeMarshaller();

        OutputStream expResult = null;
        ByteArrayOutputStream result = (ByteArrayOutputStream) instance.marshallTo(rootVerzeichnis);
        String xmlString = new String(result.toByteArray());
        //System.out.print(xmlString); not needed in normal case

        String assertingString
                = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n"
                + "<Verzeichnis name=\"myFirsttestFile\" grosse=\"50MB\">\n "
                + "   <verzeichis name=\"subdirName\" grosse=\"100k\"/>\n "
                + "   <datei name=\"cool File\" grosse=\"50k\"/>\n"
                + "</Verzeichnis>\n";
        assertEquals(xmlString, assertingString);

    }

}
