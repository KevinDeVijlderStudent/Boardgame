package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PlayerRegistrationPanel extends JPanel {
	private JLabel welcomeMessage;
	private JTextField playerName;
	private JButton cancel;
	private JButton ok;
	
	public PlayerRegistrationPanel(){
	super(new BorderLayout());
	
	welcomeMessage = new JLabel("Welkom bij yathzee, gelieve u spelersnaam in te geven: ");
	playerName = new JTextField(10);
	cancel = new JButton("Cancel");
	ok = new JButton("Ok");
	
	 welcomeMessage.setPreferredSize(new Dimension(350, 50));
	 this.add(welcomeMessage, BorderLayout.PAGE_START);
	 
	 this.add(playerName, BorderLayout.LINE_START);
	
	 
	 this.add(cancel, BorderLayout.CENTER);
	 
	 
	 this.add(ok, BorderLayout.LINE_END);
	 
	}
	
	public String getEnteredName(){
		String enteredname = playerName.getText();
		enteredname = enteredname.trim();
		return enteredname;
	}
	
	public void addIsListener(KeyListener isListener){
		playerName.addKeyListener(isListener);
	}
}
