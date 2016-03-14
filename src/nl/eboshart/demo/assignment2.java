package nl.eboshart.demo;
import java.util.Scanner;
public class assignment2 {
	public static void main(String[] args) {
		System.out.println("temperatuur in F");
		Scanner s = new Scanner(System.in);
		int input = Integer.valueOf(s.next());
		System.out.println(1.8*input+32);
	}

}
