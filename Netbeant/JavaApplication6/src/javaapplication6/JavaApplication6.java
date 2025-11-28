package javaapplication6;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.swing.JPanel;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class JavaApplication6 {

	public JFrame frame = new JFrame();
	private JPanel carPanel;
	private CardLayout cardLayout;

	final static String HOME = "HOME";
	final static String GALLARY = "GALLARY";
	final static String CATEGORY = "CATEGORY";
	final static String BYCATEGORY = "BYCATEGORY";

	public void run() {
		frame.setVisible(true);
		frame.setSize(700, 400);
		// frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		cardLayout = new CardLayout();
		carPanel = new JPanel(cardLayout);

		ByCategoryPanel bycategorypanel = new ByCategoryPanel(cardLayout, carPanel);

		carPanel.add(new HomePanel(), HOME);
		carPanel.add(new GallaryPanel(cardLayout, carPanel), GALLARY);
		carPanel.add(new CategoryPanel(cardLayout, carPanel, bycategorypanel), CATEGORY);
		carPanel.add(bycategorypanel, BYCATEGORY);

		cardLayout.show(carPanel, HOME);

		frame.getContentPane().add(new NavbarPanel(cardLayout, carPanel), BorderLayout.NORTH);
		frame.getContentPane().add(carPanel, BorderLayout.CENTER);

	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {

			JavaApplication6 main = new JavaApplication6();
			main.run();
		});
	}
}