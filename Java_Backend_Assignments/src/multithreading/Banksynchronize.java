package multithreading;




class BankAccount {
    int balance=5000;

    synchronized void withdraw(int amt) {
        if (balance >= amt) {
            System.out.println(Thread.currentThread().getName()
                    + "withdrawing"+amt);

            balance= balance-amt;

            System.out.println("Balance: " + balance);
        } else {
            System.out.println("insufficient balance for "
                    + Thread.currentThread().getName());
        }
    }
}

public class Banksynchronize { 
    public static void main(String[] args) {
        BankAccount b=new BankAccount();

        Thread t1 = new Thread(()->b.withdraw(4000),"Thread 1");
        Thread t2 = new Thread(()->b.withdraw(4000),"Thread 2");

        t1.start();
        t2.start();
    }
}