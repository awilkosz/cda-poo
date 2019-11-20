package tp9;

public class Main {

	public static void main(String[] args) {

		C_POINTCOL<Integer,String> point1 = new C_POINTCOL<Integer,String>(22,18,"Rouge");
		C_POINTCOL<Float,String> point2 = new C_POINTCOL<Float,String>(21.2f,17.5f,"Jaune");
		C_POINTCOL<Double,String> point3 = new C_POINTCOL<Double,String>(23.3,19.4,"Bleu");
		
		point1.affiche();
		point2.affiche();
		point3.affiche();

	}

}
