package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in); 
		
		System.out.println("Enter Year:");
		int Y1 = in.nextInt();
		
		boolean Leapyear = Y1 % 4 == 0 && Y1 % 100 != 0 || Y1 % 400 == 0;
		System.out.println(Y1 + " Is a leap year: " + Leapyear);
		
	}

}
