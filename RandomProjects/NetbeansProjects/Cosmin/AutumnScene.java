package autumnscene;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

import java.awt.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import javax.swing.JOptionPane;

import sun.audio.AudioPlayer; //audio imports here
import sun.audio.AudioStream;


/**
 * Project 1: Autumn Scene
 *
 * Animates a Haunted House and ghosts flying around
 *
 * @author Pluska
 * @author Cosmin C. Fologea
 */
@SuppressWarnings("serial")
public class AutumnScene extends JPanel
{
	// This is where you declare constants and variables that need to keep their
	// values between calls	to paintComponent(). Any other variables should be
	// declared locally, in the method where they are used.
    

	/**
	 * A constant to regulate the frequency of Timer events.
	 * Note: 100ms is 10 frames per second - you should not need
	 * a faster refresh rate than this
	 */
	private final int DELAY = 100; //milliseconds

	/**
	 * The anchor coordinate for drawing / animating. All of your drawings
	 * coordinates should be relative to this offset value.
         * a yOffset can be added for vertical movement
	 */
	private int xOffset = 0;
        private int yOffset = 0;
        

	/**
	 * The number of pixels added to xOffset each time paintComponent() is called.
         * Increase or decrease to change the speed
         * You can add additional stepSize variables for objects to move at different speeds
	 */
	private final int stepSize = 5;
       
	/**
	 * The background color
	 */
       
        
	private final Color BACKGROUND_COLOR = Color.black;
        
         //I initialized custom colors here
        
        public static final Color BROWN = new Color(102, 51, 0);
        
        public static final Color DARK_GREEN = new Color(0, 102, 0);
        
        public static final Color DARK_GRAY = new Color(100,100,100);
        
        public static final Color YELLOW = new Color(255,255,0);
        
        public static final Color DARKER_GRAY = new Color(50,50,50);
        
        public static final Color DARKER_YELLOW = new Color(130,120,0);
        
        public static final Color ORANGE = new Color (209, 89, 1);
        
        public static final Color PURPLE = new Color (148, 0, 211);
        
        public static final Color LIGHT_GREEN = new Color (133, 226, 31);
        
        public static final Color BLACK = new Color (0, 0, 0);
        
        public static final Color WHITE = new Color (255, 255, 255);
       

        
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
        
        //Initialize color - not working for now
       
       
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
                myScene();

                //Makes the animation smoother.  Do not modify.
		Toolkit.getDefaultToolkit().sync();
                
                //Calls the music function - MAKE SURE TO CHANGE TO MUSIC LOCATION
                playMusic("/home/cosmin/NetBeansProjects/YellowBox/src/autumnscene/halloween.wav"); //this actually plays the wav file
	}
         
        //draws the actual scene on the page
        
        public void myScene(){
            
            //haunted house
            
                g.setColor(PURPLE);
                g.fillRect(180, 195, 250, 200);
                
                
                //roof for haunted house
                g.setColor(DARKER_GRAY);
                g.fillPolygon(new int[] {100, 300, 500}, new int[] {200, 20, 200}, 3);
                
                //roof trim
                g.setColor(ORANGE);
                g.fillRect(110, 190, 377, 7);
                
                //Chimney and such
                g.setColor(LIGHT_GREEN);
                g.fillRect(200, 40, 40, 80);
                g.fillRect(375, 80, 40, 80);
                g.fillOval(278, 100, 50, 50);
                
                //Chimney roofs
                g.setColor(PURPLE);
                g.fillPolygon(new int[] {180, 220, 260}, new int[] {40, 10, 40}, 3);
                g.fillPolygon(new int[] {345, 395, 445}, new int[] {80, 35, 80}, 3);
                
                //window panes
                g.setColor(ORANGE);
                g.fillRect(217,40,5,80);
                g.fillRect(200, 80, 40, 5);
                
                g.fillRect(393, 80, 5, 80);
                g.fillRect(375, 120, 40, 5);
                
                //window pane for circular window
                g.fillRect(279, 123, 49, 5);
                g.fillRect(301, 101, 5, 49);
                
                //other windows (orange) bottom ones
                g.setColor(ORANGE);
                g.fillRect(200, 250, 60, 60);
                g.fillRect(345, 250, 60, 60);
                
                g.setColor(YELLOW);
                g.fillRect(227, 250, 5, 60);
                g.fillRect(372, 250, 5, 60);
                g.fillRect(200, 280, 60, 5);
                g.fillRect(345, 280, 60, 5);
                
                //the door
                g.setColor(DARK_GRAY);
                g.fillRect(287, 324, 35, 70);
                g.setColor(BLACK);
                g.fillRect(293, 330, 25, 60);
                
                //door handle
                g.setColor(ORANGE);
                g.fillOval(315, 360, 5, 5);
               
                //draw gravestones
                g.setColor(DARK_GRAY);
                g.fillOval(100, 310, 50, 50);
                g.fillRect(100, 330, 50, 60);
                
                g.fillOval(450, 310, 50, 50);
                g.fillRect(450, 330, 50, 60);
                
                //init text for RIP
                g.setFont(new Font("TimesRoman", Font.BOLD, 16)); 
                g.setColor(WHITE);
                g.drawString("R.I.P.", 103, 350);
                g.drawString("R.I.P.", 455, 350);
                
                //init text for Happy Halloween!
                g.setColor(LIGHT_GREEN);
                g.drawString("HAPPY HALLOWEEN!", 210, 230);
                
                //draw ghost 1
                g.setColor(WHITE);
                g.fillOval(50 + xOffset, 10 + yOffset, 50, 50);
                g.fillRect(50 + xOffset, 30 + yOffset, 50, 60);
                g.setColor(WHITE);
                g.fillOval(48 + xOffset, 82 + yOffset, 15, 15);
                g.fillOval(60 + xOffset, 82 + yOffset, 15, 15);
                g.fillOval(73 + xOffset, 82 + yOffset, 15, 15);
                g.fillOval(86 + xOffset, 82 + yOffset, 15, 15);
                
               //eyes and mouth for ghost 1
               g.setColor(BLACK);
               g.fillOval(56 + xOffset, 20 + yOffset, 15, 15);
               g.fillOval(78 + xOffset, 20 + yOffset, 15, 15);
               g.fillOval(70 + xOffset, 40 + yOffset, 10, 10);
                
                //draw ghost 2
                g.setColor(WHITE);
                g.fillOval(550 - xOffset, 10 + yOffset, 50, 50);
                g.fillRect(550 - xOffset, 30 + yOffset, 50, 60);
                g.setColor(WHITE);
                g.fillOval(548 - xOffset, 82 + yOffset, 15, 15);
                g.fillOval(560 - xOffset, 82 + yOffset, 15, 15);
                g.fillOval(573 - xOffset, 82 + yOffset, 15, 15);
                g.fillOval(586 - xOffset, 82 + yOffset, 15, 15);
                
               //eyes and mouth for ghost 2
               g.setColor(BLACK);
               g.fillOval(556 - xOffset, 20 + yOffset, 15, 15);
               g.fillOval(578 - xOffset, 20 + yOffset, 15, 15);
               g.fillOval(570 - xOffset, 40 + yOffset, 10, 10);
                         
        }
        
        //music declarations
        
        public static void playMusic(String filepath) {
            InputStream music;
            try {
                music = new FileInputStream(new File(filepath));
                AudioStream audios = new AudioStream(music);
                AudioPlayer.player.start(audios);
            }
            
            catch (Exception e) { 
                 //gives error if .wav file not found
                System.out.println("Music not found!");
                e.printStackTrace();
            }
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
            
            xOffset  = (xOffset + stepSize) % width;
            yOffset  = (yOffset + stepSize) % height;
            
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
		int initWidth = 600;
		int initHeight = 400;
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