import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class StudentDAO {

    private static final String URL =
            "jdbc:mysql://localhost:3306/studentdb";

    private static final String USERNAME = "YourUsername"; // change if needed

    private static final String PASSWORD = "YourPassword"; // change if needed

    public void insertStudent(int id, String name, int age) {

        String query =
                "INSERT INTO students(id, name, age) VALUES(?, ?, ?)";

        try {
            Connection con =
                    DriverManager.getConnection(
                            URL,
                            USERNAME,
                            PASSWORD
                    );

            PreparedStatement ps =
                    con.prepareStatement(query);

            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setInt(3, age);

            int rows = ps.executeUpdate();

            System.out.println(
                    rows + " record inserted successfully."
            );

            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateStudent(int id, String name, int age) {

        String query =
                "UPDATE students SET name=?, age=? WHERE id=?";

        try {
            Connection con =
                    DriverManager.getConnection(
                            URL,
                            USERNAME,
                            PASSWORD
                    );

            PreparedStatement ps =
                    con.prepareStatement(query);

            ps.setString(1, name);
            ps.setInt(2, age);
            ps.setInt(3, id);

            int rows = ps.executeUpdate();

            System.out.println(
                    rows + " record updated successfully."
            );

            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        StudentDAO dao = new StudentDAO();

        // Insert a new student
        dao.insertStudent(4, "Aman", 22);

        // Update student details
        dao.updateStudent(4, "Aman Sharma", 23);
    }
}
