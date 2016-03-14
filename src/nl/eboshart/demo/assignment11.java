package nl.eboshart.demo;
import java.util.Scanner;
public class assignment11 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter type");
		int type=Integer.valueOf(s.next());
		System.out.println("enter amount");
		int amount=Integer.valueOf(s.next());
		double price1=2.95;
		double price2=4.99;
		double price3=5.49;
		double price4=7.8;
		double price5=8.85;
		double finalvalue=0;
		switch(type) {
		case 1:
			finalvalue=(double) amount*price1;
			System.out.println(finalvalue);
			break;
		case 2:
			finalvalue=(double) amount*price2;
			System.out.println(finalvalue);
			break;
		case 3:
			finalvalue=(double) amount*price3;
			System.out.println(finalvalue);
			break;
		case 4:
			finalvalue=(double) amount*price4;
			System.out.println(finalvalue);
			break;
		case 5:
			finalvalue=(double) amount*price5;
			System.out.println(finalvalue);
			break;
		}
		
	}
}
