package bataille;

import java.util.Hashtable;

public class Carte {
	private String valeur;
	private String couleur;
	
	public Carte(String val, String col)
	{
		this.valeur = val;
		this.couleur = col;
	}
	
	public boolean superieurA(Carte autre)
	{
		boolean flag = false;
		Hashtable<String,Integer> tableValeurs = new Hashtable<String,Integer>();
		
		tableValeurs.put("As",14);
		tableValeurs.put("2",2);
		tableValeurs.put("3",3);
		tableValeurs.put("4",4);
		tableValeurs.put("5",5);
		tableValeurs.put("6",6);
		tableValeurs.put("7",7);
		tableValeurs.put("8",8);
		tableValeurs.put("9",9);
		tableValeurs.put("10",10);
		tableValeurs.put("Valet",11);
		tableValeurs.put("Dame",12);
		tableValeurs.put("Roi",13);
		
		if(tableValeurs.get(this.valeur) > tableValeurs.get(autre.valeur))
			flag = true;
		
		return flag;
	}
	
	public boolean memeValeur(Carte autre)
	{
		boolean flag = false;
		if(this.valeur == autre.valeur)
			flag = true;
		return flag;
	}
	
	public String toString()
	{
		return this.valeur + " " + this.couleur;
	}
}
