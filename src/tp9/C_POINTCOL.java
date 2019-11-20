package tp9;

public class C_POINTCOL<T,U> {
	protected T x;
	protected T y;
	protected U couleur;
	
	public C_POINTCOL(T abs, T ord, U coul)
	{
		this.x = abs;
		this.y = ord;
		this.couleur = coul;
	}
	
	public void affiche()
	{
		System.out.println("Coordonnées : " + this.x + " " + this.y + " Couleur : " + this.couleur);
	}
}
