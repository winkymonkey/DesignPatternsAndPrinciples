package org.example.design.patterns.c_behavioral.b_leastUsed.mediator;

public class UserImpl implements User {
	protected ChatMediator mediator;
	protected String name;

	public UserImpl(ChatMediator med, String name) {
		this.mediator = med;
		this.name = name;
	}

	@Override
	public void send(String msg) {
		System.out.println(this.name + ": Sending: " + msg);
		mediator.sendMessage(msg, this);
	}

	@Override
	public void receive(String msg) {
		System.out.println(this.name + ": Received: " + msg);
	}
}
