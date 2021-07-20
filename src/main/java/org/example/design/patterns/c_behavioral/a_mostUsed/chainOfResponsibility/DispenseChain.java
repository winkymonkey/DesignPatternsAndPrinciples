package org.example.design.patterns.c_behavioral.a_mostUsed.chainOfResponsibility;


public interface DispenseChain {
	void setNextChain(DispenseChain nextChain);
	void dispense(Currency cur);
}

