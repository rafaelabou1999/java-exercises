package model;

import java.util.Scanner;

public class BankAccount {
	private String costumerName;
	private int costumerId;
	private double balance;
	private double cashIn;
	private double cashOut;

	
	public BankAccount() {
		super();
	}
	
	public BankAccount(String costumerName, int costumerId, double balance) {
		this.costumerName = costumerName;
		this.costumerId = costumerId;
		this.balance = balance;
	}
	
	

	
	
	Scanner sc = new Scanner(System.in);
	
	public void menu() {
		System.out.println("_______");
		System.out.println("Choose a number:");
		System.out.println("1.Check balance ");
		System.out.println("2.Deposit");
		System.out.println("3.Withdraw");
		System.out.println("Enter any other number to leave")
		System.out.println("_______");
		
		int option;
		do {
			
			System.out.println("Choose an option (1/2/3):");
			System.out.println();
			option = sc.nextInt();
			System.out.println();
			
			
		    switch (option) {
		    	
		    case 1:
		    	System.out.println("Total available: " + balance);
		    	break;
		    	
		    case 2:
		    	System.out.println("Enter an amount to deposit:");
		    	cashIn = sc.nextDouble();
		    
		    	balance +=  cashIn;
		    	System.out.println("..Deposited: $"+ cashIn + "\n (UPDATED) Balance: $" + balance);	
		    	break;
		    	
		    case 3:
		    	System.out.println("Enter an amount to withdraw: ");
		    	cashOut = sc.nextDouble();
		    	if (balance >= cashOut ) {
					
					balance -= cashOut;
					System.out.println("\n ..Withdraw: $:" + cashOut + "\n ..(UPDATED) Balance: $" + balance);
					
				} else {
					System.out.println("Error. There's not enough money");
					
				}
		    	break;
		    	
		    default:
		    	System.out.println("Leaving...");
		    }
		    
			
		} while(option == 1 || option == 2 || option == 3);
	}

}
