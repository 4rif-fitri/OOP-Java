package _7_Grid_Layout;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Main {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(250, 250);
		frame.setLayout(new GridLayout(3,3,10,10));

		frame.add(new JButton("1"));
		frame.add(new JButton("1"));
		frame.add(new JButton("1"));
		frame.add(new JButton("1"));
		frame.add(new JButton("1"));
		frame.add(new JButton("1"));
		frame.add(new JButton("1"));
		frame.add(new JButton("1"));
		frame.add(new JButton("1"));

	}
}
