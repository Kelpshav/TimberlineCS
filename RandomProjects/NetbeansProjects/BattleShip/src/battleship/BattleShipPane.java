/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JPanel;

/**
 *
 * @author timberlinepluska
 */
public class BattleShipPane extends JPanel {
    private int a;
    private BattleShipGrid bsg = new BattleShipGrid();
    private BattleShipGrid2 bsg2 = new BattleShipGrid2();
    private Key key = new Key();
    
    public BattleShipPane(){
        
            setLayout(new BorderLayout());
    	    setPreferredSize(new Dimension(800, 500));
            add(bsg,BorderLayout.EAST);
            add(bsg2, BorderLayout.WEST);
            add(key, BorderLayout.SOUTH);
            
    }
}
