/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Arttu
 */
public class StrategyA implements ListConverter {
   
    
    @Override
    public void listToString(ArrayList<String> list) {
        
        Iterator itr = list.iterator();
      
      while(itr.hasNext()) {
         Object element = itr.next();
         System.out.print(element + "\n");
      }
      System.out.println();
    }

    
    
}
