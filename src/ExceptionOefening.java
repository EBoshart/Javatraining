
public class ExceptionOefening {
	static String dag;
	public static void main(String[] args)  {
		
		try {
			dag=naamVanWeekdag(13);
			System.out.println(dag);
		}
		catch(IllegalArgumentException x) {
			System.out.println("error");
		}
		catch(DatIsGeenWeekdag z) {
			System.out.println("error");
			
		}
		System.out.println(dag);
		
	}
	static String naamVanWeekdag(int dag) throws DatIsGeenWeekdag {
		String Dag="";
		switch(dag) {
		case 1: Dag="maandag"; break;
		case 2: Dag="dinsdag"; break;
		case 3: Dag="woensdag"; break;
		case 4: Dag="donderdag"; break;
		case 5: Dag="vrijdag"; break;
		case 6: Dag="zaterdag"; break;
		case 7: Dag="zondag"; break;
		default: throw new DatIsGeenWeekdag()	;
		}
		return Dag;
	}
}
