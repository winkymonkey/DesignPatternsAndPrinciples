package org.example.design.patterns.c_behavioral.a_mostUsed.observer;


public class ObserverImpl implements Observer {
	public void notify(int temperature) {
		System.out.println("temperature="+temperature);
	}
}

