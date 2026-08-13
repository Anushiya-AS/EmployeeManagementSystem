package com.ems;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        EmployeeDAO dao = new EmployeeDAO();

        while (true) {

            System.out.println("\n===== Employee Management System =====");
            System.out.println("1. Add Employee");
            System.out.println("2. View All Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Update Employee");
            System.out.println("5. Delete Employee");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {

            case 1: {
            	System.out.print("Enter Employee ID : ");
                int employeeId = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Employee Name: ");
                String name = sc.nextLine();

                if (name.trim().isEmpty()) {
                    System.out.println("Employee name cannot be empty!");
                    break;
                }

                System.out.print("Enter Department: ");
                String department = sc.nextLine();

                if (department.trim().isEmpty()) {
                    System.out.println("Department cannot be empty!");
                    break;
                }

                System.out.print("Enter Designation: ");
                String designation = sc.nextLine();

                if (designation.trim().isEmpty()) {
                    System.out.println("Designation cannot be empty!");
                    break;
                }
                System.out.print("Enter Salary: ");
                double salary = sc.nextDouble();

                if (salary < 0) {
                    System.out.println("Salary cannot be negative!");
                    break;
                }

                
                sc.nextLine();

                System.out.print("Enter Email: ");
                String email = sc.nextLine();

                if (!email.contains("@") || !email.contains(".")) {
                    System.out.println("Invalid email format!");
                    break;
                }

                Employee emp = new Employee();

                emp.setEmpName(name);
                emp.setDepartment(department);
                emp.setDesignation(designation);
                emp.setSalary(salary);
                emp.setEmail(email);

                dao.addEmployee(emp);

                break;
            }

            case 2: {
                dao.viewEmployees();
                break;
            }

            case 3: {
                System.out.print("Enter Employee ID: ");
                int searchId = sc.nextInt();

                dao.searchEmployee(searchId);

                break;
            }

            case 4: {
                System.out.print("Enter Employee ID to update: ");
                int updateId = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Employee Name: ");
                String name = sc.nextLine();

                if (name.trim().isEmpty()) {
                    System.out.println("Employee name cannot be empty!");
                    break;
                }

                System.out.print("Enter Department: ");
                String department = sc.nextLine();

                if (department.trim().isEmpty()) {
                    System.out.println("Department cannot be empty!");
                    break;
                }

                System.out.print("Enter Designation: ");
                String designation = sc.nextLine();

                if (designation.trim().isEmpty()) {
                    System.out.println("Designation cannot be empty!");
                    break;
                }

                System.out.print("Enter Salary: ");
                double salary = sc.nextDouble();

                if (salary < 0) {
                    System.out.println("Salary cannot be negative!");
                    break;
                }

                sc.nextLine();

                System.out.print("Enter Email: ");
                String email = sc.nextLine();

                if (!email.contains("@") || !email.contains(".")) {
                    System.out.println("Invalid email format!");
                    break;
                }

                Employee emp = new Employee();

                emp.setEmpId(updateId);
                emp.setEmpName(name);
                emp.setDepartment(department);
                emp.setDesignation(designation);
                emp.setSalary(salary);
                emp.setEmail(email);

                dao.updateEmployee(emp);

                break;
            }

            case 5: {
                System.out.print("Enter Employee ID to delete: ");
                int deleteId = sc.nextInt();

                dao.deleteEmployee(deleteId);

                break;
            }

            case 6: {
                System.out.println("Thank you!");
                sc.close();
                return;
            }

            default: {
                System.out.println("Invalid Choice!");
            }
            }
        }
    }
}