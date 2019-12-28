package wallet.ui;

import wallet.entity.CustomerWallet;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CustomerWalletUi {
    public static void main(String[] args){

        CustomerWalletUi cui = new CustomerWalletUi();
        cui.execute();


    }
    Map<String, CustomerWallet> store = new HashMap<>();

    public void execute(){
        CustomerWallet c1 = new CustomerWallet("9446012026", "Ram", 1000);
        store.put("9446012026", c1);
        CustomerWallet c2 = new CustomerWallet("9495574686", "Raj", 300);
        store.put("9495574686", c2);

        c1.transferAmount(c2, 100);

        print();

        CustomerWallet fetched = fetchByPhone("9446012026");
        System.out.println("Customer details fetched using phone number:");
        System.out.println("Name: " + fetched.getName() + " Phone: " + fetched.getPhoneNo() +  " Balance: " + fetched.getBalance());




    }
    public void print(){
        Set<String> keys = store.keySet();
        for (String ph : keys  ) {
            CustomerWallet customer = store.get(ph);
            System.out.println("Name: " + customer.getName() + " Phone: " + customer.getPhoneNo() + " Balance: " + customer.getBalance());

        }


    }
    public CustomerWallet fetchByPhone(String phoneNo){
        CustomerWallet cust = store.get(phoneNo);
        return cust;

    }
}
