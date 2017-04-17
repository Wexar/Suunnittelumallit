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
public class Paallikko extends Raise {
    
    double limit = 5.0;
    
    public void processRequest(RaiseRequest request) {
        if (request.getAmount() < limit) {
            System.out.println(
                "Päällikkö hyväksyi palkankorotuksesi $" + request.getAmount());
        } else if (successor != null) {
            successor.processRequest(request);
}
}
}