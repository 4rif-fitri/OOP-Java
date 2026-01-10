import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class PanelQuantity extends JPanel implements ItemListener {
    JTextField tf;
    ButtonGroup rbGroup;
    DataStructure data;

    JRadioButton rb1 = new JRadioButton("1");
    JRadioButton rb2 = new JRadioButton("2");
    JRadioButton rb3 = new JRadioButton("3");
    JRadioButton rb4 = new JRadioButton("4");
    JRadioButton rb5 = new JRadioButton("5");
    JRadioButton rb6 = new JRadioButton("6");
    JRadioButton rb7 = new JRadioButton("7");
    JRadioButton rb8 = new JRadioButton("8");
    JRadioButton rb9 = new JRadioButton("9");

    public PanelQuantity(JTextField tf, DataStructure d){
        this.tf = tf;
        this.data = d;

        this.setLayout(new GridLayout(3,3));

        rbGroup = new ButtonGroup();

        rb1.setActionCommand("1"); rb1.addItemListener(this); rbGroup.add(rb1); this.add(rb1);
        rb2.setActionCommand("2"); rb2.addItemListener(this); rbGroup.add(rb2); this.add(rb2);
        rb3.setActionCommand("3"); rb3.addItemListener(this); rbGroup.add(rb3); this.add(rb3);
        rb4.setActionCommand("4"); rb4.addItemListener(this); rbGroup.add(rb4); this.add(rb4);
        rb5.setActionCommand("5"); rb5.addItemListener(this); rbGroup.add(rb5); this.add(rb5);
        rb6.setActionCommand("6"); rb6.addItemListener(this); rbGroup.add(rb6); this.add(rb6);
        rb7.setActionCommand("7"); rb7.addItemListener(this); rbGroup.add(rb7); this.add(rb7);
        rb8.setActionCommand("8"); rb8.addItemListener(this); rbGroup.add(rb8); this.add(rb8);
        rb9.setActionCommand("9"); rb9.addItemListener(this); rbGroup.add(rb9); this.add(rb9);
        
        this.setBorder(BorderFactory.createTitledBorder("Quantity"));
    }

    public void itemStateChanged(ItemEvent e){
        String actionCommand;
        ButtonModel buttonModel = rbGroup.getSelection();
        if (e.getStateChange() == ItemEvent.SELECTED) {
            actionCommand = buttonModel.getActionCommand();
            tf.setText(actionCommand);
            data.quantity = Integer.parseInt(actionCommand);
        }
    }

}
