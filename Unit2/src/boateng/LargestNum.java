/**
 * 
 */
package boateng;

import java.util.Scanner;

/**
 * Largest Number
 * This program compares all the number in an array inputed by the user to find the largest number and displays it to the screen.
 * Monday, April 3, 2017
 * @author Abigail Boateng
 */
public class LargestNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the amount of numbers you would like to enter.");
		int x = sc.nextInt();
		System.out.println("Enter the numbers. Press enter after each number");
		int [] nums = new int[x];
		for(int i=0; i<x; i++){ //the loops the program as many times as the user wanted so they can input all the numbers
			nums[i]= sc.nextInt();
		}
		int n = greatestNum(nums);
		System.out.println(n);
	}
	/**
	 * The method takes the number of the array that have been inputed by the user and compare them to one another to obtain the largest number in the array before returning it to the main method
	 * @param num These are the numbers inputed by the user in the array
	 * @return max This is the biggest number of the array
	 */
	public static int greatestNum(int[]num){
		int max=0;
		 for (int i=0; i < num.length; i++){
			 max = Math.max(max, num[i]);
		 }
		 return max;
	}
}
