import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JList;
import javax.swing.JPanel;

public class aaa extends JPanel{
    public aaa(){
        this.setVisible(true);
        this.setSize(200,300);
        // this.setBackground(Color.yellow);

        this.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        this.setBorder(BorderFactory.createTitledBorder("Cuantitiy"));

        String[] buah = {
            "Mee bandung Muar RM 6.00", 
            "Mee bandung Muar RM 6.00", 
            "Mee bandung Muar RM 6.00", 
            "Mee bandung Muar RM 6.00", 
            "Mee bandung Muar RM 6.00", 
        };
        JList list = new JList<>(buah);
        this.add(list);
    }
    
}
