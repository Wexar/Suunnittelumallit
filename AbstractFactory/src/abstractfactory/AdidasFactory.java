/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

//concrete factory 1
public class AdidasFactory extends AbstractFactory {

   @Override
   public Adidas getVaate(String tyyppi){
   
      if(tyyppi == null){
         return null;
      }		
      
      if(tyyppi.equalsIgnoreCase("HOUSUT")){
         return new AHousut();
         
      }else if(tyyppi.equalsIgnoreCase("PAITA")){
         return new APaita();
      }
      return null;
   }
   
   @Override
   Boss getBVaate(String bvaate) {
      return null;
   }
}