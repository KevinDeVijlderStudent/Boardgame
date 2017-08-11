package view;



import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

import controller.BoardController;
import controller.GameMenuController;
import model.Observer;

public class BoardView extends JFrame {
	
	//te werpen dobbelstenen
	JPanel dobbelstenenPanel = new JPanel(new FlowLayout());
	private JButton dobbelsteen1;
	private JButton dobbelsteen2;
	private JButton dobbelsteen3;
	private JButton dobbelsteen4;
	private JButton dobbelsteen5;
	private ArrayList<JButton> dobbelsteenbuttonlijst = new ArrayList<JButton>(5);
	private JButton gooiDobbelstenenButton;
	
	//gekozendobbelstenen
	JPanel gekozendobbelstenenPanel = new JPanel(new FlowLayout());
	private JButton gekozendobbelsteen1;
	private JButton gekozendobbelsteen2;
	private JButton gekozendobbelsteen3;
	private JButton gekozendobbelsteen4;
	private JButton gekozendobbelsteen5;
	private ArrayList<JButton> gekozendobbelsteenbuttonlijst = new ArrayList<JButton>(5);
	
	//CategorieNamen
	JPanel categorieEnScorenPanel = new JPanel(new FlowLayout());
	private JComboBox<String> categorieNamen;
	
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
		
		//spelendespeler bij bord
		spelerNaam = new JLabel(boardcontroller.getYathzeeSpelFacade().getSpeler().getNaam());
		boardPanel.add(spelerNaam, BorderLayout.PAGE_END);
		
		//dobbelstenen die nog geworpen moeten worden
		dobbelsteen1 = new JButton(Integer.toString(boardcontroller.getYathzeeSpelFacade().getDobbelsteenWaarde(0)));
		dobbelsteenbuttonlijst.add(dobbelsteen1);
		dobbelsteen1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boardcontroller.voegDobbelSteenToenAanGekozen(boardcontroller.getYathzeeSpelFacade().getDobbelsteen(0) , 0);
				boardcontroller.maakDobbelsteenNietRolbaar(0);
				maakGewoneDobbelsteenOnzichtbaar(boardcontroller, 0);
				updateGekozenDobbelsteen(boardcontroller, 0);
			}
		});
		dobbelstenenPanel.add(dobbelsteen1);
		
		
		dobbelsteen2 = new JButton(Integer.toString(boardcontroller.getYathzeeSpelFacade().getDobbelsteenWaarde(1)));
		dobbelsteenbuttonlijst.add(dobbelsteen2);
		dobbelsteen2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boardcontroller.voegDobbelSteenToenAanGekozen(boardcontroller.getYathzeeSpelFacade().getDobbelsteen(1) , 1);
				boardcontroller.maakDobbelsteenNietRolbaar(1);
				maakGewoneDobbelsteenOnzichtbaar(boardcontroller, 1);
				updateGekozenDobbelsteen(boardcontroller, 1);
			}
		});
		dobbelstenenPanel.add(dobbelsteen2);

		
		dobbelsteen3 = new JButton(Integer.toString(boardcontroller.getYathzeeSpelFacade().getDobbelsteenWaarde(2)));
		dobbelsteenbuttonlijst.add(dobbelsteen3);
		dobbelsteen3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boardcontroller.voegDobbelSteenToenAanGekozen(boardcontroller.getYathzeeSpelFacade().getDobbelsteen(2) , 2);
				boardcontroller.maakDobbelsteenNietRolbaar(2);
				maakGewoneDobbelsteenOnzichtbaar(boardcontroller, 2);
				updateGekozenDobbelsteen(boardcontroller, 2);
			}
		});
		dobbelstenenPanel.add(dobbelsteen3);

		
		dobbelsteen4 = new JButton(Integer.toString(boardcontroller.getYathzeeSpelFacade().getDobbelsteenWaarde(3)));
		dobbelsteenbuttonlijst.add(dobbelsteen4);
		dobbelsteen4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boardcontroller.voegDobbelSteenToenAanGekozen(boardcontroller.getYathzeeSpelFacade().getDobbelsteen(3) , 3);
				boardcontroller.maakDobbelsteenNietRolbaar(3);
				maakGewoneDobbelsteenOnzichtbaar(boardcontroller, 3);
				updateGekozenDobbelsteen(boardcontroller, 3);
			}
		});
		dobbelstenenPanel.add(dobbelsteen4);

		
		dobbelsteen5 = new JButton(Integer.toString(boardcontroller.getYathzeeSpelFacade().getDobbelsteenWaarde(4)));
		dobbelsteenbuttonlijst.add(dobbelsteen5);
		dobbelsteen5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boardcontroller.voegDobbelSteenToenAanGekozen(boardcontroller.getYathzeeSpelFacade().getDobbelsteen(4) , 4);
				boardcontroller.maakDobbelsteenNietRolbaar(4);
				maakGewoneDobbelsteenOnzichtbaar(boardcontroller, 4);
				updateGekozenDobbelsteen(boardcontroller, 4);
			}
		});
		dobbelstenenPanel.add(dobbelsteen5);
		
		
		gooiDobbelstenenButton = new JButton("Gooi dobbelstenen");
		gooiDobbelstenenButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setDobbelstenenSpeelbaar(boardcontroller);
				setDobbelstenenClickable(boardcontroller);
				boardcontroller.rollDobbelstenen();
			}
		});
		dobbelstenenPanel.add(gooiDobbelstenenButton);
		boardPanel.add(dobbelstenenPanel,BorderLayout.LINE_START);
		this.setDobbelstenenNietSpeelbaar(boardcontroller);
		this.setDobbelstenenNotClickable(boardcontroller);
		
		//dobbelstenen die gekozen zijn
		gekozendobbelsteen1 = new JButton();
		gekozendobbelsteenbuttonlijst.add(gekozendobbelsteen1);
		gekozendobbelstenenPanel.add(gekozendobbelsteen1);
		gekozendobbelsteen1.setVisible(false);
		
		gekozendobbelsteen2 = new JButton();
		gekozendobbelsteenbuttonlijst.add(gekozendobbelsteen2);
		gekozendobbelstenenPanel.add(gekozendobbelsteen2);
		gekozendobbelsteen2.setVisible(false);

		gekozendobbelsteen3 = new JButton();
		gekozendobbelsteenbuttonlijst.add(gekozendobbelsteen3);
		gekozendobbelstenenPanel.add(gekozendobbelsteen3);
		gekozendobbelsteen3.setVisible(false);

		gekozendobbelsteen4 = new JButton();
		gekozendobbelsteenbuttonlijst.add(gekozendobbelsteen4);
		gekozendobbelstenenPanel.add(gekozendobbelsteen4);
		gekozendobbelsteen4.setVisible(false);

		gekozendobbelsteen5 = new JButton();
		gekozendobbelsteenbuttonlijst.add(gekozendobbelsteen5);
		gekozendobbelstenenPanel.add(gekozendobbelsteen5);
		gekozendobbelsteen5.setVisible(false);
		
		boardPanel.add(gekozendobbelstenenPanel,BorderLayout.CENTER);
		
		
		
		this.categorieNamen = new JComboBox<String>();
		this.categorieEnScorenPanel.add(categorieNamen);
		this.categorieNamen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String gekozenCategorie = (String)BoardView.this.categorieNamen.getSelectedItem();
				boardcontroller.beurtEindigen(gekozenCategorie);
			}
		});
		boardPanel.add(categorieEnScorenPanel, BorderLayout.LINE_END);
		//voor de eerste ronde start moet de catgeorielijst al de eerste keer gegenereerd worden
		genereerCategorieMenu(boardcontroller);
		
		this.setSize(1280, 720);
		this.start();
	}


	
	public void start() {
		setVisible(true); 
	}
	public void stop(){
		setVisible(false);
	}

	public void updateDobbelstenen(BoardController boardController) {
		for (int i = 0 ; i < 5; ++i){
			if(boardController.getYathzeeSpelFacade().dobbelsteenMagGeworpenWorden(i) == true){
				this.dobbelsteenbuttonlijst.get(i).setText((Integer.toString(boardController.getYathzeeSpelFacade().getDobbelsteenWaarde(i))));
			}
		}
	}
	
	//gewone dobbelsteen onzichtbaar maken indien geklikt
	public void maakGewoneDobbelsteenOnzichtbaar(BoardController boardcontroller,int dobbelsteennummer){
		if(boardcontroller.getYathzeeSpelFacade().dobbelsteenMagGeworpenWorden(dobbelsteennummer) == false){
			this.dobbelsteenbuttonlijst.get(dobbelsteennummer).setVisible(false);
		}
	}
	
	//gekozen dobbelsteen zichtbaar maken
	public void updateGekozenDobbelsteen(BoardController boardController, int dobbelsteennummer) {
			if(boardController.getYathzeeSpelFacade().dobbelsteenMagGeworpenWorden(dobbelsteennummer) == false){
				this.gekozendobbelsteenbuttonlijst.get(dobbelsteennummer).setText((Integer.toString(boardController.getYathzeeSpelFacade().getGekozenDobbelsteenWaarde(dobbelsteennummer))));
				this.gekozendobbelsteenbuttonlijst.get(dobbelsteennummer).setVisible(true);
			}
		
	}
	
	//twee functies om alle dobbelstenen speelbaar te maken nadat het spel begonnen is en dus alle dobbelsteen "knoppen" actief te maken
	
	public void setDobbelstenenSpeelbaar(BoardController boardController){
		boardController.getYathzeeSpelFacade().alleDobbelstenenMogenGeworpenWorden();;
	}
	
	public void setDobbelstenenClickable(BoardController boardController){
		for (int i = 0 ; i < 5; ++i){
			if(boardController.getYathzeeSpelFacade().dobbelsteenMagGeworpenWorden(i) == true){
				this.dobbelsteenbuttonlijst.get(i).setEnabled(true);
			}
		}
	}

	//twee functies om alle dobbelstenen onspeelbaar te maken voor het spel start en dus alle dobbelsteen "knoppen" inactief te maken
	
	public void setDobbelstenenNietSpeelbaar(BoardController boardController){
		boardController.getYathzeeSpelFacade().alleDobbelstenenMogenNietGeworpenWorden();;
	}
	
	public void setDobbelstenenNotClickable(BoardController boardController){
		for (int i = 0 ; i < 5; ++i){
			if(boardController.getYathzeeSpelFacade().dobbelsteenMagGeworpenWorden(i) == false){
				this.dobbelsteenbuttonlijst.get(i).setEnabled(false);
			}
		}
	}
	
	//functies voor het dropdownmenu
	public void genereerCategorieMenu(BoardController boardcontroller)
	  {
		//eerst alle categorien verwijderen, daarna zetten we alle overgebleven categorien terug in de lijst
	    this.categorieNamen.removeAllItems();
	    
	    for (int i = 0; i < boardcontroller.getYathzeeSpelFacade().getObservers().size(); i++) {
	    //eerst checken we of deze categorie nog niet is ingevuld, indien dit wel zo is, word deze niet meer getoont in het dropdownmenu
	      if ( boardcontroller.getYathzeeSpelFacade().getObservers().get(i).returnIsIngevuld() == false) {
	        this.categorieNamen.addItem(((Observer)boardcontroller.getYathzeeSpelFacade().getObservers().get(i)).getCategorieNaam());
	      }
	    }
	  }
}
