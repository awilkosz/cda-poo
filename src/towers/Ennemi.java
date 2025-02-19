package towers;

import java.util.Scanner;

public class Ennemi {
	float posX;
	float posY;
	int pv;
	int rapidite;
	
	static int compteur;
	
	public Ennemi()
	{
		this.posX = 0;
		this.posY = 0;
		this.pv = 100;
		this.rapidite = 2;
		compteur++;
	}
	
	public Ennemi(int p, int r)
	{
		this.posX = 0;
		this.posY = 0;
		this.pv = p;
		this.rapidite = r;
		compteur++;
	}
	
	public void recevoirDegats(int deg)
	{
		this.pv -= deg;
	}
	
	public void seDeplace(float nouveauX, float nouveauY)
	{
		this.posX = nouveauX;
		this.posY = nouveauY;
	}
	
	public String toString()
	{
		return "Position X : " + this.posX + " Position Y : " + this.posY + " Points de vie : " + this.pv + " Rapidit� " + this.rapidite;
	}
	
	public boolean estVivant()
	{
		boolean vivant = true;
		if(this.pv <= 0)
			vivant = true;
		return vivant;
	}
	
	public static Ennemi creerEnnemi(){
        Scanner saisie = new Scanner(System.in);
        System.out.println(" Saisir les pv PV ?");
        int pv = saisie.nextInt();
        System.out.println(" Saisir la vitesse ?");
        int rapidite = saisie.nextInt();
        Ennemi monEnnemi = new Ennemi(pv, rapidite);
        saisie.close();
        return monEnnemi;
    }
}
