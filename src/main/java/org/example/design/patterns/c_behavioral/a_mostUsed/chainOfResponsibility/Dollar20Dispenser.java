package org.example.design.patterns.c_behavioral.a_mostUsed.chainOfResponsibility;


public class Dollar20Dispenser implements DispenseChain {
	private DispenseChain chain;

	@Override
	public void setNextChain(DispenseChain nextChain) {
		this.chain = nextChain;
	}

	@Override
	public void dispense(Currency currency) {
		if (currency.getAmount() >= 20) {
			int count = currency.getAmount() / 20;
			int remainder = currency.getAmount() % 20;
			System.out.println("Dispensing " + count + " 20$ note");
			if (remainder != 0)
				this.chain.dispense(new Currency(remainder));
		}
		else {
			this.chain.dispense(currency);
		}
	}
}

