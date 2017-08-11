package model;

import java.util.ArrayList;

public class Vijven implements Observer {
	private int waarde = 0;
	private String categorieNaam = "Vijven";
	private boolean alIngevuld = false;
	
	@Override
	public void updateWaarde(ArrayList<Dobbelsteen> dobbelstenen) {
		if(this.alIngevuld == false){
			this.waarde = 0;
			ArrayList<Dobbelsteen> vijf = new ArrayList<Dobbelsteen>();
			for(int i = 0; i < dobbelstenen.size() ; ++i){
				if(dobbelstenen.get(i).getWaardeDobbelsteen() == 5){
					vijf.add(dobbelstenen.get(i));
			}
			
			if(vijf.size() >= 1) {
				int tijdelijkewaarde = vijf.size();
				this.setWaarde(tijdelijkewaarde);
			}
		}
		}
	}
	
	@Override
	public void updateScore(ArrayList<Observer> observers) {
		// TODO Auto-generated method stub
		
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
