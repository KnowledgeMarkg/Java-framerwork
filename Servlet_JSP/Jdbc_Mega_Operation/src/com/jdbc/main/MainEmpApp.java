package com.jdbc.main;

import java.util.Scanner;

public class MainEmpApp {

	public static void main(String[] args) {
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
					System.out.println(choice);
					break;
				case 2:
					System.out.println(choice);
					break;

				case 3:
					System.out.println(choice);
					break;

				case 4:
					System.out.println(choice);
					break;

				case 5:
					System.out.println(choice);
					break;

				case 6:
					System.out.println("Thank You. Visit Again");
					isRunning = false;
					break;
				default:
					break;
				}

			}
		}
	}

}
