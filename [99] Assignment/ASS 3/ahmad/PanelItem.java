import javax.swing.BorderFactory;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class PanelItem extends JPanel implements ListSelectionListener{
    JTextField tf;
    DataStructure data;
    JList listItem;
    double[] menuHarga = {6.00, 6.50, 5.50, 6.00, 5.00};
    public PanelItem(JTextField tf, DataStructure d){
        this.data = d;
        this.tf = tf;
        String stringItems[] = {
            "Mee Bandung Muar 6.00",
            "Mee Rebus Kambing 6.50",
            "Mee Goreng Daging 5.50",
            "Mee Wantan Special 6.00",
            "Mee Sup Ayam 5.00"
        };
        listItem = new JList(stringItems);
        listItem.addListSelectionListener(this);

        
        this.add(listItem);
        this.setBorder(BorderFactory.createTitledBorder("Item"));
    }

    public void valueChanged(ListSelectionEvent e){
        if(!e.getValueIsAdjusting()){
            data.unitPrice = menuHarga[listItem.getSelectedIndex()];
            tf.setText(String.format("%.2f", data.unitPrice));
        }
    }
}
