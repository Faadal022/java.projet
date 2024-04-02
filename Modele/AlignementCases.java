package Modele;

public class AlignementCases {
	 private Case[] cases;

	    public AlignementCases(Case[] cases) {
	        this.setCases(cases);
	    }

		public Case[] getCases() {
			return cases;
		}

		public void setCases(Case[] cases) {
			this.cases = cases;
		}

}
