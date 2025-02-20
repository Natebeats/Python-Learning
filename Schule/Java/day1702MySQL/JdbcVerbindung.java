/**
 * 
 */
package day1702MySQL;

/**
 * @author fred
 *
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcVerbindung {
    private static final String URL = "jdbc:mysql://localhost:3307/meine_datenbank";
    private static final String USER = "schulung";
    private static final String PASSWORD = "wuV7_mV2VUL";

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            System.out.println("Verbindung erfolgreich!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}