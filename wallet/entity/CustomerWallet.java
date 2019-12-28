package wallet.entity;

public class CustomerWallet {
    private String phoneNo;
    private String name;
    private double balance;

    public CustomerWallet() {
    }

    public CustomerWallet(String phoneNo, String name, double balance) {
        this.phoneNo = phoneNo;
        this.name = name;
        this.balance = balance;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void transferAmount(CustomerWallet c, double amount){
        if(amount < balance){
            balance = balance - amount;
            double bal = c.getBalance();
            bal = bal + amount;
            c.setBalance(bal);
            System.out.println("Amount " + amount + " transferred from " + name + " to " + c.getName());
        }
        else {
            System.out.println("Insufficient balance to transfer");
        }
    }



}
