package org.example.design.patterns.a_creational.b_abstractFactory;


public class Factory1 implements AbstractFactory {
	public ProductA createA() {
		return new ProductA1();
	}
	public ProductB createB() {
		return new ProductB1();
	}
}
