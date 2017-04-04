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
public abstract class Täyte implements Pizza {
    protected Pizza pizzapohja;
    
    public Täyte (Pizza pizzapohja) {
        this.pizzapohja = pizzapohja;
    }
    
    public double getHinta() {
        return pizzapohja.getCost();
    }
    
    public String getDescription() {
        return pizzapohja.getDetails();
    }
}
