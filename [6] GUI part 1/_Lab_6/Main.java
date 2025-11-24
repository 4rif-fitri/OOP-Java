package _Lab_6;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;

public class Main {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {

				Border border = BorderFactory.createLineBorder(Color.black, 2);

				JFrame frame = new JFrame("Currency Converter");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setSize(500, 300);
				frame.setVisible(true);
				frame.setLocationRelativeTo(null);
				frame.setLayout(new GridLayout(3, 1));

				JPanel panel1 = new JPanel();
				JPanel panel2 = new JPanel();
				JPanel panel3 = new JPanel();

				// ========= panel 1===============
				JLabel label1 = new JLabel("Enter currency amount in RM : ");
				JTextField input = new JTextField(10);

				JLabel label2 = new JLabel(" ==> ");
				label2.setVisible(false);
				panel1.setLayout(new GridBagLayout());
				label1.setHorizontalAlignment(JLabel.CENTER);

				JPanel container = new JPanel();
				// container.setBackground(Color.yellow);
				container.add(label1);
				container.add(input);
				container.add(label2);
			
				panel1.add(container);
				// ========= panel 1===============
				// ========= panel 2===============

				JPanel container_tengah = new JPanel();
				panel2.setLayout(new GridBagLayout());

				JRadioButton btn1 = new JRadioButton("Convert to USD");
				JRadioButton btn2 = new JRadioButton("Convert to Rp");
				JRadioButton btn3 = new JRadioButton("Convert to Yen");
				ButtonGroup btn_Group = new ButtonGroup();
				btn_Group.add(btn1);
				btn_Group.add(btn2);
				btn_Group.add(btn3);
				container_tengah.add(btn1);
				container_tengah.add(btn2);
				container_tengah.add(btn3);
				panel2.add(container_tengah);
				// ========= panel 2===============
				// ========= panel 3===============
				panel3.setLayout(new GridBagLayout());
				JPanel container_bawah = new JPanel();
				JButton btn_b_1 = new JButton("Calculate");
				JButton btn_b_2 = new JButton("Close");

				btn_b_1.setSize(new Dimension(10,30));
				btn_b_2.setSize(new Dimension(10, 30));
				container_bawah.add(btn_b_1);
				container_bawah.add(btn_b_2);
				panel3.add(container_bawah);

				btn_b_1.addActionListener(e -> {
					String inp = input.getText();

					if(btn1.isSelected() || btn2.isSelected() ||
						btn3.isSelected() || !inp.isEmpty() ){

							System.out.println("lorem");
							String selected = null;
							if (btn1.isSelected())
								selected = "USD";
							if (btn2.isSelected())
								selected = "Rp";
							if (btn3.isSelected())
								selected = "Yen";
		
							System.out.println("Currency: " + selected);
							System.out.println(input.getText());
							label2.setText(" ==> " + selected);
							label2.setVisible(true);
							
					}


				});
				
				// ========= panel 3===============


				panel1.setBackground(Color.YELLOW);
				panel2.setBackground(Color.BLACK);
				panel3.setBackground(Color.yellow);

				panel1.setBorder(border);
				panel2.setBorder(border);
				panel3.setBorder(border);

				frame.add(panel1);
				frame.add(panel2);
				frame.add(panel3);

			}
		});
	}
}
