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
public class Tomaattikastike extends Täyte {
    
    private double omaHinta=3.4;
    private String description="tomaattikastike";
    
    public Tomaattikastike(Pizza pizzapohja) {
        super(pizzapohja);
    }
    @Override
    public double getCost() {
        return super.getHinta() + omaHinta;
    }
    @Override
    public String getDetails() {
        return super.getDescription() + description + "\t";
    }
}
