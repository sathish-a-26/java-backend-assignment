package oops_assignments;

class BankChild extends SecureBank {

    void display() {

        System.out.println("Account Holder: " + accountHolder);

        System.out.println("Bank Name: " + bankName);

        System.out.println("Account Type: " + accountType);

        // System.out.println(balance);
    }
}