import java.util.Scanner;

public class Bill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sebelum_ni;
        double bacaan = 0;
        double kos = 0;
        double sekarang = 0;
        do {
            do {
                System.out.print("Bacaan meter sekarang (kWh) : ");
                sekarang = input.nextDouble();
                if(sekarang < 0){
                    System.out.println("Tidak boleh negatif");
                }
            } while (sekarang < 0);

            do {
                System.out.print("Bacaan meter sebelum ini (kWh) : ");
                sebelum_ni = input.nextDouble();
                if(sebelum_ni < 0){
                    System.out.println("Tidak boleh negatif");
                }
            } while (sebelum_ni < 0);

            
            if(sekarang < sebelum_ni){
                System.out.println("Ada sesuatu yang salah, Kira masukkan semula");
            }else{
                bacaan = sekarang - sebelum_ni; 
            }
        } while (sekarang < sebelum_ni);
        System.out.println("");
        System.out.println("Electric consumption (kWh) : " + bacaan);

        if(bacaan >= 200 ){
            bacaan -= 200;
            kos += 200 * 0.4;
        }else{
            kos += bacaan * 0.4;
            bacaan = 0;
        }

        if(bacaan >= 100 ){
            bacaan -= 100;
            kos += 100 * 0.6;
        }else{
            kos += bacaan * 0.6;
            bacaan = 0;
        }

        if(bacaan >= 100 ){
            bacaan -= 100;
            kos += 100 * 0.8;
        }else{
            kos += bacaan * 0.8;
            bacaan = 0;
        }

        kos += bacaan * 0.4;
        bacaan = 0;

        System.out.println("RM : " + kos);

    }
}
