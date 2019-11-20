package livres;

public class Livre {
	private String titre;
	private String auteur;
	
	public Livre(String lAuteur, String leTitre)
	{
		this.titre = leTitre;
		this.auteur = lAuteur;
	}
	
	public String getTitre()
	{
		return this.titre;
	}
	
	public String getAuteur()
	{
		return this.auteur;
	}
	
	public String toString()
	{
		return "Le livre " + this.titre + " écrit par " + this.auteur;
	}
}
