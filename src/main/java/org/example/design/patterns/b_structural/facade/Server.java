package org.example.design.patterns.b_structural.facade;


public class Server {
	public void startBooting() {
		System.out.println("Starts booting...");
	}
	public void initSystemObjects() {
		System.out.println("Initializing system objects...");
	}
	public void initProcesses() {
		System.out.println("Initializing processes...");
	}

	
	public void releaseProcesses() {
		System.out.println("Releasing processes...");
	}
	public void destroySystemObjects() {
		System.out.println("Destroying system objects...");
	}
	public void shutdown() {
		System.out.println("Shutting down...");
	}
}

