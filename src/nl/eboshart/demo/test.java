package nl.eboshart.demo;

import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class test {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        //int n = in.nextInt(); // the number of temperatures to analyse
      //  in.nextLine();
        String temps = in.nextLine(); // the n temperatures expressed as integers ranging from -273 to 5526
        
        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");
        int closesttozero=100000;
        int temp;
        int sign=1;
        for(int i=0;i<temps.length();i++) {
            
           
			temp=Character.getNumericValue(temps.charAt(i));
			if (temps.charAt(i)==' ') {
				sign=1;
			} else
			if (temps.charAt(i)=='-') {
			    sign=-1;
			} else
			
			if (sign*temp <0 && closesttozero <0 && -temp < -closesttozero) {
			    closesttozero=sign*temp;
			} else 
			if (sign*temp <0 && closesttozero >0 && -temp < closesttozero) {
			    closesttozero=sign*temp;
			} else 
			if (sign*temp >0 && closesttozero >0 && temp < closesttozero) {
			    closesttozero=sign*temp;
			} else 
			if (sign*temp >0 && closesttozero <0 && temp < -closesttozero) {
			    closesttozero=sign*temp;
			}
			//System.out.println(sign*temp);
        }
			    
		String result=Integer.toString(closesttozero);   
			
        System.out.println(result);
        long a=3;
        byte b=4;
        double c=5;
        System.out.println(test(a,b,c));
    }
    public static double test(long a,byte b, double c) {
    	
    	return a+b+c;
    }
}