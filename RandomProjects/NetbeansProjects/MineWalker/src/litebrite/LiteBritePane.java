/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package litebrite;

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
public class LiteBritePane extends JPanel {
    private int a;
    private LiteBriteGrid lbg = new LiteBriteGrid(20);
    private LiteBriteControls lbc = new LiteBriteControls(new colorListener());
    
    /**
     *
     */
    public LiteBritePane(){
        
            setLayout(new BorderLayout());
    	    setPreferredSize(new Dimension(800, 800));
            add(lbg,BorderLayout.CENTER);
            add(lbc, BorderLayout.WEST);
            
    }

    private class colorListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			a = lbc.getButtonAction((JButton) e.getSource());
                        lbg.doButtonAction(a);
		}
    }
    
}


