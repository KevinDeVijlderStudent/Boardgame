package model;

import java.util.ArrayList;

public abstract interface Observer {
	  public abstract void updateWaarde(ArrayList<Dobbelsteen> dobbelstenen);
	  
	  public abstract int getWaarde();
	  
	  public abstract void setWaarde(int waarde);
	  
	  public abstract boolean returnIsIngevuld();
	  
	  public abstract void alIngevuldOpTrue();
	  
	  public abstract String getCategorieNaam();
	  
	 public abstract void zetWaardeopNul();
}
