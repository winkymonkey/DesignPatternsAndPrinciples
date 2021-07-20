package org.example.design.patterns.b_structural.proxy;


public class MyClient {
	public static void main(String[] args) {
		ProxyInternet proxy = new ProxyInternet();
		try {
			proxy.connectTo("www.google.com");
			proxy.connectTo("bannedsite1.com");
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

