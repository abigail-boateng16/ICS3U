/**
 * 
 */
package boateng;

import lejos.nxt.LightSensor;
import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.nxt.SoundSensor;
import lejos.robotics.subsumption.Behavior;

/**
 * Culminating Assignment Continued... Step 5
 * This program makes the robot drive forward once a loud sound is detected
 * June 15 2017
 * @author Abigail Boateng
 */
public class DriveForward implements Behavior {
	private boolean suppressed =false;
	private SoundSensor sound;

	public DriveForward(SoundSensor ss){
		this.sound = ss;
	}
	
	@Override
	public boolean takeControl() {
		if (sound.readValue() > 20){
			return true;
		}
		return false;
	}

	@Override
	public void action() {
		Motor.A.forward();
		Motor.B.forward();
		while (suppressed =false){
			Thread.yield();
		}
		Motor.A.stop();
		Motor.B.stop();


	}

	@Override
	public void suppress() {
		suppressed=true;

	}

}
