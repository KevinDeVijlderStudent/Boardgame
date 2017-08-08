package view;

import java.awt.HeadlessException;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class GameView extends JFrame implements View{
	
	private PlayerRegistrationPanel playerRegistrationPanel;

	public GameView(String naam) {
		super(naam);
		setSize(900, 800);
		setPlayerRegistrationPanel(new PlayerRegistrationPanel());
		setContentPane(getPlayerRegistrationPanel());
		pack();
	}

	@Override
	public void start() {
		setVisible(true); 
	}
	
	private void setPlayerRegistrationPanel(PlayerRegistrationPanel playerRegistrationPanel) {
		this.playerRegistrationPanel = playerRegistrationPanel;
	}

	private PlayerRegistrationPanel getPlayerRegistrationPanel() {
		return playerRegistrationPanel;
	}
	
	public void displayErrorMessage(String errorMessage){	         
		JOptionPane.showMessageDialog(this, errorMessage);        
    }

	@Override
	public void addIsListener(KeyListener isListener) {
		getPlayerRegistrationPanel().addIsListener(isListener);
	}	
	
}
