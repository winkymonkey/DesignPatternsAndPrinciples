package org.example.design.patterns.c_behavioral.a_mostUsed.template;


public class GlassHouse extends HouseTemplate {
	
	@Override
	public void buildWalls() {
		System.out.println("Building Glass Walls");
	}

	@Override
	public void buildPillars() {
		System.out.println("Building Pillars with glass coating");
	}
}
