package org.example.design.patterns.a_creational.a_factory;


public class Factory {
	public static Product getProductInstance(String id) {
		if(id.equals("A1"))
			return new ProductA1();
		else if(id.equals("A2"))
			return new ProductA2();
		else
			return null;
	}
}
