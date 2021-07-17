package com.bridgelabz;

public class EmpWageArray {

	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME= 2;
	
	private int numberOfCompany = 0;
	private CompanyEmployeWage[] companyEmployeWageArray;
	
	public EmpWageArray() {
		companyEmployeWageArray = new CompanyEmployeWage[5];
	}
	private void addCompanyEmployeWage (String company, int WagePerHour, int numOfWorkingDays, int maxHrsPerMonth) {
		companyEmployeWageArray[numberOfCompany] = new CompanyEmployeWage(company, WagePerHour, numOfWorkingDays, maxHrsPerMonth);
		numberOfCompany++;
	}
	private void computeEmpWage() {
		for (int i = 0; i<=numberOfCompany; i++) {
			companyEmployeWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmployeWageArray[i]));
		}
	}
	private int computeEmpWage(CompanyEmployeWage companyEmployeWage)  {		
		//var
		int empHrs = 0, totalEmpHrs =0, totalWorkingDays=0;
		//computation
	while (totalEmpHrs <= companyEmployeWage.maxHrsPerMonth && 
			totalWorkingDays < companyEmployeWage.numOfWorkingDays) {
		totalWorkingDays++;
		int empCheck = (int) Math.floor(Math.random() * 10) % 3;
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
	return totalEmpHrs *companyEmployeWage.WagePerHour;
}
	
public static void main(String[] args) {
	EmpWageArray empwage= new EmpWageArray();
	empwage.addCompanyEmployeWage("max", 10, 4, 20);
	empwage.addCompanyEmployeWage("bigbazaar", 20, 2, 10);
	empwage.computeEmpWage();
}
}