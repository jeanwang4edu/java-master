package study.jeanwang2dev;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("JPMorgan");

        bank.addBranch("Maple");
        bank.addBranch("Main Street");

        bank.listBranches();

        bank.addCustomerForBranch("Jane", 50d, "Maple");
        bank.addCustomerForBranch("David", 100.45, "Maple");
        bank.addCustomerForBranch("John", 23.78, "Main Street");
        bank.addCustomerForBranch("Kate", 1000d, "Main Street");

        bank.addTransactionForCustomerAtBranch(-20.45, "Jane", "Maple");
        bank.addTransactionForCustomerAtBranch(1800.99, "Jane", "Maple");
        bank.addTransactionForCustomerAtBranch(500.99, "Jane", "Maple");

        bank.addTransactionForCustomerAtBranch(-20.45, "David", "Maple");
        bank.addTransactionForCustomerAtBranch(120.45, "David", "Main Street");
        bank.addTransactionForCustomerAtBranch(620.45, "John", "Main Street");
        bank.addTransactionForCustomerAtBranch(820.45, "Kate", "Main Street");

        bank.listBranchCustomers("Maple", true);
        bank.listBranchCustomers("Main Street",false);

    }
}
