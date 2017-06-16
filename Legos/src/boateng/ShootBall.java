/**
 * 
 */
package boateng;

import lejos.nxt.LightSensor;
import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.nxt.SoundSensor;
import lejos.robotics.subsumption.Behavior;
import lejos.util.Delay;

/**
 * Culminating Assignment Continued... Step 6
 * This program shoots a ball into a bin by moving motor C forward really quickly
 * June 14 2017
 * @author Abigail Boateng
 *
 */
public class ShootBall implements Behavior {
private SoundSensor sound;
private boolean suppressed=false;

public ShootBall(SoundSensor ss){
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
		Motor.C.setSpeed(3600);
		Motor.C.forward();
		Delay.msDelay(2000);
		
	}

	@Override
	public void suppress() {
		suppressed= true;
		
	}

}
