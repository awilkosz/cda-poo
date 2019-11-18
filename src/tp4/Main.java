package tp4;

public class Main {

	public static void main(String[] args) {
		
		C_FIGURE lesFigures[] = new C_FIGURE[100];
		
		for(int i=0; i<100; i++)
		{
			double d = Math.random();
			double x = Math.random() * 10;
			double y = Math.random() * 10;
			double rouc = Math.random() * 5;
			
 			if(d < 0.5)
 			{
				C_CERCLE cercle = new C_CERCLE(x, y, rouc);
				lesFigures[i] = cercle;
 			}
 			else
 			{
 				C_CARRE carre = new C_CARRE(x, y, rouc);
 				lesFigures[i] = carre;
 			}
 			lesFigures[i].dessine();
		}
		
		System.out.println("Aire totale : " + AireTotale(lesFigures));

	}
	
	public static double AireTotale(C_FIGURE lesFigures[])
	{
		double aireTotale = 0;
		for(int i=0; i<lesFigures.length; i++)
			aireTotale += lesFigures[i].Aire();
		return aireTotale;
	}

}
