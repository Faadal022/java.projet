package Modele;

public abstract class joueurHumain extends Joueur {
	private String nom;
	public joueurHumain(String nom) {
		super(nom);
		// TODO Auto-generated constructor stub
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}

}
