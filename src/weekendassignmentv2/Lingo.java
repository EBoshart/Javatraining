package weekendassignmentv2;
import java.util.Scanner;
/*public class Lingo {
	public static void main(String[] args) {
		String geheim="hoera";
		int wordlength=5;
		Scanner s=new Scanner(System.in);
		String input="";
		while(!input.equals(geheim)) {
			input=s.next().toLowerCase();
			if (input.length()==wordlength) {
				
			
				String uitvoer="";
				String geheim2=geheim;
				int index=0;
				for(int i=0;i<wordlength;i++) {
					if(input.charAt(i)==geheim.charAt(i)) {
						uitvoer=uitvoer+"x";
						String a=geheim2.substring(0,index);
						
						if(index==geheim2.length()) {
							geheim2=geheim2.substring(0,index);
						} else {
							
							geheim2=geheim2.substring(0,index)+geheim2.substring(index+1);
						
							
						}
						
						
					//	index=geheim2.indexOf(Character.toString(input.charAt(i)));
						
					} else if(geheim2.contains(Character.toString(input.charAt(i)))) {
						uitvoer=uitvoer+"o";
						index=geheim2.indexOf(Character.toString(input.charAt(i)));
						geheim2=geheim2.substring(0,index)+geheim2.substring(index+1);
				
					} else {
						uitvoer=uitvoer+".";
					}
				}
				System.out.println(uitvoer);
			} else {
				System.out.println("error, not a "+wordlength+ " letter word");
			}
		}
		System.out.println("goed geraden!");
	}
}
*/
	public class Lingo {
		public static void main(String[] args) {
	String geheim="hoera";
	int wordlength=5;
	Scanner s=new Scanner(System.in);
	String input="";
	while(!input.equals(geheim)) {
		input=s.next().toLowerCase();
		if (input.length()==wordlength) {
			
		
			char[] uitvoer=new char[wordlength];
			String geheim2=geheim;
			int index=0;
		
				
			for(int i=0;i<wordlength;i++) {
				if(input.charAt(i)==geheim.charAt(i)) {
					uitvoer[i]='x';
					String a=geheim2.substring(0,index);
					
					if(index==geheim2.length()) {
						geheim2=geheim2.substring(0,index);
					} else {
						
						geheim2=geheim2.substring(0,index)+geheim2.substring(index+1);
					
						
					}
				}
			}
			for(int i=0;i<geheim2.length();i++) {
				
					
				//	index=geheim2.indexOf(Character.toString(input.charAt(i)));
					
				if(geheim2.contains(Character.toString(input.charAt(i)))) {
					uitvoer=uitvoer+"o";
					index=geheim2.indexOf(Character.toString(input.charAt(i)));
					geheim2=geheim2.substring(0,index)+geheim2.substring(index+1);
			
				} else {
					uitvoer=uitvoer+".";
				}
			}
			System.out.println(uitvoer);
		} else {
			System.out.println("error, not a "+wordlength+ " letter word");
		}
	}
	System.out.println("goed geraden!");
}
	
}
