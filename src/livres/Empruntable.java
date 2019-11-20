package livres;

public interface Empruntable {
	public boolean emprunte = false;
	
	public void emprunter();
	public void rendre();
	public boolean isEmprunter();
}
