package nl.eboshart.demo;
import java.util.Scanner;
public class assignment27 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int counter=0;
		int score;
		for(int i=0;i<20;i++) {
			score=Integer.valueOf(s.next());
			if(score>=85 && score<=90) {
				counter++;
			}
			
		}
		System.out.println(counter);
		
	}
}
