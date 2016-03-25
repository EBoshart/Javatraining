package Phone;

public class Merk1 extends MobilePhone implements USBCharger {

	@Override
	public void charge() {
		System.out.println("charging phone");
		
	}
	String getOS() {
		return "Merk1";
	}
	
	

}
