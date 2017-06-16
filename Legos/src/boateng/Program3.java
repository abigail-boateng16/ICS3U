/**
 * 
 */
package boateng;

import lejos.nxt.Button;
import lejos.nxt.LCD;
import lejos.nxt.Motor;

/**
 * Program 3
 * 
 * May 25 2017
 * @author Abigail Boateng, Gayathiry Kris
 */
public class Program3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LCD.drawString("Program 3",0,0);
		Motor.A.rotate(1440);
		LCD.drawInt(Motor.A.getTachoCount(), 0, 1);
		Motor.A.rotate(0);
		LCD.drawInt(Motor.A.getTachoCount(), 0, 2);
		Button.waitForAnyPress();

	}

}
