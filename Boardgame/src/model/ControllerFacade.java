package model;

import java.util.ArrayList;

public class ControllerFacade {
	private Speler speler;
	private Dobbelsteen[] dobbelstenen = new Dobbelsteen[5];
	private ArrayList<Observer> observers = new ArrayList();
	
	public ControllerFacade(Speler speler) {
		this.setSpeler(speler);
		for(int i = 0 ; i < 5 ; i++){
			dobbelstenen[i] = new Dobbelsteen();
		}
	}

	private void setSpeler(Speler speler) {
		this.speler = speler;
	}
	
	public Speler getSpeler(){
		return this.speler;
	}
	
	

}
