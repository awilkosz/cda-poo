package towers;

public class Terrain {

	public static void main(String[] args) {
		/*
		Ennemi grosMechant = new Ennemi();
		Ennemi unAutreEnnemi = new Ennemi();
		
		System.out.println(grosMechant.pv);
		System.out.println(unAutreEnnemi.pv);
		grosMechant.pv = 50;
		System.out.println(grosMechant.pv);
		System.out.println(unAutreEnnemi.pv);
		
		Ennemi leVraiGrosEnnemi = new Ennemi(500,1);
		Ennemi lePetitRapide = new Ennemi(200,10);*/
		
		Ennemi grosMechant = new Ennemi(100,2);
		Ennemi unAutreEnnemi = new Ennemi(50,4);
		grosMechant.toString();
		unAutreEnnemi.toString();
		grosMechant.seDeplace(5, 8);
		grosMechant.toString();
		grosMechant.recevoirDegats(50);
		unAutreEnnemi.recevoirDegats(10);
		grosMechant.toString();
		unAutreEnnemi.toString();
		
		System.out.println(Ennemi.compteur);
		
		Ennemi monEnnemi = Ennemi.creerEnnemi();
        System.out.println("Pv de mon nouvel Ennemi : "+monEnnemi.pv);
	}

}
