package nl.rjekker.opdracht.bestelling;

import nl.rjekker.opdracht.product.Product;

public class ProductBestelling {
	private Product product;
	private int hoeveelheid;
	
	public int getHoeveelheid() {
		return hoeveelheid;
	}

	public void setHoeveelheid(int hoeveelheid) {
		this.hoeveelheid = hoeveelheid;
	}

	public String getProductNaam(){
		return this.product.getNaam();
	}
	
	public int getPrijs(boolean inclusief){
		return this.product.getPrijs(hoeveelheid, inclusief);
	}
	
	public int getBTWPercentage(){
		return this.product.getBTWPercentage();
	}

	// let op: protected constructor!
	protected ProductBestelling(Product p, int hoeveelheid) {
		this.product = p;
		this.hoeveelheid = hoeveelheid;
	}
	
	@Override
	public String toString() {
		return this.product.toString() + ": " + this.hoeveelheid;
	}

}
