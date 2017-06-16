/**
 * 
 */
package boateng;

import lejos.nxt.Button;
import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.nxt.SoundSensor;
import lejos.util.Delay;

/**
 * @author 324213115
 *
 */
public class Sound {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SoundSensor sound=new SoundSensor(SensorPort.S3,true);
		Motor.A.forward();
		Motor.B.forward();
		sound.readValue();
		while(Motor.A.isMoving()&&Motor.B.isMoving()){
			if(sound.readValue()>= 50){
				Motor.A.backward();
				Motor.B.backward();

			}
			sound.readValue();

			if (sound.readValue()>=50){
				//Delay.msDelay(1000);
				Motor.A.stop();
				Motor.B.stop();
			}
		}

	}

}


