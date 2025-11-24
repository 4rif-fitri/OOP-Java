class Customer{

    private String name;
    private String address;
    SavingAccount account;

    public Customer(String name, String address){
        this.name = name;
        this.address = address;
    }

    public void setAccount(SavingAccount acct){
        this.account = acct;
    }

    public SavingAccount getAccount() {
        return account;
    }

    public void displayCustomerInfo(){
        System.out.println("Name : " + this.name);
        System.out.println("Address : " + this.address);
        account.displayAccountInfo();
    }

}