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
public class PlugAdapter implements HomeSocket {
    
    ForeignSocket foreignSocket;
    
    public PlugAdapter(String plugType) {
        foreignSocket = new UsSocket();
    }
    
    @Override
    public void plug(String plugType) {
        foreignSocket.plug(plugType);
    }
    
}
