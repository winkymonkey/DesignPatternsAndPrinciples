package org.example.design.principles.a_dependencyInversionPrinciple.a_withoutDependencyInversion;


public class CustomerBusinessLogic {
	public String getCustomerName() {
		DataAccess da = new DataAccess();
		return da.getCustomerName();
	}
}
