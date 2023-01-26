package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("Put in a value: ");
		int n1 = in.nextInt(); 
		
		System.out.println("Put in a second value: ");
		int n2 = in.nextInt();
		
		// Find the average of the two numbers
		double total = n1 + n2;
		
		double Average = total / 2;
		System.out.println("The Average is: " + Average);
		

}
	}

