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
public class Herkkusieni extends Täyte {
    private double omaHinta=2.3;
    private String description="Herkkusieni";
    
    public Herkkusieni(Pizza pizzapohja) {
        super(pizzapohja);
    }
    public double getCost() {
        return super.getHinta() + omaHinta;
    }
    public String getDetails() {
        return super.getDescription() + description + "\n\t" ;
    }
}
