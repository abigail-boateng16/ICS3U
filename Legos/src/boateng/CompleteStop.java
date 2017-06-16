/**
 * 
 */
package boateng;

import lejos.nxt.Button;
import lejos.robotics.subsumption.Behavior;

/**
 * Culminating Assignment Continued.... 
 * This class stops the entire program
 * June 12 2017
 * @author Abigail Boateng
 */
public class CompleteStop implements Behavior {


	@Override
	public boolean takeControl(){
		if (Button.ENTER.isDown()){
			return true;
		}
		return false;
	}

	@Override
	public void action() {
		System.exit(0);

	}

	@Override
	public void suppress() {


	}

}
