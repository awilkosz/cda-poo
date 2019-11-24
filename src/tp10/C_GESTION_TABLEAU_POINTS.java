package tp10;

import java.util.Scanner;

public class C_GESTION_TABLEAU_POINTS {
	private C_POINT [] tab;
	private int taille;
	private int nb_points_positifs;
	
	public C_GESTION_TABLEAU_POINTS(int nb_points)
	{
		this.tab = new C_POINT[nb_points];
		this.taille = nb_points;
		this.nb_points_positifs = 0;
	}
	
	public void Ajoute_points()
	{
		Scanner saisie = new Scanner(System.in);
		for(int i=0; i<this.taille; i++)
		{
			System.out.println("Saisir l'absisse du point " + i);
			int absisse = saisie.nextInt();
			System.out.println("Saisir l'ordonnée du point " + i);
			int ordonnee = saisie.nextInt();
			this.tab[i] = new C_POINT(absisse,ordonnee);
		}
		saisie.close();
	}
	
	public void Affiche_tous_les_points()
	{
		for(int i=0; i<this.taille; i++)
		{
			this.tab[i].affiche();
		}
	}
	
	public void Etude_points_positifs()
	{
		for(int i=0; i<this.taille; i++)
		{
			if((this.tab[i].getx() > 0) && (this.tab[i].gety() > 0))
			{
				this.tab[i].affiche();
				this.nb_points_positifs++;
			}
		}
		System.out.println(this.nb_points_positifs);
		
	}
}
