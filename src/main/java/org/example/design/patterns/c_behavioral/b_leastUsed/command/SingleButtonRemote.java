package org.example.design.patterns.c_behavioral.b_leastUsed.command;

class SingleButtonRemote {
	Command command; 	//only one button

	public void setCommand(Command command) {
		this.command = command;
	}

	public void pressTheButton() {
		command.execute();
	}
}
