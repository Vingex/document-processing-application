/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Documents;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;

/**
 *
 * @author Алексей
 */
abstract public class Document implements Comparable, Storable {
    public int identifier;
    public String Name;
    public String Text; //не уверен, что обычный стринг для текста подойдет
    public int RegistrationNumber;
    public Date date; 
    public String Author;  
    
    @Override
    public boolean Compare(Document doc){ //если в списке должен стоять раньше, то true, иначе false (даты сортируються от более поздних к более ранним)

        if(RegistrationNumber>doc.RegistrationNumber)
            return true;        
        else
            if(date.compareTo(doc.date)==(-1))
                return true;                
            else
                return false;
               
            
    }
    @Override
    public void Save(ArrayList list){
        list.add(this);
    }    
    public void DocToString(){};
    
    public String PreDocToString(){
        SimpleDateFormat format1 = new SimpleDateFormat("dd.MM.yyyy");
        return " №"+RegistrationNumber+" от "+format1.format(date) +". "+ Name;
    }
    
}
