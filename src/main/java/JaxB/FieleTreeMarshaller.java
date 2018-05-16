/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JaxB;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

/**
 *
 * @author maik
 */
public class FieleTreeMarshaller {

    public OutputStream marshallTo(Verzeichnis rootVerzeichnis) throws JAXBException {
        
        JAXBContext jaxbContext = JAXBContext.newInstance(Verzeichnis.class);
        javax.xml.bind.Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        OutputStream xmlStream = new ByteArrayOutputStream();

        jaxbMarshaller.marshal(rootVerzeichnis, xmlStream);
        
        return xmlStream;
    }
}
