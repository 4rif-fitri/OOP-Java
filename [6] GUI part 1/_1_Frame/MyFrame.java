package _1_Frame;

import java.awt.Color;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JFrame;

public class MyFrame extends Frame{
		public MyFrame(){

		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setResizable(true);
		frame.setTitle("LOREM IPSUM");
		frame.setVisible(true);
		
		// ImageIcon icon = new ImageIcon("");
		// frame.setIconImage(icon.getImage());
		
		// frame.getContentPane().setBackground(Color.yellow);
		frame.getContentPane().setBackground(new Color(255, 225, 0));
	};
}
