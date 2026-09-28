package oops_assignments;

public class PaymentDemo1 {

    public static void main(String[] args) {

        CreditCardPay c = new CreditCardPay();
        c.makePayment();

        UPIPay u = new UPIPay();
        u.makePayment();

    }
}
