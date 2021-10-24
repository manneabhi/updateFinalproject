
public class SimpleObserver implements Observer{

	private String value;
	private Subject simpleSubject;
	
	public SimpleObserver(Subject simpleSubject) {
		this.simpleSubject = simpleSubject;
		simpleSubject.registerObserver(this);
	}
	
	public void display() {
		System.out.println("Hence!!! " + value);
	}

	@Override
	public void update(String val) {
		this.value = val;
		display();
	}
}
