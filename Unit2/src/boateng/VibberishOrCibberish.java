/**
 * 
 */
package boateng;

import java.util.Scanner;

/**
 * Cibberish or Vibberish?
 * This program determines whether the random letters inputed by the user is vibberish, cibberish or giberish
 * Monday, April 10, 2017
 * @author Abigail Boateng, Ainslie Forbes, Gayathiry Kris and Sheila Noriega Mestanza
 */
public class VibberishOrCibberish {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a sentence");
		String sentence = sc.nextLine();
		int vowel=0;
		int consonant= 0;

		for (int j=0; j < sentence.length(); j++){
			if (sentence.charAt(j) == 'a' ||sentence.charAt(j) =='e'||sentence.charAt(j) =='i'||sentence.charAt(j) =='o'||sentence.charAt(j) =='u'){
				vowel= vowel +1;
			}
			else if (sentence.charAt(j) == (' ')){

			}
			else{
				consonant= consonant +1;
			}


		}
		if (consonant== vowel){
			System.out.println("Gibberish");
		}
		else if (consonant> vowel){
			System.out.println("Cibberish");
		}
		else{
			System.out.println("Vibberish");

		}
		

	}}
