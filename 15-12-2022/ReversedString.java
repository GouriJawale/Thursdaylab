package StringConcepts;

import java.util.Scanner;
public class ReversedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String original;
		String reversed=" ";

		 Scanner sc = new Scanner (System.in);
		 System.out.println("Enter the string you wish to reverse: ");
		 original = sc.nextLine();
		 
		 // To reverse and display the string
		 for(int i = 0;i<original.length();i++)
		 {
			reversed = original.charAt(i)+reversed;
		 }
		 System.out.println("The reversed String is as follows: "+reversed);  

	}

}
