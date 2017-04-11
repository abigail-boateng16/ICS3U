/**
 * 
 */
package boateng;

import java.util.Scanner;

/**
 * Reverse Sentence
 * This program takes a sentence inputed by the user and reverses the order 
 * Friday, April 7, 2017
 * @author Abigail Boateng
 */
public class ReverseSentence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence");
		//String word = sc.nextLine();
		String [] sentence = sc.nextLine().split(" ");
				
		for (int i=0; i< sentence.length; i++){
			for (int j = sentence[i].length()-1; j>=0; j--){
				System.out.print(sentence[i].charAt(j));
			}
			System.out.print(" ");
			
		}

	}

}
