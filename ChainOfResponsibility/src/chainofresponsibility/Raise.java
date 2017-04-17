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
abstract class Raise {
    
    protected Raise successor;
    
    public void setSuccessor(Raise successor) {
    this.successor = successor;
    }
    abstract public void processRequest(RaiseRequest request);
}

