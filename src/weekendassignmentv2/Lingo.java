package weekendassignmentv2;
import java.util.ArrayList;
import java.util.Scanner;

public class Lingo {
	public static void main(String[] args) {
	String geheim="hallo";
	int wordlength=geheim.length();
	Scanner s=new Scanner(System.in);
	String input="";
	while(!input.equals(geheim)) {
		System.out.println("raad het "+wordlength+ " letter woord");
		input=s.next().toLowerCase();
		if (input.length()==wordlength) {
			char[] uitvoer=new char[wordlength];
			String geheim2=geheim;
					int aantal=0;
			ArrayList<Integer> indices=new ArrayList<>();
				for(int i=0;i<wordlength;i++) {
				if(input.charAt(i)==geheim.charAt(i)) {
					uitvoer[i]='x';
					uitvoer[i]=geheim.charAt(i);
					if(i-aantal==(geheim2.length()-1)) {
						geheim2=geheim2.substring(0,i-aantal);
					} else {
						geheim2=geheim2.substring(0,i-aantal)+geheim2.substring(i-aantal+1);
					}
					aantal++;
				} 
				else {
					indices.add(i);
				}
			}
				
			for(int i: indices)	{
				
					
				if(geheim2.contains(Character.toString(input.charAt(i)))) {
					uitvoer[i]='o';
					uitvoer[i]=(Character.toString(input.charAt(i))).toUpperCase().charAt(0);
					int index=geheim2.indexOf(Character.toString(input.charAt(i)));
					geheim2=geheim2.substring(0,index)+geheim2.substring(index+1);
				
				} else {
					uitvoer[i]='.';
				}
				aantal++;
			}
		
			for(int i=0;i<wordlength;i++) {
				System.out.print(uitvoer[i]);
			}
			System.out.println("");
		} else {
			System.out.println("error, not a "+wordlength+ " letter word");
		
		}

	}	
	System.out.println("goed geraden!");
	}
}
	

