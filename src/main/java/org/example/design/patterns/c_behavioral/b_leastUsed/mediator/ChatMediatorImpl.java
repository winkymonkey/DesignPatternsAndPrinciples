package org.example.design.patterns.c_behavioral.b_leastUsed.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator {
	private List<User> allUsers = new ArrayList<>();

	public void addUser(User user) {
		this.allUsers.add(user);
	}

	public void sendMessage(String msg, User sender) {
		for (User user : this.allUsers) {
			if (user != sender) {
				user.receive(msg);
			}
		}
	}
}
