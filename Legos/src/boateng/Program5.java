/**
 * 
 */
package boateng;

import lejos.nxt.Button;
import lejos.nxt.Motor;

/**
 * Program 5
 * 
 * May 30 2017
 * @author Abigail Boateng
 *
 */
public class Program5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Program 5");
		Motor.A.setSpeed(720);
		Motor.B.setSpeed(720);
		Button.waitForAnyPress();
		Motor.A.forward();
		Motor.B.forward(); 

	}

}
