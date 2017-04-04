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
public class Tonnikala extends Täyte {
    private double omaHinta=1.0;
    private String description="tonnikala";
    
    public Tonnikala(Pizza pizzapohja) {
        super(pizzapohja);
    }
    public double getCost() {
        return super.getHinta() + omaHinta;
    }
    public String getDetails() {
        return super.getDescription() + description + "\n\t" ;
    }
}
