/**
 * 
 */
package boateng;

import lejos.nxt.LightSensor;
import lejos.nxt.SensorPort;
import lejos.nxt.SoundSensor;
import lejos.nxt.TouchSensor;
import lejos.robotics.subsumption.Arbitrator;
import lejos.robotics.subsumption.Behavior;

/**
 * Culminating Assignment
 * This is the main part of my culminating that executes the program in order by the highest priority
 * June 6,2017
 * @author Abigail Boateng
 *
 */
public class CulminatingAbby {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TouchSensor touch= new TouchSensor(SensorPort.S3);
		LightSensor light= new LightSensor(SensorPort.S2);
		SoundSensor sound= new SoundSensor (SensorPort.S2,true);

		Behavior b1 =new CompleteStop();//This class completely stops the entire program
		Behavior b2 =new DriveForward(sound);//This class makes the robot drive forward when a sound is detected
		Behavior b3 =new DriveBackward(sound);//This class makes the robot drive backward when a sound is detected
		Behavior b4 =new HitObject(touch);//This class makes the robot change direction when it comes into contact with an object
		Behavior b5 =new IdentifyRed(light);//This class makes the robot stop when the red spot is identified
		Behavior b6 =new ShootBall(sound);//This class makes the robot shoot the ball when a loud sound is detected
		Behavior b7 =new DoLaps(light);//This class makes the robot do laps around the track following the black line
		Behavior b8 =new ClapDriveForward(touch, light);//This class makes the robot drive forward once it comes into contact with an object and stop once it detects the red spot

		Behavior [] behaviors= {b7,b1};//in order of priority, last= highest priority

		Arbitrator arby= new Arbitrator(behaviors);
		arby.start();

	}

}
