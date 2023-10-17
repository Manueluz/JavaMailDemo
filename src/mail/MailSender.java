package mail;

import java.util.Properties;

import javax.mail.*;
import javax.mail.Transport;
import javax.mail.internet.*;

public class MailSender {
	
	private Session session;
	private String user;
	private String pass;
	
	public MailSender(String user, String pass, String host, int port) {
		setupConfiguration(host, port);
		this.user = user;
		this.pass = pass;
	}
	
	
	public boolean SendEmail(Mail mail) {
		try {
			MimeMessage message = new MimeMessage(session);
			
			message.setRecipient(mail.getMessageType(), new InternetAddress(mail.getDestinatarian()));
			message.setFrom(user);
			message.setSubject(mail.getTitle());
			message.setText(mail.getText());
			//message.setContent(mail.getText(),"text/html");
			
			Transport.send(message);
			return true;
		}catch(MessagingException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	private void setupConfiguration(String host, int port) {
		Properties prop = System.getProperties();
		
		prop.put("mail.smtp.host", host);
        prop.put("mail.smtp.auth", "true");
		prop.put("mail.smtp.port", String.valueOf(port));
		prop.put("mail.smtp.starttls.enable", "true");
		
		session = Session.getDefaultInstance(prop, 
				new javax.mail.Authenticator() {
		            protected PasswordAuthentication getPasswordAuthentication() {
		                return new PasswordAuthentication(user, pass);
		            }
        	}
		);
	}
}
