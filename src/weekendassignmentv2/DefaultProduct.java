package weekendassignmentv2;

public class DefaultProduct extends Product{
	String naam;
	int Prijs;
	int voorraad;
	int eenheid;
	DefaultProduct(String naam, int Prijs, int voorraad) {
		
		this.naam=naam;
		this.Prijs=Prijs;
		this.voorraad=voorraad;
		this.eenheid=4;
		
	
	//	super.naam=naam;
		// TODO Auto-generated constructor stub
	}
	DefaultProduct(String naam, int Prijs, int voorraad,int eenheid) {
	//	super(naam, Prijs, voorraad,eenheid);
		// TODO Auto-generated constructor stub
		this.naam=naam;
		this.Prijs=Prijs;
		this.voorraad=voorraad;
		this.eenheid=eenheid;
	}

	@Override
	String getNaam() {
		
		return this.naam;
	}

	@Override
	int getPrijsPerEenheid() {
		return this.Prijs;
	}

	@Override
	int getPrijs(int hoeveelheid, boolean inclusief) {
		if (inclusief) {
			return hoeveelheid*getPrijsPerEenheid()*(100+getBTWPercentage())/100;	
		}
		else {
			return hoeveelheid*getPrijsPerEenheid();
		}
	}
	int getPrijs(int hoeveelheid) {
		return hoeveelheid*getPrijsPerEenheid()*getBTWPercentage();	
	}
	int getPrijs() {
		return getPrijsPerEenheid();	
	}

	@Override
	int getEenheid() {
		// TODO Auto-generated method stub
		return this.eenheid;
	}

	@Override
	int getVoorraad() {
		// TODO Auto-generated method stub
		return this.voorraad;
	}

	@Override
	void setVoorraad(int voorraad) {
		this.voorraad=voorraad;// TODO Auto-generated method stub
		
	}

	@Override
	void haalUitVoorraad(int aantal) {
		// TODO Auto-generated method stub
		
	}
	@Override
	int getBTWPercentage() {
		// TODO Auto-generated method stub
		return 20;
	}
	
}
