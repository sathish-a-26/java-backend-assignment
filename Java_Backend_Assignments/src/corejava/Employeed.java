package corejava;



class Employee {
    void work() {
        System.out.println("Employee is working");
    }
}

class Developer extends Employee {
    @Override
    void work() {
        System.out.println("need an java");
    }
}

class Trainer extends Employee {
    @Override
    void work() {
        System.out.println("google MNC");
    }
}

public class Employeed {
    public static void main(String[] args) {
        Employee e;

        e = new Developer();
        e.work();

        e = new Trainer();
        e.work();
    }
}
