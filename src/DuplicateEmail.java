
public class DuplicateEmail  implements Email{

	public DuplicateEmail() {
		
	}

	@Override
	public void createEmail() {

		System.out.println("Duplicate Email is created");
	}

	@Override
	public void sentEmail() {
	
		System.out.println("Duplicate Email sent !!!");
	}

}
