package main;

import app.AdminUser;
import app.SimpleUser;
import app.User;

public class Aplicacao {

	public static void main(String[] args) {

		User[] users = new User[10];
		
		for (int i = 0; i < 9; i +=2) {
			users[i] = new SimpleUser(i);
			users[i+1] = new AdminUser(i+1, 2*(i+1));
		}

		for (int i = 0; i < 10; i++) {
			System.out.println("User id = " + users[i].getId() + 
					"  adminId = " + users[i].getAdminId());
		}

	
	}

}
