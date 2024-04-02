package Modele;

import java.util.Random;

public class Joueur {
	private int vie;
	private int xp;
	private int force;
	//Constructeur
    public Joueur(){
    			vie = 100;
    			xp = 0;
    			force = 10;
    		}
    		public Joueur(int v, int x, int f){
    			vie = v;
    			xp = x;
    			force = f;
    			
    		}
    		//Accesseurs
    		public int getVie() {
    			return vie;
    		}
    		public int getxp() {
    			return xp;
    		}
    		public int getForce() {
    			return force;
    		}
    		//Setters
    		public void setVie(int v) {
    			vie = v;
    		}
    		public void setxp(int v) {
    			xp = v;
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
    			return "Vie du perso="+vie+"\nXp="+xp+"\nForce="+force;
    		}
    		
}

