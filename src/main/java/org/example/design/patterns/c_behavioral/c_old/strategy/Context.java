package org.example.design.patterns.c_behavioral.c_old.strategy;


public class Context {
	private Sort state;
	
	public Context(Sort state) {
		this.state = state;
	}

	public void sortFromContext() {
		state.sortAlgorithm();
	}
}
