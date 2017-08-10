package model;

import java.util.ArrayList;

public class ControllerFacade {
	private Speler speler;
	private ArrayList<Dobbelsteen> dobbelstenen = new ArrayList<Dobbelsteen>();
	private ArrayList<Observer> observers = new ArrayList();
	
	public ControllerFacade(Speler speler) {
		this.setSpeler(speler);
		
	}

	private void setSpeler(Speler speler) {
		this.speler = speler;
	}
	
	public Speler getSpeler(){
		return this.speler;
	}
	
	public int getDobbelsteenWaarde(int indexindobbelstenenlijst){
		return dobbelstenen.get(indexindobbelstenenlijst).getWaardeDobbelsteen();
	}
	

}
