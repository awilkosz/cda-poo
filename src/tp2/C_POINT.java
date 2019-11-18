package tp2;

public class C_POINT extends C_POSITION {
	private char nom;
	
	public C_POINT()
	{
		super(0,0);
	}
	
	public C_POINT(C_POINT point)
	{
		super(point.x, point.y);
		nom = point.nom;
	}
	
	public C_POINT(int xx, int yy, char leNom)
	{
		super(xx,yy);
		this.nom = leNom;
	}
	
	public void affiche()
	{
		System.out.println(nom + " (" + x + "," + y +")");
	}
}
