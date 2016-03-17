package net.projecteuler;

public class problem3 {
	public static void main(String[] args) {
		double n=600851475143.0;
		//n=1000;
		int largestprimefactor=calclargestprimefactor(n);
		System.out.println(largestprimefactor);
	}
	public static int calclargestprimefactor(double n) {
		
		for(int i=(int) Math.sqrt(n);i>1;i--) {
			if(n%i==0) {
				//if(project7.testifprime(array, number))
				System.out.println(i);
				return i;
				
			}
		}
		return 1;
	
	}
}
