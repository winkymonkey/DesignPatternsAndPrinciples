package org.example.design.patterns.b_structural.bridge;


public class TheClient {
	public static void main(String[] args) {
		Shape triangle = new Triangle(new RedColor());
		triangle.createShape();

		Shape rectangle = new Rectangle(new GreenColor());
		rectangle.createShape();
	}
}

