package december2;

import java.util.Scanner;

public class MultipleChoiceProgram {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println
("What is the correct way to declare a variable to store an integer value in Java?");
		System.out.println("a. int 1x=10;");
		System.out.println("b. int x=10;");
		System.out.println("c. float x=10.0f;");
		System.out.println("d. string x=\"10\";");
		System.out.println("Enter your choice: ");
		String choice = scan.nextLine().toLowerCase();
		
		switch(choice) {
		case "a": case "b": case "d":
		System.out.println("your answer is incorrect.");
		break;
		case "c":
		System.out.println("your answer is correct.");
		break;
		default:
			System.out.println("Invalid grade. a, b, c or d only");
		}
		
	
	}

}
