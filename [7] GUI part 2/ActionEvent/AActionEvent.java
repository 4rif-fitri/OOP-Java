package ActionEvent;

import java.awt.GridLayout;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AActionEvent implements ActionListener {
	JLabel label = new JLabel("Message gose here");
	JPanel panel = new JPanel();
	JButton btn1 = new JButton("OK");
	JButton btn2 = new JButton("Cencel");
	JFrame frame = new JFrame("Test Click");

	public void createAndShowGUI() {
		frame.setSize(600, 100);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setLayout(new GridLayout(2, 1));

		frame.add(label);
		panel.add(btn1);
		panel.add(btn2);
		frame.add(panel);

		btn1.addActionListener(this);
		btn2.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		String output = "\tThe " + e.getActionCommand() + " Button is click at\n " +
		new java.util.Date(e.getWhen());
		// String output = e.getActionCommand();
		label.setText(output);
	}

	public static void main(String[] args) {
		AActionEvent main = new AActionEvent();
		main.createAndShowGUI();
	}
}
