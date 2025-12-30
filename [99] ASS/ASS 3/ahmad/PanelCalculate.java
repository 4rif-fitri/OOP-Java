import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelCalculate extends JPanel implements ActionListener {
    DataStructure data;
    JButton btnCalculate = new JButton("Calculate");
    JLabel lTotal = new JLabel("Total");
    public PanelCalculate(JTextField tfUnitPrice, JTextField tfQuantity, DataStructure d){
        this.data = d;

        this.add(tfUnitPrice);
        this.add(new JLabel("*"));
        this.add(tfQuantity);
        this.add(new JLabel("="));
        this.add(btnCalculate);
        this.add(new JLabel("RM"));
        this.add(lTotal);

        btnCalculate.addActionListener(this);
        
        this.setBorder(BorderFactory.createTitledBorder("Calculate Total Price"));
    }

    public void actionPerformed(ActionEvent e)
    {
        double total = data.unitPrice * data.quantity;
        if (total != 0){
            lTotal.setText(String.format("%.2f", total));
        }
    }
}
