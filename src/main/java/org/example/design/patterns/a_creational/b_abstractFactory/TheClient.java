package org.example.design.patterns.a_creational.b_abstractFactory;


public class TheClient {
	public static void main(String[] args) throws Exception {
		String prodType = "1";		//"2"
		AbstractFactory myFactory; 
		
		if(prodType.equals("1"))
			myFactory = new Factory1();
		else if(prodType.equals("2"))
			myFactory = new Factory2();
		else
			throw new Exception();
		
		ProductA productA = myFactory.createA();
		ProductB productB = myFactory.createB();
		
		productA.methA();
		productB.methB();
	}
}
