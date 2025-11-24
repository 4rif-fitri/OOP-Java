import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;

class Main implements ActionListener{

	public void ClickButtonDemo() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setLayout(new GridLayout(1, 1));
		
		frame.pack();
		frame.setSize(400, 80);
		frame.setVisible(true);
		
		JButton button = new JButton("click me");
		frame.add(button, BorderLayout.CENTER);
		button.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e){
		System.out.println("JAWA JAWA JAWA");
	}

	public static void main(String[] args) {
		Main main = new Main();
		main.ClickButtonDemo();
	}
}