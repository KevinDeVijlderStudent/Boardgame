package model;

public class Dobbelsteen {
	private int waardeDobbelsteen;
	private boolean kanGeroldWorden;

	//Constructor
	public Dobbelsteen(){
		//bij het maken van een dobbelsteenobject, heeft deze meteen een waarde en kan standaard mee gerold worden
		this.rollDobbelsteen();
		this.setKanGeroldWorden(true);
	}
	
	//Getters en setters
	public int getWaardeDobbelsteen() {
		return waardeDobbelsteen;
	}

	private void setWaardeDobbelsteen(int waardeDobbelsteen) {
		//Extra controle om zeker te zijn dat de dobbelsteen nooit een illegale waarde heeft
		if(waardeDobbelsteen < 1 || waardeDobbelsteen > 6){
			throw new ModelException("Waarde van dobbelsteen niet legaal");
		}
		this.waardeDobbelsteen = waardeDobbelsteen;
	}
	
	public void rollDobbelsteen(){
		//maak random getal tussen 1 en 6, altijd rond getal
		int randomwaarde = (int)(Math.random()*6) + 1;
		//zet de dobbelsteenwaarde op dit random getal
		this.setWaardeDobbelsteen(randomwaarde);
	}
	
	public boolean getKanGeroldWorden(){
		return this.kanGeroldWorden;
	}
	
	public void setKanGeroldWorden(boolean kanGeroldWorden){
		this.kanGeroldWorden = kanGeroldWorden;
	}
	
	
}
