/**
 * 
 */
package boateng;

import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.nxt.SoundSensor;
import lejos.robotics.subsumption.Behavior;

/**
 * Culminating Assignment Continued... Step7
 * This program makes the robot drive backwards once a sound with a value higher than or equal to 50 is detected
 * June 14 2017
 * @author Abigail Boateng
 */
public class DriveBackward implements Behavior {
	private SoundSensor sound;
	private boolean suppressed =false;

	public DriveBackward(SoundSensor ss){
		this.sound = ss;
	}
	@Override
	public boolean takeControl() {
		if (sound.readValue()>=50){
			return true;
		}
		return false;
	}

	@Override
	public void action() {
		Motor.A.backward();
		Motor.B.backward(); 

	}

	@Override
	public void suppress() {
		suppressed= true;

	}

}
