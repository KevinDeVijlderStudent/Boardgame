package model;

public class Categorie {
	private int waarde;
	private CategorieMetVariabeleScore categorieMetVariabeleScore;
	
	public enum CategorieMetVariabeleScore {
		ACES,TWOS,THREES,FOURS,FIVES,SIXES,THREE_OF_A_KIND,FOUR_OF_A_KIND,CHANCE;
	}

	public Categorie(int waarde, CategorieMetVariabeleScore categorieMetVariabeleScore) {
		this.setWaarde(waarde);
		this.setCategorieMetVariabeleScore(categorieMetVariabeleScore);
	}

	public int getWaarde() {
		return waarde;
	}

	private void setWaarde(int waarde) {
		if(waarde < 0) {
			throw new ModelException("waarde mag niet kleiner dan 0 zijn");
		}
		this.waarde = waarde;
	}

	public CategorieMetVariabeleScore getCategorieMetVariabeleScore() {
		return categorieMetVariabeleScore;
	}

	private void setCategorieMetVariabeleScore(CategorieMetVariabeleScore categorieMetVariabeleScore) {
		this.categorieMetVariabeleScore = categorieMetVariabeleScore;
	}
	
	
	
	
	
}
