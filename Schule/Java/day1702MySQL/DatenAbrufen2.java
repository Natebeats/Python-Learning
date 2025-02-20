package day1702MySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatenAbrufen2 {
	private static final String URL = "jdbc:mysql://localhost:3307/meine_datenbank";
	private static final String USER = "schulung";
	private static final String PASSWORD = "wuV7_mV2VUL";

	public static void main(String[] args) {
		String sql = "SELECT * FROM nutzer where email = ? ";

		try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
				PreparedStatement pstmt = conn.prepareStatement(sql)) {

			// String-Wert für den Platzhalter setzen
			pstmt.setString(1, "max3@example.com");

			// Abfrage ausführen
			try (ResultSet rs = pstmt.executeQuery()) {
				while (rs.next()) {
					// Daten aus dem ResultSet auslesen
					int id = rs.getInt("id");
					String name = rs.getString("name");
					String email = rs.getString("email");

					System.out.println("ID: " + id + ", Name: " + name + ", Email: " + email);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}