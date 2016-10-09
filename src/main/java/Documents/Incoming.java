/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Documents;
import java.util.Date;
/**
 *
 * @author Алексей
 */
public class Incoming extends Document{
    public String Sender;
    public String Addresser;
    public int outgoingNumber;
    public Date RegistrationDate; 
    
    Incoming(int Identifier, String name, String text,int RegNumber,Date dat,String author, String sender, String addresser, int outNumber, Date regDate){
        identifier = Identifier;
        Name = name;
        Text = text; //не уверен, что обычный стринг для текста подойдет
        RegistrationNumber = RegNumber;
        date = dat; 
        Author = author;  
        
        Sender = sender;
        Addresser = addresser;
        outgoingNumber = outNumber;
        RegistrationDate = regDate;
    }
    @Override
    public void DocToString(){
        System.out.println("Входящий"+this.PreDocToString()); 
    };
}
