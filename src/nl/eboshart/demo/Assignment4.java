package nl.eboshart.demo;

import java.util.Scanner;

public class Assignment4 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter first length");
		double length1=Double.valueOf(s.next());
		System.out.println("enter second length");
		double length2=Double.valueOf(s.next());
		System.out.println(Math.sqrt(Math.pow(length1,2)+Math.pow(length2,2)));
		
		
	}
}
