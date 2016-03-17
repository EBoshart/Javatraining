package nl.eboshart.demo;

public class assignment1 {
	public static void main(String[] args) {
		int sum=0;
		int maxnumber=1000;
		for(int i=1;i<maxnumber;i++) {
			if((i%3==0 || i%5==0)) {
				sum+=i;
			}
		}
		
		System.out.println(sum);
		
	}
	

}
