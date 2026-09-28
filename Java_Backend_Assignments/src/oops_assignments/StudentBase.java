package oops_assignments;

public class StudentBase {

    public String name = "Sathish";

    int rollNo = 101;

    protected String college = "ABC Engineering College";

    private String password = "student123";

    public void showPassword() {
        System.out.println("Password: " + password);
    }
}