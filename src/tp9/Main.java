package tp9;

public class Main {

	public static void main(String[] args) {

		C_POINTCOL<Integer,String> point1 = new C_POINTCOL<Integer,String>(22,18,"Rouge");
		C_POINTCOL<Float,String> point2 = new C_POINTCOL<Float,String>(21.2f,17.5f,"Jaune");
		C_POINTCOL<Double,String> point3 = new C_POINTCOL<Double,String>(23.3,19.4,"Bleu");
		
		point1.affiche();
		point2.affiche();
		point3.affiche();
		
		Integer tabInt[] = {1,2,3,4,5};
		Float tabFloat[] = {1.2f, 2.3f, 3.4f, 4.5f, 5.6f};
		Double tabDouble[] = {6.7, 7.8, 8.9, 9.0, 10.1};
		String tabString[] = {"un", "deux", "trois", "quatre", "cinq"};
		Character tabChar[] = {'6','7','8','9','0'};
		
		System.out.println(contenuCase(tabInt));
		System.out.println(contenuCase(tabFloat));
		System.out.println(contenuCase(tabDouble));
		System.out.println(contenuCase(tabString));
		System.out.println(contenuCase(tabChar));
	}
	
	public static <T>T contenuCase(T tab [])
	{
		int n = tab.length;
		if(n==0) 
			return null;
		int i = (int) (n*Math.random());
		return tab[i];
	}

}
