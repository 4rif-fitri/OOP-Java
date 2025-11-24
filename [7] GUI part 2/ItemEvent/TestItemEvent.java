package ItemEvent;
//JCheckBox

import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class TestItemEvent implements ItemListener{

	JLabel label1 = new JLabel("You dontt like Vanila");
	JLabel label2 = new JLabel("You dontt like Chocolate");
	JCheckBox cV = new JCheckBox("Vanila");
	JCheckBox cC = new JCheckBox("Chocolate");
	JPanel panel = new JPanel();
	JFrame frame = new JFrame("Test CheckBox");

	public void createAndShowGUI(){
		frame.setSize(300,150);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setLayout(new GridLayout(3,1));

		frame.add(label1); frame.add(label2);
		panel.add(cC); panel.add(cV);
		frame.add(panel);

		cC.addItemListener(this);
		cV.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent e){
		if(e.getSource() == cC){
			setChocolate(e);
		}else if(e.getSource() == cV){
			setVanila(e);
		}
	}

	public void setVanila(ItemEvent e){
		if(e.getStateChange() == ItemEvent.SELECTED){
			label1.setText("You like vanila");
		}else{
			label1.setText("You dont like vanila");
		}
	}
	public void setChocolate(ItemEvent e){
		if(e.getStateChange() == ItemEvent.DESELECTED){
			label2.setText("You like Chocolate");
		}else{
			label2.setText("You dont like Chocolate");
		}
	}

	public static void main(String[] args) {
		TestItemEvent main = new TestItemEvent();
		main.createAndShowGUI();
	}
}