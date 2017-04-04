/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 *
 * @author Wexar
 */
public class Main {
    public static void main(String[] args) {
        
        Pizza kinkkupizza = new Tomaattikastike(new Kinkku(new Pizzapohja()));
        System.out.println("Kinkkupizza: " + kinkkupizza.getCost() + "€");
        System.out.println(kinkkupizza.getDetails() + "\n");
        
        Pizza kalapizza = new Tomaattikastike(new Tonnikala(new Pizzapohja()));
        System.out.println("Kalapizza: " + kalapizza.getCost() + "€");
        System.out.println(kalapizza.getDetails() + "\n");
        
        Pizza sienipizza = new Tomaattikastike(new Herkkusieni(new Pizzapohja()));
        System.out.println("Sienipizza: " + sienipizza.getCost() + "€");
        System.out.println(sienipizza.getDetails() + "\n");
        
    }
}
