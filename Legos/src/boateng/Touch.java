/**
 * 
 */
package boateng;

import lejos.nxt.Button;
import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.nxt.TouchSensor;

/**
 * 
 * May 30 2017
 * @author Abigail Boateng
 *
 */
public class Touch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	TouchSensor touch = new TouchSensor(SensorPort.S1);
	while(touch.isPressed()==false){
	Motor.A.backward();
	Motor.B.backward();
	}
    touch.isPressed();
    if (touch.isPressed()==true){
    Motor.A.forward();
	Motor.B.forward();
    }
    Button.waitForAnyPress();
    
	}

}
