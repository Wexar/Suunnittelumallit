/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

/**
 *
 * @author Arttu
 */
public class Adapter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EuSocket euSocket = new EuSocket();
        
        euSocket.plug("home");
        euSocket.plug("foreign");
    }
    
}
