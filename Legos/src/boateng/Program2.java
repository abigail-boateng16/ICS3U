/**
 * 
 */
package boateng;

import lejos.nxt.Button;
import lejos.nxt.LCD;
import lejos.nxt.Motor;
import lejos.util.Delay;

/**
 * Program 2
 * 
 * May 25 2017
 * @author Abigail Boateng, Gayathiry Kris
 */
public class Program2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LCD.drawString("Program 2",0,0);
		Button.waitForAnyPress();
		Motor.A.setSpeed(720);
		Motor.A.forward();
		Delay.msDelay(2000);
		LCD.drawInt(Motor.A.getTachoCount(), 0, 1);
		Motor.A.stop();
		LCD.drawInt(Motor.A.getTachoCount(), 0, 2);
		Motor.A.backward();
		while(Motor.A.getTachoCount()!=0){
			Motor.A.backward();


		}
		LCD.drawInt(Motor.A.getTachoCount(), 0, 3);
		Motor.A.stop();
		LCD.drawInt(Motor.A.getTachoCount(), 0, 4);
		Button.waitForAnyPress();


	}

}


