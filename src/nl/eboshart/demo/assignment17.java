package nl.eboshart.demo;

public class assignment17 {
	
	public static void main(String[] args) {
		double test1=0;
		int test2=0;
		boolean prime=true;
		for(int i=1;i<127/2;i++) {
			test1=127/i;
			test2=127/i;
			if (test1 !=test2) {
				prime=false;
			}
			
		}
		System.out.println(prime);
	}
}
