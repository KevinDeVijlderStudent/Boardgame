package model;

import java.util.ArrayList;
import java.util.Collections;

public class VierGelijken implements Observer {
	private String categorieNaam = "Vier Gelijken";
	private int waarde = 0;
	private boolean alIngevuld = false;
	
	
	@Override
	public void updateWaarde(ArrayList<Dobbelsteen> dobbelstenen) {
		if(this.alIngevuld == false){
			this.waarde = 0;
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
			
			if(een.size() >= 4 || twee.size() >= 4 || drie.size() >= 4 || vier.size() >= 4 || vijf.size() >= 4 || zes.size() >= 4) {
				int tijdelijkewaarde = 0;
				for(int i = 0 ; i < dobbelstenen.size() ; ++i){
					tijdelijkewaarde += dobbelstenen.get(i).getWaardeDobbelsteen();
				}
				this.setWaarde(tijdelijkewaarde);
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
