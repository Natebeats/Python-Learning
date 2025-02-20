/**
 * 
 */
package day1102.user;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 * @author fred
 *
 */
public class UserManagerController implements InterfaceUserManager {

	UserManager userManager ;  
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		UserManagerController userManagerController = new UserManagerController();
		SwingUtilities.invokeLater(() -> 
		userManagerController.initView());
		

	}

	private UserModel model;
	private UserSelectionModel modelMailSelection;
	
	
	private void initView() {
		userManager = new UserManager();
		
		UserManagerView view = new UserManagerView();
		model = view.getObservableList1();
		modelMailSelection = view.getObservableList2();
		initMailSelection();
		
		view.setInterfaceUserManager(this);
		view.getTextField1().setInputVerifier(getValidierer( "^[\\w._%+-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$"));
		view.getTextField2().setInputVerifier(getValidierer("^[a-zA-Z][a-zA-Z0-9_.-]{2,19}$"));
//		view.getPasswordField1().setInputVerifier(getValidierer("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$"));

		view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		view.setVisible(true);
	}
	

	private void initMailSelection() {
		
//		List<String> emails = userManager.alleUser.stream().map(p -> p.getEmail()).toList();
		
		List<String> mails = new ArrayList<String>();
		for(UserModel user :userManager.alleUser ) {
			mails.add(user.getEmail());
		}

		modelMailSelection.setAllEMails(mails);
		
	}


	@Override
	public boolean createUser() {
		System.out.println(model);
		userManager.createUser(new UserModel(model));
		cleanEingabe();
		initMailSelection();
		return true;
	}

	private void cleanEingabe() {
		model.setEmail("");
		model.setPassword("");
		model.setNickname("");
		
	}


	@Override
	public UserModel readUser() {
		UserModel user = readUserByEmail(model.getEmail());
		return user;
	}

	private UserModel readUserByEmail(String email ) {
		UserModel user = userManager.readUser(email);
		model.setEmail(user.getEmail());
		model.setPassword(user.getPassword());
		model.setNickname(user.getNickname());
		return model;

	}
	@Override
	public boolean updateUser() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteUser() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<UserModel> listUser() {
		// TODO Auto-generated method stub
		return null;
	}

	
	InputVerifier getValidierer(String regexpr){
		return new InputVerifier() {
            private final Pattern pattern = Pattern.compile(regexpr);

            @Override
            public boolean verify(JComponent input) {
                JTextField textField = (JTextField) input;
                String eingegebenerText = textField.getText();
                boolean isValid = pattern.matcher(eingegebenerText).matches();
                textField.setBackground(isValid ? Color.white : Color.red);
                return isValid;
            }
        };
	}


	@Override
	public boolean findSelectedUser() {
//		System.out.println(modelMailSelection.getSelectedEmail());
		readUserByEmail(modelMailSelection.getSelectedEmail());
		return true;
	}
	
}
