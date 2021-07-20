package org.example.design.patterns.a_creational.c_builder;


public class Director {
	Builder builder;
	
	Director(Builder builder) {
		this.builder = builder;
	}
	
	public Product prepareProduct() {
		builder.step1();
		builder.step2();
		return builder.build();
	}
}
