/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crossword;
import java.awt.*;
import java.awt.event.*;
import javax.swing.BorderFactory; 
import javax.swing.border.Border;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author timberlinepluska
 */
public class CrossWordGrid extends JPanel implements ActionListener{
    
    private int numSquares;
    private JTextField[][] squares;
   
    
    public CrossWordGrid(int s){
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(1, 1, 1, 1);
            gbc.weightx = 1;
            gbc.weighty = 1;
        gbc.fill = GridBagConstraints.BOTH;
        
        numSquares = s;
        squares = new JTextField[numSquares][numSquares];
        for (int i=0; i<squares.length; i++){
            for (int j=0; j<squares[i].length; j++) {
         	squares[i][j] = new JTextField(); 
                
                squares[i][j].setPreferredSize(new Dimension(20,20));
         	squares[i][j].addActionListener(this);
                //squares[i][j].addMouseListener(new rightClickListener());
         	add(squares[i][j]);
            }
        }

        
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
