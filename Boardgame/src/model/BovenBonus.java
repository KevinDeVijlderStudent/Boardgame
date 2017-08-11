package model;

import java.util.ArrayList;

public class BovenBonus implements Observer{
	private int waarde = 0;
	private String categorieNaam = "BovenBonus";
	private boolean alIngevuld = false;
	
	
	@Override
	public void updateWaarde(ArrayList<Dobbelsteen> dobbelstenen) {
		// TODO Auto-generated method stub
		
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
		return alIngevuld;
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
