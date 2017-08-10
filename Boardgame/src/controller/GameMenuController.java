package controller;

import java.util.ArrayList;

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
		
	}
}
