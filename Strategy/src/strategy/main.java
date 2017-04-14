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
public class main {
   public static void main(String[] args) {
      ArrayList<String> list = new ArrayList<String>();
      list.add("A");
      list.add("B");
      list.add("C");
      list.add("D");
      list.add("A");
      list.add("B");
      list.add("C");
      list.add("D");
        
      Context context = new Context(new StrategyA());		
      context.executeStrategy(list);
      
      Context context2 = new Context(new StrategyB());		
      context2.executeStrategy(list);
      
      Context context3 = new Context(new StrategyC());		
      context3.executeStrategy(list);
   }
}
