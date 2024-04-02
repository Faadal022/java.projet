package Modele;

public class Coup {
	private Joueur joueur;
    private Position position;

    public Coup(Joueur joueur, Position position) {
        this.joueur = joueur;
        this.position = position;
    }

	public Joueur getJoueur() {
		return joueur;
	}

	public void setJoueur(Joueur joueur) {
		this.joueur = joueur;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}
}
