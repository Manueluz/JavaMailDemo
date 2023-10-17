package main;


import mail.*;
//import util.FileReader;

public class Main {
	private static final String USER = <Your email here>;
	private static final String PASS = <Access token here>;
	private static final String HOST = "smtp.gmail.com";
	private static final int PORT = 587;
	
	public static void main(String[] args) {
		
		MailSender sender = new MailSender(USER, PASS, HOST, PORT);
		
		Mail mail = new Mail(<Recipient Email Here>);
		
		mail.setTitle("Cats!");
		mail.setText("meowwww");
		
		sender.SendEmail(mail);
	}
}
