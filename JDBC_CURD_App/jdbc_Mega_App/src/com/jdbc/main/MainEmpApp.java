package com.jdbc.main;

import java.util.Scanner;

import com.jdbc.employeeModel.Employee;
import com.jdbc.service.DBService;

public class MainEmpApp {
	public static void main(String[] args) {
		DBService dbservice = new DBService();
		try (Scanner sc = new Scanner(System.in)) {
			boolean isRunning = true;
			while (isRunning) {
				System.out.println("Enter Choice");
				System.out.println("1. Insert");
				System.out.println("2. Select All Record");
				System.out.println("3. Select Employee BY ID");
				System.out.println("4. Delete Employee");
				System.out.println("5. Update the Emp Details");
				System.out.println("6. Exit The App");
				int choice = Integer.parseInt(sc.nextLine());
				switch (choice) {
				case 1:
					System.out.println("Enter the Name   Address  And Salary Of Employee");
					dbservice.inserEmp(new Employee(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine())));
					break;
				case 2:
					dbservice.selectAllEmp();
					break;
				case 3:
					System.out.println("Enter The Emp Id");
					dbservice.getAllEmpById(Integer.parseInt(sc.nextLine()));
					break;
				case 4:
					System.out.println("Enter The Emp Id");
					dbservice.deleteEmpByID(Integer.parseInt(sc.nextLine()));
					break;
				case 5:
					System.out.println("Enter The Emp Id");
					int updateId = Integer.parseInt(sc.nextLine());
					boolean isFound = dbservice.getAllEmpById(updateId);
					if (isFound) {
						System.out.println("Enter the Name   Address  And Salary Of Employee");
						Employee emp = new Employee(updateId, sc.nextLine(), sc.nextLine(),
								Double.parseDouble(sc.nextLine()));
						dbservice.updateEmpById(emp);
					}
					break;
				case 6:
					System.out.println("Thank You. Visit Again");
					isRunning = false;
					break;
				default:
					System.out.println("Choose Wrong Option");
					break;
				}
			}
		} catch (Exception e) {
			throw new RuntimeException("Something Went Wrong " + e);
		}
	}

}
