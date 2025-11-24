package Lab_3_GridLayout;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;

import _1_Frame.Frame;

public class Main {

	public void createAndShowGUI() {
		JFrame frame = new JFrame();
		;
		frame.setSize(300, 300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setLayout(new GridLayout(3, 2));

		JButton btn1 = new JButton("1");
		JButton btn2 = new JButton("2");
		JButton btn3 = new JButton("3");
		JButton btn4 = new JButton("4");
		JButton btn5 = new JButton("5");
		JButton btn6 = new JButton("6");

		frame.add(btn1);
		frame.add(btn2);
		frame.add(btn3);
		frame.add(btn4);
		frame.add(btn5);
		frame.add(btn6);

	}

	public void createGridBagLayout() {
		JButton btn1 = new JButton("1");
		JButton btn2 = new JButton("2");
		JButton btn3 = new JButton("3");
		JButton btn4 = new JButton("4");
		JButton btn5 = new JButton("5");
		JButton btn6 = new JButton("6");

		JFrame frame = new JFrame("GridBagLayout");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

		frame.setLayout(new GridBagLayout());

		GridBagConstraints gbc = new GridBagConstraints();

		gbc.fill = GridBagConstraints.BOTH; // !tarik supaya full

		gbc.weightx = 2.0; //!button ikut membeser base on size screen
		gbc.weighty = 1.0;

		gbc.insets = new Insets(5, 5, 5, 5); // !gap

		gbc.gridx = 0;
		gbc.gridy = 0;
		frame.add(btn1, gbc);

		gbc.gridx = 1;
		gbc.gridy = 0;
		frame.add(btn2, gbc);

		gbc.gridx = 0;
		gbc.gridy = 1;
		frame.add(btn3, gbc);

		gbc.gridx = 1;
		gbc.gridy = 1;
		frame.add(btn4, gbc);

		gbc.gridx = 0;
		gbc.gridy = 2;
		frame.add(btn5, gbc);

		gbc.gridx = 1;
		gbc.gridy = 2;
		frame.add(btn6, gbc);

		frame.pack();
	}

	public static void main(String[] args) {
		Main grid = new Main();
		// grid.createAndShowGUI();
		grid.createGridBagLayout();
	}
}
