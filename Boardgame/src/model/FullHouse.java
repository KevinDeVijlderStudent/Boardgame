package model;

import java.util.ArrayList;
import java.util.Collections;

public class FullHouse implements Observer{
	private int waarde = 0;
	private String categorieNaam = "Full House";
	private boolean alIngevuld = false;
	
	@Override
	public void updateWaarde(ArrayList<Dobbelsteen> dobbelstenen) {
		if(this.alIngevuld == false){
			this.waarde = 0;
			ArrayList<Dobbelsteen> een = new ArrayList<Dobbelsteen>();
			ArrayList<Dobbelsteen> twee = new ArrayList<Dobbelsteen>();
			ArrayList<Dobbelsteen> drie = new ArrayList<Dobbelsteen>();
			ArrayList<Dobbelsteen> vier = new ArrayList<Dobbelsteen>();
			ArrayList<Dobbelsteen> vijf = new ArrayList<Dobbelsteen>();
			ArrayList<Dobbelsteen> zes = new ArrayList<Dobbelsteen>();
			for(int i = 0; i < dobbelstenen.size() ; ++i){
				if(dobbelstenen.get(i).getWaardeDobbelsteen() == 1){
					een.add(dobbelstenen.get(i));
				} else if (dobbelstenen.get(i).getWaardeDobbelsteen() == 2){
					twee.add(dobbelstenen.get(i));
				} else if (dobbelstenen.get(i).getWaardeDobbelsteen() == 3){
					drie.add(dobbelstenen.get(i));
				} else if (dobbelstenen.get(i).getWaardeDobbelsteen() == 4){
					vier.add(dobbelstenen.get(i));
				} else if (dobbelstenen.get(i).getWaardeDobbelsteen() == 5){
					vijf.add(dobbelstenen.get(i));
				} else {
					zes.add(dobbelstenen.get(i));
				}
			}
			
			if(een.size() == 3 || twee.size() == 3 || drie.size() == 3 || vier.size() == 3 || vijf.size() == 3 || zes.size() == 3) {
				if(een.size() == 2 || twee.size() == 2 || drie.size() == 2 || vier.size() == 2 || vijf.size() == 2 || zes.size() == 2) {
					this.setWaarde(25);
				}
			}
		}
	}
	
	@Override
	public void updateScore(ArrayList<Observer> observers) {
		
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
