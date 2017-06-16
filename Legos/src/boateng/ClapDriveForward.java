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
 * @author 324213115
 *
 */
public class ClapDriveForward implements Behavior {
	//private TouchSensor touch;
	//private LightSensor light;
	private boolean suppressed= false;
	LightSensor light= new LightSensor(SensorPort.S2);
	TouchSensor touch= new TouchSensor(SensorPort.S1);

	public ClapDriveForward(TouchSensor ts, LightSensor ls){
		this.touch = ts;
		this.light = ls;
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
		if (light.getLightValue()>=50 && light.getLightValue()<=57){
			Motor.A.stop();
			Motor.B.stop();
		}

	}

	@Override
	public void suppress() {
		suppressed=true;

	}

}
