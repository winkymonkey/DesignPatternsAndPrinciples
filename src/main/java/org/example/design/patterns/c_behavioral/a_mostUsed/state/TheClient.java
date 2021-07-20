package org.example.design.patterns.c_behavioral.a_mostUsed.state;

/*
 * Example using mobile phone
 * 	Context HAS-A State & it must be initialized with some valid default value.
 *  Context must save the State for future use. Hence no need to initialize state whenever we want to know about current state.
 * 
 * But who should have the power to change the state?
 * 	- The Client can access the Context and update the state
 * 	- The Context itself can update the state. (i.e. upon calling one state Context itself can change the state and ask the state to execute)
 * 	- The State itself can update the State.
 * 		But it's suggested not to update the State from other State.
 * 		Because in that case all State should know about all other States.
 * 		In fact, if a new State is introduced, all State have to know other newly added State.  
 */

interface State {
	public void doSomething();
}

class RingState implements State {
	public void doSomething() {
		System.out.println("RING");
	}
}
class SilentState implements State {
	public void doSomething() {
		System.out.println("SILENT");
	}
}
class VibrateState implements State {
	public void doSomething() {
		System.out.println("VIBRATE");
	}
}

class Context {
	private State state;
	Context(State state) {
		this.state = state;
	}
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	public void execute() {
		state.doSomething();
	}
}

public class TheClient {
	public static void main(String[] args) {
		Context context = new Context(new SilentState());
		context.execute();
		context.execute();
		context.execute();
		context.setState(new RingState());
		context.execute();
		context.setState(new VibrateState());
		context.execute();
		context.execute();
		context.setState(new RingState());
		context.execute();
	}
}
