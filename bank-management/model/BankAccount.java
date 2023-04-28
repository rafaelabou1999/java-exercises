package model;

import java.util.Scanner;

public class BankAccount {
	private String costumerName;
	private int costumerId;
	private double balance;
	private double cashIn;
	private double cashOut;
	private double totalDown;
	private double totalUp;
	
	public BankAccount() {
		super();
	}
	
	public BankAccount(String costumerName, int costumerId, double balance) {
		this.costumerName = costumerName;
		this.costumerId = costumerId;
		this.balance = balance;
	}
	
	public double getCashIn() {
		return cashIn;
	}
	
	public void setCashIn(double cashIn) {
		this.cashIn = cashIn;
	}
	
	public void setCashOut(double cashOut) {
		this.cashOut = cashOut;
		
	}
	
	public double getCashOut() {
		return cashOut;
	}
	
	public double withdraw(double cashOut) {
		if (balance >= cashOut ) {
			totalDown = this.balance -= cashOut;
			System.out.println("Withdraw completed");
			return totalDown;
		} else {
			System.out.println("Error. There's not enough money");
			return totalDown;
		}
	

	}
	
	
	public double deposit(double cashIn) {
		totalUp = this.balance += cashIn;
		return totalUp;
	}
	
	Scanner sc = new Scanner(System.in);
	
	public void menu() {
		System.out.println("+++++++++++++++");
		System.out.println("Choose a number:");
		System.out.println("1.Check balance ");
		System.out.println("2.Deposit");
		System.out.println("3.Withdraw");
		
		int option;
		do {
				
			System.out.println();
			option = sc.nextInt();
			System.out.println();
			
			
		    switch (option) {
		    	
		    case 1:
		    	System.out.println("Total available: " + balance);
		    	break;
		    	
		    case 2:
		    	System.out.println("Enter an amounbt to deposit:");
		    	cashIn = sc.nextDouble();
		    	System.out.println("(UPDATED) Balance: " + deposit(cashIn));	
		    	break;
		    	
		    case 3:
		    	System.out.println("Enter an amount to withdraw: ");
		    	cashOut = sc.nextDouble();
		    	System.out.println("(UPDATED) Balance: " + withdraw(cashOut));
		    	break;
		    	
		    default:
		    	System.out.println("Leaving...");
		    }
		    
			
		} while(option == 1 || option == 2 || option == 3);
	}

}
