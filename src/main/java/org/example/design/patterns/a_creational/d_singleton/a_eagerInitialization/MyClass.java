package org.example.design.patterns.a_creational.d_singleton.a_eagerInitialization;


public class MyClass {
	private static MyClass mc = new MyClass();
	
	private MyClass() {}
	
	public static MyClass getInstance() {
		return mc;
	}
}
