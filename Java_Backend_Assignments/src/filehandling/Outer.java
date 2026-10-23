package filehandling;


public class Outer {

    class Inner {
        void display() {
            System.out.println("student Name:Sathish");
            System.out.println("Roll Num:33");
        }
    }

    public static void main(String[] args) {

        Outer out = new Outer();

        Outer.Inner in = out.new Inner();

        in.display();
    }
}
