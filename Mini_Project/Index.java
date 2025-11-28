import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class Index{
	
	public JFrame frame = new JFrame();
	private JPanel carPanel;
	private CardLayout cardLayout;

	final static String HOME = "HOME";
 	final static String RED_CARD = "RED";
	final static String BLACK_CARD = "BLACK";

	public void run(){
		frame.setVisible(true);
		frame.setSize(700,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		cardLayout = new CardLayout();
		carPanel = new JPanel(cardLayout);

		carPanel.add(new Home(),HOME);
		carPanel.add(new CustomPanel(Color.RED),RED_CARD);
		carPanel.add(new CustomPanel(Color.BLACK),BLACK_CARD);

		JButton Yellow = new JButton("Yellow");
		JButton Red = new JButton("Red");
		JButton Black = new JButton("Black");

		JPanel buttonPanel = new JPanel(new GridLayout(1,3));
		buttonPanel.add(Yellow);
		buttonPanel.add(Red);
		buttonPanel.add(Black);

 		cardLayout.show(carPanel, HOME);

		Yellow.addActionListener(e -> {
 			cardLayout.show(carPanel, HOME);
		});

		Red.addActionListener(e -> {
 			cardLayout.show(carPanel, RED_CARD);
		});

		Black.addActionListener(e -> {
 			cardLayout.show(carPanel, BLACK_CARD);
		});

		frame.getContentPane().add(buttonPanel, BorderLayout.NORTH);
		frame.getContentPane().add(carPanel, BorderLayout.CENTER);

	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			Index main = new Index();	 
			main.run();
		});
	}
}