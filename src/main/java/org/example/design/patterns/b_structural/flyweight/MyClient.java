package org.example.design.patterns.b_structural.flyweight;

import java.util.Random;


public class MyClient {
	private static String[] weapons = {"AK-47", "Maverick", "Gut Knife", "Desert Eagle"};

	public static void main(String args[]) {
		Player player;
		
		for (int i=0; i<10; i++) {
			if(i%2 == 0)
				player = PlayerFactory.getPlayer("Terrorist");
			else
				player = PlayerFactory.getPlayer("CounterTerrorist");
			
			player.assignWeapon(getRandomWeapon());
			player.startMission();
		}
	}

	public static String getRandomWeapon() {
		Random rand = new Random();
		return weapons[rand.nextInt(weapons.length)];
	}
}

