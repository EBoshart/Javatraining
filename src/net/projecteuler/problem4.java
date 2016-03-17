package net.projecteuler;

public class problem4 {
	public static void main(String[] args) {
		boolean test;
		int x=0;
		int a=0;
		int b=0;
		for (int i=100;i<1000;i++) {
			for (int j=100;j<1000;j++) {
				
				test=testifpalindrome(i,j);
					
				if(test && i*j>x) {
					x=i*j;
					a=i;
					b=j;
				}
			}
		}
		System.out.println(x+" "+a+" "+b);
	}
	public static boolean testifpalindrome(int i,int j) {
		int product=i*j;
		String s=Integer.toString(product);
		int length=s.length();
		for(int k=0;k<length;k++) {
			if(s.charAt(k)==s.charAt(length-k-1)) {
				
			} 
			else {
				return false;
			
			}
		}
		return true;
	}
}
