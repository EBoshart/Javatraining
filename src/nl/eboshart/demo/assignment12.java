package nl.eboshart.demo;
import java.util.Scanner;
public class assignment12 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter first length");
		int length1=Integer.valueOf(s.next());
		System.out.println("enter second length");
		int length2=Integer.valueOf(s.next());
		System.out.println("enter third length");
		int length3=Integer.valueOf(s.next());
		boolean test1=length1+length2 > length3;
		boolean test2=length1+length3 > length2;
		boolean test3=length3+length2 > length1;
		if (test1==true && test2==true && test3==true) {
			System.out.print("could be a triangle");
		} else {
			System.out.println("can not be a triangle");
		}
		
	}
}
