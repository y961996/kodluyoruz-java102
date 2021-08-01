import java.util.Scanner;

public class Main {

	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("Please enter your email address: ");
		String email = scanner.nextLine();
		System.out.print("Please enter your password: ");
		String password = scanner.nextLine();
		
		AccountManager accountManager = new AccountManager();
		accountManager.login(email, password);
	}
}
