package boateng;
/**
 * Culminating Continued...Step 5
 * This program is part of my culminating and it identifies the red dot and stops right before it
 * June 13, 2017
 * @author Abigail Boateng
 */

import lejos.nxt.LightSensor;
import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.robotics.subsumption.Behavior;

public class IdentifyRed implements Behavior {
	private LightSensor light;
	private boolean suppressed =false;

	public IdentifyRed(LightSensor ls){
		this.light = ls;
	}

	@Override
	public boolean takeControl() {
		if (light.getLightValue()>=50 && light.getLightValue()<=57){//stops the robot when it detects the color red
			return true;
		}

		return false;
	}

	@Override
	public void action() {
		Motor.A.stop();
		Motor.B.stop();

	}

	@Override
	public void suppress() {
		suppressed=true;

	}


}
