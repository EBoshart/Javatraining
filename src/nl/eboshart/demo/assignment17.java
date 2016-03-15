package nl.eboshart.demo;

public class assignment17 {
	
	public static void main(String[] args) {
		double test1=0;
		int test2=0;
		boolean prime=true;
		int number=8;
		for(int i=2;i<=number/2;i++) {
			test1=(double) number/i;
			test2=number/i;
			if (test1 ==test2) {
				prime=false;
				System.out.println(" false, divisile by "+i);
			}
			
		}
		System.out.println(number+" is prime? "+prime);
		
	}
}
