package com.bridgelabz;

public class CompanyEmployeWage {
	public final String company;
	public final int WagePerHour;
	public final int numOfWorkingDays;
	public final int maxHrsPerMonth;
	public int totalEmpWage;
	
	public CompanyEmployeWage(String company, int WagePerHour, int numOfWorkingDays, int maxHrsPerMonth) {
		this.company = company;
		this.WagePerHour = WagePerHour;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxHrsPerMonth = maxHrsPerMonth;
	}
public void setTotalEmpWage(int totalEmpWage) {
	this.totalEmpWage = totalEmpWage;
}

@Override
public String toString() {
	return "Total Emp Wage for Company: " +company+ " is: " +totalEmpWage;
	}
}