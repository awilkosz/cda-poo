package tp1;

public class C_CERCLE {
	double coorX;
	double coorY;
	double rayon;
	
	public C_CERCLE(double abs, double ord, double rayon)
	{
		this.coorX = abs;
		this.coorY = ord;
		this.rayon = rayon;
	}
	
	public void deplace(double delta_x, double delta_y)
	{
		this.coorX = delta_x;
		this.coorY = delta_y;
	}
	
	public void affiche()
	{
		System.out.println("Coordonnée de l'absisse : " + this.coorX + " Coordonnée de l'ordonnée : " + this.coorY + " Rayon du cercle : " + this.rayon);
	}
	
	public boolean compare(C_CERCLE cercle)
	{
		boolean res = true;
		if(cercle.rayon > this.rayon)
			res = false;
		return res;
	}
	
	public double surface()
	{
		return (rayon * rayon) * Math.PI;
	}
}
