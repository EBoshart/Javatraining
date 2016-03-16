package nl.eboshart.demo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class assignment26 {
	public static void main(String[] args) {
		int[] numbers=new int[10];
		Scanner s=new Scanner(System.in);
		int number=0;
		boolean unique=true;
		int counter=1;
		
		numbers[0]=Integer.valueOf(s.next());
		for(int i=1;i<10;i++) {
			number=Integer.valueOf(s.next());
			unique=testuniqueness(Arrays.copyOfRange(numbers, 0, i),number );
			if(unique) {
				numbers[counter]=number;
				++counter;
				
			}
		
		}
		numbers=Arrays.copyOfRange(numbers,0,counter);
		System.out.println(Arrays.toString(numbers));
	}
	public static boolean testuniqueness(int[] array,int number) {
		for(int i=0;i<array.length;i++) {
			if(array[i]==number) {
				return false;
			}
		}
		return true;
	}
}
