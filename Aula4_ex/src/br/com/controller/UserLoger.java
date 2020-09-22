package br.com.controller;

import br.com.model.User;

public class UserLoger {
	public boolean validationLoguin(String login, String password) {
		
		User user = dummyUser();
		
		return user.getLogin().equals(login)&&user.getPassword().equals(password);
	}
	
	public User dummyUser() {
		return new User("poo_user", "poo_pas");
	}
}
