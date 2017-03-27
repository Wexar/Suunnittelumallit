/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

/**
 *
 * @author Wexar
 */
public class FactoryCreator {
   public static AbstractFactory getFactory(String choice){  
      if(choice.equalsIgnoreCase("Boss")){  
         return new BossFactory();  
      } else if(choice.equalsIgnoreCase("Adidas")){  
         return new AdidasFactory();  
      }  
      return null;  
   }   
}
