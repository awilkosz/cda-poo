package livres;

public class Main {

	public static void main(String[] args) {

		LivreEmpruntable roman = new LivreEmpruntable("Terry Pratchet", "Le disque monde");
		System.out.println(roman);
		roman.emprunter();
		System.out.println(roman);
		
		BD asterix = new BD("Goscinny", "Asterix et Cléopatre", "Uderzo");
		System.out.println(asterix);
		
		roman.rendre();
		Livre roman2 = new Livre("Jules Vernes","Le tour du monde en 80 jours");
		System.out.println(roman);
		System.out.println(roman2);
		System.out.println(asterix);
		
		System.out.println("Affichage avec la boucle for");
		Livre biblio [] = {roman, roman2, asterix};
		for(Livre unLivre : biblio)
		{
			System.out.println(unLivre);
		}
	}

}
