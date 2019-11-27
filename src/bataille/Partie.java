package bataille;

import java.util.ArrayList;

public class Partie {
	private Joueur joueur1;
	private Joueur joueur2;
	
	public Partie()
	{
		this.joueur1 = new Joueur("Régis");
		this.joueur2 = new Joueur("Arthur");
	}
	
	public void creerJeu()
	{
		ArrayList<Carte> paquet = new ArrayList<Carte>();
		for(int i=1; i<=13;i++)
		{
			String valeur = "";
			Carte trefle = new Carte(valeur,"Noir");
			Carte pique = new Carte(valeur, "Noir");
			Carte coeur = new Carte(valeur, "Rouge");
			Carte carreau = new Carte(valeur, "Rouge");
			
			paquet.add(trefle);
			paquet.add(pique);
			paquet.add(coeur);
			paquet.add(carreau);
		}
		
		while(paquet.size() >= 26)
		{
			int rand = (int) (paquet.size()*Math.random());
			
		}
	}
	
	public void go()
	{
		
	}
	
	public void unTourDeJeu()
	{
		
	}
	
	public void bataille()
	{
		
	}
	
	public void etatBataille()
	{
		
	}
	
	public void resolutionTour()
	{
		
	}
}
