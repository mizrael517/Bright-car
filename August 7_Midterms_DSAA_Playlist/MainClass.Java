import java.sql.*;

public class MainClass {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/school";
        String username = "root";
        String password = "";

        try {
            // Connect to database
            Connection conn = DriverManager.getConnection(url, username, password);

            // SQL query
            String sql = "SELECT * FROM students";

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            System.out.println("===== STUDENT DATABASE =====");

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String course = rs.getString("course");

                System.out.println("ID: " + id);
                System.out.println("Name: " + name);
                System.out.println("Age: " + age);
                System.out.println("Course: " + course);
                System.out.println("---------------------------");
            }

            conn.close();

        } catch (SQLException e) {
            System.out.println("Database Error: " + e.getMessage());
        }
    }
}