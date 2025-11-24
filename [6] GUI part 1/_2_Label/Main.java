package _2_Label;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Label;
import java.awt.datatransfer.Clipboard;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Main {
	public static void main(String[] args) {
		ImageIcon icon = new ImageIcon("_2_Label\\asd.png");
		Border border = BorderFactory.createLineBorder(Color.black, 5);

		JLabel label = new JLabel();
		label.setText("LOREM CODE ?");
		label.setIcon(icon);
		label.setForeground(Color.blue);
		label.setFont(new Font("MV  Boli", Font.PLAIN, 20));
		label.setIconTextGap(-100);
		label.setBackground(Color.yellow);
		label.setOpaque(true); /// dosplay backroung coloe
		label.setBorder(border);
		label.setVerticalAlignment(JLabel.CENTER);
		label.setHorizontalAlignment(JLabel.CENTER);
		// label.setBounds(100, 0, 250, 250);

		JFrame frame = new JFrame("LORWM");
		frame.setSize(500, 500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(label);// defoult border layout
		// frame.setLayout(null);
		frame.pack();///follow size component
	}	
}
