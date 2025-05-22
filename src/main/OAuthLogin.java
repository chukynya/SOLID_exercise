package main;

public class OAuthLogin implements ILogin {
	private String token;
	
	public OAuthLogin(String token) {
		this.token = token;
	}

	@Override
	public int authenticate(String username, String token) {
		return this.token.equals(token) ? 0 : -1;
	}

}
