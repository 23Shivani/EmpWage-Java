package com.bridgelabz;

public class EmployeeWage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int FULL_TIME = 1;
        int WAGE_PER_HR = 20;
        int empCheck = (int) (Math.random() * 100) % 2;
        int workingHours = 0;
        if (empCheck == FULL_TIME)
        {
            System.out.println("Employee is Present");
            workingHours = 8;
        } else
        {
            System.out.println("Employee is Absent");
        }
     
        int wage = workingHours * WAGE_PER_HR;
        System.out.println("Employee Daily Wage is " + wage);
    }
}