
public class CensorEmail implements Email{

	public CensorEmail() {
	}
	public void createEmail() {

		System.out.println("Censor Email is created");
	}
	@Override
	public void sentEmail() {
	
		System.out.println("Censor Email sent !!!");
	}
}
