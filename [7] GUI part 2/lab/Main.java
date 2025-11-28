package lab;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

public class Main extends JFrame{
    


    public static void main(String[] args) {
        JFrame frame = new JFrame("LOREM");    
  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panal_atas = new JPanel();
        JLabel label1 = new JLabel("RM");
        JTextField input = new JTextField(10);
        panal_atas.add(label1);
        panal_atas.add(input);

        JPanel panal_tengah = new JPanel();
        JRadioButton btn_usd = new JRadioButton("Convert to USD");
        JRadioButton btn_yen = new JRadioButton("Convert to Yen");
        JRadioButton btn_rp = new JRadioButton("Convert to Rp");
        ButtonGroup group = new ButtonGroup();

        group.add(btn_rp);
        group.add(btn_usd);
        group.add(btn_yen);

        panal_tengah.add(btn_rp);
        panal_tengah.add(btn_usd);
        panal_tengah.add(btn_yen);
        
        JPanel panal_bawah = new JPanel();
        JButton btn_cal = new JButton("Calculate");
        JButton btn_close = new JButton("Close");

        
        panal_bawah.add(btn_cal);
        panal_bawah.add(btn_close);
        



        frame.add(panal_atas,BorderLayout.NORTH);
        frame.add(panal_tengah,BorderLayout.CENTER);
        frame.add(panal_bawah,BorderLayout.SOUTH);



        btn_cal.addActionListener(e -> {
            double asdf = 0.0;
            
            try {
            String asd = input.getText();

            asdf = Double.parseDouble(asd);

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(btn_close, "INPUT PLEASE", "asdf", 1);
                return;
            }

            if(btn_usd.isSelected()){
                asdf *= 0.4;
            }else if(btn_yen.isSelected()){
                asdf *= 0.1;
            }else if(btn_rp.isSelected()){
                asdf *= 0.8;                
            }

            JOptionPane.showMessageDialog(null, asdf , "CONVERT",1);

        });

        btn_close.addActionListener(e -> {
            frame.dispose();
        });












    
        frame.setVisible(true);
        // frame.setSize(400,200);
        frame.pack();
    }

}
