package model;

public interface Subject {
	  public abstract void registreerObserver(Observer observer);
	  
	  public abstract void verwijderObserver(Observer observer);
	  
	  public abstract void verwittigObserver(Observer observer);
	  
	  public abstract void verwittigAlleObservers();
	  
	  public abstract void resetObservers();
}
