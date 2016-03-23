package weekendassignmentv2;

import java.util.Arrays;

public class Pascal {
	
	public static void main(String[] args) {
		int[][] a=new int[10][];
		int[] x= new int[1];
		x[0]=1;
		a[0]=x;
		
		for(int i=1;i<10;i++) {
		
		int[] b=new int[i+1];
		b[0]=1;
		b[i]=1;
		for(int j=1;j<i;j++) {
			b[j]=a[i-1][j-1]+a[i-1][j];
		//	a[i][j]=b[j];
		}
		a[i]=b;	
		
		
		}
	//	System.out.println(a);
		for(int i=0;i<10;i++) {
		System.out.println(a[i]);
		}
	//	System.out.println("test");
	}
}
