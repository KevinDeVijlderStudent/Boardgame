package model;

public class Speler {
	private String spelernaam;

	public Speler(String spelernaam) {
		this.setNaam(spelernaam);
	}

	public String getNaam() {
		return spelernaam;
	}

	private void setNaam(String spelernaam) {
		if(spelernaam.trim().isEmpty() == true || spelernaam == null){
			throw new ModelException("Spelernaam mag niet leeg of null zijn");
		}
		this.spelernaam = spelernaam;
	}
	
	
}
