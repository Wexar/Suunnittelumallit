/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Wexar
 */
public class Verkkokortti implements Laiteosa {
    
    private final double hinta = 40.4;
    private double summa;
    
    List<Laiteosa> verkkolista = new ArrayList();

    @Override
    public void add(Laiteosa osa, int lkm) {
        for (int i=0; i<lkm; i++) {
            verkkolista.add(osa);
        }
    }

    @Override
    public double getHinta() {
        for (Laiteosa osa :  verkkolista) {  
            summa += osa.getHinta();
        }
        summa+=hinta;
       
        System.out.println("verkkokortti:" + summa);
        return summa;
    }
}
