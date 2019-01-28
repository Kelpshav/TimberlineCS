/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Pluska
 */
public class LiteBriteControls extends JPanel {
    
    private JButton colorClicked;
    private Color pegColor;
    
    /* TODO:  
        Add at least three more colors.  
        For each color, create a new button. 
        For each button you add, you will need to change the GridLayout 
        dimensions to fit the required buttons
        For each button you add, you will need to modify the getPegColor 
        method
    */
    
    public LiteBriteControls(ActionListener a){
    
        setLayout(new GridLayout(6,1));
    	setPreferredSize(new Dimension(100, 800));
        JButton redButton = new JButton();
        redButton.setText("RED");
        redButton.addActionListener(a);
        add(redButton);
        JButton greenButton = new JButton();
        greenButton.setText("GREEN");
        greenButton.addActionListener(a);
        add(greenButton);
        JButton blueButton = new JButton();
        blueButton.setText("BLUE");
        blueButton.addActionListener(a);
        add(blueButton);
        JButton yellowButton = new JButton();
        yellowButton.setText("YELLOW");
        yellowButton.addActionListener(a);
        add(yellowButton);
        JButton pinkButton = new JButton();
        pinkButton.setText("PINK");
        pinkButton.addActionListener(a);
        add(pinkButton);
        JButton eraseButton = new JButton();
        eraseButton.setText("ERASE");
        eraseButton.addActionListener(a);
        add(eraseButton);
    }
    
    public Color getPegColor(JButton s){
        
        if(s.getText().equals("RED")){
            pegColor = Color.RED;
            System.out.println(pegColor);
        }else if(s.getText().equals("GREEN")){
            pegColor = Color.GREEN;
        }else if(s.getText().equals("BLUE")){
            pegColor = Color.BLUE;
        }else if(s.getText().equals("YELLOW")){
            pegColor = Color.YELLOW;
        }else if(s.getText().equals("PINK")){
            pegColor = Color.PINK;
        }else{
            pegColor = null;
        }
        return pegColor;
    }
}
