package net.projecteuler;

import nl.eboshart.demo.assignment18;

public class problem2 {
	public static void main(String[] args) {
		int x=0;
		int N=0;
		int n=1;
		int sum=0;
		while (N<4_000_000) {
			x=assignment18.fibonacci(n);
		//	System.out.println(x);
			
			if(x%2==0) {
				sum=sum+x;
			
			}
			N=x;
			n++;
		}
		System.out.println(sum);
		
	}
}
