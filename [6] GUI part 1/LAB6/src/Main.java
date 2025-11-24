
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.PageAttributes;
import java.util.jar.JarInputStream;

import javax.swing.*;
import javax.swing.border.Border;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    public static void createAndShowGUI() {
        Border border = BorderFactory.createLineBorder(Color.black, 2);

        JFrame frame = new JFrame("Currency Converter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new GridLayout(3, 1));

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();

        // ========= panel 1===============
        JLabel label1 = new JLabel("Enter currency amount in RM : ");
        JTextField input = new JTextField(10);

        panel1.setLayout(new GridBagLayout());
        label1.setHorizontalAlignment(JLabel.CENTER);

        JPanel container = new JPanel();
        container.setBackground(Color.yellow);
        container.add(label1);
        container.add(input);
        panel1.add(container);
        // ========= panel 1===============
        // ========= panel 2===============

        JPanel container_tengah = new JPanel();
        panel2.setLayout(new GridBagLayout());

        JRadioButton btn1 = new JRadioButton("Convert to USD");
        JRadioButton btn2 = new JRadioButton("Convert to Rp");
        JRadioButton btn3 = new JRadioButton("Convert to Yen");
        ButtonGroup btn_Group = new ButtonGroup();
        btn_Group.add(btn1);
        btn_Group.add(btn2);
        btn_Group.add(btn3);
        container_tengah.add(btn1);
        container_tengah.add(btn2);
        container_tengah.add(btn3);
        panel2.add(container_tengah);
        // ========= panel 2===============
        // ========= panel 3===============


        panel1.setBackground(Color.YELLOW);
        panel2.setBackground(Color.BLACK);
        panel3.setBackground(Color.yellow);

        panel1.setBorder(border);
        panel2.setBorder(border);
        panel3.setBorder(border);

        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);

    }
}
