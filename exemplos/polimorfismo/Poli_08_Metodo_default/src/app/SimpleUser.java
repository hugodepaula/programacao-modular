package app;

public class SimpleUser implements User {

	private int id;

	public SimpleUser(int id) {
		this.id = id;
	}

	@Override
	public int getId() {
		return this.id;
	}

}
