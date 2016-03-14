package nl.eboshart.demo;
import java.util.Scanner;
public class assignment3 {
	public static void main(String[] args) {
		System.out.println("input length");
		Scanner s=new Scanner(System.in);
		int length =Integer.valueOf(s.next());
		System.out.println("input width");
		int width=Integer.valueOf(s.next());
		System.out.println("input height");
		int height =Integer.valueOf(s.next());
		int volume=length*width*height;
		System.out.println("volume = " +volume);
		int surfacearea=2*((length*height)+(length*width)+(height*width));
		System.out.println("surface area = "+surfacearea);
		
		
		
	}

}
