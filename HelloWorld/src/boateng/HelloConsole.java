/**
 * 
 */
package boateng;
import hsa_new.Console;
/**
 * 
 * @author Abigail Boateng
 *
 */
public class HelloConsole {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Console console = new Console();
		double mark1;
		double mark2;
		double mark3;
		double mark4;
		console.println("Hello, Please enter your your first mark");
		mark1= console.readDouble();
		console.println("Hello, Please enter your your second mark");
		mark2= console.readDouble();
		console.println("Hello, Please enter your your third mark");
		mark3= console.readDouble();
		console.println("Hello, Please enter your your fourth mark");
		mark4= console.readDouble();
		double average;
		average= (mark1 + mark2 + mark3 +mark4)/4;
		average= Math.round(1);
		console.println("Your average is "+average);
		if (average <=60){
			console.println("Do better, I know you can do it.");
		}
		else if (average >=61 && average <=79){
			console.println("You're almost there! Try harder.");
					
					console.drawMapleLeaf(500, 250, 400, 300);
		}
		else if(average >=80 && average <100){
			console.println("Wow! Your doing great. Keep up the good work!");
		}

	}

}
