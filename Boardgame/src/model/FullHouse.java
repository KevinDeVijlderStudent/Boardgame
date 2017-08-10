package model;

import java.util.ArrayList;

public class FullHouse implements Observer{
	private String categorieNaam = "FullHouse";
	private int waarde = 0;
	private boolean alGebruikt = false;
	
	@Override
	public void updateDobbelsteen(ArrayList<Dobbelsteen> dobbelstenen) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void updateScore(ArrayList<Observer> observers) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public int getWaarde() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void resetAlsNietGebruikt() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean returnIsGebruikt() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void alGebruikt() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void reset() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String getCategorieNaam() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void setWaarde(int score) {
		// TODO Auto-generated method stub
		
	}
}
