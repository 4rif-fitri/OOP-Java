public class Main {

    public static void main(String[] args) {
        System.out.println("");
        Customer zainal = new Customer("Zainal", "Durian Tunggal");
        SavingAccount acc = new SavingAccount("1358923",1000);
        zainal.setAccount(acc);
        zainal.displayCustomerInfo();
        System.out.println("");

        acc.deposit(0);
        System.out.println("");
        
        acc.withdraw(1000);
        System.out.println("");
    }

}