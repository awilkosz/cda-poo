package tp7;

public class CoordonneeSuperieureACentException extends Exception  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CoordonneeSuperieureACentException()
	{
		System.out.println("Les coordonn�es ne doivent pas �tre sup�rieure � 100 !");
	}
}
