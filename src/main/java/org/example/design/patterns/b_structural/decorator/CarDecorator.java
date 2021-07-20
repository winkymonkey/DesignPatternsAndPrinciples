package org.example.design.patterns.b_structural.decorator;


public class CarDecorator implements Car {
	protected Car car;
	CarDecorator(Car c) {
		this.car = c;
	}

	@Override
	public void assemble() {
		this.car.assemble();
	}
}

