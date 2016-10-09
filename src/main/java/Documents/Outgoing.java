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
public class Outgoing extends Document{
    public String Addresser;
    public String DeliveryMethod;
    
    Outgoing(int Identifier, String name, String text,int RegNumber,Date dat,String author, String addresser, String deliveryMethod){
        identifier = Identifier;
        Name = name;
        Text = text; //не уверен, что обычный стринг для текста подойдет
        RegistrationNumber = RegNumber;
        date = dat; 
        Author = author; 
        
        Addresser = addresser;
        DeliveryMethod = deliveryMethod;
        
    }
    
    @Override
    public void DocToString(){
        System.out.println("Исходящий"+ this.PreDocToString()); 
    };
}
