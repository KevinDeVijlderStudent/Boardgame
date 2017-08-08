package application;

import java.awt.event.KeyListener;

import model.Categorie;
import model.CategorieMetVasteScore;
import model.Categorie.CategorieMetVariabeleScore;

import view.GameView;
import view.View;

public class ApplicationLauncher {

	public static void main(String[] args) {
		View v = new GameView("Yahtzee");
		
		v.start();
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*Categorie categorie = new Categorie(15, CategorieMetVariabeleScore.FIVES);
		System.out.println("bla: " + CategorieMetVasteScore.FULL_HOUSE + CategorieMetVasteScore.FULL_HOUSE.getwaardeCategorie());
		System.out.println("de categorie: " + categorie.getCategorieMetVariabeleScore() + " heeft als waarde: " + categorie.getWaarde());*/

