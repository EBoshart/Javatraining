package weekendassignmentv2;

public class ProductBestelling extends DefaultProduct{
	String Product;
	int hoeveelheid;
	
	ProductBestelling(String naam, int Prijs, int voorraad) {
		super(naam, Prijs, voorraad);
		// TODO Auto-generated constructor stub
	}
	ProductBestelling(String naam, int Prijs, int voorraad, int eenheid){
		super(naam,Prijs,voorraad,eenheid);
	}
	int getPrijs() {
		return Prijs;
	}
	String getProductnaam() {
		return getNaam();
	}
	int getHoeveelheid() {
		return voorraad;
		
	}
	void setHoeveelheid(int hoeveel) {
		voorraad=hoeveel;
	}
	
		
	}
}
