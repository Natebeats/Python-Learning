package day1702MySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatenEinfuegen {
    private static final String URL = "jdbc:mysql://localhost:3307/meine_datenbank";
    private static final String USER = "schulung";
    private static final String PASSWORD = "wuV7_mV2VUL";

    public static void main(String[] args) {
        String sql = "INSERT INTO nutzer (name, email) VALUES (?, ?)";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, "Max3 Mustermann");
            pstmt.setString(2, "max3@example.com");

            int rowsAffected = pstmt.executeUpdate();
            System.out.println(rowsAffected + " Datensatz eingefügt.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}