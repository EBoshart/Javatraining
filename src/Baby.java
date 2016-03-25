import java.time.LocalDate;
import java.util.Scanner;
public class Baby {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);

		System.out.println("enter year of birth: YYYY");
		int year=s.nextInt();
		System.out.println("enter month of birth: MM");
		int month=s.nextInt();
		System.out.println("enter day of birth: MM");
		int day=s.nextInt();

		LocalDate date1=LocalDate.of(year,month,day);
		LocalDate date2=LocalDate.now();
		Long x=date1.toEpochDay();
		Long y=date2.toEpochDay();
		int d=(int) (y-x);
		System.out.println(d%365);
		if (d<31) {
			System.out.println("baby "+d+ " dagen oud");
		}
		else if(d<365/4) {
			System.out.println("baby "+d/7+ " weken oud");
		}
		else if(d<365*2) {
			System.out.println("dreumes "+12*d/365+" maanden oud");
		}
		else if(d<365*4) {
			System.out.println("peuter "+d/365 +" jaar en "+12*(d%365)/365+ " maanden");
		}
		else if(d<365*12) {
			System.out.println("kind "+ d/365 + " jaar oud");
		}
		else if(d<365*18) {
			System.out.println("tiener "+ d/365 + " jaar oud");
		}
		else {
			System.out.println("volwassen "+ d/365+ " jaar oud");
		}
	}
}
