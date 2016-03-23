package weekendassignment;
import java.util.Scanner;


public class Run {
	public static void main(String[] args) {
	//	print
		System.out.println("Product\t\t Prijs \t Voorraad");
		System.out.println("----------------------------------");
		Product A = new Product("Boek OCA examen",40,1000);
		print(A);
		Product B = new Product("Mock exam",10,400);
		print(B);
		Product[] products=new Product[2];
		products[0]=A;
		products[1]=B;
		System.out.println("----------------------------------");
		String input="";
		int input2=0;
		boolean doorgaan=true;
		while (doorgaan) {
		//System.out.println("selecteer product");
		Scanner s=new Scanner(System.in);
		boolean inputtest=true;
		while(inputtest) {
			System.out.println("selecteer product");
			input=s.nextLine();
			if(testbeschickbaarheid(input,products)) {
				System.out.println("is beschikbaar");
				inputtest=false;
			}
			else {
				System.out.println("is niet beschikbaar");
				inputtest=true;
			}
		}
		boolean voorraadtest=true;
		while(voorraadtest) {
			System.out.println("selecteer hoeveelheid");
			input2=Integer.valueOf(s.next());
		
	//	if(input2 < )
			voorraadtest=false;
		}
			System.out.println("continue?");
			if (s.next().equals("Y")) {
				doorgaan=false;
			} else {
				doorgaan=false;
			}
	
		
		}
	}
	static void print(Product X) {
		System.out.println(X.getNaam()+ "\t" +X.getPrijsPerEenheid()+ "\t"+X.getVoorraad());
	}
	static boolean testbeschickbaarheid(String input, Product[] products ) {
		for(int i=0;i<products.length;i++) {
			
			if (products[i].getNaam().equals(input)) {
				
				return true;
			}
		}
		return false;
	}
	
}



