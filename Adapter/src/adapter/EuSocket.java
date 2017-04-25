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
public class EuSocket implements HomeSocket {
    PlugAdapter plugAdapter;

    @Override
    public void plug(String plugType) {
        if(plugType.equalsIgnoreCase("home")){
            System.out.println("plugging the plug to " + plugType);
    }
         else if(plugType.equalsIgnoreCase("foreign")){
             plugAdapter =  new PlugAdapter(plugType);
             System.out.println("It seems you need an adaport");
             plugAdapter.plug(plugType);
         }
    }
}
