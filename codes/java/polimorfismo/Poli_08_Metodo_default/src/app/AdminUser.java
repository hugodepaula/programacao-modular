package app;

public class AdminUser implements User {

	private int id;
	private int adminId;

	public AdminUser(int id, int adminId) {
		this.id = id;
		this.adminId = adminId;
	}

	@Override
	public int getId() {
		return this.id;
	}

	@Override
	public int getAdminId() {
		return this.adminId;
	}

	
	
}
