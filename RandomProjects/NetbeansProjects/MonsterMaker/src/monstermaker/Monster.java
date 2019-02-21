package monstermaker;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Monster extends JPanel{
    private final int DELAY = 200; //milliseconds
    Graphics2D g;
    int numEyes = 0;
    boolean setEyes, setHorns, setMouth, setTeeth, setArms, setCaption;
    String name, caption;
    private int x, y;
    
    /*
    Creates a monster 
    */
    public Monster(String n, int xCoordinate, int yCoordinate){
        name = n;
        x = xCoordinate;
        y = yCoordinate;
        startAnimation();
        
    }
    
    public void paint(Graphics g0) {

        g = (Graphics2D) g0;
        g.setColor(Color.GRAY);
        g.fillRect(0,0, getWidth(), getHeight());

        if(name!=null){
        g.setColor(Color.ORANGE);
        g.setFont(new Font("Helvetica", Font.BOLD, 24));
        g.drawString("Welcome To the Moster Race", getWidth()/2-100, 50);
        }
        g.setColor(Color.green);

        g.fillOval(x, y, 200, 300);

        //eyes
        if(numEyes!=0 && setEyes){

            for(int i = 0; i < numEyes; i++){
            int h = (int)(Math.random()*110+210);
            int v = (int)(Math.random()*140+145);
            g.setStroke(new BasicStroke(10));
            g.setColor(Color.black);
            g.drawOval(h,v,25,10);
            g.setColor(Color.white);

            g.drawOval(h+12, v+5, 5, 5);
            }
        }
        
        if(setHorns){
            g.setColor(Color.black);
            int x1[]={235, 235, 245};
            int y1[]={105, 80, 90};
            g.drawPolygon( x1, y1, 3);
            
            int x2[]={315, 305,315};
            int y2[]={80, 90,105};
            g.drawPolygon( x2, y2, 3);
        }
        if(setMouth){

            g.setColor(Color.black);
            g.fillOval(250, 310, 50, offSet +=10);
                if(offSet> 60)
                    offSet = 40;
            g.setColor(Color.red);
            g.fillOval(253, 340, 44, 14); 
   
        }
        if(setTeeth){
            g.setColor(Color.yellow);
            g.fillRect(270, 310, 10, 12);
            g.setStroke(new BasicStroke(1));
            g.setColor(Color.black);
            g.drawLine(275,310,275,322);
        }
        
        if(setArms){
            g.setStroke(new BasicStroke(10));
            g.drawLine(380, 250, 405, 250);
            g.drawLine(405, 250, 405+(int)(Math.sin(Math.toRadians(offSetAngle+=5))*50), 250+(int)(Math.cos(Math.toRadians(offSetAngle+=5))*50));
            g.drawLine(170, 250, 120, 250);
            g.drawLine(120, 250, 120+(int)(Math.sin(Math.toRadians(offSetAngle2-=5))*50), 250+(int)(Math.cos(Math.toRadians(offSetAngle2-=5))*50));
        }
        if(setCaption){
            g.fillOval(450, 100, 200, 100);
            int x1[]={440, 455, 450};
            int y1[]={150, 155, 150};
            g.drawPolygon( x1, y1, 3);
            g.setColor(Color.white);
            g.setStroke(new BasicStroke(1));
            g.drawString(caption,490,150);
            
        }
        
    }
    int offSet = 40;
    int offSetAngle = 0;
    int offSetAngle2 = 0;
    /*
    Checks if the moster has eyes, and if it does draws two eyes
    */
    public void setEyes(){
        
        setEyes = true;
    }
    public void setHorns(){
        
        setHorns = true;
    }
    public void setMouth(){
        setMouth = true;
    }
    
    public void setTeeth(){
        setTeeth = true;
  
    }
    
    public void setArms(){
        
        setArms = true;
    }
    
    public void setCaption(String msg){
        setCaption = true;
        caption = msg;
    }
    /*
    Sets a new name for the monster
    */
    public void setName(String n){
        name = n;

    }
    	private void startAnimation()
	{
		ActionListener timerListener = new TimerListener();
		Timer timer = new Timer(DELAY, timerListener);
		timer.start();
	}

	/**
	 * Repaints the graphics panel every time the timer fires.
	 * DO NOT MODIFY this class!
	 */
	private class TimerListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e) {
			repaint();
		}
	}

}