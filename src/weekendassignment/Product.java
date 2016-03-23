package weekendassignment;

public class Product {
	String Naam;
	int Prijs;
	int Voorraad;
	int Eenheid;
	
	String getNaam(){
		return this.Naam;
	}
	int getPrijsPerEenheid(){
		return this.Prijs;
	}
	int getPrijs(int hoeveelheid, boolean inclusief) {
		if (inclusief) {
			return getBTWPercentage()*hoeveelheid+hoeveelheid*getPrijsPerEenheid();
		}
		else {
			return hoeveelheid*getPrijsPerEenheid();
		}
	}
	int getPrijs(int hoeveelheid) {
		
			return getBTWPercentage()*hoeveelheid+hoeveelheid*getPrijsPerEenheid();
	
		
	}
	int getBTWPercentage() {
		return 19;
	}
	int getEenheid()  {
		return this.Eenheid;
	}
	int getVoorraad() {
		return this.Voorraad;
	}
	
	void setVoorraad(int voorraad) {
		this.Voorraad=voorraad;
	}
 	void haalUitVoorraad(int aantal) {
 		this.Voorraad=Voorraad-aantal;
 	}
	Product(String naam, int Prijs, int voorraad, int eenheid) {
		this.Naam=naam;
		this.Prijs=Prijs;
		this.Voorraad=voorraad;
		this.Eenheid=eenheid;
	}
	Product(String naam, int Prijs, int voorraad) {
		this.Naam=naam;
		this.Prijs=Prijs;
		this.Voorraad=voorraad;
		this.Eenheid=4;
	}	
	String getEenheidNaam() {
		String type="error";
		switch(Eenheid) {
			
			case 1: type= "gram";
			break;
			case 2: type ="kilo";
			break;
			case 3: type ="liters";
			break;
			case 4: type ="stuk";
			break;
			case 5: type= "pak";
			break;
			default: System.out.println(" error, geen valide eenheid");
		}
		
		return type;
	}
}
