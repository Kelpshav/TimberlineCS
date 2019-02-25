/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardcounterwithgui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Pluska
 */
public class CardPane extends JPanel implements ActionListener {
    private int dealSize;
    private JButton clicked;
    private Card clickedCard;
    private JButton[] cardButtons;
    private Card cardArray[];
    private String pathToCardImages="C:\\Users\\HP Sprout\\Desktop\\TimberlineCS\\APCSALabs\\NetbeansProjects\\CardCounterWithGUI\\src\\images\\";
    ImageIcon cardImageIcon;
    int sum;

    /**
     *
     * @param d
     */
    public CardPane(){
        
        dealSize = 10;
        CardCounter myDeal = new CardCounter(dealSize);
        cardArray = myDeal.getDealtCards();
        sum = myDeal.sumDeal();
	int valuesArray[] = myDeal.countValues();
        String cardValues[] = myDeal.getCardValues();
        int suiteValuesArray[] = myDeal.countSuites();
        char suiteValues[] = myDeal.getSuiteValues();
        
        for(int i = 0; i < valuesArray.length;i++){
            System.out.println(cardValues[i]);
            System.out.println(valuesArray[i]);
            System.out.println();
        }
	for(int i = 0; i < suiteValues.length;i++){
            System.out.println(suiteValues[i]);
            System.out.println(suiteValuesArray[i]);
            System.out.println();
        }	
		
	//DO NOT EDIT
        showCards(cardArray);
    }
	
	//DO NOT EDIT ANYTHING BELOW 
    
    /**
     * Displays the dealt cards as buttons
     * @param cardArray the dealt cards
     */
    public void showCards(Card[] cardArray){

        cardButtons = new JButton[dealSize];
        setLayout(new FlowLayout());
        setPreferredSize(new Dimension(500,400));
        
        for(int c = 0; c < cardArray.length;c++){
            String cardImage = "card"+cardArray[c].getSuite()+cardArray[c].getFaceValue()+".png";
            String cardPath = pathToCardImages+cardImage;
            cardImageIcon = new ImageIcon(cardPath);
            cardButtons[c] = new JButton(cardImageIcon);
            cardButtons[c].setBackground(Color.black);
            cardButtons[c].setPreferredSize(new Dimension(50,68));
            cardButtons[c].addActionListener(this);
            add(cardButtons[c]); 
        }
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        clicked = (JButton) e.getSource();
        locateClicked(clicked);
        
        
    }
    /**
     * Locates the button clicked and corresponding card
     * @param b is the card button clicked
     */    
    public void locateClicked(JButton b){
        /*Implementation not shown*/
    }
    
}
