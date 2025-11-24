package KeyEvent;

import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TestKeyEvent implements KeyListener{
	JLabel label1 = new JLabel("Message goes here");
	JLabel label2 = new JLabel("Message goes here");
	JFrame frame = new JFrame("Test key");

	public void createAndShowGUI() {
		frame.setSize(200, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

		frame.add(label1, BorderLayout.NORTH);
		frame.add(label2, BorderLayout.SOUTH);

		frame.addKeyListener(this);		
	}

	public void keyPressed(KeyEvent e){
		label1.setText("You have pressed key :" + e.getKeyText(e.getKeyCode()));
	}
	public void keyReleased(KeyEvent e){
		label2.setText ("And you just released key :"+ e.getKeyText(e.getKeyCode () ));
	}
	public void keyTyped(KeyEvent e){

	}

	public static void main(String[] args) {
		TestKeyEvent main = new TestKeyEvent();
		main.createAndShowGUI();
	}
}
