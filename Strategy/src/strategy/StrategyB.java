/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

import java.util.ArrayList;

/**
 *
 * @author Arttu
 */
public class StrategyB implements ListConverter {

    @Override
    public void listToString(ArrayList<String> array) {
        //String []stringArray = new String[array.size()];
        
        String stringArray[]=array.toArray(new String[array.size()]);
      
       for (int i = 0; stringArray.length > i; i++) { //loop
             System.out.print(stringArray[i] + " ");
             if (i % 2 == 0) {
                 
             } else {
                 System.out.println("\n");  
             }
    }
    
    }
}
