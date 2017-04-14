/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

import java.util.ArrayList;

/**
 *
 * @author Arttu
 */
public class Context {
    private ListConverter listconverter;
    
    public Context(ListConverter listconverter){
        this.listconverter = listconverter;
    }
   
    public void executeStrategy(ArrayList<String> array) {
        listconverter.listToString(array);
    }
}
