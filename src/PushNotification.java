
public class PushNotification implements Command {

	Notification n;
	public PushNotification(Notification n) {
		this.n = n;
	}

	@Override
	public void execute() {

		n.push();
	}

}
