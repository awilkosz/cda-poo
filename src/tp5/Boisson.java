package tp5;

public class Boisson implements Payant {
	float prix;
	
	public Boisson(float p)
	{
		this.prix = p;
	}
	
	public float getPrix()
	{
		return prix;
	}
}
