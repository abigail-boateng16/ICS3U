/**
 * 
 */
package boateng;

import lejos.nxt.LightSensor;
import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.nxt.TouchSensor;
import lejos.robotics.subsumption.Behavior;

/**
 * Culminating Assignment Continued
 * This method Changes the direction of the robot after it hits the bin
 * 
 * @author Abigail Boateng
 */
public class HitObject implements Behavior {
	private TouchSensor touch;
	private boolean suppressed =false;
	
	public HitObject(TouchSensor ts){
		this.touch = ts;
	}

	@Override
	public boolean takeControl() {
		if (touch.isPressed()){
			return true;
		}
		return false;
	}

	@Override
	public void action() {
		Motor.A.forward();
		Motor.B.forward();
		
	}

	@Override
	public void suppress() {
		suppressed=true;
		
	}
	
	

}
