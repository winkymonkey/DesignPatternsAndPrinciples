package org.example.design.patterns.a_creational.c_builder;


public class BuilderConcrete implements Builder {
	Product product = new Product();
	
	public void step1() {
		product.setVar1(100);
	}
	public void step2() {
		product.setVar2(200);
	}
	
	public Product build() {
		return product;
	}
}
