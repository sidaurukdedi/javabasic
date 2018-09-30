package com.sidauruk.dedi.abstraction;

public class Employee extends Customer {
	private String empId;

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}
	
	@Override // Overriding getCustomerInfo from Customer class
	public String getCustomerInfo() {
		return String.format("Customer : %s, EmpId : %s, Address : %s", getName(), getEmpId(), getAddress());
	}
}
