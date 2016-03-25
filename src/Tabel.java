import java.time.LocalDate;
import java.util.Scanner;
public class Tabel {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter year");
		int year = s.nextInt();
		System.out.println("enter month");
		int month = s.nextInt();
		LocalDate date1=LocalDate.of(year,month,1);
		System.out.println(month +"\t"+ year + "\n");
		System.out.println("Su \t Mo \t Tu \t We \t Th \t Fr \t Sa");
		
	
		int index=0;
		switch(date1.getDayOfWeek()) {
		case SUNDAY: index=0; break; 
		case SATURDAY: index=1; break; 
		case MONDAY: index=2; break; 
		case TUESDAY: index=3; break; 
		case WEDNESDAY: index=4; break; 
		case THURSDAY: index=5; break; 
		case FRIDAY: index=6; break; 
		
		}
		
		int max=0;
		switch(date1.getMonth()) {
		case FEBRUARY: max=28;break;
		case APRIL:
		case JUNE:
		case AUGUST:
		case NOVEMBER: max=30;break;
		default: max=31;
		}
		
		
		
		String[][] X=new String[5][7];
		int i=0;
			while (index>i || i==7) {
			X[0][i]=" ";
			i++;
			
			
		}
			int date=1;
			for(i=index-1;i<7;i++) {
				X[0][i]=""+date;
				date++;
				
			}
		for(i=1;i<5;i++) {
			for(int j=0;j<7;j++) {
				if(date<max) {
				X[i][j]=""+(date+1);
				date++;
				}
				else {
					X[i][j]=" ";
				}
			}
		}
		for(i=0;i<5;i++) {
			System.out.println("\n");
			for(int j=0;j<7;j++) {
				System.out.print(X[i][j]+"\t");
			}
		}
	}
	
}
