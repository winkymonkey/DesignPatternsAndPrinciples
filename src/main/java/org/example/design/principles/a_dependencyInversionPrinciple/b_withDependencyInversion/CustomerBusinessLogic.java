package org.example.design.principles.a_dependencyInversionPrinciple.b_withDependencyInversion;


public class CustomerBusinessLogic {	
	public String getCustomerName() {
		IDataAccess ida = new DataAccess();
		return ida.getCustomerName();
	}
}
