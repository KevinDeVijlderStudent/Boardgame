package view;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import controller.GameMenuController;

public class GameMenuView extends JFrame{
	
	JPanel gameMenuPanel = new JPanel(new BorderLayout());
	private JLabel welkomMessage;
	private JButton maakNieuweSpelerButton;
	private JButton startSpelButton;	
	private JButton sluitMenuButton;

	public GameMenuView(GameMenuController gameMenuController) {
		super("Spel menu");
		super.setDefaultCloseOperation(3);
		setContentPane(gameMenuPanel);
		
		welkomMessage = new JLabel("Welkom bij het yathzee boardgame menu !");
		gameMenuPanel.add(welkomMessage,BorderLayout.PAGE_START);
		
		maakNieuweSpelerButton = new JButton("Maak nieuwe speler");
		maakNieuweSpelerButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				gameMenuController.voegSpelerToe();
			}
		});
		gameMenuPanel.add(maakNieuweSpelerButton,BorderLayout.LINE_START);
		
		startSpelButton = new JButton("start spel");
		startSpelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gameMenuController.startSpel();
			}
		});
		gameMenuPanel.add(startSpelButton,BorderLayout.LINE_END);
		
		sluitMenuButton = new JButton("Sluit af");
		sluitMenuButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		gameMenuPanel.add(sluitMenuButton,BorderLayout.PAGE_END);
		
		this.setSize(400,100);
		this.start();
	}

	
	public void start() {
		setVisible(true); 
	}
	
	public void stop() {
		setVisible(false);
	}

}
