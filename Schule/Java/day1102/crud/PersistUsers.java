package day1102.crud;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import day1102.user.UserModel;

public class PersistUsers {
	private List<UserModel> users = new ArrayList<>();
	private static final String FILE_PATH = "users.json";
	private Gson gson = new Gson();

	public PersistUsers() {
		loadUsers();
	}

	public void saveUsers() {
		try (Writer writer = new FileWriter(FILE_PATH)) {
			gson.toJson(users, writer);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void loadUsers() {
		List<UserModel> users = null;
		try (Reader reader = new FileReader(FILE_PATH)) {
			users = gson.fromJson(reader, new TypeToken<List<UserModel>>() {
			}.getType());
			if (users == null) {
				users = new ArrayList<>();
			}
		} catch (IOException e) {
			users = new ArrayList<>();
		}
	}

	public List<UserModel> getUsers() {
		return users;
	}
}
