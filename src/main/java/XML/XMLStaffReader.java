/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package XML;

import Parsers.JaxbParser;
import StaffGroup.GroupPerson;
import java.io.File;
import javax.xml.bind.JAXBException;
import StaffGroup.*;
/**
 *
 * @author Алексей
 */
public class XMLStaffReader {
    
    public StaffGroup GetFromXML(Class clas, String file) throws JAXBException{
        JaxbParser parser = new JaxbParser();
        File file_ = new File(file);
        /*if(clas == GroupPerson.class)
            file = new File("persons.xml");
        if(clas == GroupDepartament.class)
            file = new File("departaments.xml");
        if(clas == GroupOrganization.class)
            file = new File("organizations.xml"); */   

        return (StaffGroup) parser.getObject(file_, clas);
    }
}
