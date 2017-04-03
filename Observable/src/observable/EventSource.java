/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observable;

import java.util.Observable;
import java.util.Scanner;

/**
 *
 * @author Wexar
 */
public class EventSource extends Observable implements Runnable {
    public void run() {
        ClockTimer ck = new ClockTimer();
        while(true) {
            String response = ck.getTime();
            setChanged();
            notifyObservers(response);
            ck.tick();
        }
    }
}
