
public class EmailNotification implements Command {

	Notification n;
	public EmailNotification(Notification n) {
		this.n = n;
	}

	@Override
	public void execute() {

		n.email();
	}

}

