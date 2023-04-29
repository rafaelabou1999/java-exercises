package guessing;

import java.util.Scanner;

public class GuessingGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("GUESSING GAME");
		System.out.println("There will be 3 rounds and you will only have 4 guesses for each");
		System.out.println("Enter a number between 1 and 10:");
		int yourGuess = sc.nextInt();
		int computerGuess = (int) Math.floor(Math.random()* 10+ 1);
		int guess = 0;
		int scoreComputer = 0;
		int scorePerson = 0;
		
	        System.out.println("ROUND 1");
		for (guess = 0; guess < 5; guess++) {
			if (yourGuess > computerGuess) {
				System.out.println("Too high. Try again.");
				System.out.println("Enter a number between 1 and 10:");
				yourGuess = sc.nextInt();
				guess++;
				if (guess == 5) {
					System.out.println("YOU LOST ROUND 1");
					scoreComputer += 1;
				}
			} else if (yourGuess < computerGuess){
				System.out.println("Too low. Try again.");
				System.out.println("Enter a number between 1 and 10:");
				yourGuess = sc.nextInt();
				guess++;
				if (guess == 5) {
					System.out.println("YOU LOST ROUND 1");
					scoreComputer +=1;
				}
			} else {
				System.out.println("YOU WON ROUND 1");
				scorePerson += 1;
				guess = 5;
				
			}
		}

		System.out.println();
		System.out.println("Total guesses: " + guess);
		System.out.println("Computer (" + scoreComputer + ") X You (" + scorePerson + ")");
		System.out.println("ROUND 2");
		guess = 0;
		for (guess = 0; guess < 5; guess++) {
			if (yourGuess > computerGuess) {
				System.out.println("Too high. Try again.");
				System.out.println("Enter a number between 1 and 10:");
				yourGuess = sc.nextInt();
				guess++;
				if (guess == 5) {
					System.out.println("YOU LOST ROUND 2");
					scoreComputer += 1;
				}
			} else if (yourGuess < computerGuess){
				System.out.println("Too low. Try again.");
				System.out.println("Enter a number between 1 and 10:");
				yourGuess = sc.nextInt();
				guess++;
				if (guess == 5) {
					System.out.println("YOU LOST ROUND 2");
					scoreComputer +=1;
				}
			} else {
				System.out.println("YOU WON ROUND 2");
				scorePerson += 1;
				guess = 5;
				
			}
		}
		
		System.out.println("Total guesses: " + guess);
		System.out.println("Computer (" + scoreComputer + ") X You (" + scorePerson + ")");
		
		System.out.println("ROUND 3");
		
		guess = 0;
		for (guess = 0; guess < 5; guess++) {
			if (yourGuess > computerGuess) {
				System.out.println("Too high. Try again.");
				System.out.println("Enter a number between 1 and 10:");
				yourGuess = sc.nextInt();
				guess++;
				if (guess == 5) {
					System.out.println("YOU LOST ROUND 2");
					scoreComputer += 1;
				}
			} else if (yourGuess < computerGuess){
				System.out.println("Too low. Try again.");
				System.out.println("Enter a number between 1 and 10:");
				yourGuess = sc.nextInt();
				guess++;
				if (guess == 5) {
					System.out.println("YOU LOST ROUND 2");
					scoreComputer +=1;
				}
			} else {
				System.out.println("YOU WON ROUND 2");
				scorePerson += 1;
				guess = 5;
				
			}
		}
		
		System.out.println("Computer (" + scoreComputer + ") X You (" + scorePerson + ")");
		
		if (scoreComputer > scorePerson) {
			System.out.println("THE COMPUTER WON!");
		} else {
			System.out.println("YOU WON!");
		}
		sc.close();
	}
}

