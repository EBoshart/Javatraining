import java.time.LocalDate;

public class Maart {
	public static void main(String[] args) {
		int year=1976;
		int month=3;
		int day=1;
		LocalDate date1=LocalDate.of(year,month,day);
		LocalDate date2=date1.plusDays(999);
		System.out.println(date2);
	}
}
