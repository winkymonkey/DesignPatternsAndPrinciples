package org.example.design.patterns.b_structural.adapter;


public class TheClient {
	public static void main(String[] args) {
		Bird bird = new Sparrow();
		bird.chirp();
		
		Dog dog = new Pug();
		dog.bark();
		
		Adapter adapter = new Adapter(bird);
		adapter.bark();
	}
}
