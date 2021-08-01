import java.util.ArrayList;

public abstract class Account implements Comparable<Account>{

	private AuthenticationStatus authenticationStatus;
	private User user;
	private ArrayList<Insurance> insurances;
	
	public abstract void addInsurance();
	
	public final void showUserInfo() {
		
	}
	
	public void login(String email, String password) throws InvalidAuthenticationException {
		if(this.user.getEmail().equals(email) && this.user.getPassword().equals(password)) {
			this.authenticationStatus = AuthenticationStatus.SUCCESS;
		}else {
			this.authenticationStatus = AuthenticationStatus.FAIL;
			throw new InvalidAuthenticationException("Authentication failed!");
		}
	}
	
	public void addAddress() {
		
	}
	
	public void deleteAddress() {
		
	}
	
	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	
	public AuthenticationStatus getAuthenticationStatus() {
		return authenticationStatus;
	}

	public void setAuthenticationStatus(AuthenticationStatus authenticationStatus) {
		this.authenticationStatus = authenticationStatus;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public ArrayList<Insurance> getInsurances() {
		return insurances;
	}

	public void setInsurances(ArrayList<Insurance> insurances) {
		this.insurances = insurances;
	}
}
