/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autumnscene3;

import javax.swing.JFrame;

/**
 *
 * @author timberlinepluska
 */
public class ASDriver {
    public static void main (String[] args)
	{
		// DO NOT MODIFY THIS CODE.
		JFrame frame = new JFrame ("Autumn Scene");
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new AutumnScene());
		frame.pack();
		frame.setVisible(true);
                //MonsterMaker m = new MonsterMaker();
	}
}
