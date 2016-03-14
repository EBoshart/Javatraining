package nl.eboshart.demo;

import java.util.Scanner;

public class scannerdemo {
	public static void main(String[] args) {
		System.out.println("Voer een getal in");
		Scanner s = new Scanner(System.in);
		int input = Integer.valueOf(s.next());
		System.out.println("Uw invoer is: "+ input);
	}
}
