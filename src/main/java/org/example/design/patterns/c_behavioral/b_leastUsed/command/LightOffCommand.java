package org.example.design.patterns.c_behavioral.b_leastUsed.command;

class LightOffCommand implements Command {
	Light light;

	public LightOffCommand(Light light) {
		this.light = light;
	}
	public void execute() {
		light.off();
	}
}
