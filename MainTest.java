package task3;

import java.util.Scanner;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s= new Scanner(System.in);
		System.out.print("Enter your current balance: ");
		double balance= s.nextDouble();
		
		BankAccount b= new BankAccount(balance);
		ATMmachine a= new ATMmachine(b);
		
		System.out.println("Choose one of the following:");
		System.out.println("1. Withdraw");
		System.out.println("2. Deposit");
		int n= s.nextInt();
		
		if (n==1) {
			System.out.println("Write down the amount you want to withdraw..");
			double amount= s.nextDouble();
			a.withdraw(amount);
			System.out.println();
			a.checkBalance();
		} else if (n==2) {
			System.out.println("Write down the amount you want to deposit..");
			double amount= s.nextDouble();
			a.deposit(amount);
			System.out.println();
			a.checkBalance();
		} else {
			System.out.println("the number you entered is invalid.");
		}
		
		

	}

}
