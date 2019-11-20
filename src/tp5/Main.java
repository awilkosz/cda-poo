package tp5;

public class Main {

	public static void main(String[] args) {
	
		//Exercice 1
		Payant ligne_prix [] = new Payant [3];
		Service s1 = new Service(25.99f);
		Boisson b1 = new Boisson(4.99f);
		Service s2 = new Service(18.5f);
		float total = 0f;
		
		ligne_prix[0] = s1;
		ligne_prix[1] = b1;
		ligne_prix[2] = s2;
		
		for(int i=0; i<ligne_prix.length; i++)
			total += ligne_prix[i].getPrix();
		
		System.out.println("Somme totale à payer : " + total);
		
		//Exercice 2
		I_CALCUL_GEOMETRIQUE ligne_aire [] = new I_CALCUL_GEOMETRIQUE [3];
		I_TYPE_FIGURE ligne_type [] = new I_TYPE_FIGURE [3];
		C_CERCLE c1 = new C_CERCLE(5.2,5.2,12.2);
		C_CARRE c2 = new C_CARRE(4.5,4.5,10.3);
		C_CARRE c3 = new C_CARRE(4.7,4.7,9.2);
		double total2 = 0;
		
		ligne_aire[0] = c1;
		ligne_aire[1] = c2;
		ligne_aire[2] = c3;
		
		ligne_type[0] = c1;
		ligne_type[1] = c2;
		ligne_type[2] = c3;
		 
		 for(int i=0; i<ligne_aire.length; i++)
		 {
			total2 += ligne_aire[i].getAire();
			ligne_type[i].getType();
		 }
			
		System.out.println("Somme totale des surfaces des figures : " + total2);
	}

}
