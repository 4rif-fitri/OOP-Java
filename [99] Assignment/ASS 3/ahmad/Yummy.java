import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.*;

public class Yummy {
    public static void main(String[] args) {
        // global stuff, to be shared across classes/objects
        DataStructure dsa = new DataStructure();
        JTextField tfUnitPrice = new JTextField("Price", 8);
        JTextField tfQuantity = new JTextField("Quantity", 8);
        
        tfUnitPrice.setEnabled(false);
        tfQuantity.setEnabled(false);
        tfUnitPrice.setDisabledTextColor(Color.BLACK);
        tfQuantity.setDisabledTextColor(Color.BLACK);

        PanelItem pnlItem = new PanelItem(tfUnitPrice, dsa);
        PanelQuantity pnlQuantity = new PanelQuantity(tfQuantity, dsa);
        PanelCalculate pnlCalculate = new PanelCalculate(tfUnitPrice, tfQuantity, dsa);

        JPanel panelEAST = new JPanel(new BorderLayout());
        panelEAST.add(pnlQuantity, BorderLayout.NORTH);
        panelEAST.add(pnlCalculate, BorderLayout.SOUTH);

        JFrame frame = new JFrame("Minecraft 1.7.10");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(pnlItem, BorderLayout.WEST);
        frame.add(panelEAST, BorderLayout.EAST);
        frame.pack();
        frame.setVisible(true);
    }
}