
public class EmailFactory {

	public EmailFactory() {

	}

	public Email createNotification(String channel)
    {
        if (channel == null || channel.isEmpty())
            return null;
        if ("DE".equals(channel)) {
            return new DuplicateEmail();
        }
        else if ("CE".equals(channel)) {
            return new CensorEmail();
        }

        return null;
    }
}
