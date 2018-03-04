package november3;

import java.util.Scanner;

public class MiddleCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			 String word;
			 Scanner input=new Scanner(System.in);
			 
			 System.out.println("Input a string: ");
			 word=input.next();
			 
			 int characters=word.length();
			 
			 if(characters%2==0) {
			  int evennumber=characters/2;
			  System.out.println("Middle character of "+word+" is: "+word.substring(--evennumber, ++evennumber+1));
			 
			 }else if(characters%2==1){
			  int oddnumber=(characters+1)/2;
			  System.out.println("Middle character of "+word+" is: "+word.substring(--oddnumber,oddnumber+1));
			 }
			 
			 }
			}




