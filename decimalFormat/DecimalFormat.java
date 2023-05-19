package classesUteis;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ex04 {
	public static void main(String[] args) {

		/*
		 * Create a program that asks what salary the user wants to earn, and then
		 * display the entered value formatted in R$, thousands separator and cents to
		 * two decimal places.
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("What's your dream salary?");
		double salary = sc.nextDouble();

		DecimalFormat df = new DecimalFormat("R$ ###,###,###.00");
		System.out.print("Your dream salary is ");
		System.out.print(df.format(salary));

		sc.close();
	}
}
