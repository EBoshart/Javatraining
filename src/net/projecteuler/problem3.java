package net.projecteuler;

public class problem3 {
	public static void main(String[] args) {
		long n=600851475143L;
		int largestprimefactor=calclargestprimefactor(n);
		System.out.println(largestprimefactor);
	}
	public static int calclargestprimefactor(long n) {
		
		for(int i=(int) Math.sqrt(n);i>1;i--) {
			if(n%i==0) {
				return i;
				
			}
		}
		return 1;
	
	}
}
