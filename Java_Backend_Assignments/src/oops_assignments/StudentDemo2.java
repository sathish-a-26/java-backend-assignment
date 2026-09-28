package oops_assignments;

public class StudentDemo2 {

    public static void main(String[] args) {

        CollegeStudentChild s = new CollegeStudentChild();

        s.displayDetails();

        s.showPassword();

        System.out.println("Name directly: " + s.name);

        System.out.println("Roll No directly: " + s.rollNo);

        System.out.println("College directly: " + s.college);

    }
}