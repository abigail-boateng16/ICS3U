/**
 * 
 */
package boateng;

import java.util.Scanner;

/**
 * Sum of Digits
 * This program prints the sum of the digits in a number entered by the user to the system
 * Friday March 31 2017
 * @author 324213115
 */
public class SumDigits {


	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number");
int num = sc.nextInt();
int x = sumDigits(num);
System.out.println(x);


	}
	/**
	 * This method adds the digits of a number that was inputed by the user from the main method by scanning it in and returning it back to back
	 * @param n the numbers inputed by the user in the array
	 * @return s The largest number in the array
	 */
	public static int sumDigits (int n){
		int s = 0;
		while (n>=1){
			s =s + n % 10;
			n= n/10;
		}
		return s;
	}

}
