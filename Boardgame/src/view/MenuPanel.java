package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import model.Speler;

public class MenuPanel  extends JPanel {
	private JLabel welkomMessage;
	private JButton maakNieuweSpelerButton;
	private JButton startSpelButton;
	
	private JButton sluitMenuButton;
	
	public MenuPanel(){
		super(new BorderLayout());
	
		welkomMessage = new JLabel("Welkom bij het yathzee boardgame menu !");
		maakNieuweSpelerButton = new JButton("Maak nieuwe speler");
		startSpelButton = new JButton("start spel");
		sluitMenuButton = new JButton("Sluit af");
			
		welkomMessage.setPreferredSize(new Dimension(350, 50));
		this.add(welkomMessage, BorderLayout.PAGE_START);
		 
		maakNieuweSpelerButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				Speler speler = new Speler(JOptionPane.showInputDialog("Geef spelernaam in"));
				
			}
		});
		this.add(maakNieuweSpelerButton, BorderLayout.LINE_START);
		
		
		this.add(startSpelButton, BorderLayout.LINE_END);
		
		sluitMenuButton.addActionListener(new ActionListener()
	    {
	        public void actionPerformed(ActionEvent ae)
	        {
	         System.exit(0);
	        }
	    });
		
		this.add(sluitMenuButton, BorderLayout.PAGE_END);
		 
	 
	}
	
	
	public void addIsListener(KeyListener isListener){
		
	}
}
