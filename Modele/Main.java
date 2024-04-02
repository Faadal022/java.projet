package Modele;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//On cree la grille
		Grille g1 = new Grille(12, 8);
		g1.placer(3,5,'j');
		g1.placer(8,2,'O');
		g1.placer(1,1,'M');
		g1.placer(7,4,'O');
		g1.placer(10,7,'M');
		g1.placer(2,8,'O');
		g1.placer(11,2,'M');
		//Affichage
		System.out.println("j = joueur\nO = Objet\nM = Monstre\n. = vide");
		g1.afficher();
		
		Joueur j1 = new Joueur();
		System.out.println("Caracteristique de votre joueur");
		System.out.println(j1.toString());
		
		Monstre m1 = new Monstre();
		
		System.out.println("Test de la puissance d'attaque");
		System.out.println(j1.attaquer());
		System.out.println(j1.attaquer());
		System.out.println(j1.attaquer());
		System.out.println(j1.attaquer());
		System.out.println(j1.attaquer());

	}

}
