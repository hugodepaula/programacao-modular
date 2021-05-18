package observer;

public class HexaObserver extends Observer {

	public HexaObserver(Subject subject) {
		super(subject);
	}

	@Override
	public void update() {
		System.out.println("String hexadecimal: " + Integer.toHexString(subject.getState()).toUpperCase());
	}
}