package tp6;
import tp5.C_CARRE;
import tp2.*;

public class Main {

	public static void main(String[] args) {

		tp5.C_CERCLE cercle = new tp5.C_CERCLE(15.2, 17.3, 10.1);
		cercle.affiche();
		C_CARRE carre = new C_CARRE(12.2,14.3,9.5);
		carre.affiche();
		C_POINT point = new C_POINT(7,5,'A');
		point.affiche();
	}

}
