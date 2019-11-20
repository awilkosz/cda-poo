package tp5;

public class Service implements Payant {
	float prix;
	
	public Service(float p)
	{
		this.prix = p;
	}
	
	public float getPrix()
	{
		return prix;
	}
}
