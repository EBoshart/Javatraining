package nl.eboshart.demo;
import java.util.Arrays;
import java.util.Scanner;
public class assignment25 {
	public static void main(String[] args) {
		double[] lowest=new double[12];
		double[] highest=new double[12];
		Scanner s=new Scanner(System.in);
		for(int i=0;i<12;i++) {
			System.out.println("month"+(i+1));
			System.out.println("enter lowest");
			lowest[i]=Double.valueOf(s.next());
			System.out.println("enter highest");
			highest[i]=Double.valueOf(s.next());
		}
		System.out.println(Arrays.toString(lowest));
		System.out.println(Arrays.toString(highest));
	}
}
