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
public class BossFactory extends AbstractFactory {
    
 @Override
   public Boss getBVaate(String tyyppi){
   
      if(tyyppi == null){
         return null;
      }		
      
      if(tyyppi.equalsIgnoreCase("HOUSUT")){
         return new BHousut();
         
      }else if(tyyppi.equalsIgnoreCase("PAITA")){
         return new BPaita();
      }
      return null;
   }
   
   @Override
   Adidas getVaate(String vaate) {
      return null;
   }
}
