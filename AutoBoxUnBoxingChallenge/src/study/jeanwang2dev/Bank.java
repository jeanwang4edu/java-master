package study.jeanwang2dev;

import java.util.ArrayList;

public class Bank {

    private final String name;
    private final ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    public void listBranches(){
        System.out.printf("There are %d branches of Bank %s%n", branches.size(), this.name);
        // for(int i = 0; i < branches.size(); i++){
        for (Branch branch : branches) {
            System.out.println("Branch " + branch.getName() );
        }
    }

    public void addBranch(String branchName){
        if( findBranch(branchName) == null){
            branches.add(new Branch(branchName));
        } else {
            System.out.println("there is already a branch exist with this name");
        }

    }

    public void addCustomerForBranch(String customerName, double initialAmount, String branchName){
        Branch branch = findBranch(branchName);
        if( branch != null ){
            branch.addCustomer(customerName, initialAmount);
        } else {
            System.out.printf("There isn't a branch with name %s exists. Customer not added.%n", branchName);
        }
    }

    public void addTransactionForCustomerAtBranch(Double amount, String customerName, String branchName){
        Branch branch = findBranch(branchName);
        if( branch != null ){
            branch.addCustomerTransaction(customerName, amount);
        } else {
            System.out.printf("There isn't a branch with name %s exists.%n", branchName);
        }
    }

    public void listBranchCustomers(String branchName, boolean showTransactions){
        Branch branch = findBranch(branchName);
        if( branch != null ){
            branch.listCustomerDetail(showTransactions);
        } else {
            System.out.printf("There isn't a branch with name %s exists.%n", branchName);
        }
    }


    private Branch findBranch(String name){
        for (Branch branch : branches) {
            if (branch.getName().equals(name)) {
                return branch;
            }
        }
        return null;
    }
}
