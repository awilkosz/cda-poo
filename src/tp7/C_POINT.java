package tp7;

public class C_POINT {
	
	protected int x;
	protected int y;
	
	public C_POINT(int abs, int ord) throws CoordonneeSuperieureACentException
	{
		if(abs > 100 || ord > 100)
			throw new CoordonneeSuperieureACentException();
		else
		{
			this.x = abs;
			this.y = ord;
		}
	}
	
	public void affiche()
	{
		System.out.println("Mes coor. cart,. sont " + x + " " + y);
	}
}
