package org.example.design.patterns.c_behavioral.a_mostUsed.template;


public abstract class HouseTemplate {
	public final void buildHouse() {		// TEMPLATE METHOD
		buildFoundation();
		buildPillars();
		buildWalls();
		buildWindows();
		System.out.println("House is built.\n");
	}
	
	private void buildFoundation() {
		System.out.println("Building Common Foundation for all");
	}
	
	public abstract void buildPillars();
	
	public abstract void buildWalls();
	
	private void buildWindows() {
		System.out.println("Building Common Windows for all");
	}	
}
