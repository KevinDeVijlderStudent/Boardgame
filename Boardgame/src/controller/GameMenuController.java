package controller;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import model.GameMenuFacade;
import model.Speler;
import view.GameMenuView;

public class GameMenuController {

	private GameMenuFacade gameMenuFacade = new GameMenuFacade(this);

	public void voegSpelerToe(){
		//voor iedere nieuwe speler wordt een nieuw bord gegnereert
		this.gameMenuFacade.getGameMenuView().stop();
		
		Speler speler = gameMenuFacade.maakSpeler();
		
		BoardController board = new BoardController(speler,this);
		board.stopBoard();
		this.gameMenuFacade.getBoards().add(board);
		
		this.gameMenuFacade.getGameMenuView().start();
	}


	private void setGameMenuFacade(GameMenuFacade gameMenuFacade) {
		this.gameMenuFacade = gameMenuFacade;
	}

	public GameMenuFacade getGameMenuFacade() {
		return gameMenuFacade;
	}


	public void startSpel() {
		//ik ga ervanuit dat minstens twee mensen willen spelen, alleen spelen leek mij wat vreemd
		if(gameMenuFacade.getBoards().size() > 1){
			this.gameMenuFacade.getBoards().get(0).startBeurt(); //het spel wordt gestart en de eerste speler zijn beurt begint
			this.gameMenuFacade.getGameMenuView().stop(); //we maken het menuscherm onzichtbaar omdat het spel bezig is en er geen spelers meer kunnen registerern
			
			for(int i = 0 ; i < gameMenuFacade.getBoards().size() ; ++i){
				this.gameMenuFacade.getBoards().get(i).startBoard();
			}
			
		} else {
			JOptionPane.showMessageDialog(null, "Het spel kan pas beginnen indien twee spelers registreren!");
		}
	}
}
