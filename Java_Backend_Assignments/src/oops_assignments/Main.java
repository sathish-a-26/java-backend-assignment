package oops_assignments;

public class Main {

    public static void main(String[] args) {

        Payment p;

        p = new UPIPayment();
        p.pay();

        p = new CardPayment();
        p.pay();

        p = new CashPayment();
        p.pay();
    }
}
