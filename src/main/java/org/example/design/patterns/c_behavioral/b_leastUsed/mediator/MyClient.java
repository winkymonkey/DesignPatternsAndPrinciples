package org.example.design.patterns.c_behavioral.b_leastUsed.mediator;

public class MyClient {
	public static void main(String[] args) {
		ChatMediator mediator = new ChatMediatorImpl();
		User user1 = new UserImpl(mediator, "Tom");
		User user2 = new UserImpl(mediator, "Johnny");
		User user3 = new UserImpl(mediator, "Jack");
		User user4 = new UserImpl(mediator, "Johnson");
		
		mediator.addUser(user1);
		mediator.addUser(user2);
		mediator.addUser(user3);
		mediator.addUser(user4);

		user1.send("Hi All");
	}
}
