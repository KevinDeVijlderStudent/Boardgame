package model;

public enum CategorieMetVasteScore {
	FULL_HOUSE (25),
	SMALL_STRAIGHT (30),
	LARGE_STRAIGHT (40),
	YAHTZEE (50);
	
	private int waardeCategorie;
		
	private CategorieMetVasteScore(int waardeCategorie){
		this.waardeCategorie = waardeCategorie;
	}
	
	public int getwaardeCategorie(){
		return waardeCategorie;
	}
}
