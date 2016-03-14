package nl.eboshart.demo;

public class assignment7 {
	public static void main(String[] args) {
		int x=1;
		int y=3;
		if (x*y==8) {
			x=1;
		} else {
			x=2;
		}

		System.out.println(x+" "+y);
		

		if (x<y) {
			x=2*x;
		} else {
			x=x+1;
		}
		System.out.println(x+" "+y);
	
		if (x>y) {
			x=x+1;
			y=y+1;
		} else {
			x=x-1;
			y=y-1;
		}
		System.out.println(x+" "+y);
	}
	
}
