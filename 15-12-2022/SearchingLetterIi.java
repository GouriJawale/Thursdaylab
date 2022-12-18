package StringConcepts;

import java.util.Scanner;

public class SearchingLetterIi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a;

		Scanner sc = new Scanner(System.in);
		// Entering a string eg. Insane
		System.out.println("Enter your input here: "); 
		a = sc.nextLine();

		// Checks if "I" is present in the given String

		if (((a.startsWith("i"))) || ((a.startsWith("I"))))
			System.out.println("The letter is present.");
		else
			System.out.println("No such input can be found");


	}

}
