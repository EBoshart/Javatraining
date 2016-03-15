package nl.eboshart.demo;
import java.util.Scanner;
public class assignment21 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String string=s.next();
		
		int number=Integer.valueOf(string);
		int digit=0;
		int sum=0;
		for (int i=0;i<string.length();i++) {
			digit=Character.getNumericValue(string.charAt(i));
			sum=sum+digit;
		}
		System.out.println(sum);
	}
}
