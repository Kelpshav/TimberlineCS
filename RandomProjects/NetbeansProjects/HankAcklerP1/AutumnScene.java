//package AutumnScene;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 * Project 1: Autumn Scene
 *
 * Animates a series of abstract shapes and patterns.
 *
 * @author Pluska
 * @author Hank Ackler
 */
@SuppressWarnings("serial")
public class AutumnScene extends JPanel
{
	// This is where you declare constants and variables that need to keep their
	// values between calls	to paintComponent(). Any other variables should be
	// declared locally, in the method where they are used.
    
	private final int DELAY = 300; //milliseconds
        
        private int clock=0;//A simple clock variable to track cycles
        
	/**
	 * The anchor coordinate for drawing / animating. All of your drawings
	 * coordinates should be relative to this offset value.
         * a yOffset can be added for vertical movement
	 */
	private int xOffset = 0;
        private int yOffset = 0;
        
        private double y = 500;//value to assist with vertical movement

	/**
	 * The number of pixels added to xOffset each time paintComponent() is called.
         * Increase or decrease to change the speed
         * You can add additional stepSize variables for objects to move at different speeds
	 */
	private int stepSize = 1; 
	/**
	 * The background color
	 */
        
	private final Color BACKGROUND_COLOR = Color.white;
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
        
        boolean stop=false;//A boolean to limit the amount of times the program repeats.
        
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
                //assigns graphics object to g
		g = (Graphics2D) g0;
                
                width = getWidth();// panel width
                height = getHeight();//panel height
                
                //calls the offset method which moves the object
                //across the screen left to right...
                //How might you modify this method
                //to get things to move vertically?  backwards? diagonol?
                offsets();

                //calls the background method you
                //TODO: Go to this method and change the background
		background();
                
                //TODO: Modify the myScene method to make your scene.  
                //You scene must include that scalable objects at 
                //different positions on the screen
                if(stop){
                     
                }else{
                    myScene();
                }

                //Makes the animation smoother.  Do not modify.
		Toolkit.getDefaultToolkit().sync();
	}
         
        public void myScene(){
               
                //The following code creates a y value equal to -|x|
                if(xOffset<=500){
                            y=y-1;
                            System.out.println(y);
                        }else{
                            y=y+1;
                        }
                         
                //The following code will make the impromtu "background"
                Color backg=new Color((int)(Math.random()*125),(int)(Math.random()*125),(int)(Math.random()*125));
                g.setColor(backg);
                g.fillRect(0, 0, width, height);
                
                //The following code assigns and applies the new "rainbow" color
                //Color rainbow=new Color(r,gr,b);
                //g.setColor(rainbow);
                boolean sect1=true;
                boolean sect2=false;
                boolean sect3=false;
                
                //Initializes the color variables
                int r;
                int gr;
                int b;
                
                while (sect1==true){
                  for(int i=0; i<500; i++){
                      for (int ii=0; ii<21; ii++){

                          //The following code creates random values for RGB    
                          r=(int) ((Math.random() * 255)+ 1);
                          gr=(int) ((Math.random() * 255)+ 1);
                          b=(int) ((Math.random() * 255)+ 1);

                          //The following code assigns and applies the new "rainbow" color
                          Color rainbow=new Color(r,gr,b);
                          g.setColor(rainbow);

                          //The following code will create the random shapes and so forth
                          g.fillRect(xOffset-(ii*50),(int)(Math.random()*500),r,b);
                          g.fillOval(xOffset+(ii*50),(int)(Math.random()*500),r,b);


                      }
                   }
                  sect1=false;
                  System.out.print("yeet");
                } 
                System.out.println(sect1);
                
                g.drawString("LET'S PARTY",width/2-50,50);//Adds a "title"

                
        }
        
         /**
	 * Fill the graphics page with the background color.
	 */
        public void background(){
                g.setColor(BACKGROUND_COLOR);
		g.fillRect(0, 0, width, height);
            
        }
        
         /**
	 * Calculate the Offset positions of the moving object.
         * TODO: Create a yOffset to animate objects moving vertically
	 */
      
        public void offsets(){
            
            if(clock<1000){
                xOffset=clock;
            }else{
                clock=0;
            }
            yOffset = (yOffset+ stepSize)%height;
        }
        
        public void arcs(){
            System.out.println(xOffset);
        }

        


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
		JFrame frame = new JFrame ("Autumn Scene");
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new AutumnScene());
		frame.pack();
		frame.setVisible(true);
	}

	/**
	 * Constructor for the display panel initializes necessary variables.
	 * Only called once, when the program first begins. This method also
	 * sets up a Timer that will call paint() with frequency specified by
	 * the DELAY constant.
	 */
	public AutumnScene()
	{

		// Do not initialize larger than 800x600. I won't be able to
		// grade your project if you do.
		int initWidth = 1000;
		int initHeight = 500;
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
                        
                        clock++;//increments the clock
		}
	}
}
