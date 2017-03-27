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
public class Kotelo implements Laiteosa {
    
    private final double hinta = 62.8;
    private double summa;
    
    List<Laiteosa> kotelolista = new ArrayList();

    @Override
    public void add(Laiteosa osa, int lkm) {
        for (int i=0; i<lkm; i++) {
            kotelolista.add(osa);
        }
    }

    @Override
    public double getHinta() {
        for (Laiteosa osa : kotelolista) {  
            summa += osa.getHinta();
        }
        summa+=hinta;
       
        System.out.println("kotelo:" + summa);
        return summa;
    }
}
