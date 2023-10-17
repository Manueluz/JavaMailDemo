package mail;

import javax.mail.Message;

public class Mail {
	private final Message.RecipientType MESSAGE_TYPE = Message.RecipientType.TO;
	
	private String title;
	private String text;
	private String destinatarian;
	
	public Mail(String destinatarian) {
		setDestinatarian(destinatarian);
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getDestinatarian() {
		return destinatarian;
	}
	public void setDestinatarian(String destinatarian) {
		this.destinatarian = destinatarian;
	}
	public Message.RecipientType getMessageType() {
		return MESSAGE_TYPE;
	}
}
