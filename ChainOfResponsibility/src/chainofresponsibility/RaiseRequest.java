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
class RaiseRequest {
    private double amount;
    
    public RaiseRequest(double amount, String purpose) {
    this.amount = amount;
   
    }
    public double getAmount() {
    return amount;
    }
    public void setAmount(double amt) {
    amount = amt;
    }
}
