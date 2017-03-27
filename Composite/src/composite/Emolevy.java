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
public class Emolevy implements Laiteosa {
    
    private final double hinta = 10.0;
    private double summa;
    
    List<Laiteosa> emolevylista = new ArrayList();

    @Override
    public void add(Laiteosa osa, int lkm) {
        for (int i=0; i<lkm; i++) {
            emolevylista.add(osa);
        }
    }

    @Override
    public double getHinta() {
        for (Laiteosa osa :  emolevylista) {  
            summa += osa.getHinta();
        }
        summa+=hinta;
       
        System.out.println("emolevy:" + summa);
        return summa;
    }
}
