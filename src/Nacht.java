import java.time.*;

import java.util.Scanner;
public class Nacht {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);

		System.out.println("enter year of birth: YYYY");
		int year=s.nextInt();
		System.out.println("enter month of birth: MM");
		int month=s.nextInt();
		System.out.println("enter day of birth: MM");
		int day=s.nextInt();

		LocalDate date1=LocalDate.of(year,month,day);
		LocalDate date2=LocalDate.now();
		if(date1.getDayOfYear()-date2.getDayOfYear()> 0) {
		System.out.println(date1.getDayOfYear()-date2.getDayOfYear());
		System.out.println(LocalDate.of(date2.getYear(),month,day).getDayOfWeek());
		} 
		else {
			System.out.println(365+date1.getDayOfYear()-date2.getDayOfYear());
			System.out.println(LocalDate.of(date2.plusYears(1).getYear(),month,day).getDayOfWeek());
		}
		
		
		
	}
}
