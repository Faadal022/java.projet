package Modele;
public class Case {
     private int value;
     private boolean selectionnee;

	 public Case(int value) {
	     this.value = value;
	     this.selectionnee = false;
	    }

	    public int getValue() {
	        return value;
	    }
	    
	    public boolean EstSelectionnee() {
	        return selectionnee;
	    }

	    public void setSelectionnee(boolean selectionnee, boolean Selectionnee) {
	        this.selectionnee = selectionnee;
	        
	    }

}
