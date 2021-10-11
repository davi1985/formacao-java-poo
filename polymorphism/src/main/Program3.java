package main;

import inheritance.Admin;
import inheritance.Client;
import inheritance.InternSystem;
import inheritance.Manager;

public class Program3 {

	public static void main(String[] args) {
		Manager manager = new Manager();
		manager.setPassword(222);

		Admin admin = new Admin();
		admin.setPassword(223);

		Client client = new Client();
		client.setPassword(222);

		InternSystem system = new InternSystem();
		system.auth(manager);
		system.auth(admin);
		system.auth(client);
	}

}
