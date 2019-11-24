package tp10;

public class C_POINT {
	private int x;
	private int y;
	
	public C_POINT(int abs, int ord)
	{
		this.x = abs;
		this.y = ord;
	}
	
	public int getx()
	{
		return this.x;
	}
	
	public int gety()
	{
		return this.y;
	}
	
	public void affiche()
	{
		System.out.println("Coordonnées : " + this.x + " " + this.y);
	}
	
	public void compareTo(C_POINT unPoint)
	{
		int difference = 0;
		if(this.gety() > unPoint.gety())
			difference = this.gety() - unPoint.gety();
		else
			difference = unPoint.gety() - this.gety();
		System.out.println("Les points sont éloignés de " + difference + " cm sur les ordonnées");
	}
}
