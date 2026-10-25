
package employee;

import java.util.Scanner;

public class EmployeeMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        EmployeeRegister register = new EmployeeRegister();
        EmployeeLogin login = new EmployeeLogin();
        EmployeeOperations operations = new EmployeeOperations();

        int choice;

        do {
            System.out.println("\n1. Employee Register");
            System.out.println("2. Employee Login");
            System.out.println("3. Exit");
            System.out.println("Enter your choice:");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    register.register(sc);
                    break;

                case 2:
                    int employeeId = login.login(sc);

                    if (employeeId != -1) {
                        int option;

                        do {
                            System.out.println("\n--- Employee Menu ---");
                            System.out.println("1. Display All");
                            System.out.println("2. Display One");
                            System.out.println("3. Update");
                            System.out.println("4. Delete");
                            System.out.println("5. Logout");
                            System.out.println("Enter your choice:");

                            option = sc.nextInt();
                            sc.nextLine();

                            switch (option) {

                                case 1:
                                    operations.displayAll();
                                    break;

                                case 2:
                                    operations.displayOne(sc);
                                    break;

                                case 3:
                                    operations.update(sc);
                                    break;

                                case 4:
                                    operations.delete(sc);
                                    break;

                                case 5:
                                    System.out.println("Logged out successfully");
                                    break;

                                default:
                                    System.out.println("Invalid choice");
                            }

                        } while (option != 5);
                    }

                    break;

                case 3:
                    System.out.println("Program exited");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 3);

        sc.close();
    }
}
