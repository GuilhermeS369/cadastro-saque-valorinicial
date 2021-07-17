package application;

import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account data");
		System.out.print("Number: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("Holder: ");
		String name = sc.nextLine();
		System.out.print("Initial balance: ");
		double balance = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		double withdrawLimit = sc.nextDouble();
		Account ac = new Account(number, name, balance, withdrawLimit);
		try {
		System.out.println("Enter amount for withdraw: ");
		ac.withdraw(sc.nextDouble());
		System.out.println("New balance: ");
		System.out.print(String.format("%.2f", ac.getBalance()));
		}
		
		catch(DomainException v) {
			System.out.print("Withdraw error: " + v.getMessage());
			
		}
		catch(RuntimeException v) {
			System.out.println("ERRO INESPERADO");
		}
		
		sc.close();
		

	}

}
