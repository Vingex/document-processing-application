/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabric;
import java.util.Random;
import Generators.*;
import java.util.Date;
/**
 *
 * @author Алексей
 */
public class DocFabric {
    int id;
    int idTask;
    int idIncoming;
    int idOutgoing;
    StringGenerator StrG;
    PeopleGenerate PplG;
    DateGenerator DtG;
    SelectDeliveryMethod SDM;
    
    DocFabric(){
        id=0;
        idTask=1;
        idIncoming=1;
        idOutgoing=1;
    }
    
    public void GenerationDoc(String clas){

        int identifier = id;
        String Name = StrG.NewName();
        String Text = StrG.NewText();
        Date date = DtG.RandomDate();
        String Author = PplG.RandomMan();
        
        id++;
        
        switch(clas){
            case "Task":
            {
                int RegistrationNumber = idTask;//нужна проверка на занятость
                idTask++;
            }
            case "Incoming":
            {
                
            }
            case "Outgoing":
            {
                
            }                 
                    
                    
        }
                

    
    }
    

}
