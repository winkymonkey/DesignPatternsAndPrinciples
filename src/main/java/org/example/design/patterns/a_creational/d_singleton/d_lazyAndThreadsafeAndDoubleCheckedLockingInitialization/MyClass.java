package org.example.design.patterns.a_creational.d_singleton.d_lazyAndThreadsafeAndDoubleCheckedLockingInitialization;


public class MyClass {
	private static MyClass mc;
	
	private MyClass() {}
	
	public static MyClass getInstance() {
		if(mc == null) {
			synchronized(MyClass.class) {
				if(mc == null) {
					mc = new MyClass();
				}
			}
		}
		return mc;
	}
}
