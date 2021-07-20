package org.example.design.patterns.b_structural.composite;


public class Tester implements Employee {
	private String name;

	public Tester(String name) {
		this.name = name;
	}

	@Override
	public void print() {
		System.out.println(name);
	}
}
