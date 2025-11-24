package _3_Panel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicSplitPaneUI.BasicVerticalLayoutManager;

public class Main {
	public static void main(String[] args) {
		ImageIcon icon = new ImageIcon("_3_Panel\\asd.png");

		JLabel label = new JLabel();
		label.setText("LOREM ?");
		label.setIcon(icon);
		label.setVerticalAlignment(JLabel.CENTER);
		label.setHorizontalAlignment(JLabel.CENTER);

		JPanel YellowPanel = new JPanel();
		YellowPanel.setBackground(Color.YELLOW);
		YellowPanel.setBounds(0, 0, 200, 200);

		JPanel RedPanel = new JPanel();
		RedPanel.setBackground(Color.RED);
		RedPanel.setBounds(200, 0, 200, 200);

		JPanel BluePanel = new JPanel();
		BluePanel.setBackground(Color.BLUE);
		BluePanel.setBounds(0, 200, 400, 250);
		BluePanel.setLayout(new BorderLayout());

		JFrame frame = new JFrame("LORWM");
		frame.setSize(500, 500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);

		BluePanel.add(label);

		frame.add(YellowPanel);
		frame.add(RedPanel);
		frame.add(BluePanel);

	}
}
