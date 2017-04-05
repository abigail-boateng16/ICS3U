/**
 * 
 */
package boateng;

import java.util.Scanner;

/**Factorial Program
 * Friday March 30, 2017
 * @author Abigail Boateng
 *This program gives the factorial of a number inputed by the user.
 */
public class Factorial {
	
	
	


public static void main(String[]args){
System.out.println("Enter a number");
Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	double y = factorial(num);
	System.out.println(y);
	 
}
/**
 * This method finds the factorial of a number inputed by the user
 * @param n The number inputed by the user
 * @return x the factorial of the number inputed
 */
public static double factorial (int n){
	double x=1;
	for(int i=n; i>0; i--){
		if (i > 0){
			x=x*i;
		}
		else if (i < 0){
			x=-1;
		}
		else{
			x=1;
		}
			
	}
	return x;
}

}