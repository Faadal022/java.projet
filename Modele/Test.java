package Modele;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*System.out.println("Vueillez entrer un nombre :");
		Scanner sc1 = new Scanner(System.in);
		int nb = sc1.nextInt();
		System.out.println("Vous avez entre : " + nb);
		
		System.out.println("Vueillez entrer une chaine :");
		Scanner sc2 = new Scanner(System.in);
		String str = sc2.nextLine();
		System.out.println("Vous avez entre : " + str);
		
		Grille g1 = new Grille(12, 6);
		g1.afficher();
		System.out.println();*/
		
		Grille g1 = new Grille(12, 8);
		g1.placer(3,5,'j');
		g1.placer(8,2,'O');
		g1.placer(1,1,'M');
		g1.placer(7,4,'o');
		g1.placer(10,7,'M');
		g1.placer(2,8,'O');
		g1.placer(11,2,'M');
		
		System.out.println("Debut des tests\n");
		System.out.println(g1.getCase(3, 5) + " = j\n");
		System.out.println(g1.getCase(7, 4) + " = O\n");
		System.out.println(g1.getCase(10, 7) + " = M\n");
		System.out.println(g1.getCase(3, 3) + " = .\n");
		System.out.println("Test de deplacer\n");
		g1.deplacerH();
		System.out.println(g1.getCase(3, 5) + " = j\n");
		
		
	}

}
