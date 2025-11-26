
import java.util.Scanner;
// ARIF FITRI D032410321 S2G2 

public class Courier {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char c = 'y';

        do {
            double jarak = 0, berat = 0, rate = 0, kos = 0, cap_jarak = 0;
            do {
                try {
                    System.out.print("Weight of package (Kg) : ");
                    berat = input.nextDouble();
                    if (berat < 0.1 || berat > 15) {
                        System.out.println("Sorry invalid weight");
                    } else {
                        break;
                    }

                } catch (Exception e) {
                    System.out.println("Sorry input must be number!");
                    input.next();
                    berat = -10;
                }

            } while (berat < 0.1 || berat > 15);

            do {

                try {
                    System.out.print("Distance of delivert (Km) : ");
                    jarak = input.nextDouble();
                    cap_jarak = jarak;

                    if (jarak > 2000 || jarak < 1) {
                        System.out.println("Sorry invalid Distance");
                    } else {
                        break;
                    }

                } catch (Exception e) {
                    System.out.println("Sorry input must be number!");
                    input.next();
                    jarak = -10;
                }

            } while (jarak > 2000 || jarak < 1);

            if (berat >= 0.1 && berat <= 5.0) {

                if (jarak > 0) {
                    rate = 10;
                    kos += rate;
                    jarak -= 50;
                    // System.out.println("jarak " + jarak);
                }

                if (jarak > 0) {
                    rate = 15;
                    kos += rate;
                    jarak -= 50;
                    // System.out.println("jarak " + jarak);
                }

                if (jarak > 0) {
                    do {
                        rate = 20;
                        kos += rate;
                        jarak -= 50;
                    } while (jarak > 0);
                }

            } else{
                // System.out.println("5KILO");
                if (jarak > 0) {
                    rate = 20;
                    kos += rate;
                    jarak -= 50;
                    // System.out.println("jarak " + jarak);
                }

                if (jarak > 0) {
                    rate = 30;
                    kos += rate;
                    jarak -= 50;
                    // System.out.println("jarak " + jarak);
                }

                if (jarak > 0) {
                    do {
                        rate = 40;
                        kos += rate;
                        jarak -= 50;
                    } while (jarak > 0);
                }
            }

            System.out.println("\n\n==== TRANSACTION SUMMARY ====\n");
            System.out.printf("Weight of package\t: %.2f kg", berat);
            System.out.printf("\nDistance of Delivery\t: %.2f km", cap_jarak);
            System.out.printf("\nTotal courier charge\t: RM %.2f", kos);

            System.out.println("\nDo you wish to continue? Enter any key to com continue.");
            System.out.println("\t\t\t Enter 'N' or 'n' to exit");
            c = input.next().charAt(0);

            if (c == 'n' || c == 'N') {
                break;
            }

        } while (true);

    }

}
