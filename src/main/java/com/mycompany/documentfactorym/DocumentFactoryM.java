/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.documentfactorym;

import java.util.ArrayList;
import Documents.*;
import Exception.DocumentExistsException;
import Fabric.DocFabric;
import Generators.PeopleGenerate;
import java.util.Collections;
import java.util.Random;
/**
 *
 * @author Алексей
 */
public class DocumentFactoryM {
    

    public static void main(String[] args) throws DocumentExistsException {
        ArrayList<Document> SaveDocs = new ArrayList<Document>();
        DocFabric DFabric = new DocFabric();
        String[] strClass = new String[]{"Task", "Incoming", "Outgoing"};
        Random random = new Random();
        
        for(int i=0; i<30; i++){
            String clas1 = strClass[random.nextInt(strClass.length)];
            DFabric.GenerationDoc(clas1, SaveDocs);
        }
        
        DFabric.Print(SaveDocs);
        //Collections.sort(SaveDocs,(o1, o2) -> o1.Compare(o2));







    }
    
}
