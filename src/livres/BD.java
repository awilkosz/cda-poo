package livres;

public class BD extends Livre {
	private String dessinateur;
	
	public BD(String lAuteur, String leTitre, String leDessinateur)
	{
		super(lAuteur, leTitre);
		this.dessinateur = leDessinateur;
	}
	
	public String getDessinateur()
	{
		return this.dessinateur;
	}
	
	public String toString()
	{
		return super.toString() + " et dessiné par " + this.dessinateur;
	}
}
