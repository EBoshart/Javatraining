package weekendassignmentv2;

public abstract class Product {
	abstract String getNaam();
	abstract int getPrijsPerEenheid();
	abstract int getPrijs(int hoeveelheid, boolean inclusief);
	abstract int getBTWPercentage();
	abstract int getEenheid();
	abstract int getVoorraad();
	abstract void setVoorraad(int voorraad);
	abstract void haalUitVoorraad(int aantal); 
//	Product(String naam, int Prijs, int voorraad, int eenheid) {}
//	Product(String naam, int Prijs, int voorraad) {}
}
