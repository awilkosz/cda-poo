package bataille;

public class Carte {
	private String valeur;
	private String couleur;
	
	public Carte(String val, String col)
	{
		this.valeur = val;
		this.couleur = col;
	}
	
	public void superieurA(Carte autre)
	{
		//
	}
	
	public void memeValeur(Carte autre)
	{
		//
	}
	
	public String toString()
	{
		return this.valeur + " " + this.couleur;
	}
}
