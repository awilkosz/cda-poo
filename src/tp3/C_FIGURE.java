package tp3;

public class C_FIGURE {
	 double x;
	 double y;
	
	public C_FIGURE(double px, double py)
	{
		this.x = px;
		this.y = py;
	}
	
	public void affiche()
	{
		System.out.println("Position X : " + this.x + ", Position Y : " + this.y);
	}
	
	public double Aire()
	{
		return 0;
	}
}
