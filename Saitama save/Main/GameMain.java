package Main;

import javax.swing.*;

public class GameMain {
	

	static int width = 600;
	static int height = 800;
	
	
	public static void main(String[] args) {
		

		JFrame frame = new JFrame();
		

		frame.setTitle("Punch War");
		

		frame.setSize(width, height);
		

		frame.setDefaultCloseOperation(3);
		

		frame.setLocationRelativeTo(null);
		

		GamePanel panel = new GamePanel();
		

		frame.add(panel);
		

		frame.addMouseMotionListener(panel);
		

		frame.setVisible(true);
		

		panel.init();
	}
}
