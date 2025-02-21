package day2102;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import day2002.InterfaceUserManager;
import day2002.User;

/**
 * Singleton-Klasse zur Verwaltung der Datenbankverbindung
 */
class DatabaseConnection {
	private static final String URL = "jdbc:mysql://localhost:3307/meine_datenbank";
	private static final String USER = "schulung";
	private static final String PASSWORD = "wuV7_mV2VUL";

	private static Connection connection;

	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			throw new RuntimeException("Fehler bei der Initialisierung der Datenbankverbindung");
		}
	}

	public static Connection getConnection() {
		return connection;
	}

	public static void closeConnection() {
		try {
			if (connection != null) {
				connection.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

/**
 * Data Access Object (DAO) für User-CRUD-Operationen
 */
public class UserManagerJDBC implements InterfaceUserManager {

	public UserManagerJDBC() {
	}

	public void createDB() {
		String sql = "CREATE TABLE IF NOT EXISTS users (" 
				+ "id INT AUTO_INCREMENT PRIMARY KEY, "
				+ "name VARCHAR(100), " 
				+ "email VARCHAR(100) UNIQUE, " 
				+ "passwort VARCHAR(50))";
		Connection conn = DatabaseConnection.getConnection();
		try (Statement stmt = conn.createStatement()) {
			stmt.execute(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		String sql2 = "DELETE FROM users ";
		try (PreparedStatement stmt = DatabaseConnection.getConnection().prepareStatement(sql2)) {
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// Create (Insert)
	public void addUser(User user) {
		String sql = "INSERT INTO users (email, name, passwort) VALUES (?, ?, ?)";
		try (PreparedStatement stmt = DatabaseConnection.getConnection().prepareStatement(sql)) {
			stmt.setString(1, user.getEmail());
			stmt.setString(2, user.getName());
			stmt.setString(3, user.getPasswort());
			int result = stmt.executeUpdate();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	// Read (Retrieve all users)
	public List<User> readUsers() {
		List<User> users = new ArrayList<>();
		String sql = "SELECT * FROM users";
		try (Statement stmt = DatabaseConnection.getConnection().createStatement();
				ResultSet rs = stmt.executeQuery(sql)) {
			while (rs.next()) {
				users.add(new User(rs.getString("email"), rs.getString("name"), rs.getString("passwort")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return users;
	}

	// Update
	public void updateUser(User user) {
		String sql = "UPDATE users SET  name = ?, passwort = ? WHERE email = ?";
		try (PreparedStatement stmt = DatabaseConnection.getConnection().prepareStatement(sql)) {
			stmt.setString(1, user.getName());
			stmt.setString(2, user.getPasswort());
			stmt.setString(3, user.getEmail());
			int b = stmt.executeUpdate();
			if(b==0) {
				throw new RuntimeException();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// Delete
	public void deleteUser(String email) {
		String sql = "DELETE FROM users WHERE email = ?";
		try (PreparedStatement stmt = DatabaseConnection.getConnection().prepareStatement(sql)) {
			stmt.setString(1, email);
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public User findUser(String email) {
		List<User> users = readUsers();
		List<User> filteredUser = users.stream().filter(p -> p.getEmail().equals(email)).toList();
		switch (filteredUser.size()) {
		case 1:
			return filteredUser.get(0);
		default:
			return null;
		}
	}
}
