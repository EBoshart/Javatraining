package nl.eboshart.demo;
import java.util.Scanner;
public class assignment20 {
	public static void main(String[] args) {
		String alpha ="abcdefghijklmnopqrstuvwxyz";
		Scanner s =new Scanner(System.in);
		char input = s.next().charAt(0);
		
		int index=0;
		for(int i=0;i<26;i++) {
			
			if (input==alpha.charAt(i)) {
				index=i+1;
				
			}
		}
		System.out.println(index);
	}
}
