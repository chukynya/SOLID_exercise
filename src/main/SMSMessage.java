package main;

public class SMSMessage extends Message {
	public SMSMessage(ILogin login, String sender, String recipient, String content) {
		super(login, sender, recipient, content);
	}

	@Override
	public void send(String username, String password) {
		if(getLogin().authenticate(username, password) == 0) {
			System.out.printf("SMS sent from %s to %s: %s\n", getSender(), getRecipient(), getContent());
		} else {
			System.out.println("SMS authentication failed for user: " + username);
		};
	}

}
