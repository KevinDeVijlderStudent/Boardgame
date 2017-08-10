package model;

import java.util.ArrayList;

public interface Observer {

	 public abstract void updateDobbelsteen(ArrayList<Dobbelsteen> dobbelstenen);
	  
	  public abstract void updateScore(ArrayList<Observer> observers);
	  
	  public abstract int getWaarde();
	  
	  public abstract void setWaarde(int waarde);
	  
	  public abstract void reset();
	  
	  public abstract void resetAlsNietGebruikt();
	  
	  public abstract boolean returnIsGebruikt();
	  
	  public abstract void alGebruikt();
	  
	  public abstract String getCategorieNaam();
	  
	
}
