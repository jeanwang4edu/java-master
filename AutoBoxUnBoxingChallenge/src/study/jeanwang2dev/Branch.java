package study.jeanwang2dev;

import java.util.ArrayList;

public class Branch {

    private final String name;
    private final ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }


    public void addCustomer(String customerName, double intialAmount){
        if( findCustomer(customerName) == null){
            customers.add(new Customer(customerName, intialAmount));
        } else {
            System.out.printf("customer with the name %s already exists%n", customerName);
        }

    }

    public void addCustomerTransaction(String customerName, double amount){
        Customer existingCustomer = findCustomer(customerName);
        if( existingCustomer != null ){
            existingCustomer.addTransaction(amount);
            System.out.printf("Transaction %5.2f added for customer %s%n", amount, customerName);
        } else{
            System.out.println("Customer not Found, Transaction not added.");
        }
    }

    private Customer findCustomer(String name){
        for (Customer checkedCustomer : customers) {
            if (checkedCustomer.getName().equals(name)) {
                return checkedCustomer;
            }
        }
        return null;
    }

    public void listCustomerDetail(boolean showTransactions){
        System.out.printf("There are %d customers in branch %s:%n", customers.size(), this.name);
        for(int i = 0; i < customers.size(); i++){
            System.out.printf("Customer %s [%d]%n", customers.get(i).getName(), i+1);
            if(showTransactions){
                listCustomerTransaction(customers.get(i).getName());
            }
        }
        System.out.println("*******************************");
    }

    private void listCustomerTransaction(String customerName){
//        System.out.printf("listing Transactions for Customer %s at branch %s%n",customerName, this.name);
        Customer existingCustomer = findCustomer(customerName);
        if( existingCustomer != null){
            existingCustomer.listTransactions();
        }
    }

}
