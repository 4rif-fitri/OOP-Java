package Lab_4_CardLayout;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import _1_Frame.Frame;

public class Main implements ActionListener{
	private JPanel carPanel;
	private CardLayout cardLayout;

	final static String PANEL_ONE = "Card 1: Red Panel";
	final static String PANEL_TWO = "Card 2: Blue Panel";
	final static String PANEL_THREE = "Card 3: Green Panel";

	public void createAndShowGUI() {
		JFrame frame = new JFrame("CardLayout Demo");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(400, 400));
		// frame.setSize(400,400);

		cardLayout = new CardLayout();
		carPanel = new JPanel(cardLayout);

		JPanel redJPanel = new JPanel();
		redJPanel.setBackground(Color.RED);
		redJPanel.add(new JLabel("Welcome to First screen!"));

		JPanel blueJPanel = new JPanel();
		blueJPanel.setBackground(Color.BLUE);
		blueJPanel.add(new JLabel("Welcome to Second screen!"));

		JPanel greenJPanel = new JPanel();
		greenJPanel.setBackground(Color.GREEN);
		greenJPanel.add(new JLabel("Welcome to Final screen!"));

		carPanel.add(redJPanel, PANEL_ONE);
		carPanel.add(blueJPanel, PANEL_TWO);
		carPanel.add(greenJPanel, PANEL_THREE);

		JButton nextButton = new JButton("Next Card >>");
		JButton previousButton = new JButton("<< Previous Card");

		nextButton.setActionCommand("NEXT");
		previousButton.setActionCommand("PREVIOUS");

		nextButton.addActionListener(this);
		previousButton.addActionListener(this);

		JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER,10,10));
		buttonPanel.add(previousButton);
		buttonPanel.add(nextButton);

		frame.getContentPane().add(carPanel,BorderLayout.CENTER);
		frame.getContentPane().add(buttonPanel, BorderLayout.SOUTH);

		cardLayout.show(carPanel, PANEL_ONE);

		frame.pack();
	}


	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Main()::createAndShowGUI);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();

		if (command.equals("NEXT")) {
			cardLayout.next(carPanel);
		} else if (command.equals("PREVIOUS")) {
			cardLayout.previous(carPanel);
		}
	}

}
