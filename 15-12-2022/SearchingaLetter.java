package StringConcepts;

import java.util.Scanner;
public class SearchingaLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           String a;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your input here:"); 
		a = sc.nextLine();

		// Checking for 'e' in the string 
		
		if (a.contains("e"))
			System.out.println("The string contains the given letter");
		else
			System.out.println("No such letter can be found in the string");

	}

}
