/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JaxB;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

/**
 *
 * @author maik
 */
public class FieleTreeMarshaller {

    public InputStream marshallTo(Datei rootDatei) throws JAXBException {
        String returningXML = "";
        JAXBContext jaxbContext = JAXBContext.newInstance(Datei.class);
        javax.xml.bind.Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

        // output pretty printed
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        OutpuStream xmlStream = new ByteArrayOutpuStream(4096);
        jaxbMarshaller.marshal(this, out);
        jaxbMarshaller.marshal(rootDatei, xmlStream);
        
        return returningXML
    }
}
