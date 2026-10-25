
package employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class EmployeeLogin {

    public int login(Scanner sc) {
        try {
            Connection con = DBConnection.getConnection();

            if (con == null) {
                System.out.println("Database connection failed");
                return -1;
            }

            System.out.println("Enter employee ID:");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter password:");
            String password = sc.nextLine();

            String query = "select * from employee where empid = ? and emppassword = ?";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, id);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                System.out.println("Login successful");
                System.out.println("Welcome " + rs.getString("empname"));

                rs.close();
                ps.close();
                con.close();

                return id;
            } else {
                System.out.println("Invalid employee ID or password");
            }

            rs.close();
            ps.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }

        return -1;
    }
}
