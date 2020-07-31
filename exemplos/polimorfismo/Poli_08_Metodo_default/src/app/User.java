package app;

public interface User {
	public int getId();
	
	public default int getAdminId() {
		return -1;
	}
}
