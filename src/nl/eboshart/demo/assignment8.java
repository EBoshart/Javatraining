package nl.eboshart.demo;
import java.util.Scanner;
public class assignment8 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int number1=Integer.valueOf(s.next());
		int number2=Integer.valueOf(s.next());
		int number3=Integer.valueOf(s.next());
		int max=number1;
		if (number2 > max) {
			max=number2;
		}
		if (number3 >max) {
			max=number3;
		}
		System.out.println(max);
		
	}

}
