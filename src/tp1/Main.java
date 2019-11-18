package tp1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//Exercice 1
		C_CERCLE cercle1 = new C_CERCLE(5.2,5.3,6.7);
		C_CERCLE cercle2 = new C_CERCLE(6.2,6.7,7.4);
		
		cercle1.affiche();
		cercle2.affiche();
		cercle1.deplace(3.2, 3.3);
		cercle1.affiche();
		
		if(cercle1.compare(cercle2))
			System.out.println("Le rayon est plus grand");
		else
			System.out.println("Le rayon est plus petit");
		
		System.out.println("La surface du cercle est de " + cercle2.surface());
		
		//Exercice 2
		C_CERCLE cercle3 = new C_CERCLE(8.2,7.6,9.8);
		C_CERCLE lesCercles[] = {cercle1, cercle2, cercle3};
		
		for(int i=0; i<lesCercles.length;i++)
			lesCercles[i].affiche();
		
		//Exercice 3
		Scanner saisie = new Scanner(System.in);
		System.out.println("Saisir le nombre cercles");
		int nb = saisie.nextInt();
		C_CERCLE lesCercles2[] = new C_CERCLE[nb];
		
		for(int j=0; j<nb;j++)
		{
			System.out.println("Saisir l'absisse : ");
			double absisse = saisie.nextDouble();
			System.out.println("Saisir l'ordonnée : ");
			double ordonnee = saisie.nextDouble();
			System.out.println("Saisir le rayon : ");
			double rayon = saisie.nextDouble();
			C_CERCLE unCercle = new C_CERCLE(absisse, ordonnee, rayon);
			lesCercles2[j] = unCercle;
			lesCercles2[j].affiche();;
		}
		
		saisie.close();
	}

}
