package condition;



import java.util.Scanner;

public class GradeCalculationDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your mark: ");
        int mark = sc.nextInt();

        if (mark >= 90 && mark <= 100) {
            System.out.println("A Grade");
        } 
        else if (mark >= 75) {
            System.out.println("B Grade");
        } 
        else if (mark >= 50) {
            System.out.println("C Grade");
        } 
        else if (mark >= 40) {
            System.out.println("D Grade");
        } 
        else {
            System.out.println("Fail");
        }
    }
}