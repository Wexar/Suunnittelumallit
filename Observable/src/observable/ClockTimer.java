/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observable;

import java.util.GregorianCalendar;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Wexar
 */
public class ClockTimer  {
    
    
    public String getTime(){
		String time = "";

		GregorianCalendar calendario = new GregorianCalendar();   
		int h = calendario.get(GregorianCalendar.HOUR_OF_DAY);   
		int m = calendario.get(GregorianCalendar.MINUTE);   
		int s = calendario.get(GregorianCalendar.SECOND);   
		time += ((h < 10) ? "0" : "") + h + ":";
		time += ((m < 10) ? "0" : "") + m + ":";
		time += ((s < 10) ? "0" : "") + s;

		return time;
    
    
}
    public void tick() {
        try {
            Thread.sleep(1000);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
}
    }
}
