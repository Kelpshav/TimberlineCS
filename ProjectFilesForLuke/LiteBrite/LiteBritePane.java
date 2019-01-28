

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * Adds the LiteBrite grid and Control Panel to the LiteBrite frame
 * @author timberlinepluska
 */
public class LiteBritePane extends JPanel {
    	private Color c;
	private int gridsize;
    	private LiteBriteGrid lbg;
    	private LiteBriteControls lbc = new LiteBriteControls(new colorListener());
    
    	public LiteBritePane(int gridsize){
            lbg = new LiteBriteGrid(50);
            setLayout(new BorderLayout());
    	    setPreferredSize(new Dimension(800, 800));
            add(lbg,BorderLayout.CENTER);
            add(lbc, BorderLayout.WEST);
    	}

   	 private class colorListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			c = lbc.getPegColor((JButton) e.getSource());
                        lbg.setButtonColor(c);
		}
    	}
    
    
    
}


