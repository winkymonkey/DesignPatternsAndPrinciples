package org.example.design.patterns.a_creational.a_factory;


public class TheClient {
	public static void main(String[] args) {
		Product product = Factory.getProductInstance("A1");
		product.consume();
	}
}
