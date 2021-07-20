package org.example.design.patterns.b_structural.composite;

import java.util.ArrayList;
import java.util.List;


public class Manager implements Employee {
	private List<Employee> empList = new ArrayList<Employee>();
	
	public void addEmployee(Employee emp) {
		empList.add(emp);
	}
	public void removeEmployee(Employee emp) {
		empList.remove(emp);
	}
	
	@Override
	public void print() {
		for (Employee emp : empList) {
			emp.print();
		}
	}
}
