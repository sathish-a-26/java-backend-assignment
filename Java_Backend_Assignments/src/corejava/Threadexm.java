package corejava;


class Firstthread extends Thread {
    public void run() {
        for (int i=1;i<=5;i++) {
            System.out.println("first thread:"+i);
        }
    }
}

class Secondthread extends Thread {
    public void run() {
        for (int i=1; i<=5;i++) {
            System.out.println("second thread:"+i);
        }
    }
}

public class Threadexm {
    public static void main(String[] args) {
        Firstthread t1 = new Firstthread();
        Secondthread t2 = new Secondthread();

        t1.start();
        t2.start();
    }
}
