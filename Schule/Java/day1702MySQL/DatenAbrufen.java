package day1702MySQL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatenAbrufen {
    private static final String URL = "jdbc:mysql://localhost:3307/meine_datenbank";
    private static final String USER = "schulung";
    private static final String PASSWORD = "wuV7_mV2VUL";

    public static void main(String[] args) {
        String sql = "SELECT * FROM nutzer";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                System.out.println(id + " | " + name + " | " + email);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}