package org.example.design.patterns.b_structural.facade;


public class ServerFacade {
	private final Server server;

	ServerFacade(Server server) {
		this.server = server;
	}

	public void startServer() {
		server.startBooting();
		server.initSystemObjects();
		server.initProcesses();
	}

	public void stopServer() {
		server.releaseProcesses();
		server.destroySystemObjects();
		server.shutdown();
	}
}

