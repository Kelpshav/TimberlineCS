/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crossword;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author timberlinepluska
 */
public class CrossWordPane extends JPanel {
    private int sizeOfGrid, numGridSquares;
    
    //private LiteBriteControls lbc = new LiteBriteControls(new colorListener());
    
    public CrossWordPane(int s){
            sizeOfGrid = s;
            numGridSquares = sizeOfGrid/20;
            CrossWordGrid cwg = new CrossWordGrid(numGridSquares);
            setLayout(new BorderLayout());
    	    setPreferredSize(new Dimension(sizeOfGrid, sizeOfGrid));
            add(cwg,BorderLayout.CENTER);
            //add(lbc, BorderLayout.WEST);
            
    }
    /*
    private class colorListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			a = lbc.getButtonAction((JButton) e.getSource());
                        lbg.doButtonAction(a);
		}
    }
    */
    
}
