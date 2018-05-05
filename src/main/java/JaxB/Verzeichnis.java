/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JaxB;


import java.util.List;
import javax.xml.bind.annotation.*;

/**
 *
 * @author maik
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Verzeichnis")
@XmlType(propOrder = {"name","gorsse"})
public class Verzeichnis {
    
    protected String name;   
    protected String grosse;
    
    protected List<Datei> subDirectory;

    public void setName(String name) {
        this.name = name;
    }

    public void setGrosse(String grosse) {
        this.grosse = grosse;
    }

    public String getName() {
        return name;
    }

    public String getGrosse() {
        return grosse;
    }
            
}
