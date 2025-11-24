import java.util.Scanner;

public class Main {

    public static double bmi(double berat,double tinggi){
        // System.out.println(berat + tinggi);
        double _bmi = (tinggi / 100);
        _bmi = Math.pow(_bmi,2);
        _bmi = berat / _bmi;
        System.out.printf("%,.2f", _bmi);
        System.out.println("");
        return _bmi;
    }

    public static void semak(double _bmi){
        if(_bmi < 20){
            System.out.println("You are underweight!");
        }else if(_bmi >= 20 || _bmi < 25){
            System.out.println("You are normal!");

        }else if(_bmi >= 25){
            System.out.println("You are obese!");

        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Sila masukkan berat (kg) : ");
        double berat = input.nextDouble();
        System.out.print("Sila masukkan tinggi (cm) : ");
        double tinggi = input.nextDouble();
        semak(bmi(berat,tinggi));
    }
    
}