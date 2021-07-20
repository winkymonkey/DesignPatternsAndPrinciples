package org.example.design.patterns.c_behavioral.b_leastUsed.command;

class LightOnCommand implements Command {
	Light light;

	public LightOnCommand(Light light) {
		this.light = light;
	}
	public void execute() {
		light.on();
	}
}
