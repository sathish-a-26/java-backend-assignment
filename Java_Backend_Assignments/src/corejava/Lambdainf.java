package corejava;




interface Calculator {
    int add(int a,int b);
}

public class Lambdainf {
    public static void main(String[] args) {
        Calculator c=(a,b)->a+b;

        System.out.println("Add:"+c.add(78,65));
    }
}
