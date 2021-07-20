package org.example.design.patterns.a_creational.c_builder;


public interface Builder {
	public void step1();
	public void step2();
	
	public Product build();
}
