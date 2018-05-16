/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JaxB;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author D3NCE0NLINE
 */
public class UnmarshallerClass {
    
        public void unmarshall() {

        try {
            JAXBContext jc = JAXBContext.newInstance(Verzeichnis.class);
            Unmarshaller unms = jc.createUnmarshaller();

            Verzeichnis ver;
            ver = (Verzeichnis) unms.unmarshal(new File("C:\\Users\\Freddy\\Desktop\\test.xml"));
            Datei dat = (Datei) unms.unmarshal(new File("C:\\Users\\Freddy\\Desktop\\test.xml"));

            System.out.print("Verzeichnisse werden eingelesen...\n");
            System.out.print("subDirectory: " + ver.getSubDirectoryList() + "\n");
            //System.out.print("Verzeichnisse: " + ver.subDirectoryList + "\n");
            System.out.print("subFile: " + ver.getSubFileList() + "\n");
            //System.out.print("Dateien: " + ver.subFileList + "\n");

            System.out.print("Dateien werden eingelesen...\n");
            System.out.print("Datei: " + dat.getName() + " ");
            //System.out.print("Datei: " + dat.name + " ");
            System.out.print("Größe: " + dat.getGrosse() + "\n");
            //System.out.print("Datei: " + dat.grosse + " ");

        } catch (JAXBException e) {
            System.out.print(e.getMessage());
        }

    }
    
}
