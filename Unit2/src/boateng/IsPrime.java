/**
 * 
 */
package boateng;

import java.util.Scanner;

/**
 * Is Prime
 * The program takes the number inputed by the user and runs it through a method the looks for a number that can even fit into it other than 1 and itself
 * Tuesday, April 4, 2017
 * @author 324213115
 */
public class IsPrime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check if it is a prime number");
		int num = sc.nextInt();
		boolean x = isPrime(num);
		System.out.println(x);
		

	}
	/**
	 * This method runs through the numbers between 2 and the number inputed by the user to find a number that can evenly divide into it.
	 * @param num1
	 * @return true or false depending on whether or not a number is found that can evenly fit into the number
	 */
	public static boolean isPrime(int num1){
		for (int i = 2; i< num1; i++){
			if (isDivisible(num1,i)){
				return false;
			}
		}
		return true;
	}
	/**
	 * This method takes the number inputed by the user and square roots it and subtracts 1 until a number is found that can evenly fit into the number.
	 * @param a and c 
	 * @return true or false depending on the result of the if statement
	 */
	
	public static boolean isDivisible(int a,int c){
		for (int b= (int) Math.sqrt(a); b>1; b--){
			if (a%b == 0){
				return true;
			}
			return false;
		}
		return false;
	}

}
