package bataille;

import java.util.ArrayList;
import java.util.Collections;

public class Partie {
	private Joueur joueur1;
	private Joueur joueur2;
	
	public Partie()
	{
		this.joueur1 = new Joueur("Régis");
		this.joueur2 = new Joueur("Arthur");
	}
	
	public Joueur getJoueur1()
	{
		return this.joueur1;
	}
	
	public Joueur getJoueur2()
	{
		return this.joueur2;
	}
	
	public void creerJeu()
	{
		ArrayList<Carte> paquet = new ArrayList<Carte>();
		for(int i=1; i<=13;i++)
		{
			String valeur = "";
			if(i == 1)
				valeur = "As";
			else if(i == 11)
				valeur = "Valet";
			else if(i == 12)
				valeur = "Dame";
			else if(i == 13)
				valeur = "Roi";
			else
				valeur = valeur + i;
			
			
			Carte trefle = new Carte(valeur,"Noir");
			Carte pique = new Carte(valeur, "Noir");
			Carte coeur = new Carte(valeur, "Rouge");
			Carte carreau = new Carte(valeur, "Rouge");
			
			paquet.add(trefle);
			paquet.add(pique);
			paquet.add(coeur);
			paquet.add(carreau);
		}
		
		Collections.shuffle(paquet);
		
		while(paquet.size() >= 26)
		{
			joueur1.setMain(paquet.get(0));
			paquet.remove(0);
		}
		
		while(paquet.size() > 0)
		{
			joueur2.setMain(paquet.get(0));
			paquet.remove(0);
		}
	}
	
	public void go()
	{
		while(this.joueur1.peutJouer() && this.joueur2.peutJouer())
		{
			unTourDeJeu();
		}
	}
	
	public void unTourDeJeu()
	{
		this.joueur1.poserCarte();
		this.joueur2.poserCarte();
		
		resolutionTour();
	}
	
	public void bataille()
	{
		System.out.println("Bataille !");
		do
		{
			int i = (int)(this.joueur1.getMain().size() * Math.random());
			if(this.joueur1.peutJouer())
			{
				this.joueur1.getTapis().add(this.joueur1.getMain().get(i));
				this.joueur1.getMain().remove(i);
				this.joueur1.poserCarte();
			}
			
			i = (int)(this.joueur2.getMain().size() * Math.random());
			if(this.joueur2.peutJouer())
			{
				this.joueur2.getTapis().add(this.joueur2.getMain().get(i));
				this.joueur2.getMain().remove(i);
				this.joueur2.poserCarte();
			}
			
		}while(etatBataille());
		
		if(this.joueur1.derniereCartePosee().superieurA(this.joueur2.derniereCartePosee()))
		{
			System.out.println(this.joueur1.getNom() + " remporte la mise");
			for(Carte uneCarte : this.joueur1.getTapis())
				this.joueur1.getMain().add(uneCarte);
			this.joueur1.getTapis().clear();
			
			for(Carte uneCarte : this.joueur2.getTapis())
				this.joueur1.getMain().add(uneCarte);
			this.joueur2.getTapis().clear();
		}
		else
		{
			System.out.println(this.joueur2.getNom() + " remporte la mise");
			for(Carte uneCarte : this.joueur2.getTapis())
				this.joueur2.getMain().add(uneCarte);
			this.joueur2.getTapis().clear();
		
			for(Carte uneCarte : this.joueur1.getTapis())
				this.joueur2.getMain().add(uneCarte);
			this.joueur1.getTapis().clear();
		}
		
		System.out.println("Fin Bataille ");
		
		
	}
	
	public boolean etatBataille()
	{
		boolean bat = false;
		if(this.joueur1.derniereCartePosee().memeValeur(this.joueur2.derniereCartePosee()))
			bat = true;
		return bat;
	}
	
	public void resolutionTour()
	{
		
		if(etatBataille())
			bataille();
		else 
		{
			if(this.joueur1.getTapis().get(0).superieurA(this.joueur2.getTapis().get(0)))
			{
				this.joueur1.getMain().add(this.joueur1.getTapis().get(0));
				this.joueur1.getMain().add(this.joueur2.getTapis().get(0));
				System.out.println(this.joueur1.getNom() + " remporte la mise");
			}
			else
			{
				this.joueur2.getMain().add(this.joueur1.getTapis().get(0));
				this.joueur2.getMain().add(this.joueur2.getTapis().get(0));
				System.out.println(this.joueur2.getNom() + " remporte la mise");
			}
			this.joueur1.getTapis().clear();
			this.joueur2.getTapis().clear();
		}
	}
}
