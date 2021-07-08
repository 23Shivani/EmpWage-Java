package com.bridgelabz;

public class EmployeeWage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int FULL_TIME = 1;
		int empCheck = (int) (Math.random() * 10) % 2;
		if (empCheck == FULL_TIME)
			System.out.println("Employee is Present");
		else
			System.out.println("Employee is Absent");
	}
}
