package codeexample;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 * Project 1: Greeting Card
 *
 * Animates a [put your description here]
 *
 * @author Pluska
 * @author [put your name here]
 */
@SuppressWarnings("serial")
public class GreetingCard extends JPanel
{
	// This is where you declare constants and variables that need to keep their
	// values between calls	to paintComponent(). Any other variables should be
	// declared locally, in the method where they are used.

	/**
	 * A constant to regulate the frequency of Timer events.
	 * Note: 100ms is 10 frames per second - you should not need
	 * a faster refresh rate than this
	 */
	private final int DELAY = 10; //milliseconds

	/**
	 * The anchor coordinate for drawing / animating. All of your drawings
	 * coordinates should be relative to this offset value.
         * a yOffset can be added for vertical movement
	 */
	private int xOffset = 0, xOffsetStar = 0;
      

	/**
	 * The number of pixels added to xOffset each time paintComponent() is called.
         * Increase or decrease to change the speed
	 */
	private int stepSize = 5;
        private int stepSizeStar = 1;
	/**
	 * The background color
	 */

	private final Color BACKGROUND_COLOR = Color.black;
        /**
	 * initialize width
	 */
        private int width;

         /**
	 * initialize height
	 */
	private int height; 
        
         /**
	 * initialize g as type Graphics2D.  
         * Necessary for using setStroke()
	 */
        Graphics2D g;
        
        /**
	 * Draws (and refreshes) the scene at each animation step.
	 * 
	 * @param g0 Graphics context
	 */
	/* (non-Javadoc)
	 * @see javax.swing.JComponent#paintComponent(java.awt.Graphics)
	 */
        @Override
	public void paintComponent(Graphics g0)
	{    
            //call your methods
                //assigns graphics object to g
		g = (Graphics2D) g0;
                
                width = getWidth();// panel width
                height = getHeight();//panel height
                offset();
                offsetStar();
  

                //calls the background method
		background();
                //calls the square method
                square();
                //calls the circle method
                circle();
                //calls the star method
                triangle(10, 10);
                triangle(100, 15);
                star();
                //calls the text method
                text();
                line(300, 250);//x end, y end
                line(0, 500);
                // TODO: Use width, height, and xOffset to create additional methdos
                // that draw scalable objects at different positions on the screen
                //Makes the animation smoother.  Do not modify.
		Toolkit.getDefaultToolkit().sync();
	}
         /**
	 * Draws a green square that moves left to right across the screen
         * Replace with your own object
	 */
        int cWidth = 0, cHeight = 0;
        boolean grow = true;
        
        public void circle(){
            
            if(grow){
                cWidth++;
                cHeight++;

                if(cWidth==100){
                    grow = false;
                }
            }
                
            if(!grow){
                cWidth--;
                cHeight--;
                if(cWidth==0){
                    grow = true;
                }
                    
            }
             //x coord, y coord, sizeW, sizeH
        g.fillOval(width/2, height/2, cWidth, cHeight);
        g.fillOval(width/2 -25, height/2-25, cWidth, cHeight);
        g.fillOval(width/2 -50, height/2, cWidth, cHeight);
             
        }
        public void star(){
            r1 = (int) (Math.random()*250+1);
            g1 = (int) (Math.random()*250+1);
            b1 = (int) (Math.random()*250+1);
          
            g.setColor(new Color(r1,g1,b1));
            
            //int[] x = {100, 125, 175, 125};
            //int[] y = {100, 150, 150, 175};
            
            int [ ] x = {xOffsetStar, xOffsetStar+25, xOffsetStar+75, xOffsetStar + 25, xOffsetStar + 50, xOffsetStar, xOffsetStar-50, xOffsetStar-25, xOffsetStar-75, xOffsetStar-25};
            int [ ] y = {xOffsetStar, xOffsetStar + 50, xOffsetStar +50, xOffsetStar +75, xOffsetStar +125, xOffsetStar +90, xOffsetStar +125, xOffsetStar +75, xOffsetStar +50, xOffsetStar +50 };
            g.fillPolygon(x, y, 4);//xpositions, ypositions, number of points
        }
        
        public void triangle(int starOffsetx, int starOffsety){
            
            r1 = (int) (Math.random()*255+1);
            g1 = (int) (Math.random()*250+1);
            b1 = (int) (Math.random()*250+1);
            
            g.setColor(new Color(r1,g1,b1));
            int [] x = {100+starOffsetx, 125+starOffsetx, 175+starOffsetx, 125+starOffsetx};
            int [] y = {100+starOffsety, 150+starOffsety, 150+starOffsety, 175+starOffsety};
            
 
            
            g.fillPolygon(x, y, 4);//xpositions, ypositions, number of points
            //g.fillPolygon(x, y, 3);
 
        }

        int r1=0, g1=0, b1=0;
       
        
        public void square(){
                int squareSide = height/5;
		int squareY = height/2 - squareSide/2;
		g.setColor(Color.MAGENTA);
		g.fillRect(squareY, xOffset, squareSide, squareSide);
            
        }
        
        public void line(int sx, int sy){
           
            g.setStroke(new BasicStroke(10));

            g.drawLine(width/2, height/2, sx, sy);
   
        }
        
        
        public void text(){
            g.setColor(Color.green);
            g.drawString("HO HO HO", 100, xOffset);
            
        }
        
         /**
	 * Fill the graphics page with the background color.
	 */
        public void background(){
                g.setColor(BACKGROUND_COLOR);
		g.fillRect(0, 0, width, height);
            
        }
        
         /**
	 * Calculate the new xOffset position of the moving object.
	 */
        public void offset(){
            xOffset  = (xOffset + stepSize) % width;
            System.out.println(xOffset);
        }
        
       public void offsetStar(){
           xOffsetStar  = (xOffsetStar + stepSizeStar) % width;
       }
       
        
        //TODO:  Create additional methods
        


	//==============================================================
	// You don't need to modify anything beyond this point.
	//==============================================================


	/**
	 * Starting point for this program. Your code will not go in the
	 * main method for this program. It will go in the paintComponent
	 * method above.
	 *
	 * DO NOT MODIFY this method!
	 *
	 * @param args unused
	 */
	public static void main (String[] args)
	{
		// DO NOT MODIFY THIS CODE.
		JFrame frame = new JFrame ("Greeting Card");
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new GreetingCard());
		frame.pack();
		frame.setVisible(true);
	}

	/**
	 * Constructor for the display panel initializes necessary variables.
	 * Only called once, when the program first begins. This method also
	 * sets up a Timer that will call paint() with frequency specified by
	 * the DELAY constant.
	 */
	public GreetingCard()
	{

		// Do not initialize larger than 800x600. I won't be able to
		// grade your project if you do.
		int initWidth = 800;
		int initHeight = 600;
		setPreferredSize(new Dimension(initWidth, initHeight));
		this.setDoubleBuffered(true);

		//Start the animation - DO NOT REMOVE
		startAnimation();
	}

	/**
	 * Create an animation thread that runs periodically.
	 * DO NOT MODIFY this method!
	 */
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
