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
public class StrategyC implements ListConverter {

    @Override
    public void listToString(ArrayList<String> array) {
       int row = 0;
       for (int i = 0; array.size() > i; i++) {
           System.out.print(array.get(i) + " ");
           if (row == 2){
               System.out.println("\n");
               row = 0;
           } else {
              row = row +1;
           }
       }
    }
    
}
