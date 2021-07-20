package org.example.design.patterns.b_structural.proxy;

import java.util.ArrayList;
import java.util.List;


public class ProxyInternet implements Internet {
	private Internet realInternet = new RealInternet();
	private static List<String> bannedSites = new ArrayList<String>();

	static {
		bannedSites.add("bannedsite1.com");
		bannedSites.add("bannedsite2.com");
		bannedSites.add("bannedsite3.com");
		bannedSites.add("bannedsite4.com");
	}

	@Override
	public void connectTo(String url) {
		if (bannedSites.contains(url.toLowerCase()))
			throw new RuntimeException("Access Denied");
		else
			realInternet.connectTo(url);
	}
}

