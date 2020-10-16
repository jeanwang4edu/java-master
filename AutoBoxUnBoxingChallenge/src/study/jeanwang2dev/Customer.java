package study.jeanwang2dev;

import java.util.ArrayList;

public class Customer {

    private final String name;
    private final ArrayList<Double> transactions;

    public Customer(String name, double initialAmount) {
        this.name = name;
        this.transactions = new ArrayList<>();
        this.transactions.add(initialAmount);
    }

    public String getName() {
        return name;
    }

    public void addTransaction(double amount){
        transactions.add(amount);
    }

    public void listTransactions(){
        System.out.printf("Customer Name: %s %n", this.getName());
        for(int i = 0; i < transactions.size(); i++){
            if(i == 0){
                System.out.println("[" + (i+1) + "] " + "Initial Transaction: " + transactions.get(i).intValue());
            } else {
                System.out.println("[" +  (i+1) + "] Transaction: "  +  transactions.get(i).intValue());
            }
        }
    }

}
