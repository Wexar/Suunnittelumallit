/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsibility;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Arttu
 */
public class ChainOfResponsibility {

    public static void main(String[] args) {
        Esimies esimies = new Esimies();
        Paallikko paallikko = new Paallikko();
        Toimitusjohtaja tj = new Toimitusjohtaja();
        esimies.setSuccessor(paallikko);
        paallikko.setSuccessor(tj);
        
        // Press Ctrl+Cto end.
        try{
            while(true) {
                System.out.println("Enter the % amount of raise you want.");
                System.out.print(">");
                double d = Double.parseDouble(new BufferedReader(new InputStreamReader(System.in)).readLine());
                esimies.processRequest(new RaiseRequest(d, "General"));
        }
        } catch(Exception e) {
            System.exit(1);
        }
    }
    
}
