package multithreading;




class OrderThread extends Thread {
    public void run() {
        System.out.println("Order process is  start");

        try {
            System.out.println("Thread is sleeping");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Order processing completed");
    }
}

public class Threadlifecycle {
    public static void main(String[] args) throws InterruptedException {
        OrderThread t1 = new OrderThread();

        System.out.println("state:"+ t1.getState());

        t1.start();

        Thread.sleep(500);
        System.out.println("state:"+t1.getState());

        t1.join();
        System.out.println("state:"+t1.getState());
    }
}
