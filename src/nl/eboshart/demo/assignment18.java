package nl.eboshart.demo;

public class assignment18 {
	public static void main(String[] args) {
		int n=3;
		int x=fibonacci(n);
		System.out.println(x);
	}
	public static int fibonacci(int n) {
		int number1=0;
		int number2=1;
		int fib=1;
		if (n==1) {
			return 0;
		} else {
		
			for (int i=1;i<n-1;i++) {
				fib=number1+number2;
				number1=number2;
				number2=fib;
			}
			return fib;
		}
	}

}
