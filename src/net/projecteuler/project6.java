package net.projecteuler;

public class project6 {
	public static void main(String[] args) {
		int sum1=0;
		int sum2=0;
		for(int i=1;i<=100;i++) {
			sum1=sum1+i*i;
			sum2=sum2+i;
		}
		System.out.println(Math.pow(sum2,2));
		System.out.println(sum1);
		System.out.println(Math.pow(sum2,2)-sum1);
	}
}
