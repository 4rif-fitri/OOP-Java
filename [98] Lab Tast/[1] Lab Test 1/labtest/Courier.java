package labtest;

import java.util.Scanner;

public class Courier {
	public static void main(String[] args) {
		double berat,jarak,rate = 0,harga = 0;
		Scanner input = new Scanner(System.in);

		do {
			System.out.print("Sila masukkan barat barang (Kg) : ");
			berat = input.nextDouble();

			if(berat <= 0){
				System.out.println("Sorry berat tidak boleh negative!");
			}else{
				if(berat <= 12){
				  break;
			  }else{
				  System.out.println("Sorry Maximun barat adalah 12 kg");
			  }
			}

		} while (true);

		do {
			System.out.print("Sila masukkan jarak (Km) : ");
			jarak = input.nextDouble();
			if(jarak <= 0){
				System.out.println("Sorry jarak tidak boleh negative!");
			}else{
				break;
			}
		} while (true);
	
		if(berat > 10) 	 rate = 20;
		else if(berat > 6) rate = 15.50;
		else if(berat > 2) rate = 10;
		else if(berat > 0) rate = 5;

		do {
			jarak -= 50;
			harga += rate;
		} while (jarak > 0);

		System.out.println(harga);
	}
}
