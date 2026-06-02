import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCDemo {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/studentdb";
        String username = "YourUsername"; // change if needed
        String password = "YourPassword"; // change if needed

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con =
                    DriverManager.getConnection(
                            url,
                            username,
                            password
                    );

            Statement stmt =
                    con.createStatement();

            ResultSet rs =
                    stmt.executeQuery(
                            "SELECT * FROM students"
                    );

            while (rs.next()) {

                System.out.println(
                        "ID: " + rs.getInt("id")
                        + ", Name: " + rs.getString("name")
                        + ", Age: " + rs.getInt("age")
                );
            }

            rs.close();
            stmt.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}