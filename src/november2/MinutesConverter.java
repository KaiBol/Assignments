package november2;

import java.util.Scanner;

public class MinutesConverter {
	

	public static void main(String[] args) {
		
		System.out.println("Please enter the number in minutes, converts it to years and days.");
		
		Scanner superman =new Scanner(System.in);
		
		int minutes=superman.nextInt();
		
		int hours=minutes/60;
		int days=hours/24;
		int years=days/365;
		int sixYears=365*6;
		int modul=days-sixYears;
		
		System.out.println( "approximetly " + years + "and " + days);
		//3456789 minutes is approximately 6 years and 210 days		
	}

}
