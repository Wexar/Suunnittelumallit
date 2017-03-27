/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

import java.util.ArrayList;
import java.util.List;

public class Ram implements Laiteosa {
   
    final double hinta = 2.0;
    
    
    @Override
    public double getHinta() {
        return hinta;
    }
    @Override
    public void add(Laiteosa osa, int määrä) {
        throw new RuntimeException("Ramiin ei voida lisätä muita osia");
    }
 }
