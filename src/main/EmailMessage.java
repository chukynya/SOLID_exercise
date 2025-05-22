package main;

public class EmailMessage extends Message {
	public EmailMessage(ILogin emailLogin, String sender, String recipient, String content) {
		super(emailLogin, sender, recipient, content);
	}

	@Override
	public void send(String username, String password) {
		if(getLogin().authenticate(username, password) == 0) {
			System.out.printf("Email sent from %s to %s: %s\n", getSender(), getRecipient(), getContent());
		} else {
			System.out.println("Email authentication failed for user: " + username);
		};
	}

}
