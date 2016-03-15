package nl.eboshart.demo;
import java.util.Scanner;
public class assignment19 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String input = s.next();
		char A;
		int counter=0;
		for(int i=0;i<input.length();i++) {
			A=input.charAt(i);
			System.out.println(A);
			if (A=='a') {
				counter++;
			}
				
			
		}
		System.out.println(counter);
	}
}
