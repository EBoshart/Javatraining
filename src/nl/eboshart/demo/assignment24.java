package nl.eboshart.demo;
import java.util.Arrays;
import java.util.Scanner;
public class assignment24 {
	public static void main(String[] args) {
		String[] items={"a", "b", "c", "d","e","f"};
		int[] prices={1,2,3,4,5,6};
		Scanner s=new Scanner(System.in);
		String input=s.next();
		int index=Arrays.asList(items).indexOf(input);
		if(Arrays.asList(items).contains(input)) {
			System.out.println(prices[index]);
		} else {
			System.out.println("item not found");
		}
		
	}
}
