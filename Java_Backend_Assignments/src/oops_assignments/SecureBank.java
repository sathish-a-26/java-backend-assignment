package oops_assignments;

public class SecureBank {

    private double balance = 50000;

    protected String accountHolder = "Sathish";

    public String bankName = "ABC Bank";

    String accountType = "Savings";

    public void showBalance() {
        System.out.println("Balance: " + balance);
    }
}