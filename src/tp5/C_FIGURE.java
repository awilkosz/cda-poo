package tp5;

abstract class C_FIGURE implements I_CALCUL_GEOMETRIQUE, I_TYPE_FIGURE{
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
		return this.Aire();
	}
	
	abstract protected void dessine();
}
