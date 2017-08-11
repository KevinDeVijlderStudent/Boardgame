package controller;

import model.YathzeeSpelFacade;
import model.Dobbelsteen;
import model.GameMenuFacade;
import model.Speler;
import view.BoardView;

public class BoardController {
	 private BoardView boardview;
	 private YathzeeSpelFacade yathzeeSpelFacade;
	 private GameMenuController gameMenuController;
	 
	 public BoardController(Speler speler, GameMenuController gameMenuController){
		 this.yathzeeSpelFacade = new YathzeeSpelFacade(speler);
		 this.boardview = new BoardView(this);
		 this.gameMenuController = gameMenuController;
	 }

	public YathzeeSpelFacade getYathzeeSpelFacade() {
		return yathzeeSpelFacade;
	}

	public void rollDobbelstenen() {
		for(int i = 0 ; i < 5 ; ++i){
			if(yathzeeSpelFacade.dobbelsteenMagGeworpenWorden(i) == true){
				this.yathzeeSpelFacade.rolDobbelsteen(i);
				updateDobbelstenen();
			}
		}
	}
	
	public void voegDobbelSteenToenAanGekozen(Dobbelsteen gekozendobbelsteen, int index){
		this.yathzeeSpelFacade.addGekozenDobbelsteen(gekozendobbelsteen, index);
	}
	
	public void maakDobbelsteenNietRolbaar(int index){
		this.yathzeeSpelFacade.setDobbelsteenMagNietGegooidWorden(index);
	}

	public void updateDobbelstenen() {
		this.boardview.updateDobbelstenen(this);
	}
	
	public void startBoard(){
		boardview.setVisible(true);
	}
	
	public void stopBoard(){
		boardview.setVisible(false);;
	}

	public void startBeurt() {
		
	}

	 
	 
}
