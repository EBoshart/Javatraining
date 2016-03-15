package nl.eboshart.demo;
import java.util.Arrays;
import java.util.Scanner;
public class assignment23 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input=s.next();
		String[] names = {"tom","hank","tim"};
		int[] number= {123,456,789};
		String[] dateofbirth ={"1988","1989","1990"};
		int index=0;
		index=Arrays.asList(names).indexOf(input);
		
		System.out.println(number[index]+" "+dateofbirth[index]);
	}
}
