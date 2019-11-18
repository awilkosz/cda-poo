package tp3;

public class C_CARRE extends C_FIGURE{
	double cote;
	double aire;
	
	public C_CARRE(double px, double py, double c)
	{
		super(px, py);
		this.cote = c;
	}
	
	public void affiche()
	{
		System.out.println("Position X : " + x + ", Position Y : " + y + ", longueur d'un côté : " + this.cote);
	}
	
	public double Aire()
	{
		this.aire = this.cote * this.cote;
		return this.aire;
	}
}
