package bataille;

import java.util.ArrayList;

public class Joueur {
	private String nom;
	private ArrayList<Carte> main;
	private ArrayList<Carte> tapis;
	
	public Joueur(String leNom)
	{
		this.nom = leNom;
		this.main = new ArrayList<Carte>();
		this.tapis = new ArrayList<Carte>();
		
	}
	
	public void setMain(Carte uneCarte)
	{
		this.main.add(uneCarte);
	}
	
	public ArrayList<Carte> getMain()
	{
		return this.main;
	}
	
	public ArrayList<Carte> getTapis()
	{
		return this.tapis;
	}
	
	public String getNom()
	{
		return this.nom;
	}
	
	public boolean peutJouer()
	{
		boolean flag = true;
		if(this.main.size() == 0)
			flag = false;
		return flag;
	}
	
	public Carte derniereCartePosee()
	{
		return this.tapis.get(this.tapis.size() - 1);
	}
	
	public boolean gagner()
	{
		boolean gagne = false;
		if(this.main.size() == 52)
			gagne = true;
		return gagne;
	}
	
	public void poserCarte()
	{
		if(peutJouer())
		{
			this.tapis.add(this.main.get(0));
			System.out.println(this.nom + " pose " + this.derniereCartePosee());
			this.main.remove(0);
		}
	}
}
