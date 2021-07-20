package org.example.design.patterns.b_structural.composite;


public class MyClient {
	public static void main(String[] args) {
		Manager moduleLead = new Manager();
		moduleLead.addEmployee(new Developer("Martha"));
		
		Manager teamLead = new Manager();
		teamLead.addEmployee(new Developer("Jack"));
		teamLead.addEmployee(new Tester("Harry"));
		teamLead.addEmployee(moduleLead);

		teamLead.print();
	}
}
