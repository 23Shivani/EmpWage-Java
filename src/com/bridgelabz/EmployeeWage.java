package com.bridgelabz;

public class EmployeeWage {

	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME= 2;
	
	private final String company;
	private final int WagePerHour;
	private final int numOfWorkingDays;
	private final int maxHrsPerMonth;
	private int totalEmpWage;
	
	public EmployeeWage(String company, int WagePerHour, int numOfWorkingDays, int maxHrsPerMonth){
		this.company = company;
		this.WagePerHour = WagePerHour;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxHrsPerMonth = maxHrsPerMonth;
	}
	public void computeEmpWage() {
		//var
		int empHrs = 0, totalEmpHrs =0, totalWorkingDays=0;
		//computation
	while (totalEmpHrs <= maxHrsPerMonth && totalWorkingDays < numOfWorkingDays) {
		totalWorkingDays++;
		int empCheck = (int) Math.floor(Math.random() *10) %3;
		switch (empCheck) {
		case IS_PART_TIME:
			empHrs = 4;
			break;
		case IS_FULL_TIME:
			empHrs = 8;
			break;
		default:
			empHrs = 0;
		}
		totalEmpHrs += empHrs;
		System.out.println("Day: " + totalWorkingDays + " Emp Hr: " +empHrs);
	}
	totalEmpWage = totalEmpHrs * WagePerHour;
}

@Override
public String toString() {
	return "Total Emp Wage for Company: " +company+ " is: " + totalEmpWage;
}
	
public static void main(String[] args) {
		EmployeeWage bigBazaar = new EmployeeWage("bigBazaar", 20, 2, 10);
		EmployeeWage max = new EmployeeWage("max", 10, 4, 20);
		bigBazaar.computeEmpWage();
		System.out.println(bigBazaar);
		max.computeEmpWage();
		System.out.println(max);
	}	

}