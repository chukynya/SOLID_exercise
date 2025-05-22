package main;

import java.util.HashMap;
import java.util.Map;

public class BasicLogin implements ILogin {
	private Map<String, String> databases = new HashMap<String, String>();
	public BasicLogin(String username, String password) {
		databases.put(username, password);
	}
	
	@Override
	public int authenticate(String username, String password) {
//		String tempPassword = databases.get(username);
//		if(tempPassword == null) return -1;
//		return tempPassword.equals(password) ? 0 : -1;
		return databases.getOrDefault(username, "").equals(password) ? 0 : -1;
	}
}
