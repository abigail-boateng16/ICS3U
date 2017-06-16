/**
 * 
 */
package boateng;

import lejos.nxt.Button;
import lejos.nxt.LCD;
import lejos.nxt.Motor;
import lejos.util.Delay;

/**
 * @author 324213115
 *
 */
public class Program4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LCD.clear();
		LCD.drawString("Program 4", 0, 0);
		Motor.A.rotate(-1440,true);
		while (Motor.A.isMoving()) {
			System.out.println(Motor.A.getTachoCount());
			//if (Button.ENTER.isDown()) {
				//Motor.A.stop();
			//}
			if (Button.ENTER.isDown()){
				Button.waitForAnyPress();
				Motor.A.stop();
			}
		}
			//Button.waitForAnyPress();
			//Motor.A.stop();
		LCD.clear();
		LCD.drawInt(Motor.A.getTachoCount(), 0, 0);
		Button.waitForAnyPress();

	}
}
