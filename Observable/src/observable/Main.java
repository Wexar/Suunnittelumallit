/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observable;

import java.util.Observable;
import java.util.Observer;

public class Main {
    public static void main(String[] args) {
        EventSource eventSource = new EventSource();
        eventSource.addObserver(new Observer() {
            public void update(Observable obj, Object arg) {
                System.out.println(arg);
            }
        });

        new Thread(eventSource).start();
    }
}
