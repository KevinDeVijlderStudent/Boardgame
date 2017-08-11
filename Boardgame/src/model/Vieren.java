package model;

import java.util.ArrayList;

public class Vieren implements Observer {
	private int waarde = 0;
	private String categorieNaam = "Vieren";
	private boolean alIngevuld = false;
	
	@Override
	public void updateWaarde(ArrayList<Dobbelsteen> dobbelstenen) {
		if(this.alIngevuld == false){
			this.waarde = 0;
			ArrayList<Dobbelsteen> vier = new ArrayList<Dobbelsteen>();
			for(int i = 0; i < dobbelstenen.size() ; ++i){
				if(dobbelstenen.get(i).getWaardeDobbelsteen() == 4){
					vier.add(dobbelstenen.get(i));
			}
			
			if(vier.size() >= 1) {
				int tijdelijkewaarde = vier.size();
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
