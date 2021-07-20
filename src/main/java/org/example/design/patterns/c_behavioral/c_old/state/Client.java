package org.example.design.patterns.c_behavioral.c_old.state;


public class Client {
	public static void main(String args[]) {
		Context ctx = new Context();
		ctx.startWorkflow(1);
	}
}
