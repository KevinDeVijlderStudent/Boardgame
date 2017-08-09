package controller;

import model.ControllerFacade;
import model.GameMenuFacade;
import model.Speler;
import view.BoardView;

public class BoardController {
	 private BoardView boardview;
	 private ControllerFacade controllerFacade;
	 private GameMenuController gameMenuController;
	 
	 public BoardController(Speler speler, GameMenuController gameMenuController){
		 this.controllerFacade = new ControllerFacade(speler);
		 this.boardview = new BoardView(this);
		 this.gameMenuController = gameMenuController;
	 }

	public ControllerFacade getControllerFacade() {
		return controllerFacade;
	}
	 
	 
}
