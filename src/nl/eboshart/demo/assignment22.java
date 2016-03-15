package nl.eboshart.demo;

public class assignment22 {
	public static void main(String[] args) {
		int counter=0;
		int number=1;
		while(counter<10) {
			if (checkprime(number)) {
				counter++;
				System.out.println(number);
				number++;
			} else {
				number++;
			}
		}
		
	}
	public static boolean checkprime(int number) {
		double test1=0;
		int test2=0;
		boolean prime=true;
		
		for(int i=2;i<=number/2;i++) {
			test1=(double) number/i;
			test2=number/i;
			if (test1 ==test2) {
				prime=false;
				return prime;
				
			}
			
		}
	/*	System.out.println(number+" is prime? "+prime);*/
		return prime;
	}
}
