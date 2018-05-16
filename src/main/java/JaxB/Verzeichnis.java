/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JaxB;


import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.*;

/**
 *
 * @author maik
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Verzeichnis")
//@XmlType(propOrder = {"name","gorsse"})
public class Verzeichnis extends Datei {
       
    @XmlElement(name = "verzeichis")
    protected ArrayList<Verzeichnis> subDirectoryList;
    
    @XmlElement(name = "datei")
    protected ArrayList<Datei> subFileList;

    public ArrayList<Verzeichnis> getSubDirectoryList() {
        return subDirectoryList;
    }

    public void setSubDirectoryList(ArrayList<Verzeichnis> subDirectoryList) {
        this.subDirectoryList = subDirectoryList;
    }

    public ArrayList<Datei> getSubFileList() {
        return subFileList;
    }

    public void setSubFileList(ArrayList<Datei> subFileList) {
        this.subFileList = subFileList;
    }


            
}
