package net.projecteuler;

public class projec5 {
	public static void main(String[] args) {
		boolean solutionnotfound=true;
		int number=5;
		while(solutionnotfound) {
			number++;
			solutionnotfound=checkdivisibility(number);
		}
		System.out.println(number);
	
		//System.out.println(checkdivisibility(2520));
	}
	public static boolean checkdivisibility(int number) {
		double quotient;
		for(int i=2;i<=20;i++) {
			quotient=number%i;
		//	System.out.println(quotient);
			if(quotient!=0 || quotient%2 !=0) {
				return true;
			}
		}		
		return false;
	
	}
}

