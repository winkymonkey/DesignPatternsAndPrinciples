package org.example.design.patterns.a_creational.d_singleton.c_lazyAndThreadsafeInitialization;


public class MyClass {
	private static MyClass mc;
	
	private MyClass() {}
	
	public static synchronized MyClass getInstance() {
		if(mc == null) {
			mc = new MyClass();
		}
		return mc;
	}
}
