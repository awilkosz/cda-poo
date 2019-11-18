package tp4;

public class C_CERCLE extends C_FIGURE{
	double rayon;
	double aire;
	
	public C_CERCLE(double px, double py, double r)
	{
		super(px, py);
		this.rayon = r;
	}
	
	public void affiche()
	{
		System.out.println("Position X : " + x + ", Position Y : " + y + ", rayon du cercle : " + this.rayon);
	}
	
	public double Aire()
	{
		this.aire = (this.rayon * this.rayon) * Math.PI;
		return this.aire;
	}
	
	public void dessine()
	{
		affiche();
	}
}
