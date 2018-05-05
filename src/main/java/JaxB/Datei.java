/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JaxB;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author maik
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "datei")
@XmlType(propOrder = {"name", "gorsse"})
public class Datei {

    protected String name;
    protected String grosse;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrosse() {
        return grosse;
    }

    public void setGrosse(String grosse) {
        this.grosse = grosse;
    }
}
