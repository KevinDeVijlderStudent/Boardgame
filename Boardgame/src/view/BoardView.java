package view;



import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.BoardController;
import controller.GameMenuController;

public class BoardView extends JFrame {
	
	JPanel boardPanel = new JPanel(new BorderLayout());
	private JLabel spelNaam;
	private JLabel spelerNaam;

	public BoardView(BoardController boardcontroller) {
		super();
		setContentPane(boardPanel);
		super.setDefaultCloseOperation(3);
		
		boardPanel.setBackground(Color.lightGray);
		
		spelNaam = new JLabel("Yathzee");
		boardPanel.add(spelNaam,BorderLayout.PAGE_START);
		
		spelerNaam = new JLabel(boardcontroller.getControllerFacade().getSpeler().getNaam());
		boardPanel.add(spelerNaam, BorderLayout.PAGE_END);
		
		this.setSize(1280, 720);
		this.start();
	}


	
	public void start() {
		setVisible(true); 
	}
	public void stop(){
		setVisible(false);
	}

	
	
	

}
