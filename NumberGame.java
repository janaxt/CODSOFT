package codsoft;

import java.util.Scanner;

public class NumberGame {
	
	public static void main(String args[]) {
	Scanner s= new Scanner(System.in);
	
	int num=(int)(Math.random()*100);
	
	System.out.println("Guess the number! You have only 5 tries.");
	System.out.print("Enter your number: ");
	int guessed= s.nextInt();
	int count=0;
	
	while(guessed!=num) {
		System.out.println("-------------------------");
		System.out.println("wrong number! try again..");
		System.out.print("Enter your number: ");
		int guess2= s.nextInt();
		count++;
		guessed= guess2;
		
		if (count>6) {
			break;
		}
	}
	
	System.out.println();
	if (count>6 && guessed!=num) {
		System.out.println("Unfortunately you're out of tries. The number was "+num+".");
	} else {
	System.out.println("Congrats! you found the number "+num+" after "+count+ " tries!");
	}
	}
}