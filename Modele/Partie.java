package Modele;

public class Partie {
	private Grille grille;
    private Joueur joueur1;
    private Joueur joueur2;
    private Coup[] coupsJoues;
    private int nombreCoups;
    private int scoreJoueur1;
    private int scoreJoueur2;
    public Partie(int tailleGrille, Joueur joueur1, Joueur joueur2) {
        this.joueur1 = joueur1;
        this.joueur2 = joueur2;
        grille = new Grille(tailleGrille);
        coupsJoues = new Coup[tailleGrille * tailleGrille];
        nombreCoups = 0;
        scoreJoueur1 = 0;
        scoreJoueur2 = 0;
    }
	public Grille getGrille() {
		return grille;
	}
	public void setGrille(Grille grille) {
		this.grille = grille;
	}
	public Joueur getJoueur1() {
		return joueur1;
	}
	public void setJoueur1(Joueur joueur1) {
		this.joueur1 = joueur1;
	}
	public Joueur getJoueur2() {
		return joueur2;
	}
	public void setJoueur2(Joueur joueur2) {
		this.joueur2 = joueur2;
	}
	public Coup[] getCoupsJoues() {
		return coupsJoues;
	}
	public void setCoupsJoues(Coup[] coupsJoues) {
		this.coupsJoues = coupsJoues;
	}
	public int getNombreCoups() {
		return nombreCoups;
	}
	public void setNombreCoups(int nombreCoups) {
		this.nombreCoups = nombreCoups;
	}
	public int getScoreJoueur1() {
		return scoreJoueur1;
	}
	public void setScoreJoueur1(int scoreJoueur1) {
		this.scoreJoueur1 = scoreJoueur1;
	}
	public int getScoreJoueur2() {
		return scoreJoueur2;
	}
	public void setScoreJoueur2(int scoreJoueur2) {
		this.scoreJoueur2 = scoreJoueur2;
	}
}
