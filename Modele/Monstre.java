package Modele;

import java.util.Random;

public class Monstre {
	//Attributs
	private int vie;
	private int force;
	//Constructeur
	public Monstre() {
		vie = 30;
		force = 10;
	}
	public Monstre(int v, int x){
		vie = v;
		force = x;
		
	}
	//Accesseurs
	public int getVie() {
		return vie;
	}
	public int getForce() {
		return force;
	}
	//Setters
	public void setVie(int v) {
		vie = v;
	}
	public void setForce(int v) {
		force = v;
	}
	//Service
	public int attaquer() {
		Random rand = new Random();
		int d = rand.nextInt(force)+5;
		return d;
    }
	public String toString(){
		return "Vie du perso="+vie+"\nForce="+force;
	}
	

}
