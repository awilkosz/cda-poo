package bataille;

public class Main {

	public static void main(String[] args) {

		Partie laPartie = new Partie();
		laPartie.creerJeu();
		
		System.out.println(laPartie.getJoueur1().getMain());
		System.out.println(laPartie.getJoueur2().getMain());
		
		laPartie.go();
		if(laPartie.getJoueur1().gagner())
			System.out.println(laPartie.getJoueur1().getNom() + " remporte la partie !");
		else
			System.out.println(laPartie.getJoueur2().getNom() + " remporte la partie !");

	}

}
