package net.projecteuler;

import java.util.Arrays;

public class project7 {
	public static void main(String[] args) {
		int N=1;
		int numberofprimes=10001;
		int[] primes= new int[numberofprimes];
		primes[0]=2;
		int number=2;
		
		boolean test=false;
	while(N<numberofprimes) {
			number++;
			test=testifprime(Arrays.copyOfRange(primes, 0, N),number );
			if (test) {
				primes[N]=number;
				N++;
			
			}
			;

		}
	//	System.out.println(Arrays.toString(primes));
		System.out.println(primes[N-1]);

	}
	public static boolean testifprime(int[] array,int number) {
		double quotient;
		for(int i=0;i<array.length;i++) {
			quotient=number%array[i];
			//System.out.println(quotient);
			if(quotient==0) {
				return false;
			}
		}
		return true;
	}

}
