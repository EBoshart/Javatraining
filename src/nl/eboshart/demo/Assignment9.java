package nl.eboshart.demo;
import java.util.Scanner;
public class Assignment9 {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int x=0;
		
		while (x>10 || x<1) {
			System.out.println("enter number in range of 1 through 10");
			x=Integer.valueOf(s.next());
			
		}
	}

}
