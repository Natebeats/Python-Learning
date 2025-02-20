package day1102.crud;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import day1102.user.UserModel;

public class PersistUsers2 <T> {
//	private List<UserModel> users = new ArrayList<>();
	private static final String FILE_PATH = "./users.json";
//	private Gson gson = new Gson();
	Gson gson = new GsonBuilder().setPrettyPrinting().create();
	public PersistUsers2() {
		loadUsers();
	}

	public void saveUsers(List<UserModel> users) {
		try (Writer writer = new FileWriter(FILE_PATH)) {
			gson.toJson(users, writer);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public List<UserModel>  loadUsers() {
		List<UserModel> users = null;
		try (Reader reader = new FileReader(FILE_PATH)) {
			users = gson.fromJson(reader, new TypeToken<T>() {
			}.getType());
			if (users == null) {
				users = new ArrayList<>();
			}
		} catch (IOException e) {
			users = new ArrayList<>();
		}
		return users;
	}

	
	public static void main(String[] args) {
		List<UserModel> users = new ArrayList<>();
//		users.add(new UserModel("fred","fred@pm-impact.de","password"));
//		users.add(new UserModel("fred","fred@pm-impact.de","password"));
		
		PersistUsers2 persistUsers = new PersistUsers2<>();
//		persistUsers.saveUsers(users);
		
		List<UserModel> users2 = new ArrayList<>();
		users2 = persistUsers.loadUsers();
		
		for(int i=0;i<users2.size();i++) {
			System.out.println(users2.get(i));
		}
		
	}
}
