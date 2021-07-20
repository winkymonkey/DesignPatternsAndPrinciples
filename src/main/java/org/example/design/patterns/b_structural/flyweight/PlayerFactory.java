package org.example.design.patterns.b_structural.flyweight;

import java.util.HashMap;


class PlayerFactory {
	private static HashMap<String, Player> map = new HashMap<String, Player>();

	public static Player getPlayer(String playerType) {
		Player player = null;
		if (map.containsKey(playerType))
			player = map.get(playerType);
		else {
			switch (playerType) {
				case "Terrorist":
					System.out.println("Terrorist Created");
					player = new Terrorist();
					break;
				case "CounterTerrorist":
					System.out.println("Counter Terrorist Created");
					player = new CounterTerrorist();
					break;
			}
			map.put(playerType, player);
		}
		return player;
	}
}
