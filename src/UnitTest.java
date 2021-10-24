import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UnitTest {

	@Test
	void test() throws
    Throwable{
		//Test composite Design Pattern
		emailClass e1 = new emailClass("abc123@gmail.com", "xyz123@gmail.com", "Hello");
		emailClassComponent e2 = new emailClass("abcd123@gmail.com", "wxyz123@gmail.com", "Hello");
		emailClassComponent allMails = new emailClass("all sent mails to", "all recieve emails from", "All emails");

		allMails.add(e1);
		allMails.add(e2);

		e1.add(new simpleEmail("hello123@gmail.com", "hi123@gmail.com", "Hello"));
		allMails.print();

		// Test factory pattern
		// factory pattern create Duplicate Email
		EmailFactory factory = new EmailFactory();		
        Email email = factory.createNotification("DE");
        email.createEmail();
        email.sentEmail();
		// factory pattern create Censor Email
        Email email1 = factory.createNotification("CE");
        email1.createEmail();
        email1.sentEmail();
        
        // Test Observer Pattern to sent email
        SimpleSubject simpleSubject = new SimpleSubject();    	
		SimpleObserver simpleObserver = new SimpleObserver(simpleSubject);
		simpleSubject.setValue("Email sent successfully");	
		simpleSubject.removeObserver(simpleObserver);
		
		// Test Command Pattern
		SimpleCommand co = new SimpleCommand();
		Notification  n = new Notification();
		// Command to send Email notification
		EmailNotification en = new EmailNotification(n);
		co.setCommand(en);
		co.buttonWasPressed();
		// Command to send Push notification
		PushNotification pn = new PushNotification(n);
		co.setCommand(pn);
		co.buttonWasPressed();
		
        // Test Observer Pattern to receive email
		SimpleSubject simpleSubject1 = new SimpleSubject();    	
		SimpleObserver simpleObserver1 = new SimpleObserver(simpleSubject1);
		simpleSubject1.setValue("Email receive successfully");	
		simpleSubject1.removeObserver(simpleObserver1);
		
		fail("Not yet implemented");
	}

}
