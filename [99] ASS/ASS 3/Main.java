import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.text.CollationElementIterator;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

class Main extends JPanel{

    public Main(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,300);
        frame.setVisible(true);

        // JPanel p1 = new JPanel();
        // p1.setSize(200,300);
        // p1.setVisible(true);
        // p1.setBackground(Color.YELLOW);
        // frame.add(p1);
        
        // String[] buah = {"Apple", "Banana", "Mango", "Orange", "Durian"};
        // JList list = new JList<>(buah);
        
        frame.add(new aaa(),BorderLayout.WEST);
        frame.add(new bbb(),BorderLayout.CENTER);




        

    }

    public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			new Main();
		});
    }
}