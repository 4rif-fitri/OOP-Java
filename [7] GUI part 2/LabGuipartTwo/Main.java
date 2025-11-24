package LabGuipartTwo;

import java.awt.Button;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.*;
import java.time.chrono.JapaneseChronology;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Main implements ActionListener, ItemListener{
	JFrame frame = new JFrame();
	JLabel label = new JLabel("Enter currency amount in RM : ");
	JLabel label_output = new JLabel();

	JRadioButton rbtn1 = new JRadioButton("Convert to USD");
	JRadioButton rbtn2 = new JRadioButton("Convert to Riyal");
	JRadioButton rbtn3 = new JRadioButton("Convert to Yen");
	
	JButton btn1 = new JButton("Calculate");
	JButton btn2 = new JButton("Close");
	
	JPanel panel_atas = new JPanel();
	JPanel panel_tengah = new JPanel();
	JPanel panel_bawah = new JPanel();	

	JTextField input = new JTextField();

	double rate = 0;
	String unit = null;

	public void createAndShowGUI(){
		frame.setLayout(new GridLayout(3,1));
		input.setPreferredSize(new Dimension(100,20));
		panel_atas.add(label);
		panel_atas.add(input);
		panel_atas.add(label_output);
		
		ButtonGroup group = new ButtonGroup();
	
		group.add(rbtn1);
		group.add(rbtn2);
		group.add(rbtn3);

		panel_tengah.add(rbtn1);
		panel_tengah.add(rbtn2);
		panel_tengah.add(rbtn3);

		rbtn1.addItemListener(this);
		rbtn2.addItemListener(this);
		rbtn3.addItemListener(this);

		panel_bawah.add(btn1);
		panel_bawah.add(btn2);

		frame.add(panel_atas);
		frame.add(panel_tengah);
		frame.add(panel_bawah);

		btn1.addActionListener(this);
		btn2.addActionListener(this);

		// frame.pack();
		frame.setSize(500,200);
		frame.setVisible(true);
	}

	public void itemStateChanged(ItemEvent e) {
		if (e.getStateChange() == ItemEvent.SELECTED) {
			JRadioButton btn = (JRadioButton) e.getItemSelectable();
			String a = btn.getText();
			
			if (a.equals("Convert to Riyal")) {
				unit = "Riyal";
				rate = 0.39;
			}else if (a.equals("Convert to Yen")) {
				unit = "Yen";
				rate = 33.2;
			}else if(a.equals("Convert to USD")){
				unit = "USD";
				rate = 0.22;
			}

		}
	
	}

	public void actionPerformed(ActionEvent e){
		String action = e.getActionCommand();
		double value = 0.0;

		if (action.equals("Calculate")) {
			
			try {
				value = Double.parseDouble(input.getText());
			} catch (Exception ex) {
				label_output.setText("Invalid input");
				return;
			}

			if (rate > 0) {
				label_output.setText(" => " + unit + " " + rate * value);
			}else{
				label_output.setText("Sila Pilih");
			}


		}else if(action.equals("Close")){
			frame.dispose();
		}
	}  

	public static void main(String[] args) {
		Main main = new Main();
		main.createAndShowGUI();		 
	}
}
