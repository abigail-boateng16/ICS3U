/**
 * 
 */
package boateng;

import lejos.nxt.Button;
import lejos.nxt.LCD;
import lejos.nxt.LightSensor;
import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.robotics.subsumption.Behavior;

/**
 * Culminating Assignment Continued...Step 2
 * This program makes the robot do a full lap around the track following the black line
 * June 13 2017
 * @author Abigail Boateng
 *
 */
public class DoLaps implements Behavior{
	private boolean suppressed=false;
	//private LightSensor light;
	LightSensor light= new LightSensor(SensorPort.S2);

	public DoLaps (LightSensor ls){
		this.light = ls;
	}


	@Override
	public boolean takeControl() {
		if (Button.ESCAPE.isDown()){//begins the program
			return true;
		}
		return false;
	}

	@Override
	public void action() {
		Motor.A.forward();
		Motor.B.forward();
		while(Motor.B.isMoving()){
			while (light.getLightValue()>=45){//when a value lower than this is detected the motor will rotate until black is detected again
				Motor.B.rotate(40);
				Motor.A.stop();
			}
			Motor.B.forward();
			Motor.A.forward();
			/**if(Button.ENTER.isDown()){
				Motor.A.stop();
				Motor.B.stop();
			}*/
			if(light.getLightValue()<=35&&light.getLightValue()>=27){//this makes the robot stop on a green sticky note
				Motor.A.stop();
				Motor.B.stop();
			}
			Thread.yield();
		}

	}

	@Override
	public void suppress() {
		suppressed=true;

	}

}
