package monstermaker;

import java.awt.Dimension;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MonsterMaker{

public static void main(String[] args) {
    
    
    Monster monster1 = new Monster("Mike", 175, 100);
    monster1.numEyes = 13;
    monster1.setEyes();
    monster1.setHorns();
    monster1.setMouth();
    monster1.setTeeth();
    monster1.setArms();
    monster1.setCaption("RAR!");
    
    

    
    //DO NOT EDIT BELOW
    JFrame frame = new JFrame ("Monster");
    frame.setSize(new Dimension(700,500));
    frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().add(monster1);	
    frame.setVisible(true);

    }

}

