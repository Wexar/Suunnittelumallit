/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsibility;

/**
 *
 * @author Arttu
 */
public class Toimitusjohtaja extends Raise {
    
    double limit = 100.0;
    
    public void processRequest(RaiseRequest request) {
        if (request.getAmount() < limit) {
            System.out.println(
                "Toimitusjohtaja hhyväksyy korotuksesi $" + request.getAmount());
        } else  {
            System.out.println("Olet humalassa");
}
}
}
