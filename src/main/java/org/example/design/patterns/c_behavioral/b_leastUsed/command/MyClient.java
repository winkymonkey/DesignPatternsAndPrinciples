package org.example.design.patterns.c_behavioral.b_leastUsed.command;

public class MyClient {
	public static void main(String[] args) {
		SingleButtonRemote remote = new SingleButtonRemote();
		Light light = new Light();

		remote.setCommand(new LightOnCommand(light));
		remote.pressTheButton();
		remote.pressTheButton();
	}
}
