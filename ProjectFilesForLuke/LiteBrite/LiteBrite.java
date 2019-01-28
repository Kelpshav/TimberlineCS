
import javax.swing.JFrame;

/**
 * Creates the main LiteBrite frame
 * @author Pluska
 */
public class LiteBrite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

		/**
		 *TODO:  Create a Scanner
	         *       Prompt the user for an integer and assign the value to a variable
		 *       called gridsize
                 *       Create a new LiteBritePane object called "liteBritePane" then pass the 
		 *       gridsize to the LiteBritePane constructor
                 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a grid size");
		int gridsize = sc.nextInt();
		LiteBritePane liteBritePane = new LiteBritePane(gridsize);
                JFrame frame = new JFrame("Lite Brite");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(liteBritePane);
		frame.pack();
		frame.setVisible(true);
    }
    
}
