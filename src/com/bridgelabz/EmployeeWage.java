package com.bridgelabz;

public class EmployeeWage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int PART_TIME = 1;
        int FULL_TIME = 2;
        int WAGE_PER_HR = 20;
        int empCheck = (int) (Math.random() * 100) % 3;
        int workingHours = 0;
        if (empCheck == FULL_TIME)
        {
            System.out.println("Employee is Present Full time");
            workingHours = 12;
        } else if (empCheck == PART_TIME)
        {
            System.out.println("Employee is Present Part time");
            workingHours = 8;
        } else
        {
            System.out.println("Employee is Absent");
        }
        int wage = workingHours * WAGE_PER_HR;
        System.out.println("Employee Daily Wage is " + wage);
    }
}