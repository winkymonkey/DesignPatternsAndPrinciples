package org.example.design.patterns.a_creational.c_builder;


public class TheClient {
	public static void main(String[] args) {
		Director director = new Director(new BuilderConcrete());
		Product product = director.prepareProduct();
		
		System.out.println(product.getVar1());
		System.out.println(product.getVar2());
	}
}
