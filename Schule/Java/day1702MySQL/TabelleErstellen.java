/**
 * 
 */
package day1702MySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author fred
 *
 */
public class TabelleErstellen {
    private static final String URL = "jdbc:mysql://localhost:3307/meine_datenbank";
    private static final String USER = "schulung";
    private static final String PASSWORD = "wuV7_mV2VUL";

    public static void main(String[] args) {
        String sql = "CREATE TABLE IF NOT EXISTS nutzer ("
                   + "id INT AUTO_INCREMENT PRIMARY KEY, "
                   + "name VARCHAR(100), "
                   + "email VARCHAR(100) UNIQUE)";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
            System.out.println("Tabelle wurde erstellt.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}