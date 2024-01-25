package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		boolean isLeap = false;
		
		System.out.println("What year would you like to check for leaping?");
		int year = in.nextInt();
		
		isLeap = (year%4.0 == 0 && year%100.0 != 0) || (year%400 == 0);

		System.out.println(year + " is a leap year: " + isLeap);
	}

}
