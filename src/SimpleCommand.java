
public class SimpleCommand {
	Command c;
	 
	public SimpleCommand() {}
 
	public void setCommand(Command command) {
		c = command;
	}
 
	public void buttonWasPressed() {
		c.execute();
	}
}