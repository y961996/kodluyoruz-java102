import java.util.Set;
import java.util.TreeSet;

public class AccountManager {

	private Set<Account> accounts = new TreeSet<>();
	
	public Account login(String email, String password) {
		for(Account a : accounts) {
			if(a.getUser().getEmail().equals(email) && a.getUser().getPassword().equals(password)) {
				try {
					a.login(email, password);
					return a;
				} catch (InvalidAuthenticationException e) {
					e.printStackTrace();
				}
			}
		}
		return null;
	}
}
