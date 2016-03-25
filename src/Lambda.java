

	

	import java.util.ArrayList;
	import java.util.List;
	import java.util.function.Function;
	import java.util.function.Predicate;
	import java.util.stream.Collectors;

	public class Lambda{


		/**
		 * Deze functie hoef je niet te begrijpen!
		 * @param data  een ArrayList van een willekeurig type 
		 * @param p     een lambda-expressie die een parameter van datzelfde type neemt en een boolean teruggeeft
		 * @return		een nieuwe List terug waarin alleen de data zit waarvoor je predicaat true is.
		 */
		public static <T> List<T> filter(ArrayList<T> data, Predicate<T> p){
			return data.stream().filter(p).collect(Collectors.toList());
		}

		
		/**
		 * Deze functie hoef je niet te begrijpen!
		 * @param data  een ArrayList van een willekeurig type
		 * @param p     een lambda-expressie die een parameter van datzelfde type neemt en ook zo'n type teruggeeft
		 * @return		we voeren de lamba uit voor ieder element van data en geven het resultaat terug 
		 */
		public static <T> List<T> map(ArrayList<T> data, Function<T, T> f){
			return data.stream().map(f).collect(Collectors.toList());
		}
		

		public static void main(String[] args) {
			ArrayList<Integer> ar = new ArrayList<>();
			ArrayList<Double> X =new ArrayList<>();
			ArrayList<String> A = new ArrayList<>();
			A.add("123.java");
			A.add("1234");
			A.add("12345");
			A.add("12345");
			A.add("123456.java");
			ArrayList<StringBuilder> B= new ArrayList<>();
			StringBuilder B1= new StringBuilder("one");
			StringBuilder B2= new StringBuilder("two");
			StringBuilder B3= new StringBuilder("three");
			StringBuilder B4= new StringBuilder("four");
			
			B.add(B1);
			B.add(B2);
			B.add(B3);
			B.add(B4);
			StringBuilder test;
			for(int x = 0; x < 100; ++x){
				ar.add(x);
			}
			for (double x=0; x<100;++x) {
				X.add(x);
			}
			System.out.println(filter(ar, i -> i%3==0 || i%5==0));
			System.out.println( filter(A, i -> i.endsWith(".java")==true));
					 
			System.out.println(map(X, i -> Math.sqrt(i)));
		//	System.out.println(map(A, i -> i=reverseString(i)));
			System.out.println(map(A, i -> i=(new StringBuilder(i)).reverse().toString()));
			
		}
		static String reverseString(String s) {
			String a="";
			for(int i=0;i<s.length();i++) {
				a=s.charAt(i)+a;
			}
			return a;
		}
	}

