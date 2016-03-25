
public class Exceptions {
	public static void main(String[] args) {
		String a="string";
		//a=null;
	//	a="12345";
		a="";
		int b;
		try {
		b=twoExceptions(a);
		System.out.println(b);
		}
		
		catch(NullPointerException x) {
			System.out.println("nullpointer error");
			
			
		}
		catch(NumberFormatException y) {
			System.out.println("number format error");
			
		}
		System.out.println("test");
	}
	static int twoExceptions(String getal) {
		return Integer.valueOf(getal.trim());
	}
}
