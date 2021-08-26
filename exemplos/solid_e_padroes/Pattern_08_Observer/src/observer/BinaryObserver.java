package observer;

public class BinaryObserver extends Observer {

	public BinaryObserver(Subject subject) {
		super(subject);
	}

	@Override
	public void update() {
		System.out.println("String binária: " + Integer.toBinaryString(subject.getState()));
	}
}