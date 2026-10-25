
package employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class EmployeeOperations {

    // Display all employees
    public void displayAll() {
        try {
            Connection con = DBConnection.getConnection();

            String query = "select * from employee";
            PreparedStatement ps = con.prepareStatement(query);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println("Employee ID: " + rs.getInt("empid"));
                System.out.println("Name: " + rs.getString("empname"));
                System.out.println("Salary: " + rs.getDouble("empsalary"));
                System.out.println("--------------------");
            }

            rs.close();
            ps.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // Display one employee
    public void displayOne(Scanner sc) {
        try {
            Connection con = DBConnection.getConnection();

            System.out.println("Enter employee ID:");
            int id = sc.nextInt();
            sc.nextLine();

            String query = "select * from employee where empid = ?";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                System.out.println("Employee ID: " + rs.getInt("empid"));
                System.out.println("Name: " + rs.getString("empname"));
                System.out.println("Salary: " + rs.getDouble("empsalary"));
            } else {
                System.out.println("Employee not found");
            }

            rs.close();
            ps.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // Update employee
    public void update(Scanner sc) {
        try {
            Connection con = DBConnection.getConnection();

            System.out.println("Enter employee ID to update:");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter new employee name:");
            String name = sc.nextLine();

            System.out.println("Enter new salary:");
            double salary = sc.nextDouble();
            sc.nextLine();

            System.out.println("Enter new password:");
            String password = sc.nextLine();

            String query = "update employee set empname = ?, empsalary = ?, emppassword = ? where empid = ?";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, name);
            ps.setDouble(2, salary);
            ps.setString(3, password);
            ps.setInt(4, id);

            int result = ps.executeUpdate();

            if (result > 0) {
                System.out.println("Employee updated successfully");
            } else {
                System.out.println("Employee not found");
            }

            ps.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // Delete employee
    public void delete(Scanner sc) {
        try {
            Connection con = DBConnection.getConnection();

            System.out.println("Enter employee ID to delete:");
            int id = sc.nextInt();
            sc.nextLine();

            String query = "delete from employee where empid = ?";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, id);

            int result = ps.executeUpdate();

            if (result > 0) {
                System.out.println("Employee deleted successfully");
            } else {
                System.out.println("Employee not found");
            }

            ps.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
