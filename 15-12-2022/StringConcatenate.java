package StringConcepts;

import java.util.Scanner;

public class StringConcatenate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1;
		String str2;
		String str3;
		Scanner sc = new Scanner (System.in);
		
		//First string  input from user
		System.out.println("Enter String 1 here: ");
		str1 = sc.nextLine();
		
		//Second String input from user
		System.out.println("Enter String 2 here: ");
		str2 = sc.nextLine();
		
		//Concatenating first and second string
		str3 = str1.concat(" "+str2);
		
		System.out.println("Concatenated String is as follows: "+str3);

	}

}
