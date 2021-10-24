import java.util.Scanner;

public class MainClass {

	  public static void main(String args[]){  
		  
		System.out.println("------------------------------------");
		System.out.println("Welcome to Email Notification System");
		System.out.println("------------------------------------");
		String to;
		String from;
		String subject;
		
		Scanner s = new Scanner(System.in);
		System.out.println("To:");
		to = s.nextLine();
		System.out.println("From:");
		from = s.nextLine();
		System.out.println("Subject:");
		subject = s.nextLine();

		emailClass e = new emailClass(to, from, subject);
		emailClass e1 = new emailClass("abc123@gmail.com", "xyz123@gmail.com", "Hello");
		emailClassComponent e2 = new emailClass("abcd123@gmail.com", "wxyz123@gmail.com", "Hello");
		emailClassComponent allMails = new emailClass("all sent mails to", "all recieve emails from", "All emails");

		allMails.add(e1);
		allMails.add(e2);

		e1.add(new simpleEmail("hello123@gmail.com", "hi123@gmail.com", "Hello"));
		allMails.print();
		// Factory design pattern
		EmailFactory factory = new EmailFactory();
        Email email = factory.createNotification("DE");
        email.createEmail();
        email.sentEmail();
        
        Email email1 = factory.createNotification("CE");
        email1.createEmail();
        email1.sentEmail();

		// Observer design pattern
        SimpleSubject simpleSubject = new SimpleSubject();    	
		SimpleObserver simpleObserver = new SimpleObserver(simpleSubject);
		simpleSubject.setValue("Email sent successfully");	
		simpleSubject.removeObserver(simpleObserver);
		
		// Command design pattern
		SimpleCommand co = new SimpleCommand();
		Notification  n = new Notification();
		EmailNotification en = new EmailNotification(n);
		co.setCommand(en);
		co.buttonWasPressed();
		
		PushNotification pn = new PushNotification(n);
		co.setCommand(pn);
		co.buttonWasPressed();
		// Observer design pattern
		SimpleSubject simpleSubject1 = new SimpleSubject();    	
		SimpleObserver simpleObserver1 = new SimpleObserver(simpleSubject1);
		simpleSubject1.setValue("Email receive successfully");	
		simpleSubject1.removeObserver(simpleObserver1);
	}

}
