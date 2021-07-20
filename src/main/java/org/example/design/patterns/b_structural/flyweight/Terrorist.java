package org.example.design.patterns.b_structural.flyweight;


class Terrorist implements Player {
	private final String task; 		// Intrinsic Attribute
	private String weapon; 			// Extrinsic Attribute

	public Terrorist() {
		task = "PLANT A BOMB";
	}

	public void assignWeapon(String weapon) {
		this.weapon = weapon;		// Assign a weapon
	}

	public void startMission() {
		System.out.println("T's Weapon="+weapon+"|Task="+task);
	}
}

