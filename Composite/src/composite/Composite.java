/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

/**
 *
 * @author Wexar
 */
public class Composite {
    public static void main(String[] args) {
        
  
        Laiteosa näyttis = new Näytönohjain();
        Laiteosa tuuletin = new Tuuletin();
        Laiteosa ram = new Ram();
        Laiteosa muistipiiri = new Muistipiiri();
        
        Laiteosa emolevy = new Emolevy();
        emolevy.add(ram, 1);
        emolevy.add(näyttis, 1);
        
        Laiteosa verkkokortti = new Verkkokortti();
        verkkokortti.add(muistipiiri, 2);
        
        Laiteosa kotelo = new Kotelo();
        kotelo.add(tuuletin, 1);
        kotelo.add(emolevy, 1);
        kotelo.add(verkkokortti, 1);
        kotelo.getHinta();
     
}
    
}