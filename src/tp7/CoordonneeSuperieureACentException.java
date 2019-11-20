package tp7;

public class CoordonneeSuperieureACentException extends Exception  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CoordonneeSuperieureACentException()
	{
		System.out.println("Les coordonnées ne doivent pas être supérieure à 100 !");
	}
}
