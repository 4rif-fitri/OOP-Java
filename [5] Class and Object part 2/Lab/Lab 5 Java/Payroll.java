import java.util.Scanner;

public class Payroll {
    private String name;
    private int id;
    private double rate;
    private int hour;

    Payroll(String name, int id){
        this.name = name;
        this.id = id;
    }

    public double pay(){
        return this.hour * this.rate;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        int id,hour;
        double rate;

        System.out.print("\nWhat is employee name? ");
        name = input.next();

        System.out.print("What is employee id? ");
        id = input.nextInt();

        System.out.print("What is hourly pay rate? ");
        rate = input.nextDouble();

        System.out.print("How manay number of hours worked? ");
        hour = input.nextInt();
        Payroll orang1 = new Payroll(name, id);
        
        
        orang1.hour = hour;
        orang1.rate = rate;
        
        System.out.println("");
        System.out.println("Employee name  " + name);
        System.out.println("Employee id  " + id);
        System.out.println("The amount of gross pay eraned for " + hour + " of working : RM " + orang1.pay() + "\n");
    }

}
