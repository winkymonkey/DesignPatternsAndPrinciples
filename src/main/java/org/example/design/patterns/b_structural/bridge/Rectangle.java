package org.example.design.patterns.b_structural.bridge;


public class Rectangle extends Shape {
	public Rectangle(Color c) {
		super(c);
	}

	@Override
	public void createShape() {
		System.out.print("Rectangle");
		color.applyColor();
	}
}

