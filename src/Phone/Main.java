package Phone;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Merk1 A=new Merk1();
		Merk2 B=new Merk2();
		
	//	System.out.println(A.getOS());
		//System.out.println(B.getOS());
		ArrayList<MobilePhone> list=new ArrayList<>();
		list.add(A);
		Double  x=1.0;
		
		list.add(B);
		for(MobilePhone x:list)
			if(x instanceof USBCharger) {
				((USBCharger) x).charge();
		System.out.println(x.getOS());
			}
	}
}
