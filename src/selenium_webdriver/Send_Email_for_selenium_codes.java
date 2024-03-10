package selenium_webdriver;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.SimpleEmail;

public class Send_Email_for_selenium_codes {

	public static void main(String[] args) {
		
		//https://commons.apache.org/proper/commons-email/userguide.html
		//https://mvnrepository.com/artifact/org.apache.commons/commons-email/1.5
		//https://support.google.com/a/answer/176600?hl=en#:~:text=filter%20suspicious%20messages.-,The%20fully%20qualified%20domain%20name%20of%20the%20SMTP%20service%20is,SSL%20and%20TLS%20protocols
		
		Email email = new SimpleEmail();
		
		//smtp.gmail.com
		email.setHostName("smtp.gmail.com");
		
		//On the device or in the app, for server address, enter smtp.gmail.com.For Port, enter one of the following numbers:
		//	For SSL, enter 465.For TLS, enter 587.
		email.setSmtpPort(465);
		
//		email.setAuthenticator(new DefaultAuthenticator("username@gmail", "password"));
//		
//		email.setSSLOnConnect(true);
//		
//		email.setFrom("username@gmail");
//		
//		email.setSubject("TestMail");
//		
//		email.setMsg("This is a test mail ... :-)");
//		
//		email.addTo("username@gmail");
//		
//		email.send();
		
		
		
		
		
	}

}
