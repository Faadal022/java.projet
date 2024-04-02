package Modele;

public class joueurOrdinateur extends Joueur {
	 private String strategie;
	 private String nom;

	    public String JoueurOrdinateur(String nom, String strategie) {
	        super(nom);
	        this.strategie = strategie;
	        
	    }

	    public String Coup jouerCoup(Grille grille) {
	        return strategie.choisirCoup(grille);
	        return 0;
	    }
	    
	    public 
}
