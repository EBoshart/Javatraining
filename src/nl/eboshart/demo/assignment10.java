package nl.eboshart.demo;
import java.util.Scanner;
public class assignment10 {
	public static void main(String[] args) {
		String input= "";
		Scanner s=new Scanner(System.in);
	
		while(!input.equals("Y") && !input.equals("N")) {
			System.out.println("are you sure you want to quit? (Y/N)");
			input=s.next();
		}
	}
}
