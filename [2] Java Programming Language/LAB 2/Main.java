import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// System.out.println("Halo");
		do {
			

		Scanner input = new Scanner(System.in);
		int awal;
		int akhir;
		int pengunaan;
		double kos = 0;
		do {
			System.out.print("sila masukkan bacaan meter Sekarang : ");
			akhir = input.nextInt();
			System.out.print("sila masukkan bacaan meter Sebelum ini : ");
			awal = input.nextInt();
			if(awal > akhir) System.out.println("Salah Input!");
			input.close();
		} while (awal > akhir);

		pengunaan = akhir - awal;
		System.out.println("penggunaan : " + pengunaan);
		if(pengunaan > 200){
			pengunaan -= 200;
			kos += 200 * 0.40;
		}else if(pengunaan < 200){
			kos += pengunaan * 0.40;
			pengunaan = 0;
		}
		if (pengunaan >= 100) {
			pengunaan -= 100;
			kos += 100 * 0.60;
		} else if (pengunaan < 100) {
			kos += pengunaan * 0.60;
			pengunaan = 0;
		}

		if (pengunaan >= 100) {
			pengunaan -= 100;
			kos += 100 * 0.80;
		} else if (pengunaan < 100) {
			kos += pengunaan * 0.80;
			pengunaan = 0;
		}

		if(pengunaan > 0){
			kos += pengunaan * 0.40;
		}

		System.out.println(kos);

					System.out.println("kira lagi? : ");
			char c;
			c = input.next()
		} while (condition);

	}
}
