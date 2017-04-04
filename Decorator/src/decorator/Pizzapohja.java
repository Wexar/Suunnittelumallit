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
public class Pizzapohja implements Pizza{

    private double price=5.0;
    private String description="pizzapohja";
    
    public double getCost() {
        return price;
    }
    
    public String getDetails() {
        return "\t" + description + "\n\t";
    }
}