import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ddd extends JPanel{

    public ddd(){

        this.setVisible(true);
        this.setSize(300,300);
        this.setBackground(Color.yellow);
        

        this.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        this.setBorder(BorderFactory.createTitledBorder("Calculate"));
    
        JLabel label = new JLabel("lorem");
        this.add(label);
        this.add(label);
        this.add(label);
        this.add(label);
        this.add(label);
        this.add(label);
        this.add(label);
    }

}
