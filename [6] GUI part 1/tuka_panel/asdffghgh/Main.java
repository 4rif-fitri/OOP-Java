package asdffghgh;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.plaf.metal.MetalBorders;

public class Main {

	private CardLayout cardlayout = new CardLayout();
	private JPanel cardPanel = new JPanel(cardlayout);

	private static final String PANEL_ONE = "Panel 1";
	private static final String PANEL_TWO = "Panel 2";

	public void createAndshowGUI() {
		JFrame frame = new JFrame();
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

		JPanel panel1 = new JPanel();
		panel1.setBackground(Color.YELLOW);

		JPanel panel2 = new JPanel();
		panel2.setBackground(Color.BLACK);

		cardPanel.add(panel1, PANEL_ONE);
		cardPanel.add(panel2, PANEL_TWO);

		JPanel btn_group = new JPanel();
		JButton btn_next = new JButton("NEXT");
		JButton btn_back = new JButton("BACK");

		btn_group.add(btn_back);
		btn_group.add(btn_next);

		frame.add(cardPanel, BorderLayout.CENTER);
		frame.add(btn_group, BorderLayout.SOUTH);

		btn_back.addActionListener(e -> {
			cardlayout.next(cardPanel);
		});

		btn_next.addActionListener(e -> {
			cardlayout.previous(cardPanel);
		});

	}

	public static void main(String[] args) {
		Main main = new Main();
		main.createAndshowGUI();
	}

}
