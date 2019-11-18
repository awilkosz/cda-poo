package tp2;

public class C_POSITION {
	protected int x;
	protected int y;
	
	public C_POSITION(int px, int py)
	{
		this.x = px;
		this.y = py;
	}
	
	public void deplace(int dx, int dy)
	{
		this.x += dx;
		this.y += dy;
	}
	
	public void affiche()
	{
		System.out.println("Position X : " + this.x + ", Position Y : " + this.y);
	}
}
