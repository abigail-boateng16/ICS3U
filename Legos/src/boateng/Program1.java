/**
 * 
 */
package boateng;

import lejos.nxt.Button;
import lejos.nxt.Motor;

/**
 * May 24 2017
 * @author 324213115
 *
 */
public class Program1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			
        
		Button.waitForAnyPress();
        Motor.A.forward();
        Motor.B.forward();
        
        System.out.println("FORWARD");
        Button.waitForAnyPress();
        Motor.A.backward();
        Motor.B.backward();
        System.out.println("BACKWARD");
        Button.waitForAnyPress();
        Motor.A.stop();
        Motor.B.stop();
        System.out.println("STOP");
        

	}

}
