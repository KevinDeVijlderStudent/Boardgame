package model;

import java.util.ArrayList;
import model.Observer;

public class YathzeeSpelFacade implements Subject {
	private Speler speler;
	private ArrayList<Dobbelsteen> dobbelstenen = new ArrayList<Dobbelsteen>();
	private ArrayList<Dobbelsteen> gekozendobbelstenen = new ArrayList<Dobbelsteen>();
	private ArrayList<Observer> observers = new ArrayList();
	
	public YathzeeSpelFacade(Speler speler) {
		this.setSpeler(speler);
		for(int i = 0; i < 5; ++i){
			dobbelstenen.add(i, new Dobbelsteen());;
		}
		
		for(int i = 0; i < 5; ++i){
			gekozendobbelstenen.add(i, new Dobbelsteen());;
		}
		
		registreerDeObservers();
	}

	private void registreerDeObservers() {
		//alle verschillende categorien worden geregistreerd als observer, elk van deze klasse heeft een methode om het aantal punten te berekenen
			registreerObserver(new Eentjes());
			registreerObserver(new Tweeen());
			registreerObserver(new Drieen());
			registreerObserver(new Vieren());
			registreerObserver(new Vijven());
			registreerObserver(new Zessen());
			
			registreerObserver(new BovenBonus());
			
			registreerObserver(new DrieGelijken());
			registreerObserver(new VierGelijken());
			registreerObserver(new KleineStraat());
			registreerObserver(new GroteStraat());
			registreerObserver(new FullHouse());
			registreerObserver(new Kans());
			registreerObserver(new Yathzee());
			
			
	}

	private void setSpeler(Speler speler) {
		this.speler = speler;
	}
	
	public Speler getSpeler(){
		return this.speler;
	}
	
	
	//logica rolbare dobbelstenen
	public int getDobbelsteenWaarde(int indexindobbelstenenlijst){
		return dobbelstenen.get(indexindobbelstenenlijst).getWaardeDobbelsteen();
	}
	
	public boolean dobbelsteenMagGeworpenWorden(int indexdobbelstenenlijst){
		return dobbelstenen.get(indexdobbelstenenlijst).getKanGeroldWorden();
	}
	
	public ArrayList<Dobbelsteen> getDobbelstenen(){
		return this.dobbelstenen;
	}
	
	public void rolDobbelsteen(int indexindobbelstenenlijst){
		dobbelstenen.get(indexindobbelstenenlijst).rollDobbelsteen();
	}
	
	public void alleDobbelstenenMogenGeworpenWorden(){
		for(int i = 0; i < 5; ++i){
			dobbelstenen.get(i).setKanGeroldWorden(true);
		}
	}
	
	public void alleDobbelstenenMogenNietGeworpenWorden(){
		for(int i = 0; i < 5; ++i){
			dobbelstenen.get(i).setKanGeroldWorden(false);
		}
	}
	
	public Dobbelsteen getDobbelsteen(int index){
		return dobbelstenen.get(index);
	}
	
	public void setDobbelsteenMagNietGegooidWorden(int indexningekozendobbelstenenlijst){
		dobbelstenen.get(indexningekozendobbelstenenlijst).setKanGeroldWorden(false);
	}
	
	//logica nietrolbare dobbelstenen
	public void addGekozenDobbelsteen(Dobbelsteen gekozendobbelsteen,int index){
		this.gekozendobbelstenen.add(index, gekozendobbelsteen);
	}
	
	public int getDobbelsteenWaardeNietRolbareDobbelstenen(int indexningekozendobbelstenenlijst){
		return gekozendobbelstenen.get(indexningekozendobbelstenenlijst).getWaardeDobbelsteen();
	}
	
	public ArrayList<Dobbelsteen> getGekozenDobbelstenen(){
		return this.gekozendobbelstenen;
	}
	
	public void setGekozenDobbelsteenMagNietGegooidWorden(int indexningekozendobbelstenenlijst){
		gekozendobbelstenen.get(indexningekozendobbelstenenlijst).setKanGeroldWorden(false);
	}
	
	public int getGekozenDobbelsteenWaarde(int indexindobbelstenenlijst){
		return gekozendobbelstenen.get(indexindobbelstenenlijst).getWaardeDobbelsteen();
	}

	
	//observer pattern methodes subject
	public ArrayList<Observer> getObservers(){
	    return this.observers;
	}
	
	@Override
	public void registreerObserver(Observer observer) {
		this.observers.add(observer);
	}

	@Override
	public void verwijderObserver(Observer observer) {
		this.observers.remove(observer);
	}

	@Override
	public void verwittigObserver(Observer observer) {
	    observer.updateWaarde(dobbelstenen);
	}

	@Override
	public void verwittigAlleObservers() {
		for (int i = 0 ; i < this.observers.size(); ++i) {
		      verwittigObserver((Observer)this.observers.get(i));
		}
	}

	@Override
	public void resetObservers() {
		for (int i = 0 ; i < this.observers.size(); ++i) {
			((Observer)this.observers.get(i)).zetWaardeopNul();
		} 
	}
	
	
}
