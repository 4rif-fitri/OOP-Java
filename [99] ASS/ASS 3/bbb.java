import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JPanel;

public class bbb extends JPanel{
    public bbb(){
        this.setVisible(true);
        this.setSize(200,300);
        this.setBackground(Color.black);
        this.setLayout(new FlowLayout());

        // this.add(new ccc(), BorderLayout.CENTER);
        // this.add(new ddd(), BorderLayout.NORTH);

        this.add(new ccc());
        this.add(new ddd());

    }
}
