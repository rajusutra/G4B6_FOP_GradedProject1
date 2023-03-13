package com.gl.assesment1.driver;

import java.util.Scanner;

import com.gl.assessment1.departments.AdminDepartment;
import com.gl.assessment1.departments.HrDepartment;
import com.gl.assessment1.departments.TechDepartment;

public class Application {

	public static void main(String[] args) {

		HrDepartment hrd =new HrDepartment();
		TechDepartment tech =new TechDepartment();
		AdminDepartment admin =new AdminDepartment();

		while(true) {
			System.out.println("Please enter the department from the following \n"
					+ "1. Admin Department\n"
					+ "2. Hr Department\n"
					+ "3. Tech Department\n"
					+ "0. Exit");
			System.out.println("Enter Your choice=");

			Scanner choice = new Scanner(System.in);

			int depChoice=choice.nextInt();

			switch(depChoice) {

			case 1:
				System.out.println("Welcome to "+admin.departmentName());
				System.out.println(admin.getTodaysWork());
				System.out.println(admin.getWorkDeadline());
				System.out.println(admin.isTodayAHoliday());
				System.out.println("");
				break;
			case 2:
				System.out.println("Welcome to "+hrd.departmentName());
				System.out.println(hrd.doActivity());
				System.out.println(hrd.getTodaysWork());
				System.out.println(hrd.getWorkDeadline());
				System.out.println(hrd.isTodayAHoliday());
				System.out.println("");
				break;
			case 3:
				System.out.println("Welcome to "+tech.departmentName());
				System.out.println(tech.getTodaysWork());
				System.out.println(tech.getWorkDeadline());
				System.out.println(tech.getTechStackInformation());
				System.out.println(tech.isTodayAHoliday());
				System.out.println("");
				break;
			case 0:
				System.out.print("Thank you!");
				choice.close();
				System.exit(0);
			default:
				System.out.println("Invalid");
				break;

			}

		}

	}
}