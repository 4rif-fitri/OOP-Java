package _4_Button;

import java.awt.Color;
import java.awt.Font;
import java.awt.JobAttributes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

// public class MyFrame extends JFrame implements ActionListener{
public class MyFrame extends JFrame{
	JButton button;
	JLabel label;

	MyFrame(){
		ImageIcon icon = new ImageIcon("_3_Panel\\asd.png");

		label =  new JLabel();	
		label.setIcon(icon);
		label.setBounds(150,250,150,150);
		label.setVisible(false);

		button = new JButton();
		button.setBounds(10,10,300,300);
		button.setText("CLICK ME!");
		button.setFocusable(false);
		button.setIcon(icon);
		button.setHorizontalTextPosition(JButton.CENTER);
		button.setVerticalTextPosition(JButton.BOTTOM);
		button.setFont(new Font("Comic Sans",Font.BOLD, 25));
		button.setIconTextGap(-20);
		button.setForeground(Color.yellow);
		// button.setBackground(Color.black);
		button.setBorder(BorderFactory.createEtchedBorder());
		// button.setEnabled(false);
		

		button.addActionListener(e -> {
			// System.out.println(e);
			label.setVisible(true);
		});

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(400,400);
		this.setVisible(true);

		this.add(button);
		this.add(label);

	}

	// @Override
	// public void actionPerformed(ActionEvent e) {

	// 	if(e.getSource() == button){
	// 		System.out.println("BOOM");
	// 	}

	// }
}
