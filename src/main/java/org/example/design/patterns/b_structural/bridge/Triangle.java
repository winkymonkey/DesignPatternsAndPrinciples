package org.example.design.patterns.b_structural.bridge;


public class Triangle extends Shape {
	public Triangle(Color c) {
		super(c);
	}

	@Override
	public void createShape() {
		System.out.print("Triangle");
		color.applyColor();
	}
}

