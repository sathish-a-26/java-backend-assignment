
package corejava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JDBCInsert {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.println("enter student iD:");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.println("enter student name:");
            String name = sc.nextLine();

            System.out.println("Enter marks:");
            int marks = sc.nextInt();

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/corejava",
                "root",
                "Sathish16052004"
            );

            String query = "insert into student values (?,?,?)";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setInt(3, marks);

            int result = ps.executeUpdate();

            if (result > 0) {
                System.out.println("student insert successfully");
            }

            ps.close();
            con.close();
            sc.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

