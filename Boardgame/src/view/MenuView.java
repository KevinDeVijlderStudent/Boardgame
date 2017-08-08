package view;

import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MenuView extends JFrame implements View{
	
	private MenuPanel menuPanel;

	public MenuView(String naam) {
		super(naam);
		
		setMenuPanel(new MenuPanel());
		setContentPane(getMenuPanel());
		pack();
	}

	@Override
	public void start() {
		setVisible(true); 
	}
	
	
	
	private MenuPanel getMenuPanel() {
		return menuPanel;
	}

	private void setMenuPanel(MenuPanel menuPanel) {
		this.menuPanel = menuPanel;
	}

	public void displayErrorMessage(String errorMessage){	         
		JOptionPane.showMessageDialog(this, errorMessage);        
    }

	@Override
	public void addIsListener(KeyListener isListener) {
		getMenuPanel().addIsListener(isListener);
	}	

}
