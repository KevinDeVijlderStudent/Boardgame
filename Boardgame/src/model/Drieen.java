package model;

import java.util.ArrayList;

public class Drieen implements Observer{
	private int waarde = 0;
	private String categorieNaam = "Drieen";
	private boolean alIngevuld = false;
	
	@Override
	public void updateWaarde(ArrayList<Dobbelsteen> dobbelstenen) {
		if(this.alIngevuld == false){
			this.waarde = 0;
			ArrayList<Dobbelsteen> drie = new ArrayList<Dobbelsteen>();
			for(int i = 0; i < dobbelstenen.size() ; ++i){
				if(dobbelstenen.get(i).getWaardeDobbelsteen() == 3){
					drie.add(dobbelstenen.get(i));
			}
			
			if(drie.size() >= 1) {
				int tijdelijkewaarde = drie.size();
				this.setWaarde(tijdelijkewaarde);
			}
		}
		}
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
	public boolean returnIsIngevuld() {
		return alIngevuld;
	}
	@Override
	public void alIngevuldOpTrue() {
		this.alIngevuld = true;
	}
	@Override
	public String getCategorieNaam() {
		return categorieNaam;
	}
	@Override
	public void zetWaardeopNul() {
		this.setWaarde(0);
		this.alIngevuld = false;
	}
	
	

}
