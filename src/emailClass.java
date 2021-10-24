import java.util.ArrayList;
import java.util.Iterator;

public class emailClass extends emailClassComponent{

	ArrayList<emailClassComponent> menuComponents = new ArrayList<emailClassComponent>();

	String To;
	String From;
	String Subject;
	
	public emailClass(String to, String from, String subject) {
		super();
		To = to;
		From = from;
		Subject = subject;
	}
	public void add(emailClassComponent menuComponent) {
		menuComponents.add(menuComponent);
	}
 
	public void remove(emailClassComponent menuComponent) {
		menuComponents.remove(menuComponent);
	}
 
	public emailClassComponent getChild(int i) {
		return (emailClassComponent)menuComponents.get(i);
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
	
	System.out.println( "To: " + To + "\n"
		+ "From: " + From + "\n"
		+ "Subject: " + Subject) ;
	Iterator<emailClassComponent> iterator = menuComponents.iterator();
	while (iterator.hasNext()) {
		emailClassComponent menuComponent = 
			(emailClassComponent)iterator.next();
		menuComponent.print();
	}
}
	
}
