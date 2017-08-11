package model;

import java.util.ArrayList;

public class Kans implements Observer{
	private int waarde = 0;
	private String categorieNaam = "Kans";
	private boolean alIngevuld = false;
	
	
	@Override
	public void updateWaarde(ArrayList<Dobbelsteen> dobbelstenen) {
		if(this.alIngevuld == false){
			this.waarde = 0;
			for(int i = 0 ; i < dobbelstenen.size() ; ++i){
					this.waarde += dobbelstenen.get(i).getWaardeDobbelsteen();
				}
			}
	}
	
	@Override
	public int getWaarde() {
		return this.waarde;
	}
	
	@Override
	public void setWaarde(int waarde) {
		this.waarde = waarde;
	}
	
	@Override
	public boolean returnIsIngevuld() {
		return this.alIngevuld;
	}
	
	@Override
	public void alIngevuldOpTrue() {
		this.alIngevuld = true;
	}
	
	@Override
	public String getCategorieNaam() {
		return this.categorieNaam;
	}

	@Override
	public void zetWaardeopNul() {
		this.setWaarde(0);
		this.alIngevuld = false;
	}

}
