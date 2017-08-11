package model;

import java.util.ArrayList;

public class Eentjes implements Observer {
	//waarde die deze catgeorie uiteindelijk gaat hebben , afhankelijk van hoeveel eentjes gegoooid
	private int waarde = 0;
	private String categorieNaam = "Eentjes";
	//standaard is een categorie nog niet ingevuld , wanneer deze categorie wordt ingevuld => wordt op true gezet
	private boolean alIngevuld = false;
	
	@Override
	public void updateWaarde(ArrayList<Dobbelsteen> dobbelstenen) {
		//de categorie mag nog niet ingevuld zijn
		if(this.alIngevuld == false){
			this.waarde = 0;
			ArrayList<Dobbelsteen> een = new ArrayList<Dobbelsteen>();
			for(int i = 0; i < dobbelstenen.size() ; ++i){
				if(dobbelstenen.get(i).getWaardeDobbelsteen() == 1){
					een.add(dobbelstenen.get(i));
			}
			
			if(een.size() >= 1) {
				int tijdelijkewaarde = een.size();
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
