/**
 * 
 */
package boateng;

import lejos.nxt.Button;
import lejos.nxt.LCD;
import lejos.nxt.LightSensor;
import lejos.nxt.Motor;
import lejos.nxt.SensorPort;

/**
 * @author 324213115
 *
 */
public class RotateNum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LightSensor light =new LightSensor(SensorPort.S2);
		Button.waitForAnyPress();
		Motor.A.forward();
		Motor.B.forward();
		while(Motor.A.isMoving()){
			while (light.getLightValue()>=45){
				Motor.A.rotate(40);
				Motor.B.stop();
				LCD.drawInt(Motor.A.getTachoCount(),0,0);
				LCD.clear();
			}
			Motor.B.forward();
			Motor.A.forward();
			if(Button.ENTER.isDown()){
				Motor.A.stop();
				Motor.B.stop();
			}
			
		}

	}
}
