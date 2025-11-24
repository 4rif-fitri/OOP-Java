public class SavingAccount {
    private String accountId;
    private double balance;

    public SavingAccount(String accountId, double balance){
        this.accountId = accountId;
        this.balance = balance;
    }

    public void setAccountId(String accountId){
        this.accountId = accountId;
    }

    public String getAccountId(){
        return this.accountId;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }

    public void withdraw(double amount){
        
        if(this.balance <= amount){
            System.out.println("Insufficient balance");
        }else{
            this.balance -= amount;
            System.out.println("Withdraw : " + amount);
            System.out.println("Balance :" + this.balance);
        }
    } 

    public void deposit(double amount){
        if(amount <= 1){
            System.out.println("Insufficient amount");
        }else{
            this.balance += amount;
            System.out.println("Deposit : " + amount);
            System.out.println("Balance :" + this.balance);
        }
    }

    public void displayAccountInfo(){
        System.out.println("AccountId : " + this.accountId);
        System.out.println("Balance : " + this.balance);
    }
}
