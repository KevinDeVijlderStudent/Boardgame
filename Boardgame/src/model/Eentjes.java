package model;

import java.util.ArrayList;

public class Eentjes implements Observer{
	private String categorieNaam = "Eentjes";
	private int waarde = 0;
	private boolean alGebruikt = false;
	
	@Override
	public void updateDobbelsteen(ArrayList<Dobbelsteen> dobbelstenen) {
		if(this.alGebruikt == false){
			this.waarde = 0;
			for(int i = 0 ; i < dobbelstenen.size() ; ++i){
				if( (dobbelstenen.get(i).getWaardeDobbelsteen() == 1) && (dobbelstenen.get(i).getKanGeroldWorden() == false) ){
					this.waarde += 1;
				}
			}
		}
	}
	
	@Override
	public void updateScore(ArrayList<Observer> observers) {
		
	}
	
	@Override
	public int getWaarde() {
		return waarde;
	}
	
	@Override
	public void setWaarde(int waarde) {
		this.waarde = waarde;
	}
	
	@Override
	public void reset() {
		this.waarde = 0;
		this.alGebruikt = false;
	}
	
	@Override
	public void resetAlsNietGebruikt() {
		if (this.alGebruikt == false){
			this.waarde = 0;
			this.alGebruikt = false;
	    }
	}
	
	@Override
	public boolean returnIsGebruikt() {
		return this.alGebruikt;
	}
	
	@Override
	
	public void alGebruikt() {
		this.alGebruikt = true;
	}
	
	@Override
	public String getCategorieNaam() {
		return this.categorieNaam;
	}
	
	
	
}
