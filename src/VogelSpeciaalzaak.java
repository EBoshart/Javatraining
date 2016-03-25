
public class VogelSpeciaalzaak extends DierenWinkel {

	
	@Override
	public Vogel[] getVoorraad(){
		Vogel[] dieren=new Vogel[2];
		Vogel x =new Vogel("vogel1");
		Vogel y =new Vogel("vogel2");
		dieren[0]=x;
	 	dieren[1]=y;
	 	return dieren;
	 	
		
	
	
}
	public static void main(String[] args) {
		DierenWinkel dierenwinkel=new VogelSpeciaalzaak();
		for (Dier dier: dierenwinkel.getVoorraad()) {
			System.out.println(dier.getNaam());
			
		}
		
		
		
		
		
	}
	
	
}
