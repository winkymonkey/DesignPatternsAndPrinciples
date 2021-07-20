package org.example.design.patterns.c_behavioral.a_mostUsed.chainOfResponsibility;


public class MyClient {
	public static void main(String[] args) {
		int amount = 290;
		if (amount % 10 != 0) {
			System.out.println("Amount should be in multiple of 10s.");
			return;
		}
		else {
			DispenseChain c1 = new Dollar50Dispenser();
			DispenseChain c2 = new Dollar20Dispenser();
			DispenseChain c3 = new Dollar10Dispenser();

			c1.setNextChain(c2);
			c2.setNextChain(c3);
			
			c1.dispense(new Currency(amount));
		}
	}
}

