package nl.eboshart.demo;
import java.util.Scanner;
public class assignment6 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int sum=0;
		for(int i=0;i<5;i++) {
			System.out.println("enter number "+(i+1));
			int number=Integer.valueOf(s.next());
			if(number>7) {
				sum=sum+1;
			}
			
		}
		System.out.println(sum);
	}
}