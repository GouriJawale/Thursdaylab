//Program to print the table on entered number.
package basicprogram;

import java.util.*;
public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		n = sc.nextInt();
		System.out.println("The table of "+n +" is:");
		for(int i=1;i<=10;i++) {
			System.out.println(n*i);
		}

	}

}
