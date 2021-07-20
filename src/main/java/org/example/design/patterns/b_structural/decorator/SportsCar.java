package org.example.design.patterns.b_structural.decorator;


public class SportsCar extends CarDecorator {
	SportsCar(Car c) {
		super(c);
	}

	@Override
	public void assemble() {
		super.assemble();
		System.out.println(" Add feature of Sports Car");
	}
}

