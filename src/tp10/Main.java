package tp10;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		//Exercice 1
		String tabString[] = new String[2];
		tabString[0] = "Chaine1";
		tabString[1] = "Chaine2";

		for(int i =0; i < tabString.length; i++)
		{
			System.out.println("Element à l'index : "+i +" = "+tabString[i]);
		}
		
		Double tabDouble[] = new Double[2];
		tabDouble[0] = 2.5;
		tabDouble[1] = 20.35;
		
		for(int i =0; i < tabDouble.length; i++)
		{
			System.out.println("Element à l'index : "+i +" = "+tabDouble[i]);
		}
		
		C_POINT tabCPoint[] = new C_POINT[2];
		tabCPoint[0] = new C_POINT(25,22);
		tabCPoint[1] = new C_POINT(9,12);
		
		for(int i =0; i < tabCPoint.length; i++)
		{
			tabCPoint[i].affiche();
		}
		
		//Exercice 2
		C_GESTION_TABLEAU_POINTS tableau = new C_GESTION_TABLEAU_POINTS(2);
		tableau.Ajoute_points();
		tableau.Affiche_tous_les_points();
		tableau.Etude_points_positifs();
		
		//Exercice 3
		ArrayList<C_POINT> listPoints = new ArrayList<C_POINT>();
		listPoints.add(new C_POINT(5,15));
		listPoints.add(new C_POINT(4,-33));
		listPoints.get(1).compareTo(listPoints.get(0));
	}

}
