package classesUteis;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class ex04 {
	public static void main(String[] args) {

		/*
		 * Write a program that displays the number 123456.789 formatted in 8 currencies
		 * from different locales.
		 */
		
		double num = 123456.789;
		
		Locale local = new Locale("pt", "BR");
		NumberFormat nf = NumberFormat.getCurrencyInstance(local);
		System.out.println(nf.format(num));
		
		Locale pt= new Locale("pt", "PT");
		NumberFormat nf2 = NumberFormat.getCurrencyInstance(pt);
		System.out.println(nf2.format(num));
		
		Locale.setDefault(Locale.FRANCE);
		NumberFormat nf3 = NumberFormat.getCurrencyInstance();
		System.out.println(nf3.format(num));
		
		Locale.setDefault(Locale.CANADA);
		NumberFormat nf4 = NumberFormat.getCurrencyInstance();
		System.out.println(nf4.format(num));
		
		Locale.setDefault(Locale.CHINA);
		NumberFormat nf5 = NumberFormat.getCurrencyInstance();
		System.out.println(nf5.format(num));
		
		Locale.setDefault(Locale.GERMAN);
		NumberFormat nf6 = NumberFormat.getCurrencyInstance();
		System.out.println(nf5.format(num));
		
		Locale.setDefault(Locale.ITALY);
		NumberFormat nf7 = NumberFormat.getCurrencyInstance();
		System.out.println(nf7.format(num));
		

	}
}
