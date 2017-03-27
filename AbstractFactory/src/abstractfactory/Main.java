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
public class Main {
    public static void main(String args[]) {
         AbstractFactory AdidasFactory = FactoryCreator.getFactory("Adidas");
         
          Adidas a1 = AdidasFactory.getVaate("PAITA");
          Adidas a2 = AdidasFactory.getVaate("HOUSUT");
        
          a1.getVaate();
          a2.getVaate();
    }
}
