
//Jumlah.java
//Mencampur 2 nombor – nombor pertama dpd input pengguna
// nombor kedua adalah pilihan dpd combo box
import javax.swing.*;

public class Jumlah {
	public static void main(String[] args) {
		int no1, no2 = 0;
		Object[] possibleValues = { 4, 3, 7 }; // Nilai pd combo box
		// Terima input dpd JOptionPane melalui showInputDialog
		String pertama = JOptionPane.showInputDialog("Nombor pertama? ");

		// Terima input dpd pilihan berdasarkan nilai di combo box
		Object nilaiDipilih = JOptionPane.showInputDialog(null,
				"Nombor kedua?", "Input", JOptionPane.INFORMATION_MESSAGE,
				null, possibleValues, possibleValues[0]);
		// Tukar nilai string pd input ke integer
		no1 = Integer.parseInt(pertama);

		// Terima nilai combo box ke bentuk integer
		no2 = ((Integer) nilaiDipilih).intValue();
		// Paparkan hasil melalui showMessageDialog
		JOptionPane.showMessageDialog(null, "Jumlah = " + (no1 + no2),
				"Jumlah 2 nombor", JOptionPane.PLAIN_MESSAGE);
	} // main
} // Jumlah