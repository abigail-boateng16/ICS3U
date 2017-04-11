/**
 * 
 */
package boateng;

import java.util.Scanner;

/**
 * Batman vs Superman
 * This program determines the outcome of the battle between Batman and Superman based on the numbers inputed by the user
 * Tuesday, April 11, 2017
 * @author 324213115
 */
public class SupermanVsBatman {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers on each line. Press space between them");
		int aB = sc.nextInt();
		int dB = sc.nextInt();
		int aS = sc.nextInt();
		int dS = sc.nextInt();
		
		if (aB> aS && dB> dS){
			System.out.println("Batman");
		}
		else if (aS> aB && dS > dB){
			System.out.println("Superman");
		}
		else{
			System.out.println("Inconclusive");
		}
		
	}

}
