package org.example.design.patterns.c_behavioral.a_mostUsed.observer;

import java.util.ArrayList;
import java.util.Random;


public class SubjectImpl implements Subject {
	ArrayList<Observer> list = new ArrayList<Observer>();

	public void registerObserver(Observer observer) {
		list.add(observer);
	}
	public void deregisterObserver(Observer observer) {
		list.remove(list.indexOf(observer));
	}
	public void notifyObservers() {
		int temperature = new Random().nextInt(100);
		for(Observer observer : list) {
			observer.notify(temperature);
		}
	}
}

