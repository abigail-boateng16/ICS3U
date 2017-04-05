/**
 * 
 */
package boateng;

import java.util.Scanner;

/**
 * Finding The Greatest Common Factor
 * This program finds the greatest common factor between two numbers inputed by the user
 * Tuesday, April 4, 2017
 * @author Abigail Boateng
 */
public class GCF {

	public static void main(String[] args) {
		System.out.println("Enter two numbers that you want to find the  greatest common factor of. Press enter after each number");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num = GCF(num1,num2);
		System.out.println(GCF(num1,num2));



	}
	/**
	 * The method looks for the greatest common factor between the two numbers
	 * @param num1 the first number
	 * @param num2 the second number
	 * @return n or 1 depending on whether the two number are both divisible by a number other than 1
	 */
	public static int GCF (int num1, int num2){
		int max =Math.max(num1, num2);
		int min = Math.min(num1, num2);

		for (int n = min; n> 0; n--){
			if (isDivisible(max, n) && (isDivisible(min, n))){
				return n;
			}
		}
		return 1;
	}
	/**
	 * This method checks if the numbers are divisible by each other
	 * @param a The first number inputed by the user
	 * @param b The second number inputed by the user
	 * @return true or false depending on whether the two numbers are divisible by one another or not
	 */
	public static boolean isDivisible(int a,int b){
		if (a%b == 0){
			return true;
		}
		return false;
	}
}
