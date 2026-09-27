package oops_assignments;

public class Main1 {

    public static void main(String[] args) {

        Car car = new Car();

        car.setSpeed(100);

        System.out.println("Car Speed: " + car.getSpeed());

        car.start();
        car.stop();

        System.out.println();

        Bike bike = new Bike();

        bike.setSpeed(80);

        System.out.println("Bike Speed: " + bike.getSpeed());

        bike.start();
        bike.stop();

        System.out.println();

        Vehicle v;

        v = new Car();
        v.start();

        v = new Bike();
        v.start();
    }
}
