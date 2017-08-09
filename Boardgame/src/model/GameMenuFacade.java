package model;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import controller.BoardController;
import controller.GameMenuController;
import view.GameMenuView;

public class GameMenuFacade {
	private GameMenuView gameMenuView;
	private ArrayList<BoardController> boards = new ArrayList<BoardController>();
	
	
	public GameMenuFacade(GameMenuController gameMenuController) {
		this.gameMenuView = new GameMenuView(gameMenuController);
	}
	
	public Speler maakSpeler(){
		String naam = JOptionPane.showInputDialog("Geef hier u spelersnaam in: ");
		Speler nieuwespeler = new Speler(naam);
		return nieuwespeler;
	}

	public GameMenuView getGameMenuView() {
		return gameMenuView;
	}

	public ArrayList<BoardController> getBoards() {
		return boards;
	}
	
	

}
