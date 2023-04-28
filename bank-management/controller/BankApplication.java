package controller;

import java.util.Scanner;

import model.BankAccount;

public class BankApplication {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter your costumer ID: ");
		int id = sc.nextInt();
		
		System.out.println("Enter your balance:");
		double balance = sc.nextDouble();
		
		
		BankAccount account = new BankAccount(name, id, balance);
		
		
		System.out.println("Welcome " + name);
		System.out.println("Your costumer ID is " + id);
		
		account.menu();
		
		
	}
}
