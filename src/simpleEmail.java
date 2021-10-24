import java.util.Iterator;

public class simpleEmail extends emailClassComponent{
	String To;
	String From;
	String Subject;
	public simpleEmail(String to, String from, String subject) {
		super();
		To = to;
		From = from;
		Subject = subject;
	}
	public String getTo() {
		return To;
	}
	public void setTo(String to) {
		To = to;
	}
	public String getFrom() {
		return From;
	}
	public void setFrom(String from) {
		From = from;
	}
	public String getSubject() {
		return Subject;
	}
	public void setSubject(String subject) {
		Subject = subject;
	}
	public void print()
	{
		
		System.out.println( "To: " + getTo() + "\n"
			+ "From: " + getFrom() + "\n"
			+ "Subject: " + getSubject()) ;
		
	}
}
