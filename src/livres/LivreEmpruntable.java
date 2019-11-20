package livres;

public class LivreEmpruntable extends Livre implements Empruntable{

	private boolean emprunte = false;
	
	public LivreEmpruntable(String lAuteur, String leTitre) 
	{
		super(lAuteur, leTitre);
	}
	
	public void emprunter()
	{
		this.emprunte = true;
	}
	
	public void rendre()
	{
		this.emprunte = false;
	}
	
	public boolean isEmprunter()
	{
		return this.emprunte;
	}
	
	public String toString()
	{
		String disponible = "disponible";
		if(emprunte)
			disponible = "emprunté";
		return super.toString() + " est " + disponible;
	}

}
