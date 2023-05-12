package plus;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayList02 {
	public static void main(String[] args) {
		/*
		 * Create a menu program with the following options: 1. Add Elements 2. Remove
		 * Elements 3. Display Elements 4. Exit
		 * 
		 * This program runs infinitely until the user chooses the fourth option
		 */

		Scanner sc = new Scanner(System.in);

		ArrayList<Integer> myList = new ArrayList<>();
		System.out.println("Choose a number: " + "\n 1.Add Elements " + "\n 2.Remove Elements "
				+ "\n 3.Display Elements " + "\n 4.Exit");

		int element = 0;

		while (true) {
			System.out.println("Select an option again:");
			int chosenNumber = sc.nextInt();
			if (chosenNumber == 1) {
				System.out.println("Enter the number to be added:");
				element = sc.nextInt();
				myList.add(element);

			} else if (chosenNumber == 2) {
				System.out.println("Enter the number that you want to remove:");
				element = sc.nextInt();

				try {
					if (myList.contains(element)) {
						myList.remove(element);
					}

				}

				catch (IndexOutOfBoundsException e) {
					System.out.println("INVALID. This element does not exist");
				}

			} else if (chosenNumber == 3) {

				System.out.println("Enter the index of the number you wish to check:");
				element = sc.nextInt();

				try {
					if (myList.contains(element)) {
						myList.get(element);
					}

				}

				catch (IndexOutOfBoundsException e) {
					System.out.println("INVALID. Index Out of Bounds");
				}

			} else if (chosenNumber == 4) {
				Collections.sort(myList);
				System.out.println("FINAL LIST:" + myList);
				System.out.println("LEAVING THE PROGRAM...");
				break;
			}

		}

		sc.close();

	}
}
