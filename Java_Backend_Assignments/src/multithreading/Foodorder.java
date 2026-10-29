package multithreading;



class Food {
    boolean ready=false;

    synchronized void collectFood() {
        while (!ready) {
            try {
                System.out.println("Customer is waiting");
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }

        System.out.println("Customer received food");
    }

    synchronized void prepareFood() {
        System.out.println("Chef is preparing food");
     ready=true;

        System.out.println("Chef prepared food");
        notify();
    }
}

public class Foodorder {
    public static void main(String[] args) throws InterruptedException {
        Food f=new Food();

	        Thread customer=new Thread(()->f.collectFood());
	        customer.start();

        Thread.sleep(1000);

        Thread chef = new Thread(()->f.prepareFood());
        chef.start();
    }
}