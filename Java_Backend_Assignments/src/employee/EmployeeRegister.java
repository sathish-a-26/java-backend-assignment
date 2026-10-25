
package employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Scanner;

public class EmployeeRegister {

    public void register(Scanner sc) {
        try {
            Connection con = DBConnection.getConnection();

            if (con == null) {
                System.out.println("Database connection failed");
                return;
            }

            System.out.println("Enter employee name:");
            String name = sc.nextLine();

            System.out.println("Enter employee salary:");
            double salary = sc.nextDouble();
            sc.nextLine();

            System.out.println("Create password:");
            String password = sc.nextLine();

            String query = "insert into employee (empname, empsalary, emppassword) values (?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(
                query, Statement.RETURN_GENERATED_KEYS
            );

            ps.setString(1, name);
            ps.setDouble(2, salary);
            ps.setString(3, password);

            int result = ps.executeUpdate();

            if (result > 0) {
                ResultSet rs = ps.getGeneratedKeys();

                if (rs.next()) {
                    System.out.println("Registration successful");
                    System.out.println("Your employee ID: " + rs.getInt(1));
                    System.out.println("Please remember your employee ID");
                }
                rs.close();
            }

            ps.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
