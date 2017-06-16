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
public class Light {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		LightSensor light=new LightSensor(SensorPort.S2);
		light.getLightValue();
		/*Button.waitForAnyPress();
		Motor.A.forward();
		while(Motor.A.isMoving()){
		if (light.getLightValue()>=40){
			Motor.A.forward();

		}else{
			Motor.A.backward();
		}
		Button.ENTER.isDown();
		if (Button.ENTER.isDown()==true){
	    Motor.A.stop(); 
		Motor.B.stop();

		}*/
		Button.waitForAnyPress();
		while (Button.ENTER.isUp()==true) {
			light.getLightValue();
			LCD.clear();
			LCD.drawInt(light.getLightValue(),0,0);
			if (Button.ENTER.isDown()) {
				break;
			}
		}

	}
}



//}
