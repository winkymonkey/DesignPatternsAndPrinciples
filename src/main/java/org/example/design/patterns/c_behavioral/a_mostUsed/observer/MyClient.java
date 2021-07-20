package org.example.design.patterns.c_behavioral.a_mostUsed.observer;


public class MyClient {
	public static void main(String args[]) {
		Observer observer = new ObserverImpl();
		Subject subject = new SubjectImpl();
		
		subject.registerObserver(observer);
		subject.notifyObservers();
		subject.deregisterObserver(observer);
		
		subject.notifyObservers();
	}
}

