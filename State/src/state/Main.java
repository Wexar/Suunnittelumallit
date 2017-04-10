/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

/**
 *
 * @author Arttu
 */
public class Main {
     public static void main(String[] args) {
     Context context = new Context();
       
      Squirtle squirtle = new Squirtle();
      Wartortle war = new Wartortle();
      Blastoise blas = new Blastoise();
      
      squirtle.takeState(context);
      squirtle.Attack();
      squirtle.evolve(context);
      System.out.println(context.getState());
      
      war.Attack();
      war.evolve(context);
      System.out.println(context.getState());
      
      blas.Attack();
      blas.evolve(context);
      System.out.println(context.getState());

      
      
      
      
      
   }
}
