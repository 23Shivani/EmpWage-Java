package com.bridgelabz;

public class CompanyEmployeWage {
	
	public static void main(String[] args) {
}
	EmployeeWage bigBazaar = new EmployeeWage("bigBazaar", 20, 2, 10);
	EmployeeWage max = new EmployeeWage("max", 10, 4, 20);
	bigBazaar.computeEmpWage();
	System.out.println(bigBazaar);
	max.computeEmpWage();
	System.out.println(max);
}
public String getCompany() {
	return company;
}
public void setCompany(String company) {
	this.company = company;
}
public int getTotalEmpWage() {
	return totalEmpWage;
}
public void setTotalEmpWage(int totalEmpWage) {
	this.totalEmpWage = totalEmpWage;
}