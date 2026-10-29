package multithreading;


class Exam {
    boolean published=false;

    synchronized void getResult(String name) {
        while (!published) {
            try {
                System.out.println(name+"is waiting");
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }

        System.out.println(name+"received result");
    }
 
    synchronized void publishResult() {
        System.out.println("Teacher publishes results");

        published=true;
        notifyAll();
    }
}

public class Studentresult {
	
    public static void main(String[] args) throws InterruptedException {
           Exam e=new Exam();

	        Thread s1=new Thread(()->e.getResult("Student 1"));
	        Thread s2=new Thread(()->e.getResult("Student 2"));
	        Thread s3=new Thread(()->e.getResult("Student 3"));

        s1.start();
        s2.start();
        s3.start();

        Thread.sleep(1000);
        e.publishResult();
    }
}