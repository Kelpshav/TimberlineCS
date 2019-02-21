/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author timberlinepluska
 */
public class BattleShipGrid2 extends JPanel implements ActionListener {
    private JButton[][] tiles;
    private int gridDimensions = 12;
    public BattleShipGrid2(){
        
        gridDimensions = 12;
        tiles = new JButton[gridDimensions][gridDimensions];
        //shipGrid = new boolean[gridDimensions][gridDimensions];
        
        setLayout(new GridLayout(gridDimensions, gridDimensions));
    	setPreferredSize(new Dimension(400, 400));
        
        for (int i=0; i<tiles.length; i++){
            for (int j=0; j<tiles[i].length; j++) {
         	tiles[i][j] = new JButton();       
         	//tiles[i][j].addActionListener(this);
         	add(tiles[i][j]);
            }
        }
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
