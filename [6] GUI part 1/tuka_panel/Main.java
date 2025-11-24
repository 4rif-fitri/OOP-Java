
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

class Main {
	private CardLayout cardLayout = new CardLayout();
	private JPanel carPanel = new JPanel(cardLayout);

	final static String PANEL_ONE = "Card 1: Red Panel";
	final static String PANEL_TWO = "Card 2: Blue Panel";

	public void createAndshowGUI() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel redJPanel = new JPanel();
		redJPanel.setBackground(Color.RED);

		JPanel blueJPanel = new JPanel();
		blueJPanel.setBackground(Color.BLUE);

		JButton nextButton = new JButton("Next Card >>");
		JButton previousButton = new JButton("<< Previous Card");

		JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
		buttonPanel.add(previousButton);
		buttonPanel.add(nextButton);

		carPanel.add(redJPanel, PANEL_ONE);
		carPanel.add(blueJPanel, PANEL_TWO);

		frame.getContentPane().add(carPanel, BorderLayout.CENTER);
		frame.getContentPane().add(buttonPanel, BorderLayout.SOUTH);

		nextButton.addActionListener(e -> {
			cardLayout.next(carPanel);
		});
		previousButton.addActionListener(e -> {
			cardLayout.previous(carPanel);
		});

	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {

			Main main = new Main();
			main.createAndshowGUI();
		});

	}
};