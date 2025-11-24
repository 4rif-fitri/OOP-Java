package Lab_2_FlowLayout;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

import _1_Frame.Frame;

public class Main { //! DISPLAY FLEX
	
	private void createAndShowGUI(){
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(300,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setLayout(new FlowLayout());
		// frame.setLayout(new FlowLayout());

		JButton btn1 = new JButton("Button 1");
		JButton btn2 = new JButton("LOREM IPSUM");
		JButton btn3 = new JButton("3");

		frame.add(btn1);
		frame.add(btn2);
		frame.add(btn3);
	}

	public static void main(String[] args) {
		Main flex = new Main();
		flex.createAndShowGUI();
	}
}
