package gamebox_Final;

import javax.swing.JFrame;
/**
 * This is the main class to be run in order to play the game. 
 */
public class RunGame {
	static JFrame frame = new JFrame("Bouncing bullet");

	public static void main(String[] args) {
		GameBox bx=new GameBox();
		frame.getContentPane().add(bx);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(490,600);
		frame.setResizable(false);
	}

}
