package nl.eboshart.demo;
import java.util.Scanner;
public class Assignment13 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("first number");
		int length1=Integer.valueOf(s.next());
		System.out.println("second number");
		int length2=Integer.valueOf(s.next());
		System.out.println("third number");
		int length3=Integer.valueOf(s.next());
		boolean test1=Math.pow(length1, 2)+Math.pow(length2, 2)==Math.pow(length3, 2);
		boolean test2=Math.pow(length1, 2)+Math.pow(length3, 2)==Math.pow(length2, 2);
		boolean test3=Math.pow(length2, 2)+Math.pow(length3, 2)==Math.pow(length1, 2);
		if (test1==true || test2==true||test3==true) {
			System.out.println("It is a right angle triangle");
		} else {
			System.out.println("It is not a right angle triangle");
		}
	}
}
