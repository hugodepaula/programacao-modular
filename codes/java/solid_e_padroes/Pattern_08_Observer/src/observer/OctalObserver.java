package observer;

public class OctalObserver extends Observer {

	public OctalObserver(Subject subject) {
		super(subject);
	}

	@Override
	public void update() {
		System.out.println("String octal: " + Integer.toOctalString(subject.getState()));
	}
}