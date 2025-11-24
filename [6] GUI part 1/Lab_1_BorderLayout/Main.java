package Lab_1_BorderLayout;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

import _1_Frame.Frame;

public class Main { 
	//! POSISION TOP LEFT BOTTOM RIGHT 0

	private void createAndShowGUI() {
		JFrame frame = new JFrame("LOREM IPSUM");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setVisible(true);

		JButton btn_atas = new JButton("Utara");
		JButton btn_tengah = new JButton("Tengah");
		JButton btn_bawah = new JButton("Bawah");
		JButton btn_kanan = new JButton("Kanan");
		JButton btn_kiri = new JButton("kiri");

		frame.add(btn_atas, BorderLayout.NORTH);
		frame.add(btn_bawah, BorderLayout.SOUTH);
		frame.add(btn_kiri, BorderLayout.WEST);
		frame.add(btn_kanan, BorderLayout.EAST);
		frame.add(btn_tengah, BorderLayout.CENTER);
	}

	public static void main(String[] args) {
		Main bd = new Main();
		bd.createAndShowGUI();

	}

}
