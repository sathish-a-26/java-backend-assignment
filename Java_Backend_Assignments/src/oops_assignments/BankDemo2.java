package oops_assignments;

public class BankDemo2 {

    public static void main(String[] args) {

        SecureBank b = new SecureBank();

        System.out.println("Bank Name: " + b.bankName);

        System.out.println("Account Type: " + b.accountType);

        b.showBalance();

        BankChild c = new BankChild();

        c.display();
    }
}