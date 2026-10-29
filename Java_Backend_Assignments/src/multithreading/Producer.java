package multithreading;




class Store {
    int product=0;

    synchronized void produce() {
        product++;

        System.out.println("Producer produced product");

        if (product==1) {
            notify();
        } else {
            notifyAll();
        }
    }

    synchronized void consume(String name) {
        while (product == 0) {
            try {
                System.out.println(name+"is waiting");
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }

        product--;

        System.out.println(name+"consumed product");
    }
}

public class Producer {
    public static void main(String[] args) throws InterruptedException {
        Store s = new Store();

        Thread c1=new Thread(()->s.consume("Consumer 1"));
        Thread c2=new Thread(()->s.consume("Consumer 2"));
        Thread c3=new Thread(()->s.consume("Consumer 3"));

        c1.start();
        c2.start();
        c3.start();

        Thread.sleep(1000);

        Thread p=new Thread(()-> {
            s.produce();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }

            s.produce();
        });

        p.start();
    }
}