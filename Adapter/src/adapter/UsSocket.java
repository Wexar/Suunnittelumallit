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
public class UsSocket implements ForeignSocket {
  
    public void plug(String plugType) {
        System.out.println("plugging the plug to " + plugType);
    }
}
