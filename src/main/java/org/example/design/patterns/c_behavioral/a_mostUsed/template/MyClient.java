package org.example.design.patterns.c_behavioral.a_mostUsed.template;


public class MyClient {
	
	public static void main(String[] args) {
		HouseTemplate houseType = new WoodenHouse();
		houseType.buildHouse();
		/* -------------------------------------- */
		houseType = new GlassHouse();
		houseType.buildHouse();
	}
}
