package study.jeanwang2dev;

public class VipCustomer {

    private String name;
    private double credit_limit;
    private String email_address;

    public VipCustomer(String name, double credit_limit, String email_address) {
        this.name = name;
        this.credit_limit = credit_limit;
        this.email_address = email_address;
    }

    public VipCustomer(){
        this("default name", 1000.99d, "default@email.com");
    }

    public VipCustomer(double credit_limit) {
        this("default name", credit_limit, "unknown@email.com");
    }

    public String getName() {
        return name;
    }

    public double getCredit_limit() {
        return credit_limit;
    }

    public String getEmail_address() {
        return email_address;
    }
}
