import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class ccc extends JPanel {
    public ccc(){
        this.setVisible(true);
        this.setSize(300,300);
        // this.setBackground(Color.black);
        this.setLayout(new GridLayout(3,3));
                this.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        this.setBorder(BorderFactory.createTitledBorder("Item"));

        JRadioButton rb1 = new JRadioButton("Option 1");
        JRadioButton rb2 = new JRadioButton("Option 2");
        JRadioButton rb3 = new JRadioButton("Option 3");
        JRadioButton rb4 = new JRadioButton("Option 1");
        JRadioButton rb5 = new JRadioButton("Option 2");
        JRadioButton rb6 = new JRadioButton("Option 3");
        JRadioButton rb7 = new JRadioButton("Option 1");
        JRadioButton rb8 = new JRadioButton("Option 2");
        JRadioButton rb9 = new JRadioButton("Option 3");
    
        this.add(rb1);
        this.add(rb2);
        this.add(rb3);
        this.add(rb4);
        this.add(rb5);
        this.add(rb6);
        this.add(rb7);
        this.add(rb8);
        this.add(rb9);

                ButtonGroup group = new ButtonGroup();
                group.add(rb1);
                group.add(rb2);
                group.add(rb3);
                group.add(rb4);
                group.add(rb5);
                group.add(rb6);
                group.add(rb7);
                group.add(rb8);
                group.add(rb9);

    }
}
